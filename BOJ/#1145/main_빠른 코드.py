import math

def lcm_three(a, b, c) : # 세 수의 최소공배수 구하기
    def lcm(num1, num2) : # 두 수의 최소공배수 구하기
        return num1 * num2 // math.gcd(num1, num2)

    lcm_ab = lcm(a, b)
    lcm_abc = lcm(lcm_ab, c)

    return lcm_abc

num_list = list(map(int, input().split()))
case = [[0,1,2], [0,1,3], [0,1,4], [0,2,3], [0,2,4], [0,3,4], [1,2,3], [1,2,4], [1,3,4], [2,3,4]] # 5개 수에서 나올 수 있는 경우의 수
result_list = []

for index_set in case :
    value = [num_list[i] for i in index_set] #index_set 안에서 i가 돌고, 그 i를 num_list에 대입하여 해당 위치의 값들을 value에 리스트업
    result_list.append(lcm_three(value[0], value[1], value[2]))

print(min(result_list)) #각 케이스의 최소공배수들 중 가장 작은 값을 출력