# puts "what is your next todo?"
# next_todo = gets.chomp

# puts "\n" #Carriage return

# puts "[  ] #{next_todo}"#String 

# puts "abcd efgh #{1 + 10}"



#trying fixing the below code
#shows ans in integer which is not right
num = [1,2,3,4,5,6]
puts "The average of these numbers are #{num.sum/num.length}"

#to get correct ans
num = [1,2,3,4,5,6]
num_sum = num.sum.to_f
num_length = num.length.to_f
p "#{num_sum/num_length}" 