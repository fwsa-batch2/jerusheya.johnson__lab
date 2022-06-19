
#explicit functions
def map(list, &function)
  new_list = []
  list.each { |v| new_list << function.call(v) }   #<< this symbol appends the value into the array
  new_list
end

puts map([1, 2, 3]) { |v| v * 2 }

#implicit functions
def map_implied(list)
  new_list = []
  list.each { |v| new_list << yield(v) }
  new_list
end

puts  map_implied([1, 2, 3]) { |v| v * 2 }