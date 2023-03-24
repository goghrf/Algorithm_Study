import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    count = 0
    total = 0
    quiz = input()
    for i in quiz:
        if i == "O":
            count += 1
            total += count
        else:
            count = 0
            total += count
    
    print(total)

