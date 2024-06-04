def calculate_an_after_m_seconds(t, queries):
    results = []
    for n, m in queries:
        if m == 0:
            results.append(n)
        elif m == 1:
            if n == 0:
                results.append(1)  # a_0 changes to 1
            else:
                results.append((1 << (n+1)) - 1)  # Set all bits up to position n
        else:
            # For m >= 2, all bits up to n are set
            results.append((1 << (n+1)) - 1)
    return results

# Example usage:
t = 9
queries = [
    (0, 0),
    (0, 1),
    (0, 2),
    (1, 0),
    (5, 2),
    (10, 1),
    (20, 3),
    (1145, 14),
    (19198, 10)
]

results = calculate_an_after_m_seconds(t, queries)
for result in results:
    print(f"Bits set for n: {result.bit_length()}")  # Display number of bits set instead of the huge number
