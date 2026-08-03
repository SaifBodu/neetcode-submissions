class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(' ||
            ch == '{' ||
            ch == '['){//opening
                stack.push(ch);
            }else{//closing
                if(stack.size() == 0){
                    return false;
                }
                char top = stack.peek();
                if(ch == ')' && top == '(' ||
                ch == '}' && top == '{' ||
                ch == ']' && top == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
