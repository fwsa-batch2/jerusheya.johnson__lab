
#2nd Problem

todos = [["Send invoice", "money"],["Clean room", "organize"],["Pay rent", "money"],["Arrange books", "organize"],["Pay taxes", "money"],["Buy groceries", "food"]]
key_array = []
array1=[]
array2 = []
array3=[]
for i in 0...todos.length do
        key_array.push(todos [i][1])
end
key_array1 =key_array.uniq


for i in 0...todos.length do
    for j in 0...todos.length do
        if todos[i][j] == "money"
             array1.push(todos[i][0])
        end
    end
end
for i in 0...todos.length do
    for j in 0...todos.length do
        if todos[i][j] == "organize"
             array2.push(todos[i][0])
        end
    end
end
for i in 0...todos.length do
    for j in 0...todos.length do
        if todos[i][j] == "food"
             array3.push(todos[i][0])
        end
    end
end
value_array=[]
value_array.push(array1)
value_array.push(array2)
value_array.push(array3)


hash = {}
#using for loop
for i in 0...key_array1.length do
    for j in 0...value_array.length do
        if i == j
            hash.store(key_array1[i],value_array[j])
        end
    end
end
puts hash

hash.each {|k,v| puts "#{k}:\n#{v}"}