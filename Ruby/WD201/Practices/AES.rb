require 'aes'

# 1. Generate a random key
key = AES.key
puts key
# => "290c3c5d812a4ba7ce33adf09598a462"

# 2.  Encrypt a string using default base64 code.
b64 = AES.encrypt("A super secret message", key)
puts b64
# => "IJjbgbv/OvPIAf4R5qAWyg==$fy0v7JwRX4kyAWflgouQlt9XGmiDKvbQMRHmQ+vy1fA="

# 3. encrypt a string using format
plain = AES.encrypt("A super secret message", key, {:format => :plain}) 
puts plain
# => [";\202\222\306\376<\206\343\023\245\312\225\214KAm", 
#     "C\343\023\323U~W>\023y\217\341\201\371\352\334\311^\307\352{\020 H(DVw\3224N\223"]

# 4. Generate a random initialization vector
iv = AES.iv(:base_64)
puts iv
# => "IJjbgbv/OvPIAf4R5qAWyg=="

# 5. Encrypt a string using initialized base64 code
b64_iv = AES.encrypt("A super secret message", key, {:iv => iv})
puts b64_iv
# => "IJjbgbv/OvPIAf4R5qAWyg==$fy0v7JwRX4kyAWflgouQlt9XGmiDKvbQMRHmQ+vy1fA="

AES.decrypt(b64, key)
# => "A super secret message"

AES.decrypt(plain, key, {:format => :plain})
# => "A super secret message" 

# By default data is padded to the nearest 16 bytes block.  To turn
# this off, you may use the :padding => false (or nil) option.
#
# In this mode however, the caller is required to pad the data.  In
# the following example the message is exactly 16 bytes long, so no
# error aries.
msg = AES.encrypt("A secret message", key, {:padding => false})
# => "SnD+WIfEfjZRrl+WAM/9pw==$89sGGZsu973j8Gl6aXC8Uw=="

# Be sure to pass the same padding option when decrypting the
# message, as it will fail if you try to decrypt unpadded data and
# didn't specify :padding => false.
AES.decrypt(msg, key, {:padding => false})
# => "A secret message"