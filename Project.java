/* Author Soumen Ghosh
   Date: 03/08/2020
   Created at: 11:03 AM
*/
public class Project {

	public static void main(String []args) {
//		System.out.println("Soumen");
		
		long start = System.nanoTime();
		
		FUEC_DAEC();
		FUEC_TAEC();
		FUEC_QUAEC();
		
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("time taken: "+time+"ns");
		
//		String str = bitFlip(6, "10110001");
	}
	
	public static String bitFlip(int index, String str) {
		char temp = str.charAt(index);
		if(temp == '0') {
			StringBuilder string = new StringBuilder(str);
			string.setCharAt(index, '1');
			str = "";
			str = ""+string;
		} else if(temp == '1') {
			StringBuilder string = new StringBuilder(str);
			string.setCharAt(index, '0');
			str = "";
			str = ""+string;
		}
		
		return str;
	}
	
	
	public static void FUEC_DAEC() {
		String actualIn  = "1011001001101101";
		String updatedIn = "1011001001101101";
		
		byte [][]H = {{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
					 {0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0},
					 {0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1},
					 {0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0},
					 {0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0 ,0, 1, 1, 0, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1}};
		
		byte x[] = new byte[16];
		for(byte i = 0; i < x.length; i++) {
			x[i] = (byte) (actualIn.charAt(i) - 48);
		}
		
		byte c0 = (byte) (x[0] ^ x[4] ^ x[7] ^ x[8] ^ x[11] ^ x[12] ^ x[13]);
		byte c1 = (byte) (x[1] ^ x[3]^ x[5] ^ x[7] ^ x[9] ^ x[10] ^ x[11] ^ x[14]); 
		byte c2 = (byte) (x[0] ^ x[2] ^ x[6] ^ x[7] ^ x[9] ^ x[12] ^ x[14] ^ x[15]);
		byte c3 = (byte) (x[1] ^ x[4] ^ x[8] ^ x[9] ^ x[12]);
		byte c4 = (byte) (x[0] ^ x[3] ^ x[4] ^ x[7] ^ x[12] ^ x[13] ^ x[15]);
		byte c5 = (byte) (x[1] ^ x[2] ^ x[5] ^ x[9] ^ x[10] ^ x[12] ^ x[14]);
		byte c6 = (byte) (x[2] ^ x[3] ^ x[6] ^ x[8] ^ x[10] ^ x[11] ^ x[13] ^ x[15]);
		
		String newStr = ""+c0+c1+c2+c3+c4+c5+c6+updatedIn;
		char newChar[] = newStr.toCharArray();
		byte b[] = new byte[newChar.length];
		for(byte i = 0; i < newChar.length; i++) {
			b[i] = (byte)((int)newChar[i] - 48);
		}
		
		byte []arr = new byte[7];
		for(byte i = 0; i < H.length; i++) {
			byte temp = 0;
			for(byte j = 0; j < H[0].length; j++) {
				temp = (byte) (temp ^ H[i][j] ^ b[j]);
			}
			arr[i] = temp;
		}
		
		/*
		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
		}
//		System.out.println();
		*/
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[7];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[4] ^ new_x[7] ^ new_x[8] ^ new_x[11] ^ new_x[12] 
				  ^ new_x[13]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[3] ^ new_x[5] ^ new_x[7] ^ new_x[9] ^ new_x[10]  
					^ new_x[11] ^ new_x[14]);
		s[2] = (byte) (c2 ^ new_x[0] ^ new_x[2] ^ new_x[6] ^ new_x[7] ^ new_x[9] ^ new_x[12]
					^ new_x[14] ^ new_x[15]);
		s[3] = (byte) (c3 ^ new_x[1] ^ new_x[4] ^ new_x[8] ^ new_x[9] ^ new_x[12]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[3] ^ new_x[4] ^ new_x[7] ^ new_x[12] ^ new_x[13]
					^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[2] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[12]
					^ new_x[14]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[3] ^ new_x[6] ^ new_x[8] ^ new_x[10] ^ new_x[11]
					^ new_x[13] ^ new_x[15]);
		
		for(byte i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		byte index = -1;
		for(byte j = 7; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < H.length; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 7) {
					index = j;
					break;
				}
			}
		}
		
		byte sum = 0;
		for(byte i = 0; i < s.length; i++) {
			sum += s[i];
		}
		
		
		if(sum == 0 && index == -1) {
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			System.out.println("no error!");
//			System.out.println(index);
		}
		else if(sum != 0 && index != -1){
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
			System.out.println("error occured at index (zero based): "+(index - 7));
			String cor = bitFlip((index - 7), updatedIn);
			System.out.println(cor);
			
//			char temp = updatedIn.charAt(index - 7);
//
//			if(temp == '0') {
//				StringBuilder string = new StringBuilder(updatedIn);
//				string.setCharAt(index - 7, '1');
//				System.out.println("after correcting: "+string);
//			} else if(temp == '1') {
//				StringBuilder string = new StringBuilder(updatedIn);
//				string.setCharAt(index - 7, '0');
//				System.out.println("after correcting: "+string);
//			}
			
		} else if(sum != 0 && index == -1) {
			System.out.println("multiple error!");
			boolean found2 = false;
			byte []tempArr2 = new byte[7];
			for(byte j = 7; j < H[0].length - 1; j++) {
				byte temp = 0;
				for(byte i = 0; i < H.length; i++) {
					tempArr2[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1]);
				}
				
				byte tempSum = 0;
				for(byte i = 0; i < tempArr2.length; i++) {
					
					if(tempArr2[i] == s[i]) {
						tempSum++;
					} else {
						tempSum = 0;
						break;
					}
					if(tempSum == 7) {
						System.out.println((j - 7)+" "+(j - 7 + 1));
						found2 = true;
						String cor1 = bitFlip((j - 7), updatedIn);
						String cor2 = bitFlip((j - 7 + 1), cor1);
						System.out.println("actual input:  "+actualIn);
						System.out.println("updated value: "+updatedIn);
						System.out.println("corrected value: "+cor2);
						break;
					}
				}
				
			}
			
			if(found2 == false) {
				System.out.println("3 burst error detected.");
			}
		}
	}
	
	public static void FUEC_TAEC() {
		String actualIn  = "1011001001101101";
		String updatedIn = "1011001001101101";
		
		byte H[][] = {{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1},  
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1},
					 {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0}};
	
		byte x[] = new byte[16];
		for(byte i = 0; i < x.length; i++) {
			x[i] = (byte) (actualIn.charAt(i) - 48);
		}
		
		byte c0 = (byte) (x[0] ^ x[3] ^ x[4] ^ x[7] ^ x[8] ^ x[11] ^ x[15]);
		byte c1 = (byte) (x[1] ^ x[4] ^ x[5] ^ x[8] ^ x[9] ^ x[12] ^ x[13]);
		byte c2 = (byte) (x[2] ^ x[5] ^ x[9] ^ x[10] ^ x[12]);
		byte c3 = (byte) (x[6] ^ x[10] ^ x[14] ^ x[15]);
		byte c4 = (byte) (x[0] ^ x[4] ^ x[8] ^ x[9] ^ x[13] ^ x[14] ^ x[15]);
		byte c5 = (byte) (x[1] ^ x[5] ^ x[9] ^ x[11] ^ x[12] ^ x[13] ^ x[14]);
		byte c6 = (byte) (x[2] ^ x[7] ^ x[9] ^ x[10] ^ x[11] ^ x[14]);
		byte c7 = (byte) (x[3] ^ x[6] ^ x[8] ^ x[12] ^ x[14]);
		
		String newStr = ""+c0+c1+c2+c3+c4+c5+c6+c7+updatedIn;
		char newChar[] = newStr.toCharArray();
		byte b[] = new byte[newChar.length];
		for(byte i = 0; i < newChar.length; i++) {
			b[i] = (byte) ((int)newChar[i] - 48);
		}
		
		byte []arr = new byte[8];
		for(byte i = 0; i < H.length; i++) {
			byte temp = 0;
			for(byte j = 0; j < H[0].length; j++) {
				temp = (byte) (temp ^ H[i][j] ^ b[j]);
			}
			arr[i] = temp;
		}
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[8];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[3] ^ new_x[4] ^ new_x[7] ^ new_x[8] ^ new_x[11]
				  ^ new_x[15]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[4] ^ new_x[5] ^ new_x[8] ^ new_x[9] ^ new_x[12]
				  ^ new_x[13]);
		s[2] = (byte) (c2 ^ new_x[2] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[12]);
		s[3] = (byte) (c3 ^ new_x[6] ^ new_x[10] ^ new_x[14] ^ new_x[15]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[4] ^ new_x[8] ^ new_x[9] ^ new_x[13] ^ new_x[14] 
				  ^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[5] ^ new_x[9] ^ new_x[11] ^ new_x[12] ^ new_x[13]
				  ^ new_x[14]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[7] ^ new_x[9] ^ new_x[10] ^ new_x[11] ^ new_x[14]);
		s[7] = (byte) (c7 ^ new_x[3] ^ new_x[6] ^ new_x[8] ^ new_x[12] ^ new_x[14]);
		
		for(byte i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		byte index = -1;
		for(byte j = 8; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < 8; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 8) {
					index = j;
					break;
				}
			}
		}
		
		byte sum = 0;
		for(byte i = 0; i < s.length; i++) {
			sum += s[i];
		}
		
		if(sum == 0 && index == -1) {
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			System.out.println("no error!");
//			System.out.println(index);
		} else if(sum != 0 && index != -1){
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
			System.out.println("error occured at index (zero based): "+(index - 8));
			String cor = bitFlip((index - 8), updatedIn);
			System.out.println("corrected value: "+cor);
			
		} else if(sum != 0 && index == -1) {
			System.out.println("multiple error!");
			boolean found2 = false;
			byte []tempArr2 = new byte[8];
			for(byte j = 8; j < H[0].length - 1; j++) {
				byte temp = 0;
				for(byte i = 0; i < H.length; i++) {
					tempArr2[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1]);
				}
				
				byte tempSum = 0;
				for(byte i = 0; i < tempArr2.length; i++) {
					
					if(tempArr2[i] == s[i]) {
						tempSum++;
					} else {
						tempSum = 0;
						break;
					}
					if(tempSum == 8) {
						System.out.println("actual input:  "+actualIn);
						System.out.println("updated value: "+updatedIn);
						System.out.println("error occured at index (zero based): "
								+(j - 8)+" "+(j - 8 + 1));
						String cor1 = bitFlip((j - 8), updatedIn);
						String cor2 = bitFlip((j - 8 + 1), cor1);
						System.out.println("corrected value: "+cor2);
						found2 = true;
						break;
					}
				}
				
			}
			if(found2 == false) {
				System.out.println("error occured more than 3 bit");
				boolean found3 = false;
				byte []tempArr3 = new byte[8];
				
				for(byte j = 8; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
//					for(int i =0;i<H.length;i++) {
//						System.out.print(tempArr3[i]+" ");
//						
//					}System.out.println();
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 8) {
							System.out.println("actual input:  "+actualIn);
							System.out.println("updated value: "+updatedIn);
							System.out.println("error occured at index (zero based): "
									+(j - 8)+" "+(j - 8 + 1)+" "+(j - 8 + 2));
							String cor1 = bitFlip((j - 8), updatedIn);
							String cor2 = bitFlip((j - 8 + 1), cor1);
							String cor3 = bitFlip((j - 8 + 2), cor2);
							System.out.println("corrected value: "+cor3);
							
							found3 = true;
							break;
						}
					}
				}
				if(found3 == false) {
					System.out.println("4 burst error detected");
				}
			}
		}
		
	}
	
	public static void FUEC_QUAEC() {
		String actualIn  = "1011001001101101";
		String updatedIn = "1011001001101101";
		
		byte H[][] = {{1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
					 {0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0}};
				
		
		byte x[] = new byte[16];
		for(byte i = 0; i < x.length; i++) {
			x[i] = (byte) (actualIn.charAt(i) - 48);
		}

		byte c0 = (byte) (x[0] ^ x[4] ^ x[5] ^ x[6] ^ x[7]);
		byte c1 = (byte) (x[1] ^ x[5] ^ x[9] ^ x[10] ^ x[14]);
		byte c2 = (byte) (x[2] ^ x[6] ^ x[8] ^ x[11] ^ x[15]);
		byte c3 = (byte) (x[3] ^ x[7] ^ x[11] ^ x[12]);
		byte c4 = (byte) (x[0] ^ x[5] ^ x[10] ^ x[13] ^ x[15]);
		byte c5 = (byte) (x[1] ^ x[6] ^ x[10] ^ x[13]);
		byte c6 = (byte) (x[2] ^ x[7] ^ x[10] ^ x[11] ^ x[15]);
		byte c7 = (byte) (x[3] ^ x[8] ^ x[12] ^ x[14]);
		byte c8 = (byte) (x[4] ^ x[9] ^ x[12] ^ x[13]);
		
		String newStr = ""+c0+c1+c2+c3+c4+c5+c6+c7+c8+updatedIn;
		char newChar[] = newStr.toCharArray();
		byte b[] = new byte[newChar.length];
		for(byte i = 0; i < newChar.length; i++) {
			b[i] = (byte) ((int)newChar[i] - 48);
		}
		
		byte []arr = new byte[9];
		for(byte i = 0; i < H.length; i++) {
			byte temp = 0;
			for(byte j = 0; j < H[0].length; j++) {
				temp = (byte) (temp ^ H[i][j] ^ b[j]);
			}
			arr[i] = temp;
		}
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[9];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[4] ^ new_x[5] ^ new_x[6] ^ new_x[7]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[14]);
		s[2] = (byte) (c2 ^ new_x[2] ^ new_x[6] ^ new_x[8] ^ new_x[11] ^ new_x[15]);
		s[3] = (byte) (c3 ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[5] ^ new_x[10] ^ new_x[13] ^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[6] ^ new_x[10] ^ new_x[13]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[7] ^ new_x[10] ^ new_x[11] ^ new_x[15]);
		s[7] = (byte) (c7 ^ new_x[3] ^ new_x[8] ^ new_x[12] ^ new_x[14]);
		s[8] = (byte) (c8 ^ new_x[4] ^ new_x[9] ^ new_x[12] ^ new_x[13]);
		
		for(byte i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();

		byte index = -1;
		for(byte j = 9; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < 9; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 9) {
					index = j;
					break;
				}
			}
		}
		
		byte sum = 0;
		for(byte i = 0; i < s.length; i++) {
			sum += s[i];
		}
		
		if(sum == 0 && index == -1) {
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			System.out.println("no error!");
		} else if(sum != 0 && index != -1){
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
			System.out.println("error occured at index (zero based): "+(index - 9));
			String cor = bitFlip((index - 9), updatedIn);
			System.out.println("corrected value: "+cor);
		} else if(sum != 0 && index == -1) {
			System.out.println("multiple error!");
			boolean found2 = false;
			byte []tempArr2 = new byte[9];
			for(byte j = 9; j < H[0].length - 1; j++) {
				byte temp = 0;
				for(byte i = 0; i < H.length; i++) {
					tempArr2[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1]);
				}
				
				byte tempSum = 0;
				for(byte i = 0; i < tempArr2.length; i++) {
					
					if(tempArr2[i] == s[i]) {
						tempSum++;
					} else {
						tempSum = 0;
						break;
					}
					if(tempSum == 9) {
						System.out.println("actual input:  "+actualIn);
						System.out.println("updated value: "+updatedIn);
						
						System.out.println("error occured at index (zero based): "+(j - 9)
								+" "+(j - 9 + 1));
						String cor1 = bitFlip((j - 9), updatedIn);
						String cor2 = bitFlip((j - 9 + 1), cor1);
						System.out.println("corrected value: "+cor2);
						found2 = true;
						break;
					}
				}
			}
			if(found2 == false) {
				System.out.println("error occured more than 3 bit");
				boolean found3 = false;
				byte []tempArr3 = new byte[9];
				
				for(byte j = 9; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
//					for(int i =0;i<H.length;i++) {
//						System.out.print(tempArr3[i]+" ");
//						
//					}System.out.println();
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 9) {
							System.out.println("actual input:  "+actualIn);
							System.out.println("updated value: "+updatedIn);
							System.out.println("error occured at index (zero based): "+(j - 9)
									+" "+(j - 9 + 1)+" "+(j - 9 + 2));
							String cor1 = bitFlip((j - 9), updatedIn);
							String cor2 = bitFlip((j - 9 +1), cor1);
							String cor3 = bitFlip((j - 9 + 2), cor2);
							System.out.println("corrected value: "+cor3);
							found3 = true;
							break;
						}
					}
				}
				if(found3 == false) {
					System.out.println("4 burst error detected");
					byte []tempArr4 = new byte[9];
					for(byte j = 9; j < H[0].length - 3; j++) {
						byte temp = 0;
						for(byte i = 0; i < H.length; i++) {
							tempArr4[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
												       ^ H[i][j + 3]);
						}
//						for(int i =0;i<H.length;i++) {
//							System.out.print(tempArr3[i]+" ");
//							
//						}System.out.println();
						byte tempSum = 0;
						for(byte i = 0; i < tempArr4.length; i++) {
							
							if(tempArr4[i] == s[i]) {
								tempSum++;
							} else {
								tempSum = 0;
								break;
							}
							if(tempSum == 9) {
								System.out.println("actual input:  "+actualIn);
								System.out.println("updated value: "+updatedIn);
								System.out.println("error occured at index (zero based): "
													+(j - 9)+" "+(j - 9 + 1)+" "+(j - 9 + 2)
													+" "+(j - 9 + 3) );
								String cor1 = bitFlip((j - 9), updatedIn);
								String cor2 = bitFlip((j - 9 + 1), cor1);
								String cor3 = bitFlip((j - 9 + 2), cor2);
								String cor4 = bitFlip((j - 9 + 3), cor3);
								System.out.println("corrected value: "+cor4);
								found3 = true;
								break;
							}
						}
					}
				}
			}
		}
		
	}
}

















