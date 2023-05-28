n = int(input())
group = []

for x in range(n) :
    group.append(input())


set_group = list(set(group)) #set으로 중복값 제거
set_group.sort() #사전순 정렬 먼저
set_group.sort(key=len) #길이순 정렬

for x in range(len(set_group)) :
    print(set_group[x])