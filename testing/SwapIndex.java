public class SwapIndex{

	public static int[] getSwapindex(int[] arrays){

		for(int index = 1; index < arrays.length; index++){
	
		if(index % 2 != 0){

			int temp = arrays[index];

			arrays[index] = arrays[index-1];

			arrays[index-1] = temp;

		}

		}return arrays;

	}

}