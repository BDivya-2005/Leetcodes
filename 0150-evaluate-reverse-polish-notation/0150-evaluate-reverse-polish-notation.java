class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer>s=new ArrayDeque<>();
        for(String t:tokens){
            if(t.length()>1||Character.isDigit(t.charAt(0))){
                s.push(Integer.parseInt(t));
            }
            else{
                int sec=s.pop();
                int f=s.pop();
                switch(t){
                    case "+":
                        s.push(sec+f);
                        break;
                    case "-":
                        s.push(f-sec);
                        break;
                    case "*":
                        s.push(f*sec);
                        break;
                    case "/":
                        s.push(f/sec);
                        break;
                }
            }
        }
        return s.pop();
    }
}