
#example 1
case 30
when 0..20 then puts "lower"
when 20..30 then puts "equal"
else puts "upper"
end

#example 2
mark = gets.chomp.to_i
case mark
when 0..5 
    puts "Beginner"
when 6..10 
    puts "Intermediate"
when 11..15 
    puts "Advanced"
else 
    puts "fail"
end

#example 3
puts "Hello there!"
greeting = gets.chomp

case greeting
when "English" then puts "Hello!"
when "French" then puts "Bonjour!"
when "German" then puts "Guten Tag!"
when "Finnish" then puts "Haloo!"
else puts "I don't know that language!"
end