package Assign_Problems;
public class Inventory{
    static void analyzeInventory(int[] sectionA,int[] sectionB){
        int sumA=0,sumB=0,max=sectionA[0],index=0;
        String section="Section A";

        for(int i=0;i<sectionA.length;i++){
            sumA+=sectionA[i];
            if(sectionA[i]>max){
                max=sectionA[i];
                index=i;
                section="Section A";
            }
        }

        for(int i=0;i<sectionB.length;i++){
            sumB+=sectionB[i];
            if(sectionB[i]>max){
                max=sectionB[i];
                index=i;
                section="Section B";
            }
        }

        String status=sumA==sumB?"Balanced":"Not Balanced";
        System.out.println("Section A Total: "+sumA+" | Section B Total: "+sumB+" | Status: "+status+" | Highest Quantity: "+max+" ("+section+", Item "+(index+1)+")");
    }

    public static void main(String[] args){
        int[] sectionA={20,15,30};
        int[] sectionB={25,10,30};
        analyzeInventory(sectionA,sectionB);
    }
}
