
#2nd program:
#merging two arrays into a hash


#using map.with_index
books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
books.map.with_index do|book, i|
   authors.map.with_index do |author, j|
    if i==j
        puts  "#{book} was written by #{author}"
    end
end
end

#using for loop
books = ["Design Arts","Anthem","Shogun"]
authors =  ["Bruno","Neal","James"]
hash1 = {}


#using for loop
for i in 0...books.length do
    for j in 0...authors.length do
        if i == j
            hash1.store(books[i],authors[j])
        end
    end
end
puts hash1

