#1st way to open a file(stores the file in a variable file)
File.open("/home/jerusheyajohnson/Documents/jerusheya.johnson__lab/Ruby/Advance/Employees.txt", "r+") do |files| #r- read


   #try out one by one


   puts files.read().include? "Jim"
   #checks whether the file include a specific information
   puts file.readline() #reads line by line
   puts files.readchar() #reads char by char
   puts files.readlines() #stores as an array so can iterate
   puts files.read() #reads the whole file

end