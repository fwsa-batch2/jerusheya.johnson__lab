array = [1,2,3,4,5]

#one way of iterating
array.each { |item| puts item }

#second way of iterating
array.each do |x|
  x += 10
  puts "#{x}"
end

#times iterator 
10.times {print "jeru" }

#iterating between array and hash

friends = ["Milhouse", "Ralph", "Nelson", "Otto"]

family = { "Homer" => "dad",
  "Marge" => "mom",
  "Lisa" => "sister",
  "Maggie" => "sister",
  "Abe" => "grandpa",
  "Santa's Little Helper" => "dog"
}

friends.each { |x| puts "#{x}" }
family.each { |x, y| puts "#{x}: #{y}" }