puts "Text to search through"
text = gets.chomp
puts "Word to readact"
readact = gets.chomp

words = text.split(" ")


words.each do |word|
    if(readact == word)
      print "REDACTED "
    else 
     print word + " "
    end
end
