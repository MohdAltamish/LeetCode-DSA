class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[10000];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                top++;
                stack[top] = c;
            }
            else{
                
                if(top == -1){
                    return false;
                }
                if (c == ')' && stack[top] != '('){
                    return false;
                }
                if (c == ']' && stack[top] != '['){
                    return false;
                }
                if (c == '}' && stack[top] != '{'){
                    return false;
                }
                top--;
            }
        }
        return top == -1;
    }
}