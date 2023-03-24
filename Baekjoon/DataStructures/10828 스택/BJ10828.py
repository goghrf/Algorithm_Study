import sys

input = sys.stdin.readline

n = int(input())

list=[]

for i in range(n):
    # 명령 입력 받기
    inputQuest = input().split()

    # 명령이 'push'일경우
    if inputQuest[0] == "push":
        list.append(inputQuest[1])
    
    # 명령이 'pop'일 경우
    elif inputQuest[0] == "pop":
        if len(list) == 0:
            print("-1")
        else:
            print(list.pop())

    # 명령이 'size'일경우
    elif inputQuest[0] == "size":
        print(len(list))
    
    # 명령이 'empty'일 경우
    elif inputQuest[0] == "empty":
        if len(list) == 0:
            print("1")
        else:
            print("0")
    
    # 명령이 'top'일 경우
    elif inputQuest[0] == "top":
        if len(list) == 0:
            print("-1")
        else:
            print(list[-1])