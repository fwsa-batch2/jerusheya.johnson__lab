# numbers = [1,2,3].map do |i|
#     x = i + 2
#     x = x * 2
#     x
#   end

# puts numbers

# [1, 2, 3].each do |x|
#     puts x
#   end

#stabby lambda
adder = -> a, b { a + b }
puts adder.call(1, 2)

def double_items(list)
    new_list = []
  
    for item in list
      new_list << item * 2
    end
  
    new_list
end