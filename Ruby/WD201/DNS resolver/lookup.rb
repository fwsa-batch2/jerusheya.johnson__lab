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

  dns_raw.
  reject { |line| line[0] == "#" } #deletes the line starts with #
  .map { |line| line.split(",") } #splits the line with , and makes it as a array
  .reject do |record|
    record.length != 3  #deletes the line if the line contains 3 words (for expelling the empty line)
  end
  .each_with_object({}) do |record, records|
    rec_index_value = record.map{|rec|  rec.strip()} #strips each value in the array
    #records = hash, record = final array with no empty lines , rec_index_value = array without \n 
    records[rec_index_value[1]] = { type: rec_index_value[0], target: rec_index_value[2] }
end


end

def resolve(dns_records, lookup_chain, domain)
  record = dns_records[domain]
  if (!record)
    lookup_chain << "Error: Record not found for " + domain
  elsif record[:type] == "A"
    lookup_chain << record[:target]
  elsif record[:type] == "CNAME"
    lookup_chain << record[:target]
    resolve(dns_records, lookup_chain, record[:target])
  else
    lookup_chain << "Invalid record type for " + domain
  end
  lookup_chain
end

dns_record = parse_dns(dns_raw)
lookup_chain = [domain] #an array which contains only domain 
lookup_chain = resolve(dns_record, lookup_chain, domain)
puts lookup_chain.join(" => ")

