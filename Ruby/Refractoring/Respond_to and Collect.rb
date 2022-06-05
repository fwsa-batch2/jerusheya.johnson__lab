# 1. respond_to? 

puts 26.respond_to? (:next) #checks whether the variable 26 responds to the method next

puts [1, 2, 3].respond_to?(:push) #arrays respond to push hence return true

puts [1, 2, 3].respond_to?(:to_sym) #arrays can't be changed to symbol so return false

# 2.collect 

fibs = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
doubled_fibs = fibs.collect {|x| x*2} # collect do the operation for each value
puts doubled_fibs

 