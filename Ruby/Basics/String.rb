
user_input = gets.chomp
user_input.downcase!

if user_input.include? "s"
  user_input.gsub!("s", "th")
else
  puts "There are no 's's in your string."
end

puts "Your new thtring is #{user_input}."

name = "jeru"
name.gsub!("e","s",ignore.case=TRUE)
puts name