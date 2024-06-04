t = int(input())  # number of test cases

for _ in range(t):
    n, f, k = map(int, input().split())  # input values for n, f, and k
    a = list(map(int, input().split()))  # input values for the cubes

    count = 0

    for i in range(n):
        if a[i] >= a[f - 1]:  # count the number of cubes with values greater than or equal to Dmitry's favorite cube
            count += 1

    if count >= k:  # Dmitry's favorite cube will be removed in all cases
        print("YES")
    elif count == 0:  # Dmitry's favorite cube will not be removed in any case
        print("NO")
    else:  # Dmitry's favorite cube may be either removed or left
        print("MAYBE")