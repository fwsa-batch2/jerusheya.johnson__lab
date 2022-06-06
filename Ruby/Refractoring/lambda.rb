
#Lambda for Array
strings = ["leonardo", "donatello", "raphael", "michaelangelo"]

symbolize = lambda {|para| para.to_sym}

symbols = strings.collect(&symbolize)
print symbols

#Lambda for Hash
crew = {
    captain: "Picard",
    first_officer: "Riker",
    lt_cdr: "Data",
    lt: "Worf",
    ensign: "Ro",
    counselor: "Troi",
    chief_engineer: "LaForge",
    doctor: "Crusher"
  }
  # Add your code below!
  first_half = lambda {|key,value| value<"M"}
  puts crew.select(&first_half)