n = int(input())

for x in range(2, int(n**0.5)+1) :
    while n % x == 0:
        print(x)
        n //= x

if n > 1:
    print(n)