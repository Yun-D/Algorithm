import math

n = int(input())
is_prime_num = [True for _ in range(n+1)] #메모리를 덜 차지하게 하기 위해 숫자가 아닌 T/F 등록
prime_num = []
start = 0

if n < 4 :
    print(6)
else :
    #에라토스테네스의 체
    for i in range(2, int(math.sqrt(n)) + 1) :
        temp = 2
        while i * temp <= n :
            is_prime_num[i*temp] = False
            temp += 1

    #걸러진 수들(소수)을 prim_num에 추가하기
    for i in range(2, n+1) :
        if is_prime_num[i] == True:
            prime_num.append(i)
            if i <= int(math.sqrt(n)) :
                start = i #제곱근에 가까운 수가 정답에 근접

    #연속한 두 수(특별한 수) 구하기
    for i in range(prime_num.index(start), len(prime_num)) :
        result = prime_num[i] * prime_num[i+1]
        if result > n : #n보다 가장 가까운 큰 수에서 break
            print(result)
            break