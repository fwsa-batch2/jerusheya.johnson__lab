=begin
  Refractoring:
    the process of introducing small and incremental changes to 
    leave the code in a better state than it was
=end

#Eg:
require 'prime'   # This is a module. We'll cover these soon!

def first_n_primes(n)
  return "n must be an integer." unless n.is_a? Integer
  return "n must be greater than 0." unless n > 0
  Prime.first n
end

first_n_primes(10)