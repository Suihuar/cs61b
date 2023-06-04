public class HW0{

/*linked to ex2*/
	public static int Hello(int x, int y){
		if(x==y){
			return x;
		}
		else return y;
	}
/*linked to ex3*/
	public static int mx(int[] m) {
        int ceil=0,loop=0;
		while(loop<=m.length-1){/* array numbers from 0 to 6 */
        	if(ceil<m[loop]){
        		ceil=m[loop];
        	}
        	else ceil=ceil;
        	loop=loop+1;
        } 
        return ceil;
    }

/*Linked to ex5 */
public static void windowPosSum(int[] a, int n){
	for(int i=0;i<a.length;i+=1){
		if(a[i]<0){
			continue;
		}
		else{
			for(int j=i+1;j<=i+n;j+=1){
				if(j>=a.length){
					break;
				}
				else a[i]=a[i]+a[j];
			}
		}
	}
}
	public static void main(String[] args){
		
/*EX1 drawing a triangle of 5 layers*/

		int b=1;
		while (b<=5){
			int a=1;
			while(a<=b){
				System.out.print("*");
				a=a+1;
			}
			b=b+1;
			System.out.print("\n");
		}

/*EX2 define a function */

		System.out.println(Hello(5,5));


/*EX3 About arrays*/
	int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
	System.out.println(mx(numbers));

/*Ex4 For Loop*/
	for(int i=0,j=10;i<j;i+=1){
		System.out.println(i+j);
	}

/*EX5  */
int[] a={1,2,-3,4,5,4};
int n = 3;
windowPosSum(a,n);
System.out.println(java.util.Arrays.toString(a));







	}


}