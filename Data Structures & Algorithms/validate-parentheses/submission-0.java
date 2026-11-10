class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();

        char Arr[] = s.toCharArray();

        for(int i = 0 ; i < Arr.length ; i++)
        {
            if(Arr[i] == '(' || Arr[i] == '[' || Arr[i] == '{')
            {
                st.push(Arr[i]);
            }
            else
            {
                if(st.empty())
                {
                    return false;
                }

                char ch = st.peek();

                if(Arr[i] == ')' && ch == '(')
                {
                    st.pop();
                }
                else if(Arr[i] == ']' && ch == '[')
                {
                    st.pop();
                }
                else if(Arr[i] == '}' && ch == '{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }

        return st.empty();
    }
}
