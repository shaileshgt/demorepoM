import java.util.Arrays;

class insertionsortpgm{
	
	public static void insertionsort(int[] a) {
	int n= a.length;
	for(int j=1;j<n;j++) {
	int i=j-1;
	int key = a[j];
	while((i>-1)&&(a[i]>key)) {
		a[i+1]= a[i];
		i--;
	}
	
	a[i+1]=key;
	}
	}
	public static void main(String[] args) {
		int a[] = {0,4,7,2,9};
		insertionsort(a);
		System.out.println(Arrays.toString(a));
		
		
		
	}
	
	
	
}