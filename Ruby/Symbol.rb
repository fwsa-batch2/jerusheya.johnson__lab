=begin
  You can think of a Ruby symbol as a sort of name. 
  It’s important to remember that symbols aren’t strings:
         "string" == :string # false
   Above and beyond the different syntax,
   there’s a key behavior of symbols that makes them different from strings. 
   While there can be multiple different strings that all have the same value, 
   there’s only one copy of any particular symbol at a given time.
=end

puts "string".object_id
puts "string".object_id

puts :symbol.object_id
puts :symbol.object_id


#symbols to strings and strings to symbols

strings = ["HTML", "CSS", "JavaScript", "Python", "Ruby"]
symbols = []

strings.each do |s| 
 symbols.push(s.to_sym) # to add into array use push method
 # to_sym or .intern changes string into symbols
end 
print symbols