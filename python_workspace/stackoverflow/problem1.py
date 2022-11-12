
# I would like to find out how to find repeated numbers after every 4 numbers.

# This is what I have.

# arr = [4, 5, 2, 1, 1, 5 , 1, 8, 3, 5 ,0, 7, 2 , 5 ,6 , 5, 8]
# size = len(arr)
# for i in range(0,size,4):
#     if arr[i] == arr[i + 4] and arr[i + 4] == arr[i + 8] and arr[i + 8] == arr[i + 12 :
#         print(arr[i])\
# arr = [4, 5, 2, 1, 1, 5 , 1, 8, 3, 5 ,0, 7, 2 , 5 ,6 , 5, 8]

# for i in range(0, len(arr)):
    # try:
    #     # checking the conditions
    #     if arr[i] == arr[i+4] and arr[i] == arr[i+8] and arr[i] == arr[i+12] :
    #         print(arr[i])
    # except IndexError as e:
    #     # when you catch this exception, you can no longer find a number that match what you are looking for, so you break the loop.
    #     # print(e)
    #     break
arr = [4, 5, 2, 1, 1, 5 , 1, 8, 3, 5 ,0, 7, 2 , 5 ,6 , 5, 8]
dictionary = {}
print(len(arr))
arr_list = [len(arr)]

for i in (1,len(arr)):
     arr[i] += arr_list
#     if len(arr_list) == 4:
#         dictionary += arr_list
#         arr_list = []
# print(dictionary)
print(arr_list)
        
    