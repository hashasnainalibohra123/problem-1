def get_uppercase_alphabet_map():

    uppercase_alphabet_dict = {}
    value = 1

    for c in range(65, 91):
        uppercase_alphabet_dict[str(value)] = chr(c)
        value = value + 1

    return uppercase_alphabet_dict


def count_digit(n):

    count = 0

    while n != 0:
        n //= 10
        count += 1

    return count


if __name__ == '__main__':
    n = 123

    digits = count_digit(n)

    alphabet_map = get_uppercase_alphabet_map()

    for i in range(digits):
        for j in range(i+1, digits):
            m = str(n)

