package lec15_Recursion2;

public class TowerOfHanaoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		towerOfHanoi(2, 'a', 'b', 'c');

	}
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		
		if(disks==0) {
			return;
		}
		
		towerOfHanoi(disks-1, source, destination, auxiliary);
		System.out.println(source+" "+destination);
		towerOfHanoi(disks-1, auxiliary,source, destination);



	}
}
