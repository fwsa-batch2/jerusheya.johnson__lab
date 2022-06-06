#yield helps us to call the parameter wherever needed

def block_test
    puts "We're in the method!"
    puts "Yielding to the block..."
    yield  
    puts "We're back in the method!"
end
  
  block_test { puts ">>> We're in the block!" }


#Eg1:

def yield_name(name)
    puts "In the method! Let's yield."
    yield("Kim")
    puts "In between the yields!"
    yield(name)
    puts "Block complete! Back in the method."
end
  
  yield_name("Eric") { |n| puts "My name is #{n}." }
  
  # Now call the method with your name!
  yield_name("Jamie") { |n| puts "My name is #{n}." }

#Eg2:
def double(num)
    yield(num)
end
  
  double(16) {|x| puts x * 2}