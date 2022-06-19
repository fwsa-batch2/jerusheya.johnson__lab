#1st program:
#multidimensional array to single dimensional array

names = [["Jhumpa","Lahiri1"],["J. K", "Rowling"],["Devdutt", "Pattanaik"]]
names_new=[]
# a = names.flatten!
# print a
for i in 0...names.length do
    for j in 0...names.length do
        if names[i][j] != nil && names[i][j+1]!=nil
          a = names[i][j]+" "+names[i][j+1]
          names_new.push(a)
        end
    end
end
puts names_new.to_s
