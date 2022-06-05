# creating an empty hash with default value "nothing here"
hash = Hash.new(" nothing here ")


#trying to print the hash
puts hash  #prints {}

#trying to print a value inside the empty hash with some key
puts hash["jeru"]  #prints the default value

colors = { 
    "blue" => 3,
    "green" => 1,
    "red" => 2
  }
colors = colors.sort_by do |color, count|  #loops it for each values
    count   #sorts by count 
end

puts colors.reverse!   #reverse the sorted hash 

#new syntax for creating a hash
movies = {
  children: "Moana",
  scifi: "Mortal Kombat",
  history: "Lincoln"
}
puts movies