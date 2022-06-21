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


 dns_record = {}
      for i in (dns_raw.select{ |x| x[0] != "#" && x!="\n"})
        @dns_domain=(i.split(","))[1].strip()
        @dns_address=(i.split(","))[2].strip()
        dns_record[@dns_domain]=@dns_address
      end
      p dns_record
      return dns_record
end

def resolve(dns_record, lookup_chain, domain)
  
     if (dns_record.has_key? domain)
        dns_domain2= dns_record[domain]
        lookup_chain.push(dns_record[domain])
         if (dns_record.has_key? dns_domain2)
           resolve(dns_record,lookup_chain,dns_domain2)
         end
     else
        lookup_chain.push("this is not present")
     end
     return lookup_chain

end

dns_record = parse_dns(dns_raw)
lookup_chain = [domain] #an array which contains only domain 
lookup_chain = resolve(dns_record, lookup_chain, domain)
puts lookup_chain.join(" => ")

