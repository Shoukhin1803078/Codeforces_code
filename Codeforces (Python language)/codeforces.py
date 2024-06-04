def favorite_cube(t, test_cases):
    results = []
    for case in test_cases:
        n, f, k = case[0], case[1], case[2]
        values = case[3]

        favorite_value = values[f - 1]
        sorted_values = sorted(values, reverse=True)
        removed_max_values = sorted_values[:k].count(favorite_value)

        if f <= k or (removed_max_values > 0 and values.index(favorite_value) < k):
            results.append("YES")
        elif removed_max_values > 0:
            results.append("MAYBE")
        else:
            results.append("NO")

    return results


# Number of test cases
t = int(input())

test_cases_input = []

# Getting input for each test case
for _ in range(t):
    n, f, k = map(int, input().split())
    values = list(map(int, input().split()))
    test_cases_input.append((n, f, k, values))

# Function call
results = favorite_cube(t, test_cases_input)

# Output
for result in results:
    print(result)
