/*
https://codingbat.com/prob/p159339

Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. 
Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
*/

public int[] fix34(int[] nums) {
  int [] arrWith3and4 = new int[nums.length];
  int fourPosition = 0;
  for (int i = 0; i < nums.length; i++) {
    if(nums[i] == 3){
      arrWith3and4[i]= 3;
      arrWith3and4[i+1]= 4;
      fourPosition = nums[i+1];
        for (int j = 0; j < nums.length; j++) {
          if(nums[j]==4){
            nums[j]=fourPosition;
          }
        }
    }
  }
  for (int i = 0; i < arrWith3and4.length; i++) {
    if(arrWith3and4[i]== 0){
      arrWith3and4[i] = nums[i];
    }
  }
  return arrWith3and4;
}