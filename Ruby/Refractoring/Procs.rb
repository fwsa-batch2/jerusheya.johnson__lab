# can store a block of code in a variable

#select method
multiples_of_3 = Proc.new do |n|
    n % 3 == 0
end
  print (1..100).to_a.select(&multiples_of_3) #to_a --> changes to array


#collect method
floats = [1.2, 3.45, 0.91, 7.727, 11.42, 482.911]
round_down = Proc.new { |x| x.floor }
ints = floats.collect(&round_down)
print ints

#map method
map_procs = Proc.new {|x| x*2 }
print (2..6).to_a.map(&map_procs)


#usage of proc
group_1 = [4.1, 5.5, 3.2, 3.3, 6.1, 3.9, 4.7]
group_2 = [7.0, 3.8, 6.2, 6.1, 4.4, 4.9, 3.0]
group_3 = [5.5, 5.1, 3.9, 4.3, 4.9, 3.2, 3.2]

over_4_feet = Proc.new { |height| height >= 4 }

can_ride_1 = group_1.select(&over_4_feet)
can_ride_2 = group_2.select(&over_4_feet)
can_ride_3 = group_3.select(&over_4_feet)

puts can_ride_1
puts can_ride_2
puts can_ride_3

#procs yielded in method
def greeter
  yield
end
phrase = Proc.new { puts "Hello there!" }
greeter(&phrase)

#directly calling proc
hi = Proc.new { puts "Hello!" }
hi.call  #call method calls the proc