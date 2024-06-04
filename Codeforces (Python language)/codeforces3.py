def solve_problem(n, f, k, a):
    # Sort the cubes in non-increasing order
    a.sort(reverse=True)

    # Find the position of the favorite cube after sorting
    favorite_position = a.index(a[f - 1]) + 1

    # Check if the favorite cube will be removed
    if favorite_position <= k:
        return "YES"
    elif favorite_position > n - k:
        return "NO"
    else:
        return "MAYBE"


# Read the input and solve each test case
t = int(input())
for _ in range(t):
    n, f, k = map(int, input().split())
    a = list(map(int, input().split()))
    print(solve_problem(n, f, k, a))