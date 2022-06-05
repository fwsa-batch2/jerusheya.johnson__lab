#hashes
#hash =  Hash.new  ---> can also create  a  hash
studentDetails={"name"=>  "jeru",  "age"=>  "19","sex"=>"female"}
classDetails={"class"=> "3","school"=> "andrews","teacher"=> "ruby"}

#to print key:value
studentDetails.each {|key,value| puts "#{key}: #{value}"}

#for each loop
studentDetails.each  do |keys,values|
    puts   "the student's #{keys} is #{values}"
end

#for loop
for i in 0...studentDetails.length do
    puts "the student #{studentDetails.keys[i]} is #{studentDetails.values[i]}"
end

#for each_value loop
studentDetails.each_value do |value|
    puts "#{value}"
end

#for each_key loop 
studentDetails.each_key do |keys|
    puts "#{keys}"
end

#for each_index loop
studentDetails.each_with_index do |(key, value), index|
    puts "index: #{index} and key: #{key} and value: #{value}"
end

#getting a single value
puts "#{studentDetails["name"]}"

#checking the no of key value pairs in two hashes
if studentDetails=classDetails  #checks the no of characters
    puts "these are equal"
    
else
    puts "these are not equal"
end

#https://www.tutorialspoint.com/ruby/ruby_hashes.htm

