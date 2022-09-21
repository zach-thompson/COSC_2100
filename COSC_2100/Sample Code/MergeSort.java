package sample_code;

class MergeSort {
	
	static int Y1[] = {13, 101, 79, 23, 154, 4, 11, 38, 89, 45, 17, 94, 62};
	static int lenY1 = 13;
	
	public static void main(String[] args) {
		mergesort(Y1,0,lenY1-1);
		for (int i = 0; i < lenY1; i++)
			System.out.print(Y1[i] + " ");
			System.out.println("\n");
	}
	
	public static void mergesort(int x[], int left, int right) {
		int middle;
		if (left >= right) {
			return;
		}
		else {
			middle=left+((right-left+1)>>1);
			mergesort(x,left,middle-1);
			mergesort(x,middle,right);
			merge(x,left,middle,right);
		}
	}
	
	public static void merge(int x[], int left, int middle, int right) {
		int leftind, endleft, rightind, endright, temp, i;
		leftind=left;
		rightind=middle;
		endleft=middle-1;
		endright=right;
		while ((leftind<=endleft)&&(rightind<=endright)){
			if (x[leftind]<=x[rightind]) {
				leftind++;
			}
			else {
					temp=x[rightind];
					for (i=rightind-1; i>=leftind; i--) {
						x[i+1]=x[i];
					}
					x[leftind]=temp;
					leftind++;
					endleft++;
					rightind++;
				}
			}
		}
	}

