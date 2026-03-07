class Solution {
    public boolean hasSameDigits(String s) {

        //int number = Integer.parseInt(s);
        //System.out.println("Converted number: " + number);
        //int sum=0;
        
        while (s.length() != 2){
            String str = "";
            for(int i = 0; i < s.length()-1; i++){
                int digit1 = Character.getNumericValue(s.charAt(i));
                int digit2 = Character.getNumericValue(s.charAt(i+1));
                int sum = digit1 + digit2;
                int lsb = sum % 10; 
                str = str + Integer.toString(lsb);
                
                
              //  System.out.println(str+ "str & sum: " + sum+ " lsb "+ lsb);
            }
            s = str;
        }
       
        if (s.charAt(0) == s.charAt(1)) {
            return true;
        }

        return false;
    }
}