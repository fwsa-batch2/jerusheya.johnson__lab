print "What's your first name? "
first_name = gets.chomp.capitalize!

print "What's your last name? "
last_name = gets.chomp.capitalize!

print "What city are you from? "
city = gets.chomp.capitalize!

print "What state or province are you from? "
state = gets.chomp.upcase!

puts "Your name is #{first_name}"
puts "Your last_name is #{last_name}"
puts "Your city is #{city}"
puts "Your state is #{state}"