hash_code = 123
hash_str = str(hash_code)
alphabets = {1: A, 2: B, ... 26: Z}
str_out = ""
i = 0
while i < len(hash_str):
    c = hash_str[i]
    if c > 2:
        str_out += alphabets[c]
    if c <= 2 and hash_str[i+1] <= 6:
        str_out
