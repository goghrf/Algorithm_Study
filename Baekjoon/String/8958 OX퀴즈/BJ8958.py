import sys
input = sys.stdin.readline

n = int(input())

# n만큼 반복
for _ in range(n):
    count = 0
    total = 0
    quiz = input()
    for i in quiz:
        # 0일 때
        if i == "O":
            count += 1
            total += count
        # X일 때
        else:
            count = 0
            total += count

    # 최종값 출력
    print(total)

