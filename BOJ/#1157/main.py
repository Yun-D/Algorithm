a = input()
a = a.upper()
a_list = [0] * 91

for i in range(65, 91) :
    a_list[i] = a.count(chr(i))

max_value = a_list.count(max(a_list))

if max_value > 1 :
    print("?")
else:
    print(chr(a_list.index(max(a_list))))