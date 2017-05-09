public class Solution {
	public boolean Find(int target, int[][] array) {
		int row = array.length;//该二维数组的行数
		int col = array[0].length;//该二维数组的列数
		int i = 0;
		int j = col - 1;
		while(i < row && j >= 0){
			if(target > array[i][j]){
				i++;//如果目标数大于当前数组位置的数，则右移
				continue;
			}
			else if(target < array[i][j]){
				j--;//如果目标数小于当前数组位置的数，则左移
				continue;
			}
			else
				return true;
		}
		return false;
	}
}