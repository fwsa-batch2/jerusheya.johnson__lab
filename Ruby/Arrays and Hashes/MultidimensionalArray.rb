multi_d_array = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]

puts multi_d_array #prints each element
multi_d_array.each { |x| puts "#{x}\n" } #prints each array

s = [["ham", "swiss"], ["turkey", "cheddar"], ["roast beef", "gruyere"]]
for i in 0..s.length do
  for j in 0..s.length do
     puts s[i][j]
  end
end