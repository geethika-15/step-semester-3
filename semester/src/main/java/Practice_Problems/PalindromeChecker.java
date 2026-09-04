package Practice_Problems;

public class PalindromeChecker {
    static boolean isPalindromeIterative(String text) {
        int start=0,end=text.length()-1;
        while(start<end) {
            if(text.charAt(start)!=text.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text) {
        if(text.length()<=1)
            return true;
        if(text.charAt(0)!=text.charAt(text.length()-1))
            return false;
        return isPalindromeRecursive(text.substring(1,text.length()-1));
    }

    static boolean isPalindromeArrayReversal(String text) {
        char[] arr=text.toCharArray();
        for(int i=0,j=arr.length-1;i<j;i++,j--) {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        return text.equals(new String(arr));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter text: ");
        String text=sc.nextLine();

        boolean iterative=isPalindromeIterative(text);
        boolean recursive=isPalindromeRecursive(text);
        boolean reversal=isPalindromeArrayReversal(text);

        System.out.println("Iterative: "+(iterative?"Palindrome":"Not Palindrome"));
        System.out.println("Recursive: "+(recursive?"Palindrome":"Not Palindrome"));
        System.out.println("Array Reversal: "+(reversal?"Palindrome":"Not Palindrome"));

        sc.close();
    }
}
