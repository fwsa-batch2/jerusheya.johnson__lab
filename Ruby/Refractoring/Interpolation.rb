# 1. interpolation

age = 26
puts "I am " + age.to_s + " years old."  #non string objects should be changed
# ==> "I am 26 years old."
puts "I am " << age.to_s << " years old."
# ==> "I am 26 years old."
puts "I am #{age} years old."

# 2. shovel

#Instead of typing out the .push method name, 
#you can simply use <<, the concatenation operator (also known as “the shovel”) 

alphabet = ["a", "b", "c"]
alphabet << "d"

caption = "A giraffe surrounded by "
caption << "weezards!"