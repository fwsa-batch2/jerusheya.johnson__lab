=begin
    0 if the first operand (item to be compared) equals the second,
     1 if the first operand is greater than the second,
      and -1 if the first operand is less than the second.

=end

array1 = [2,3,4]
array2=[3,4,5]
puts array1 <=> array2   # -1

array3 = [3,4,5,5]
puts array1 <=> array3  #-1

array4 = [1,2]
puts array1 <=> array4  # 1

array5 = [2,3,4]
puts array1 <=> array5 # 0