def get_command_line_argument

  if ARGV.empty?
    puts "Usage: ruby lookup.rb <domain>"
    exit
  end
  ARGV.first

end

domain = get_command_line_argument

dns_raw = File.readlines("zone") #stores as an array of array

def parse_dns(dns_raw)

 array1=[]
 array2=[]
 array3=[]

 dns_record = {Record: array1, Domain_Name: array2, Destination: array3}
      for i in (dns_raw.select{ |x| x[0] != "#" && x!="\n"})
        dns_record[:Record]=array1.push((i.split(","))[0].strip())
        dns_record[:Domain_Name]=array2.push((i.split(","))[1].strip())
        dns_record[:Destination]=array3.push((i.split(","))[2].strip())
      end
      return dns_record
end

def resolve(dns_record, lookup_chain, domain)
     if (dns_record[:Domain_Name].include? domain)
         index = (dns_record[:Domain_Name]).find_index(domain)
         if (dns_record[:Record])[index] == 'A'
           lookup_chain.push((dns_record[:Destination])[index])
         elsif (dns_record[:Record])[index] == 'CNAME'
          
            new_domain = dns_record[:Destination][index]
            lookup_chain.push(new_domain)
            resolve(dns_record,lookup_chain,new_domain)
         end
     else 
            lookup_chain.push("the domain is not present")
     end
     return lookup_chain
end

dns_record = parse_dns(dns_raw)
lookup_chain = [domain] #an array which contains only domain 
lookup_chain = resolve(dns_record, lookup_chain, domain)
puts lookup_chain.join(" => ")

