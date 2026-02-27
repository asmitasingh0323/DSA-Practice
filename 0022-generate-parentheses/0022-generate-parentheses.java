class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtrack(list, sb, 0,0,n);
        return list;
    }
    public void backtrack(List<String> list, StringBuilder sb, int left,int right,int n){
        if(sb.length() == 2 *n){
            list.add(sb.toString());
            return;
        }
        if(left < n){
            sb.append("(");
            backtrack(list, sb, left + 1, right,n);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(right <left){
            sb.append(")");
            backtrack(list, sb, left, right+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}