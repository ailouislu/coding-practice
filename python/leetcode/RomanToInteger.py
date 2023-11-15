# 13. Roman to Integer
class RomanToInteger:
    def romanToInt(self, s: str) -> int:
        map = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }
        num = 0
        for i in range(len(s)):
            if i < len(s) - 1 and map[s[i]] < map[s[i + 1]]:
                num -= map.get(s[i])
            else:
                num += map.get(s[i])

        return num

# Call the twoSum method
romanToInteger = RomanToInteger()
result = romanToInteger.romanToInt("III")
print(result)