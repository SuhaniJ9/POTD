class Solution {
    public String removeKdigits(String S, int K) {
       

        if(S.length() == K){
            return "0";
        }
        Stack<Character> st = new Stack();
        int i = 0;
        while(i<S.length()){
            while(K>0 && !st.isEmpty() && st.peek()> S.charAt(i)){
                st.pop();
                K--;
            }
            st.push(S.charAt(i));
            i++;
        }
        while(K--> 0){
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb = sb.reverse();
        while(sb.length()> 1 && sb.charAt(0) == '0')
        sb.deleteCharAt(0);
        return sb.toString();
    }
}
