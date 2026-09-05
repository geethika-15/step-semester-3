package Assign_Problems;
public class TypeCheck{
    static void checkTypingAccuracy(String original,String typed){
        int matched=0,first=-1;
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)==typed.charAt(i))
                matched++;
            else if(first==-1)
                first=i;
        }

        double accuracy=matched*100.0/original.length();

        if(first==-1)
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",matched,original.length(),accuracy);
        else
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",matched,original.length(),accuracy,first+1,original.charAt(first),typed.charAt(first));
    }

    public static void main(String[] args){
        checkTypingAccuracy("hello world","hello worlt");
    }
}

