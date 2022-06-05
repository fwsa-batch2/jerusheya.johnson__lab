
  
# Using '$0' To know about the script name 
puts "Script_name: ",$0;   
  
# Using ' #{$$}' to know about the total number of process in the script
puts "Total number of process in this script: #{$$}"     
  
# Pattern matching
"jerusheya is a girl" =~ /is/
  
# use to print the string's left word of the match
puts $`
  
# use to print the string matched by the last pattern match
puts $&
  
# use to print the string to the right of the last pattern match
puts $'