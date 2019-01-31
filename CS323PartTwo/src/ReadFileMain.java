import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.LinkedList;

public class ReadFileMain {
	int[] array;
	LinkedList aList = new LinkedList();
        public int[] Reader(int p) throws FileNotFoundException{
        	
                String fileInput = "NumFilesPartTwo//Num"+p+".txt"; //read file using 'p' as a integer
                Scanner object = new Scanner(new File(fileInput));

                while(object.hasNext()){
                    int input = object.nextInt();
                    aList.add(input);
                }

                array = new int[aList.size()]; 

                for(int k=0;k<aList.size();k++){ //copy arrayList data in Array
                    array[k]=(int) aList.get(k);
                }
                aList.clear();
                object.close();
            
            return array;
        }//reader
        
        public int[] arrayTransfer(int[]target, int[]source){
        	for(int i=0;i<source.length;i++){
        		target[i] = source[i];
        	}
        	return target;
        }
        
        public int arrayMax(int[] x){
        	int temp=0;
        	for(int i=0;i<x.length;i++){
        		if(temp<x[i])
        			temp = x[i];
        	}
        	return temp;
        }
        
}//class
