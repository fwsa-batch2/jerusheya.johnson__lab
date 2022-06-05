=begin
  Refractoring:
    the process of introducing small and incremental changes to 
    leave the code in a better state than it was
=end

# 1. upto

95.upto(100) { |num| puts num }
# Prints 95 96 97 98 99 100

L = 'L'
L.upto('P') { |letter| puts letter}
# Prints L M N O P

# 2. downto

100.downto(95) { |num| puts num}
#Prints 100 99 98 97 96 95


# 3. respond_to?

puts 26.respond_to? (:next) #checks whether the variable 26 responds to the method next

puts [1, 2, 3].respond_to?(:push) #arrays respond to push hence return true

puts [1, 2, 3].respond_to?(:to_sym) #arrays can't be changed to symbol so return false


# 4. shovel

#Instead of typing out the .push method name, 
#you can simply use <<, the concatenation operator (also known as “the shovel”) 

alphabet = ["a", "b", "c"]
alphabet << "d"

caption = "A giraffe surrounded by "
caption << "weezards!" 

# 5. one line if 

puts "jeru" if 0<4

# 6. one line unless

puts "sess" unless 0>4

# 7. ternary operator

puts 0<4? "jeru" : "sess" #true : false

# 8. interpolation

age = 26
puts "I am " + age.to_s + " years old."  #non string objects should be changed
# ==> "I am 26 years old."
puts "I am " << age.to_s << " years old."
# ==> "I am 26 years old."
puts "I am #{age} years old."