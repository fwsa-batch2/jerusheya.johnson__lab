books = ["Charlie and the Chocolate Factory", "War and Peace", "Utopia", "A Brief History of Time", "A Wrinkle in Time"]

# To sort our books in ascending order, in-place
puts books.sort! { |firstBook, secondBook| firstBook <=> secondBook }

# Sort your books in descending order, in-place below

puts books.sort! { |firstBook, secondBook| secondBook <=> firstBook }

def alphabetize(arr, rev = false)
    arr.sort!
    if rev == true
      arr.reverse!
    else
        arr
    end
end
  
  numbers = [3, 5, 1, 6]
  
  puts alphabetize(numbers)