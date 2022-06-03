#while loop
x=5
while x>=1
    puts "hello"
    x=x-1
end

#for loop
j = "jeru"
for i in 1..5 do
     puts "#{j} in #{i}"
end

#for each
array=Array.new(4,"sess")
array.each do |num|
    puts num
end


#do while
value =1
loop do 
    puts "do while"
    break if value<3
end 

#until loop
var=0
until var==2 do
    puts "var is less than 2"
    var=var+1
end