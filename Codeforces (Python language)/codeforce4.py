def solve_problem(n, f, k, a):
    # The value of the favorite cube before sorting
    favorite_value = a[f - 1]

    # Sort the cubes in non-increasing order
    a.sort(reverse=True)

    # Count how many of the first k cubes have the same value as the favorite cube
    count_in_top_k = sum(1 for i in range(k) if a[i] == favorite_value)

    # Count how many cubes in total have the same value as the favorite cube
    total_count = a.count(favorite_value)

    # Determine if the favorite cube is definitely removed, definitely not removed, or maybe
    if count_in_top_k == total_count:
        return "YES"
    elif count_in_top_k == 0:
        return "NO"
    else:
        return "MAYBE"


# Read the input and solve each test case
t = int(input())
for _ in range(t):
    n, f, k = map(int, input().split())
    a = list(map(int, input().split()))
    print(solve_problem(n, f, k, a))