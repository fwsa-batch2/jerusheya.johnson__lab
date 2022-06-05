array = [1,2,"jeru",true]
puts array

multi_d_array = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]

puts multi_d_array #prints each element
multi_d_array.each { |x| puts "#{x}\n" } #prints each array

s = [["ham", "swiss"], ["turkey", "cheddar"], ["roast beef", "gruyere"]]
for i in 0..s.length do
  for j in 0..s.length do
     puts s[i][j]
  end
end

my_array = [2,4,1,6,3]
puts my_array.sort!

# to add elements into an array
strings = ["HTML", "CSS", "JavaScript", "Python", "Ruby"]
symbols = []

strings.each do |s| 
 symbols.push(s.to_sym) # to add into array use push method
end 
print symbols