
def getter
    puts "Enter your name"
    name = gets.chomp
    puts "Enter your age"
    age = gets.chomp.to_i
    puts "Your name is #{name} and your age is #{age}"
end

getter