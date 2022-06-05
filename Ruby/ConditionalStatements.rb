
#if elseif
num = gets.chomp
if(num<3)
  puts "it is less than 3"
elsif(num == 3)
  puts "it is equal to 3"
else
  puts "it is greater than 3"
end  

#unless 
hungry = false

unless hungry
  puts "I'm writing Ruby programs!"
else
  puts "Time to eat!"
end