class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        char[] ch=x.toCharArray();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(' || ch[i]=='[' || ch[i]=='{'){
                st.push(ch[i]);
            }
            else{
                if((ch[i]==')' && !st.isEmpty() && st.peek()=='(') || (ch[i]==']' && !st.isEmpty() && st.peek()=='[') || (ch[i]=='}' && !st.isEmpty() && st.peek()=='{') )
                st.pop();
                else
                return false;
            }
        }
        return st.isEmpty();
    }
}
