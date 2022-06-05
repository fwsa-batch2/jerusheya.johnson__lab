#in ruby do plays the role of {}, so can use {} also.
#next keyword-->

#while loop
x=5
while x>=1
    puts "hello"
    x=x-1
end

#for loop
j = "jeru"
for i in 1..5 do # double . = inclusive range , trible . = will not print the last num
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
    next if value==2 # next keyword--> will skip the value for the loop
    break if value<3
end 

#until loop
var=0
until var==2 do
    puts "var is less than 2"
    var=var+1
end

#times loop
5.times {puts "hi"}

#unless loop
i=3
unless i!=3
    puts "jeru"
end

