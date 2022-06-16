require 'aes'#a gem package

source_file = ARGV[0]#it is an array which is an array 
password = AES.key#generates a random package
if source_file!=nil 
   encrypted = AES.encrypt(File.read(source_file), password)#encrypts the file with the key
end
target_file = "#{source_file}.enc"
File.open(target_file, "wb") {|f| f.write(encrypted)}#writes the file encrypted
puts "File encrypted to #{target_file} with password #{password}"