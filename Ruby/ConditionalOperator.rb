favorite_book = nil
puts favorite_book

#it will add only if the variable is nil
favorite_book ||= "Cat's Cradle"
puts favorite_book

#will not replace as it already have a value
favorite_book ||= "Why's (Poignant) Guide to Ruby"
puts favorite_book

#will replace the value
favorite_book = "Why's (Poignant) Guide to Ruby"
puts favorite_book