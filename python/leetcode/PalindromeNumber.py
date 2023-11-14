from typing import List

class PalindromeNumber:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        input = str(x)
        input_len = len(input)
        for i in range(input_len // 2):
            if input[i] != input[input_len - 1 - i]:
                return False

        return True

# Call the PalindromeNumber method
palindrome_Number = PalindromeNumber()
result = palindrome_Number.isPalindrome(161)
print(result)
