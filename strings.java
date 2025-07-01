public class strings{
    public static String largest(String fruits[]){
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
           if(largest.compareTo(fruits[i]) < 0){
            largest=fruits[i];
           }
        }
            return largest;
    } 
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String stringCompress(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }

        }
        return newStr;
    }
    public static void main(String args[]) {
    //    String str = "HelloWorld";
    //    System.out.println(str.substring(0,5));
    // String fruits[]={"apple","mango","banana"};
    // System.out.println(largest(fruits));
    // StringBuilder sb = new StringBuilder("");
    // for(char ch='a';ch<='z';ch++){
    //     sb.append(ch);
    // }
    // System.out.println(sb);
    // String str = "hi i am sakshi";
    // System.out.println(toUppercase(str));
    // String str = "abcd";
    // System.out.println(stringCompress(str));


    }
}