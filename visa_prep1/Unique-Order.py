def unique_elements(arr):
    unique_arr = []
    seen = set()
    for element in arr:
        if element not in seen:
            unique_arr.append(element)
            seen.add(element)
    return unique_arr
if __name__ == "__main__":
    n = int(input())
    arr = list(map(int, input().split()))
    unique_arr = unique_elements(arr)
    print(*unique_arr) 
