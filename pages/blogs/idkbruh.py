import numpy as np

num_arrays = 20
array_length = 8

data = [np.random.randint(0, 100, size=array_length) for _ in range(num_arrays)]

averaged_array = np.mean(data, axis=0)

print("Generated Arrays:")
for i, arr in enumerate(data):
    print(f"Array {i + 1}: {arr}")

print("\nAveraged Array:")
print(averaged_array)