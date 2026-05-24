class Solution {
    public String simplifyPath(String path) {
        Deque<String> s= new ArrayDeque<>();
        String[] com=path.split("/");
        for(String c:com){
            if(c.isEmpty() ||c.equals(".")){
                continue;
            }
            if(c.equals("..")){
                s.pollLast();
            }
            else{
                s.offerLast(c);
            }
        }
        return "/"+String.join("/",s);
    }
}