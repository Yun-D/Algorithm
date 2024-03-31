n = input()
f = input()

temp_n = int(n[:-2].ljust(len(n), '0')) #뒤에서 두번째 자리까지 0으로 만듦
while True :
    if temp_n % int(f) == 0 :
        print(str(temp_n)[-2:])
        break

    temp_n += 1