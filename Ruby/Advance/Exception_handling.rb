begin
    # result=1/0
    # result #zerodivisionerror
    arrays = [1,2,3]
    arrays["jeru"] #Typeerror
rescue ZeroDivisionError => i
    puts "this is an zerodivisionerror #{i}"
rescue TypeError => e
    puts "this is an typeerror #{e}"
else  #acts as default
    puts "no error"
ensure #acts as finally
    puts "code ends"
end