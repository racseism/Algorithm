class Solution {
public:
    string convertToTitle(int n) {
        string output;
        const int powerConstant = 26;
        n = n-1;
        int digit = n % powerConstant;
        output.push_back('A' + digit);
        n = n/powerConstant;
        while (n != 0)
        {
            n = n-1;
            digit = n % powerConstant;
            n = n/powerConstant;
            output.push_back('A' + digit);
        }
        
        size_t startIndex = 0;
        size_t endIndex = output.size()-1;
        while (startIndex < endIndex)
        {
            char tempChar = output[startIndex];
            output[startIndex] = output[endIndex];
            output[endIndex] = tempChar;
            startIndex++;
            endIndex--;
        }
        return output;
    }
};