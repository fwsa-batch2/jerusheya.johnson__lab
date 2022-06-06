array = [1,2,"jeru",true]
puts array

my_array = [2,4,1,6,3]
puts my_array.sort!

# to add elements into an array
strings = ["HTML", "CSS", "JavaScript", "Python", "Ruby"]
symbols = []

strings.each do |s| 
 symbols.push(s.to_sym) # to add into array use push method
end 
puts symbols

a = [1,2,3,4,5,5,6,7]
puts a.count 
puts a.count 5
puts a.size 
puts a.length