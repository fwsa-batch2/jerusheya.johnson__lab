#difference between lambda and procs

# a lambda checks the number of arguments passed to it, while a proc does not.

#when a proc returns, it does so immediately, without going back to the calling method.

def batman_ironman_proc
    victor = Proc.new { return "Batman will win!" }
    victor.call
    "Iron Man will win!"
end
  
  puts batman_ironman_proc
  
#when a lambda returns, it passes control back to the calling method
def batman_ironman_lambda
    victor = lambda { return "Batman will win!" }
    victor.call
    "Iron Man will win!"
end
  
  puts batman_ironman_lambda

  