begin
    num=1
    num1=0
    result=num/num1
    puts result
rescue => exception
    puts "this is an error #{exception}"
else  #acts as default
    puts "no error"
ensure #acts as finally
    puts "code ends"
end