#1st Problem

books = ["Design as Art", "Anathem", "Shogun"]
  authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]

  hash = {}
#using for loop
for i in 0...books.length do
    for j in 0...authors.length do
        if i == j
             author = authors[j].split.first.downcase!
            hash.store(author.to_sym,books[i])
        end
    end  
end
puts hash