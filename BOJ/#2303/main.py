from itertools import combinations

def find_sum (num) : #3개씩 묶는 조합대로 더하고, 그중 가장 큰 값을 찾는 함수
    sum_value = 0
    for index_set in combinations(num, 3):
        sum_value = max(sum_value, sum(index_set) % 10) #1의 자리만 출력
    return sum_value


n = int(input())
num_list = []

for i in range(n) :
    num_list.append(list(map(int, input().split())))

result = 0
winner = 0
for person, numbers in enumerate(num_list) :
    temp = find_sum(numbers)
    if result <= temp :
        result = temp
        winner = person+1

print(winner)