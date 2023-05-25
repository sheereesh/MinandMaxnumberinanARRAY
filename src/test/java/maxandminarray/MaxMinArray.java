package maxandminarray;

public class MaxMinArray {

	public static void main(String[] args) {
		 int array[]= {12,122,13,14,444,65,19};
		 int min =array[0];
		 int max =array[0];
		 
		 for(int i=1;i<array.length;i++) {
			 if(array[i]>max)
				 max=array[i];
			 if(array[i]<min)
				 min=array[i];
				 
		 }
		 System.out.println("maximum number is"+max);
		 System.out.println("minimum number is "+min);
		 	}

}
