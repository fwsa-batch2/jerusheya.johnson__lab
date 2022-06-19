
p " now's  the time".split        #=> ["now's", "the", "time"]
p " now's  the time".split(' ')   #=> ["now's", "the", "time"]
p " now's  the time".split(/ /)   #=> ["", "now's", "", "the", "time"]
p "1, 2.34,56, 7".split(%r{,\s*}) #=> ["1", "2.34", "56", "7"]
p "hello".split(//)               #=> ["h", "e", "l", "l", "o"]
p "hello".split(//, 3)            #=> ["h", "e", "llo"]

#%r{...} (or %r[...], or %r#....#, or %rX...X... you get the gist) is equivalent to /.../
#\s is a space, and * is 0 or more of preceding token
p "hi mom".split(%r{\s*})         #=> ["h", "i", "m", "o", "m"]

#%w(foo bar) is a shortcut for ["foo", "bar"]
p %w(hi there)
p "mellow yellow".split("ello")   #=> ["m", "w y", "w"]
p "1,2,,3,4,,".split(',')         #=> ["1", "2", "", "3", "4"]
p "1,2,,3,4,,".split(',', 4)      #=> ["1", "2", "", "3,4,,"]
p "1,2,,3,4,,".split(',', -4)     #=> ["1", "2", "", "3", "4", "", ""]

p "1:2:3".split(/(:)()()/, 2)     #=> ["1", ":", "", "", "2:3"]

p "".split(',', -1)               #=> []


#join 

puts [ "a", "b", "c" ].join        #=> "abc"
puts [ "a", "b", "c" ].join("-")   #=> "a-b-c"
p [ "a", [1, 2, [:x, :y]], "b" ].join("-")   #=> "a-1-2-x-y-b"

puts [a,b,c,d,e,f].select{|v| v=~ /[aeiou]/}