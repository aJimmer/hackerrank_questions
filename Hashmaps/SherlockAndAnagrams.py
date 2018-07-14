#!/bin/python3

def main():
    N = int(input())
    
    for i in range(N):
        map = dict()
        str = input()
        
        for i in range(len(str)):
            for j in range(i, len(str)):
                sstr = str[i:j+1]
                sstr = ''.join(sorted(sstr))
                map[sstr] = map.get(sstr, 0) + 1
        count = 0
        for k in map:
            val = map[k]
            count += (val*(val-1))//2
        print(count)
main()