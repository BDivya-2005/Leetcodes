class Solution {
    public int calculate(String s) {
        Stack<Integer>st=new Stack<>();
        int r=0;
        int si=1;
        int n=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                n=n*10+(ch-'0');
            }
            else if(ch=='+'){
                r=r+si*n;
                n=0;
                si=1;
            }
            else if(ch=='-'){
                r=r+si*n;
                n=0;
                si=-1;
            }
            else if(ch=='('){
                st.push(r);
                st.push(si);
                r=0;
                si=1;
            }
            else if(ch==')'){
                r=r+si*n;
                n=0;
                r=r*st.pop();
                r=r+st.pop();
            }
        }
        r=r+si*n;
        return r;
    }
}