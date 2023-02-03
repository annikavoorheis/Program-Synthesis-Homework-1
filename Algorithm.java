import java.util.*;
import java.util.Scanner; 

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("type your desired inputs and outputs consecutively with a space between each number. ex: 2 4 3 6");
    String str = sc.nextLine();
    List<String> InOutList = str.split(" ");

    int i = 0;     
    int x = 0;
    int y = 0;   
    int sum;
}

public functionAdditionMultiplicationCheck(){
    for(y =0; x<=10; x++){
        for(y<=10; y++){
            for (i < InOutList.length) {
                let sum = InOutList[i] * x + y * 1;
                if (sum == InOutList[i + 1]){
                    if(i == InOutList.length-1){
                        System.out.println("(input*" +x+")" + " +1 "*y);
                        i = 0;
                    }
                    else{
                        i+=2;
                    }   
                }
            }
        }
    }
}
x=1;
i=0;

public functionSubtractionDivisionCheck(){
    for(y =0; x<=10; x++){
        for(y<=10; y++){
            for (i < InOutList.length) {
                let sum = InOutList[i] / x - y * 1;
                if (sum == InOutList[i + 1]){
                    if(i == InOutList.length-1){
                        System.out.println("(input/" +x+")" + " -1 "*y);
                        i = 0;
                    }
                    else{
                        i+=2;
                    }   
                }
            }
        }
    }
}