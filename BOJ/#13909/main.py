import math
import sys
n = int(sys.stdin.readline())

#창문이 열려있으려면 해당 수의 약수의 개수가 홀수개여야 함. -> 제곱수의 개수 구하기
print(math.floor(math.sqrt(n)))