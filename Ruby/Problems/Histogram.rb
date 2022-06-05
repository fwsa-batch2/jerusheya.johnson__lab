puts "Enter a phrase you'd like to analyze: "
text = gets.chomp

words = text.split  #stores as an array

frequencies = Hash.new(0)  #creates a default hash 

words.each { |word| frequencies[word] += 1 } 
#adds the words as key into the hash and setting the values of the keys
# to the number of times it occurs in the loop


frequencies = frequencies.sort_by { |count| } #sorting the hash by count and saving it in the same hash

frequencies.reverse! #reversing the hash so that the max comes first

frequencies.each do |word,count|
   puts "#{word} #{count}"  #printing each keys and values by loop
end