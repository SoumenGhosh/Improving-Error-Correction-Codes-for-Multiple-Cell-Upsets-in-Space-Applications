/* Author Soumen Ghosh
   Date: 03/08/2020
   Created at: 11:03 AM
*/

public class Project {

	public static void main(String []args) {
//		System.out.println("Soumen");
		
		long start = System.nanoTime();
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
//		FUEC_DAEC();
//		FUEC_TAEC();
//		FUEC_QUAEC();
//		FUEC_FAEC();
//		FUEC_SAEC();
//		FUEC_SevAEC();
//		FUEC_EAEC();
		testing();
		long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long actualMemUsed=afterUsedMem-beforeUsedMem;
		System.out.println("Space Required "+(actualMemUsed / (double)(8*1024*1024)));
		long end = System.nanoTime();
		long time = (end - start); // 1000000;
//		System.out.println("time taken: "+time+"ns");
		
	}
	
	
	public static void testing() {
		double count_DAEC = 0;
		double count_TAEC = 0;
		double count_QUAEC = 0;
		double count_FAEC = 0;
		double count_SAEC = 0;
		double count_SevAEC = 0;
		double count_EAEC = 0;
		
		long start = System.nanoTime();
		for(int i = 0; i < (int)(Math.pow(2, 16)); i++) {
			String str = Integer.toBinaryString(i);
			
			if(str.length() == 1) {
				str = "000000000000000"+str;
			} else if(str.length() == 2) {
				str = "00000000000000"+str;
			} else if(str.length() == 3) {
				str = "0000000000000"+str;
			} else if(str.length() == 4) {
				str = "000000000000"+str;
			} else if(str.length() == 5) {
				str = "00000000000"+str;
			} else if(str.length() == 6) {
				str = "0000000000"+str;
			} else if(str.length() == 7) {
				str = "000000000"+str;
			} else if(str.length() == 8) {
				str = "00000000"+str;
			} else if(str.length() == 9) {
				str = "0000000"+str;
			} else if(str.length() == 10) {
				str = "000000"+str;
			} else if(str.length() == 11) {
				str = "00000"+str;
			} else if(str.length() == 12) {
				str = "0000"+str;
			} else if(str.length() == 13) {
				str = "000"+str;
			} else if(str.length() == 14) {
				str = "00"+str;
			} else if(str.length() == 15) {
				str = "0"+str;
			} else if(str.length() == 16) {
				str = ""+str;
			}
//			System.out.println(str+" "+str.length());
			
			String sendingEnd = str;
			String receivingEnd = "";
//			System.out.println();
//			System.out.println();
//			System.out.println();
			
			// 1-bit flip
//			for(int j = 0; j < 16; j++) {
//				receivingEnd = bitFlip(j, sendingEnd);
//				count_DAEC += FUEC_DAEC(sendingEnd, receivingEnd);
//				count_TAEC += FUEC_TAEC(sendingEnd, receivingEnd);
//				count_QUAEC += FUEC_QUAEC(sendingEnd, receivingEnd);
//				count_FAEC += FUEC_FAEC(sendingEnd, receivingEnd);
//				count_SAEC += FUEC_SAEC(sendingEnd, receivingEnd);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			
			// 2-bit flip
//			for(int j = 0; j < 16 - 1; j++) {
//				String cor = bitFlip(j, sendingEnd);
//				receivingEnd = bitFlip(j + 1, cor);
//				count_DAEC += FUEC_DAEC(sendingEnd, receivingEnd);
//				count_TAEC += FUEC_TAEC(sendingEnd, receivingEnd);
//				count_QUAEC += FUEC_QUAEC(sendingEnd, receivingEnd);
//				count_FAEC += FUEC_FAEC(sendingEnd, receivingEnd);
//				count_SAEC += FUEC_SAEC(sendingEnd, receivingEnd);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			// 3-bit flip
//			for(int j = 0; j < 16 - 2; j++) {
//				String cor = bitFlip(j, sendingEnd);
//				String cor1 = bitFlip(j + 1, cor);
//				receivingEnd = bitFlip(j + 2, cor1);
//				count_TAEC += FUEC_TAEC(sendingEnd, receivingEnd);
//				count_QUAEC += FUEC_QUAEC(sendingEnd, receivingEnd);
//				count_FAEC += FUEC_FAEC(sendingEnd, receivingEnd);
//				count_SAEC += FUEC_SAEC(sendingEnd, receivingEnd);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			// 4-bit flip
//			for(int j = 0; j < 16 - 3; j++) {
//				String cor = bitFlip(j, sendingEnd);
//				String cor1 = bitFlip(j + 1, cor);
//				String cor2 = bitFlip(j + 2, cor1);
//				receivingEnd = bitFlip(j + 3, cor2);
//				count_QUAEC += FUEC_QUAEC(sendingEnd, receivingEnd);
//				count_FAEC += FUEC_FAEC(sendingEnd, receivingEnd);
//				count_SAEC += FUEC_SAEC(sendingEnd, receivingEnd);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			// 5-bit flip
//			for(int j = 0; j < 16 - 4; j++) {
//				String cor = bitFlip(j, sendingEnd);
//				String cor1 = bitFlip(j + 1, cor);
//				String cor2 = bitFlip(j + 2, cor1);
//				String cor3 = bitFlip(j + 3, cor2);
//				receivingEnd = bitFlip(j + 4, cor3);
				
//				count_FAEC += FUEC_FAEC(sendingEnd, receivingEnd);
//				count_SAEC += FUEC_SAEC(sendingEnd, receivingEnd);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			// 6-bit flip
//			for(int j = 0; j < 16 - 5; j++) {
//				String cor = bitFlip(j, sendingEnd);
//				String cor1 = bitFlip(j + 1, cor);
//				String cor2 = bitFlip(j + 2, cor1);
//				String cor3 = bitFlip(j + 3, cor2);
//				String cor4 = bitFlip(j + 4, cor3);
//				receivingEnd = bitFlip(j + 5, cor4);
//				count_SAEC += FUEC_SAEC(sendingEnd, receivingEnd);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			// 7-bit flip
//			for(int j = 0; j < 16 - 6; j++) {
//				String cor = bitFlip(j, sendingEnd);
//				String cor1 = bitFlip(j + 1, cor);
//				String cor2 = bitFlip(j + 2, cor1);
//				String cor3 = bitFlip(j + 3, cor2);
//				String cor4 = bitFlip(j + 4, cor3);
//				String cor5 = bitFlip(j + 5, cor4);
//				receivingEnd = bitFlip(j + 6, cor5);
//				count_SevAEC += FUEC_SevAEC(sendingEnd, receivingEnd);
//				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
//			}
			
			
			// 8-bit flip
			for(int j = 0; j < 16 - 7; j++) {
				String cor = bitFlip(j, sendingEnd);
				String cor1 = bitFlip(j + 1, cor);
				String cor2 = bitFlip(j + 2, cor1);
				String cor3 = bitFlip(j + 3, cor2);
				String cor4 = bitFlip(j + 4, cor3);
				String cor5 = bitFlip(j + 5, cor4);
				String cor6 = bitFlip(j + 6, cor5);
				receivingEnd = bitFlip(j + 7, cor6);
				
				count_EAEC += FUEC_EAEC(sendingEnd, receivingEnd);
			}
			//70488848 70491360 
			
		}
		long end = System.nanoTime();
		long time = (end - start); // 1000000;
		System.out.println("time taken: "+time+"");
		System.out.println("FUEC_DAEC 1bit:  "+count_DAEC);
		System.out.println("FUEC_TAEC 1bit:  "+count_TAEC);
		System.out.println("FUEC_QUAEC 1bit: "+count_QUAEC);
		System.out.println("FUEC_FAEC 1bit:  "+count_FAEC);
		System.out.println("FUEC_SAEC 1bit:  "+count_SAEC);
		System.out.println("FUEC_SevAEC 1bit:  "+count_SevAEC);
		System.out.println("FUEC_EAEC 1bit:  "+count_EAEC);
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
	
	
	public static int FUEC_DAEC(String sendingEnd, String receivingEnd) {
		
		
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "1100 0010 0110 1101";
//		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		String actualIn = sendingEnd;
		String updatedIn = receivingEnd;
//		System.out.println(actualIn);
		int hit = 0;
		
		byte [][]H ={{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
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
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();
		
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
			System.out.println("no error!");
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
//			System.out.println(index);
		}
		else if(sum != 0 && index != -1){
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
			
//			System.out.println("error occured at index (zero based): "+(index - 7));
			String cor = bitFlip((index - 7), updatedIn);
//			System.out.println(cor);
			if(cor.equals(actualIn)) {
				hit = 1;
			}
			
		} else if(sum != 0 && index == -1) {
			
			boolean found2 = false;
			byte []tempArr2 = new byte[7];
			for(byte j = 7; j < H[0].length - 1; j++) {
				
				for(byte i = 0; i < H.length; i++) {
					tempArr2[i] = (byte) (H[i][j] ^ H[i][j + 1]);
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
//						System.out.println("2 bit error found");
//						System.out.println((j - 7)+" "+(j - 7 + 1));
						found2 = true;
						String cor1 = bitFlip((j - 7), updatedIn);
						String cor2 = bitFlip((j - 7 + 1), cor1);
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						System.out.println("corrected value: "+cor2);
						if(cor2.equals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
				
			}
			
			if(found2 == false) {
				System.out.println("3 burst error detected.");
			}
		}
		return hit;
	}
	
	public static int FUEC_TAEC(String sendingEnd, String receivingEnd) {
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "1011 0010 0110 0101";
		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		String actualIn = sendingEnd;
		String updatedIn = receivingEnd;
		int hit = 0;
		
		byte H[][] ={{1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1},  
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1},
					 {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0}};
	
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
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();
		
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
			System.out.println("no error!");
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
//			System.out.println(index);
		} else if(sum != 0 && index != -1){
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
			
//			System.out.println("error occured at index (zero based): "+(index - 8));
			String cor = bitFlip((index - 8), updatedIn);
//			System.out.println("corrected value: "+cor+" ----- "+actualIn);
			
			if(cor.equals(actualIn)) {
				hit = 1;
			}
			
		} else if(sum != 0 && index == -1) {
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
//						System.out.println("2 bit error found");
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						System.out.println("error occured at index (zero based): "
//								+(j - 8)+" "+(j - 8 + 1));
						String cor1 = bitFlip((j - 8), updatedIn);
						String cor2 = bitFlip((j - 8 + 1), cor1);
//						System.out.println("corrected value: "+cor2);
						
						found2 = true;
						if(cor2.contentEquals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
				
			}
			if(found2 == false) {
				boolean found3 = false;
				byte []tempArr3 = new byte[8];
				
				for(byte j = 8; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 8) {
//							System.out.println("3 bit error found");
//							System.out.println("actual input:  "+actualIn);
//							System.out.println("updated value: "+updatedIn);
//							System.out.println("error occured at index (zero based): "
//									+(j - 8)+" "+(j - 8 + 1)+" "+(j - 8 + 2));
							String cor1 = bitFlip((j - 8), updatedIn);
							String cor2 = bitFlip((j - 8 + 1), cor1);
							String cor3 = bitFlip((j - 8 + 2), cor2);
//							System.out.println("corrected value: "+cor3);
							
							
							found3 = true;
							if(cor3.equals(actualIn)) {
								hit = 1;
							}
							break;
						}
					}
				}
				if(found3 == false) {
					System.out.println("4 burst error detected "+ updatedIn);
//					System.out.println(updatedIn);
				}
			}
		}
		return hit;
	}
	
	public static int FUEC_QUAEC(String sendingEnd, String receivingEnd) {
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "1011 1101 1110 1101";
//		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		String actualIn = sendingEnd;
		String updatedIn = receivingEnd;
		
		int hit = 0;
		
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
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();

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
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
			
//			System.out.println("error occured at index (zero based): "+(index - 9));
			String cor = bitFlip((index - 9), updatedIn);
//			System.out.println("corrected value: "+cor);
			if(cor.contentEquals(actualIn)) {
				hit = 1;
			}
		} else if(sum != 0 && index == -1) {
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
//						System.out.println("2 bit error found");
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						
//						System.out.println("error occured at index (zero based): "+(j - 9)
//								+" "+(j - 9 + 1));
						String cor1 = bitFlip((j - 9), updatedIn);
						String cor2 = bitFlip((j - 9 + 1), cor1);
//						System.out.println("corrected value: "+cor2);
						
						found2 = true;
						if(cor2.contentEquals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
			}
			if(found2 == false) {
				boolean found3 = false;
				byte []tempArr3 = new byte[9];
				
				for(byte j = 9; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 9) {
//							System.out.println("3 bit error found");
//							System.out.println("actual input:  "+actualIn);
//							System.out.println("updated value: "+updatedIn);
//							System.out.println("error occured at index (zero based): "+(j - 9)
//									+" "+(j - 9 + 1)+" "+(j - 9 + 2));
							String cor1 = bitFlip((j - 9), updatedIn);
							String cor2 = bitFlip((j - 9 +1), cor1);
							String cor3 = bitFlip((j - 9 + 2), cor2);
//							System.out.println("corrected value: "+cor3);
							found3 = true;
							if(cor3.equals(actualIn)) {
								hit = 1;
							}
							break;
						}
					}
				}
				if(found3 == false) {
					boolean found4 = false;
					byte []tempArr4 = new byte[9];
					for(byte j = 9; j < H[0].length - 3; j++) {
						byte temp = 0;
						for(byte i = 0; i < H.length; i++) {
							tempArr4[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
												       ^ H[i][j + 3]);
						}
						byte tempSum = 0;
						for(byte i = 0; i < tempArr4.length; i++) {
							
							if(tempArr4[i] == s[i]) {
								tempSum++;
							} else {
								tempSum = 0;
								break;
							}
							if(tempSum == 9) {
//								System.out.println("4 bit error found");
//								System.out.println("actual input:  "+actualIn);
//								System.out.println("updated value: "+updatedIn);
//								System.out.println("error occured at index (zero based): "
//													+(j - 9)+" "+(j - 9 + 1)+" "+(j - 9 + 2)
//													+" "+(j - 9 + 3) );
								String cor1 = bitFlip((j - 9), updatedIn);
								String cor2 = bitFlip((j - 9 + 1), cor1);
								String cor3 = bitFlip((j - 9 + 2), cor2);
								String cor4 = bitFlip((j - 9 + 3), cor3);
//								System.out.println("corrected value: "+cor4);
								found4 = true;
								if(cor4.contentEquals(actualIn)) {
									hit = 1;
								}
								break;
							}
						}
					}
					if(found4 == false) {
						System.out.println("5 bit burst error detected");
						System.out.println("actual input:  "+actualIn);
						System.out.println("updated value: "+updatedIn);
					}
				}
			}
		}
		return hit;
	}


	public static int FUEC_FAEC(String sendingEnd, String receivingEnd) {
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "1010 1101 1110 1101";
//		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		
		String actualIn = sendingEnd;
		String updatedIn = receivingEnd;
		int hit = 0;
		
		byte H[][] ={{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
					 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0}};
				
		
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
		byte c9 = (byte) (x[1] ^ x[5] ^ x[6] ^ x[9] ^ x[13] ^ x[14]);
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[10];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[4] ^ new_x[5] ^ new_x[6] ^ new_x[7]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[14]);
		s[2] = (byte) (c2 ^ new_x[2] ^ new_x[6] ^ new_x[8] ^ new_x[11] ^ new_x[15]);
		s[3] = (byte) (c3 ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[5] ^ new_x[10] ^ new_x[13] ^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[6] ^ new_x[10] ^ new_x[13]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[7] ^ new_x[10] ^ new_x[11] ^ new_x[15]);
		s[7] = (byte) (c7 ^ new_x[3] ^ new_x[8] ^ new_x[12] ^ new_x[14]);
		s[8] = (byte) (c8 ^ new_x[4] ^ new_x[9] ^ new_x[12] ^ new_x[13]);
		s[9] = (byte) (c9 ^ new_x[1] ^ new_x[5] ^ new_x[6] ^ new_x[9] ^ new_x[13] ^ new_x[14]);
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();

		byte index = -1;
		for(byte j = 10; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < 10; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 10) {
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
			System.out.println("no error!");
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
		} else if(sum != 0 && index != -1){
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
//			
//			System.out.println("error occured at index (zero based): "+(index - 10));
			String cor = bitFlip((index - 10), updatedIn);
//			System.out.println("corrected value: "+cor);
			if(cor.contentEquals(actualIn)) {
				hit = 1;
			}
		} else if(sum != 0 && index == -1) {
			boolean found2 = false;
			byte []tempArr2 = new byte[10];
			for(byte j = 10; j < H[0].length - 1; j++) {
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
					if(tempSum == 10) {
//						System.out.println("2 bit error found");
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						
//						System.out.println("error occured at index (zero based): "+(j - 10)
//								+" "+(j - 10 + 1));
						String cor1 = bitFlip((j - 10), updatedIn);
						String cor2 = bitFlip((j - 10 + 1), cor1);
//						System.out.println("corrected value: "+cor2);
						found2 = true;
						if(cor2.contentEquals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
			}
			if(found2 == false) {
				boolean found3 = false;
				byte []tempArr3 = new byte[10];
				
				for(byte j = 10; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 10) {
//							System.out.println("3 bit error found");
//							System.out.println("actual input:  "+actualIn);
//							System.out.println("updated value: "+updatedIn);
//							System.out.println("error occured at index (zero based): "+(j - 10)
//									+" "+(j - 10 + 1)+" "+(j - 10 + 2));
							String cor1 = bitFlip((j - 10), updatedIn);
							String cor2 = bitFlip((j - 10 +1), cor1);
							String cor3 = bitFlip((j - 10 + 2), cor2);
//							System.out.println("corrected value: "+cor3);
							found3 = true;
							if(cor3.contentEquals(actualIn)) {
								hit = 1;
							}
							break;
						}
					}
				}
				if(found3 == false) {
					boolean found4 = false;
					byte []tempArr4 = new byte[10];
					for(byte j = 10; j < H[0].length - 3; j++) {
						byte temp = 0;
						for(byte i = 0; i < H.length; i++) {
							tempArr4[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
												       ^ H[i][j + 3]);
						}
						byte tempSum = 0;
						for(byte i = 0; i < tempArr4.length; i++) {
							
							if(tempArr4[i] == s[i]) {
								tempSum++;
							} else {
								tempSum = 0;
								break;
							}
							if(tempSum == 10) {
//								System.out.println("4 bit error found");
//								System.out.println("actual input:  "+actualIn);
//								System.out.println("updated value: "+updatedIn);
//								System.out.println("error occured at index (zero based): "
//													+(j - 10)+" "+(j - 10 + 1)+" "+(j - 10 + 2)
//													+" "+(j - 10 + 3) );
								String cor1 = bitFlip((j - 10), updatedIn);
								String cor2 = bitFlip((j - 10 + 1), cor1);
								String cor3 = bitFlip((j - 10 + 2), cor2);
								String cor4 = bitFlip((j - 10 + 3), cor3);
//								System.out.println("corrected value: "+cor4);
								found4 = true;
								if(cor4.contentEquals(actualIn)) {
									hit = 1;
								}
								break;
							}
						}
					}
					if(found4 == false) {
						boolean found5 = false;
						byte []tempArr5 = new byte[10];
						for(byte j = 10; j < H[0].length - 4; j++) {
							byte temp = 0;
							for(byte i = 0; i < H.length; i++) {
								tempArr5[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
													       ^ H[i][j + 3] ^ H[i][j + 4]);
							}
							byte tempSum = 0;
							for(byte i = 0; i < tempArr5.length; i++) {
								if(tempArr5[i] == s[i]) {
									tempSum++;
								} else {
									tempSum = 0;
									break;
								}
								if(tempSum == 10) {
//									System.out.println("5 bit error found");
//									System.out.println("actual input:  "+actualIn);
//									System.out.println("updated value: "+updatedIn);
//									System.out.println("error occured at index (zero based): "
//														+(j - 10)+" "+(j - 10 + 1)+" "+(j - 10 + 2)
//														+" "+(j - 10 + 3) +" "+(j - 10 + 4));
									String cor1 = bitFlip((j - 10), updatedIn);
									String cor2 = bitFlip((j - 10 + 1), cor1);
									String cor3 = bitFlip((j - 10 + 2), cor2);
									String cor4 = bitFlip((j - 10 + 3), cor3);
									String cor5 = bitFlip((j -10 + 4), cor4);
//									System.out.println("corrected value: "+cor5);
									found5 = true;
									if(cor5.contentEquals(actualIn)) {
										hit = 1;
									}
									break;
								}
							}
						}
						if(found5 == false) {
							System.out.println("6 bit burst error detected");
							System.out.println("actual input:  "+actualIn);
							System.out.println("updated value: "+updatedIn);
						}
						
					}
				}
			}
		}
		return hit;
	}

	
	public static int FUEC_SAEC(String sendingEnd, String receivingEnd) {
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "1011 0010 0001 0010";
//		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		
		String actualIn  = sendingEnd;
		String updatedIn = receivingEnd;
		int hit = 0;
		
		byte H[][] ={{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
					 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1}};
				
		
		byte x[] = new byte[16];
		for(byte i = 0; i < x.length; i++) {
			x[i] = (byte) (actualIn.charAt(i) - 48);
		}

		byte c0 = (byte) (x[0] ^ x[4] ^ x[5] ^ x[7]);
		byte c1 = (byte) (x[1] ^ x[5] ^ x[9] ^ x[10] ^ x[14]);
		byte c2 = (byte) (x[2] ^ x[6] ^ x[8] ^ x[11] ^ x[15]);
		byte c3 = (byte) (x[3] ^ x[7] ^ x[11] ^ x[12]);
		byte c4 = (byte) (x[0] ^ x[5] ^ x[10] ^ x[13] ^ x[15]);
		byte c5 = (byte) (x[1] ^ x[6] ^ x[10] ^ x[13]);
		byte c6 = (byte) (x[2] ^ x[7] ^ x[10] ^ x[11] ^ x[15]);
		byte c7 = (byte) (x[3] ^ x[8] ^ x[12] ^ x[14]);
		byte c8 = (byte) (x[4] ^ x[9] ^ x[12] ^ x[13]);
		byte c9 = (byte) (x[1] ^ x[5] ^ x[6] ^ x[9] ^ x[13] ^ x[14]);
		byte c10 = (byte) (x[0] ^ x[3] ^ x[7] ^ x[11] ^ x[12] ^ x[15]);
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[11];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[4] ^ new_x[5] ^ new_x[7]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[14]);
		s[2] = (byte) (c2 ^ new_x[2] ^ new_x[6] ^ new_x[8] ^ new_x[11] ^ new_x[15]);
		s[3] = (byte) (c3 ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[5] ^ new_x[10] ^ new_x[13] ^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[6] ^ new_x[10] ^ new_x[13]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[7] ^ new_x[10] ^ new_x[11] ^ new_x[15]);
		s[7] = (byte) (c7 ^ new_x[3] ^ new_x[8] ^ new_x[12] ^ new_x[14]);
		s[8] = (byte) (c8 ^ new_x[4] ^ new_x[9] ^ new_x[12] ^ new_x[13]);
		s[9] = (byte) (c9 ^ new_x[1] ^ new_x[5] ^ new_x[6] ^ new_x[9] ^ new_x[13] ^ new_x[14]);
		s[10] = (byte) (c10 ^ new_x[0] ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12] ^ new_x[15]);
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();

		byte index = -1;
		for(byte j = 11; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < 11; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 11) {
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
			System.out.println("no error!");
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
		} else if(sum != 0 && index != -1){
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
			
//			System.out.println("error occured at index (zero based): "+(index - 11));
			String cor = bitFlip((index - 11), updatedIn);
//			System.out.println("corrected value: "+cor);
			if(cor.contentEquals(actualIn)) {
				hit = 1;
			}
		} else if(sum != 0 && index == -1) {
			boolean found2 = false;
			byte []tempArr2 = new byte[11];
			for(byte j = 11; j < H[0].length - 1; j++) {
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
					if(tempSum == 11) {
//						System.out.println("2 bit burst error found");
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						
//						System.out.println("error occured at index (zero based): "+(j - 11)
//								+" "+(j - 11 + 1));
						String cor1 = bitFlip((j - 11), updatedIn);
						String cor2 = bitFlip((j - 11 + 1), cor1);
//						System.out.println("corrected value: "+cor2);
						found2 = true;
						if(cor2.contentEquals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
			}
			if(found2 == false) {
				boolean found3 = false;
				byte []tempArr3 = new byte[11];
				
				for(byte j = 11; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 11) {
//							System.out.println("3 bit burst error found");
//							System.out.println("actual input:  "+actualIn);
//							System.out.println("updated value: "+updatedIn);
//							System.out.println("error occured at index (zero based): "+(j - 11)
//									+" "+(j - 11 + 1)+" "+(j - 11 + 2));
							String cor1 = bitFlip((j - 11), updatedIn);
							String cor2 = bitFlip((j - 11 +1), cor1);
							String cor3 = bitFlip((j - 11 + 2), cor2);
//							System.out.println("corrected value: "+cor3);
							found3 = true;
							if(cor3.contentEquals(actualIn)) {
								hit = 1;
							}
							break;
						}
					}
				}
				if(found3 == false) {
					boolean found4 = false;
					byte []tempArr4 = new byte[11];
					for(byte j = 11; j < H[0].length - 3; j++) {
						byte temp = 0;
						for(byte i = 0; i < H.length; i++) {
							tempArr4[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
												       ^ H[i][j + 3]);
						}
						byte tempSum = 0;
						for(byte i = 0; i < tempArr4.length; i++) {
							
							if(tempArr4[i] == s[i]) {
								tempSum++;
							} else {
								tempSum = 0;
								break;
							}
							if(tempSum == 11) {
//								System.out.println("4 bit burst error found");
//								System.out.println("actual input:  "+actualIn);
//								System.out.println("updated value: "+updatedIn);
//								System.out.println("error occured at index (zero based): "
//													+(j - 11)+" "+(j - 11 + 1)+" "+(j - 11 + 2)
//													+" "+(j - 11 + 3) );
								String cor1 = bitFlip((j - 11), updatedIn);
								String cor2 = bitFlip((j - 11 + 1), cor1);
								String cor3 = bitFlip((j - 11 + 2), cor2);
								String cor4 = bitFlip((j - 11 + 3), cor3);
//								System.out.println("corrected value: "+cor4);
								found4 = true;
								if(cor4.contentEquals(actualIn)) {
									hit = 1;
								}
								break;
							}
						}
					}
					if(found4 == false) {
						boolean found5 = false;
						byte []tempArr5 = new byte[11];
						for(byte j = 11; j < H[0].length - 4; j++) {
							byte temp = 0;
							for(byte i = 0; i < H.length; i++) {
								tempArr5[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
													       ^ H[i][j + 3] ^ H[i][j + 4]);
							}
							byte tempSum = 0;
							for(byte i = 0; i < tempArr5.length; i++) {
								if(tempArr5[i] == s[i]) {
									tempSum++;
								} else {
									tempSum = 0;
									break;
								}
								if(tempSum == 11) {
//									System.out.println("5 bit burst error found");
//									System.out.println("actual input:  "+actualIn);
//									System.out.println("updated value: "+updatedIn);
//									System.out.println("error occured at index (zero based): "
//														+(j - 11)+" "+(j - 11 + 1)+" "+(j - 11 + 2)
//														+" "+(j - 11 + 3) +" "+(j - 11 + 4));
									String cor1 = bitFlip((j - 11), updatedIn);
									String cor2 = bitFlip((j - 11 + 1), cor1);
									String cor3 = bitFlip((j - 11 + 2), cor2);
									String cor4 = bitFlip((j - 11 + 3), cor3);
									String cor5 = bitFlip((j -11 + 4), cor4);
//									System.out.println("corrected value: "+cor5);
									found5 = true;
									if(cor5.contentEquals(actualIn)) {
										hit = 1;
									}
									break;
								}
							}
						}
						if(found5 == false) {
							boolean found6 = false;
							byte []tempArr6 = new byte[11];
							for(byte j = 11; j < H[0].length - 5; j++) {
								byte temp = 0;
								for(byte i = 0; i < H.length; i++) {
									tempArr6[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
														 ^ H[i][j + 3] ^ H[i][j + 4] ^ H[i][j + 5]);
								}
								byte tempSum = 0;
								for(byte i = 0; i < tempArr6.length; i++) {
									if(tempArr6[i] == s[i]) {
										tempSum++;
									} else {
										tempSum = 0;
										break;
									}
									if(tempSum == 11) {
//										System.out.println("6 bit burst error found");
//										System.out.println("actual input:  "+actualIn);
//										System.out.println("updated value: "+updatedIn);
//										System.out.println("error occured at index (zero based): "
//															+(j - 11)+" "+(j - 11 + 1)+" "+(j - 11 + 2)
//															+" "+(j - 11 + 3) + " "+(j - 11 + 4)
//															+ " "+(j - 11 + 5));
										String cor1 = bitFlip((j - 11), updatedIn);
										String cor2 = bitFlip((j - 11 + 1), cor1);
										String cor3 = bitFlip((j - 11 + 2), cor2);
										String cor4 = bitFlip((j - 11 + 3), cor3);
										String cor5 = bitFlip((j - 11 + 4), cor4);
										String cor6 = bitFlip((j - 11 + 5), cor5);
//										System.out.println("corrected value: "+cor6);
										if(cor6.contentEquals(actualIn)) {
											hit = 1;
										}
										found6 = true;
										break;
									}
								}
							}
							if(found6 == false) {
								System.out.println("7 bit burst error detected");
								System.out.println("actual input:  "+actualIn);
								System.out.println("updated value: "+updatedIn);
							}
							
						}
						
					}
				}
			}
		}
		return hit;
	}

	
	public static int FUEC_SevAEC(String sendingEnd, String receivingEnd) {
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "0100 1101 0110 1101";
//		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		
		String actualIn  = sendingEnd;
		String updatedIn = receivingEnd;
		int hit = 0;
		
		byte H[][] ={{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
					 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0}};
				
		
		byte x[] = new byte[16];
		for(byte i = 0; i < x.length; i++) {
			x[i] = (byte) (actualIn.charAt(i) - 48);
		}

		byte c0 = (byte) (x[0] ^ x[4] ^ x[5] ^ x[7]);
		byte c1 = (byte) (x[1] ^ x[5] ^ x[9] ^ x[10] ^ x[14]);
		byte c2 = (byte) (x[2] ^ x[6] ^ x[8] ^ x[11] ^ x[15]);
		byte c3 = (byte) (x[3] ^ x[7] ^ x[11] ^ x[12]);
		byte c4 = (byte) (x[0] ^ x[5] ^ x[10] ^ x[13] ^ x[15]);
		byte c5 = (byte) (x[1] ^ x[6] ^ x[10] ^ x[13]);
		byte c6 = (byte) (x[2] ^ x[7] ^ x[10] ^ x[11] ^ x[15]);
		byte c7 = (byte) (x[3] ^ x[8] ^ x[12] ^ x[14]);
		byte c8 = (byte) (x[4] ^ x[9] ^ x[12] ^ x[13]);
		byte c9 = (byte) (x[1] ^ x[5] ^ x[6] ^ x[9] ^ x[13] ^ x[14]);
		byte c10 = (byte) (x[0] ^ x[3] ^ x[7] ^ x[11] ^ x[12] ^ x[15]);
		byte c11 = (byte) (x[2] ^ x[4] ^ x[5] ^ x[8] ^ x[9] ^ x[13]);
		
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[12];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[4] ^ new_x[5] ^ new_x[7]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[14]);
		s[2] = (byte) (c2 ^ new_x[2] ^ new_x[6] ^ new_x[8] ^ new_x[11] ^ new_x[15]);
		s[3] = (byte) (c3 ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[5] ^ new_x[10] ^ new_x[13] ^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[6] ^ new_x[10] ^ new_x[13]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[7] ^ new_x[10] ^ new_x[11] ^ new_x[15]);
		s[7] = (byte) (c7 ^ new_x[3] ^ new_x[8] ^ new_x[12] ^ new_x[14]);
		s[8] = (byte) (c8 ^ new_x[4] ^ new_x[9] ^ new_x[12] ^ new_x[13]);
		s[9] = (byte) (c9 ^ new_x[1] ^ new_x[5] ^ new_x[6] ^ new_x[9] ^ new_x[13] ^ new_x[14]);
		s[10] = (byte) (c10 ^ new_x[0] ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12] ^ new_x[15]);
		s[11] = (byte)(c11 ^ new_x[2] ^ new_x[4] ^ new_x[5] ^ new_x[8] ^ new_x[9] ^ new_x[13]);
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();

		byte index = -1;
		for(byte j = 12; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < 12; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 12) {
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
			System.out.println("no error!");
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
		} else if(sum != 0 && index != -1){
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
//			
//			System.out.println("error occured at index (zero based): "+(index - 12));
			String cor = bitFlip((index - 12), updatedIn);
//			System.out.println("corrected value: "+cor);
			if(cor.contentEquals(actualIn)) {
				hit = 1;
			}
		} else if(sum != 0 && index == -1) {
			
			boolean found2 = false;
			byte []tempArr2 = new byte[12];
			for(byte j = 12; j < H[0].length - 1; j++) {
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
					if(tempSum == 12) {
//						System.out.println("2 brust error found");
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						
//						System.out.println("error occured at index (zero based): "+(j - 12)
//								+" "+(j - 12 + 1));
						String cor1 = bitFlip((j - 12), updatedIn);
						String cor2 = bitFlip((j - 12 + 1), cor1);
//						System.out.println("corrected value: "+cor2);
						found2 = true;
						if(cor2.contentEquals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
			}
			if(found2 == false) {
				
				boolean found3 = false;
				byte []tempArr3 = new byte[12];
				
				for(byte j = 12; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 12) {
//							System.out.println("3 bit burst error found");
//							System.out.println("actual input:  "+actualIn);
//							System.out.println("updated value: "+updatedIn);
//							System.out.println("error occured at index (zero based): "+(j - 12)
//									+" "+(j - 12 + 1)+" "+(j - 12 + 2));
							String cor1 = bitFlip((j - 12), updatedIn);
							String cor2 = bitFlip((j - 12 +1), cor1);
							String cor3 = bitFlip((j - 12 + 2), cor2);
//							System.out.println("corrected value: "+cor3);
							found3 = true;
							if(cor3.contentEquals(actualIn)) {
								hit = 1;
							}
							break;
						}
					}
				}
				if(found3 == false) {
					
					boolean found4 = false;
					byte []tempArr4 = new byte[12];
					for(byte j = 12; j < H[0].length - 3; j++) {
						byte temp = 0;
						for(byte i = 0; i < H.length; i++) {
							tempArr4[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
												       ^ H[i][j + 3]);
						}
						byte tempSum = 0;
						for(byte i = 0; i < tempArr4.length; i++) {
							
							if(tempArr4[i] == s[i]) {
								tempSum++;
							} else {
								tempSum = 0;
								break;
							}
							if(tempSum == 12) {
//								System.out.println("4 bit burst error detected");
//								System.out.println("actual input:  "+actualIn);
//								System.out.println("updated value: "+updatedIn);
//								System.out.println("error occured at index (zero based): "
//													+(j - 12)+" "+(j - 12 + 1)+" "+(j - 12 + 2)
//													+" "+(j - 12 + 3) );
								String cor1 = bitFlip((j - 12), updatedIn);
								String cor2 = bitFlip((j - 12 + 1), cor1);
								String cor3 = bitFlip((j - 12 + 2), cor2);
								String cor4 = bitFlip((j - 12 + 3), cor3);
//								System.out.println("corrected value: "+cor4);
								found4 = true;
								if(cor4.contentEquals(actualIn)) {
									hit = 1;
								}
								break;
							}
						}
					}
					if(found4 == false) {
						
						boolean found5 = false;
						byte []tempArr5 = new byte[12];
						for(byte j = 12; j < H[0].length - 4; j++) {
							byte temp = 0;
							for(byte i = 0; i < H.length; i++) {
								tempArr5[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
													       ^ H[i][j + 3] ^ H[i][j + 4]);
							}
							byte tempSum = 0;
							for(byte i = 0; i < tempArr5.length; i++) {
								if(tempArr5[i] == s[i]) {
									tempSum++;
								} else {
									tempSum = 0;
									break;
								}
								if(tempSum == 12) {
//									System.out.println("5 bit burst error found");
//									System.out.println("actual input:  "+actualIn);
//									System.out.println("updated value: "+updatedIn);
//									System.out.println("error occured at index (zero based): "
//														+(j - 12)+" "+(j - 12 + 1)+" "+(j - 12 + 2)
//														+" "+(j - 12 + 3) +" "+(j - 12 + 4));
									String cor1 = bitFlip((j - 12), updatedIn);
									String cor2 = bitFlip((j - 12 + 1), cor1);
									String cor3 = bitFlip((j - 12 + 2), cor2);
									String cor4 = bitFlip((j - 12 + 3), cor3);
									String cor5 = bitFlip((j -12 + 4), cor4);
//									System.out.println("corrected value: "+cor5);
									found5 = true;
									if(cor5.contentEquals(actualIn)) {
										hit = 1;
									}
									break;
								}
							}
						}
						if(found5 == false) {
							
							boolean found6 = false;
							byte []tempArr6 = new byte[12];
							for(byte j = 12; j < H[0].length - 5; j++) {
								byte temp = 0;
								for(byte i = 0; i < H.length; i++) {
									tempArr6[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
														 ^ H[i][j + 3] ^ H[i][j + 4] ^ H[i][j + 5]);
								}
								byte tempSum = 0;
								for(byte i = 0; i < tempArr6.length; i++) {
									if(tempArr6[i] == s[i]) {
										tempSum++;
									} else {
										tempSum = 0;
										break;
									}
									if(tempSum == 12) {
//										System.out.println("6 bit burst error found");
//										System.out.println("actual input:  "+actualIn);
//										System.out.println("updated value: "+updatedIn);
//										System.out.println("error occured at index (zero based): "
//															+(j - 12)+" "+(j - 12 + 1)+" "+(j - 12 + 2)
//															+" "+(j - 12 + 3) + " "+(j - 12 + 4)
//															+ " "+(j - 12 + 5));
										String cor1 = bitFlip((j - 12), updatedIn);
										String cor2 = bitFlip((j - 12 + 1), cor1);
										String cor3 = bitFlip((j - 12 + 2), cor2);
										String cor4 = bitFlip((j - 12 + 3), cor3);
										String cor5 = bitFlip((j - 12 + 4), cor4);
										String cor6 = bitFlip((j - 12 + 5), cor5);
//										System.out.println("corrected value: "+cor6);
										
										found6 = true;
										if(cor6.contentEquals(actualIn)) {
											hit = 1;
										}
										break;
									}
								}
							}
							if(found6 == false) {
								
								boolean found7 = false;
								byte []tempArr7 = new byte[12];
								for(byte j = 12; j < H[0].length - 6; j++) {
									byte temp = 0;
									for(byte i = 0; i < H.length; i++) {
										tempArr7[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
															 ^ H[i][j + 3] ^ H[i][j + 4] ^ H[i][j + 5]
																	 ^ H[i][j + 6]);
									}
									byte tempSum = 0;
									for(byte i = 0; i < tempArr7.length; i++) {
										if(tempArr7[i] == s[i]) {
											tempSum++;
										} else {
											tempSum = 0;
											break;
										}
										
										if(tempSum == 12) {
//											System.out.println("7 bit burst error found");
//											System.out.println("actual input:  "+actualIn);
//											System.out.println("updated value: "+updatedIn);
//											System.out.println("error occured at index (zero based): "
//																+(j - 12)+" "+(j - 12 + 1)+" "+(j - 12 + 2)
//																+" "+(j - 12 + 3) + " "+(j - 12 + 4)
//																+ " "+(j - 12 + 5)+ " "+(j - 12 + 6));
											String cor1 = bitFlip((j - 12), updatedIn);
											String cor2 = bitFlip((j - 12 + 1), cor1);
											String cor3 = bitFlip((j - 12 + 2), cor2);
											String cor4 = bitFlip((j - 12 + 3), cor3);
											String cor5 = bitFlip((j - 12 + 4), cor4);
											String cor6 = bitFlip((j - 12 + 5), cor5);
											String cor7 = bitFlip((j - 12 + 6), cor6);
//											System.out.println("corrected value: "+cor7);
											found7 = true;
											if(cor7.contentEquals(actualIn)) {
												hit = 1;
											}
											break;
										}
									}
								}
								if(found7 ==false) {
									System.out.println("8 bit burst error detected");
								}
							}
							
						}
						
					}
				}
			}
		}
		return hit;
	}


	public static int FUEC_EAEC(String sendingEnd, String receivingEnd) {
//		String actualIn  = "1011 0010 0110 1101";
//		String updatedIn = "1100 1101 1010 1101";
//		
//		actualIn = actualIn.replaceAll("\\s", "");
//		updatedIn = updatedIn.replaceAll("\\s", "");
		
		String actualIn  = sendingEnd;
		String updatedIn = receivingEnd;
		int hit = 0;
		
		byte H[][] ={{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
					 {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
					 {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1},
					 {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
					 {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
					 {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
					 {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}};
				
		
		byte x[] = new byte[16];
		for(byte i = 0; i < x.length; i++) {
			x[i] = (byte) (actualIn.charAt(i) - 48);
		}

		byte c0 = (byte) (x[0] ^ x[4] ^ x[5] ^ x[7]);
		byte c1 = (byte) (x[1] ^ x[5] ^ x[9] ^ x[10] ^ x[14]);
		byte c2 = (byte) (x[2] ^ x[6] ^ x[8] ^ x[11] ^ x[15]);
		byte c3 = (byte) (x[3] ^ x[7] ^ x[11] ^ x[12]);
		byte c4 = (byte) (x[0] ^ x[5] ^ x[10] ^ x[13] ^ x[15]);
		byte c5 = (byte) (x[1] ^ x[6] ^ x[10] ^ x[13]);
		byte c6 = (byte) (x[2] ^ x[7] ^ x[10] ^ x[11] ^ x[15]);
		byte c7 = (byte) (x[3] ^ x[8] ^ x[12] ^ x[14]);
		byte c8 = (byte) (x[4] ^ x[9] ^ x[12] ^ x[13]);
		byte c9 = (byte) (x[1] ^ x[5] ^ x[6] ^ x[9] ^ x[13] ^ x[14]);
		byte c10 = (byte) (x[0] ^ x[3] ^ x[7] ^ x[11] ^ x[12] ^ x[15]);
		byte c11 = (byte) (x[2] ^ x[4] ^ x[5] ^ x[8] ^ x[9] ^ x[13]);
		byte c12 = (byte) (x[4] ^ x[10]);
		
		String newStr = ""+c0+c1+c2+c3+c4+c5+c6+c7+c8+c9+c10+c11+c12+updatedIn;
		char newChar[] = newStr.toCharArray();
		byte b[] = new byte[newChar.length];
		for(byte i = 0; i < newChar.length; i++) {
			b[i] = (byte) ((int)newChar[i] - 48);
		}
		
		byte new_x[] = new byte[16];
		for(byte i = 0; i < new_x.length; i++) {
			new_x[i] = (byte) (updatedIn.charAt(i) - 48);
		}
		
		byte s[] = new byte[13];
		s[0] = (byte) (c0 ^ new_x[0] ^ new_x[4] ^ new_x[5] ^ new_x[7]);
		s[1] = (byte) (c1 ^ new_x[1] ^ new_x[5] ^ new_x[9] ^ new_x[10] ^ new_x[14]);
		s[2] = (byte) (c2 ^ new_x[2] ^ new_x[6] ^ new_x[8] ^ new_x[11] ^ new_x[15]);
		s[3] = (byte) (c3 ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12]);
		s[4] = (byte) (c4 ^ new_x[0] ^ new_x[5] ^ new_x[10] ^ new_x[13] ^ new_x[15]);
		s[5] = (byte) (c5 ^ new_x[1] ^ new_x[6] ^ new_x[10] ^ new_x[13]);
		s[6] = (byte) (c6 ^ new_x[2] ^ new_x[7] ^ new_x[10] ^ new_x[11] ^ new_x[15]);
		s[7] = (byte) (c7 ^ new_x[3] ^ new_x[8] ^ new_x[12] ^ new_x[14]);
		s[8] = (byte) (c8 ^ new_x[4] ^ new_x[9] ^ new_x[12] ^ new_x[13]);
		s[9] = (byte) (c9 ^ new_x[1] ^ new_x[5] ^ new_x[6] ^ new_x[9] ^ new_x[13] ^ new_x[14]);
		s[10] = (byte) (c10 ^ new_x[0] ^ new_x[3] ^ new_x[7] ^ new_x[11] ^ new_x[12] ^ new_x[15]);
		s[11] = (byte) (c11 ^ new_x[2] ^ new_x[4] ^ new_x[5] ^ new_x[8] ^ new_x[9] ^ new_x[13]);
		s[12] = (byte) (c12 ^ new_x[4] ^ new_x[10]);
		
//		for(byte i = 0; i < s.length; i++) {
//			System.out.print(s[i]+" ");
//		}
//		System.out.println();

		byte index = -1;
		for(byte j = 13; j < H[0].length; j++) {
			byte temp = 0;
			for(byte i = 0; i < 13; i++) {
				if(H[i][j] == s[i]) {
					temp++;
				} else {
					temp = 0;
					break;
				}
				if(temp == 13) {
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
			System.out.println("no error!");
			System.out.println("actual input:  "+actualIn);
			System.out.println("updated value: "+updatedIn);
			
		} else if(sum != 0 && index != -1){
//			System.out.println("1 bit error found");
//			System.out.println("actual input:  "+actualIn);
//			System.out.println("updated value: "+updatedIn);
			
//			System.out.println("error occured at index (zero based): "+(index - 13));
			String cor = bitFlip((index - 13), updatedIn);
//			System.out.println("corrected value: "+cor);
			if(cor.contentEquals(actualIn)) {
				hit = 1;
			}
		} else if(sum != 0 && index == -1) {
			boolean found2 = false;
			byte []tempArr2 = new byte[13];
			for(byte j = 13; j < H[0].length - 1; j++) {
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
					if(tempSum == 13) {
//						System.out.println("2 bit burst error found");
//						System.out.println("actual input:  "+actualIn);
//						System.out.println("updated value: "+updatedIn);
//						
//						System.out.println("error occured at index (zero based): "+(j - 13)
//								+" "+(j - 13 + 1));
						String cor1 = bitFlip((j - 13), updatedIn);
						String cor2 = bitFlip((j - 13 + 1), cor1);
//						System.out.println("corrected value: "+cor2);
						found2 = true;
						if(cor2.contentEquals(actualIn)) {
							hit = 1;
						}
						break;
					}
				}
			}
			if(found2 == false) {
				boolean found3 = false;
				byte []tempArr3 = new byte[13];
				
				for(byte j = 13; j < H[0].length - 2; j++) {
					byte temp = 0;
					for(byte i = 0; i < H.length; i++) {
						tempArr3[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]);
					}
					byte tempSum = 0;
					for(byte i = 0; i < tempArr3.length; i++) {
						
						if(tempArr3[i] == s[i]) {
							tempSum++;
						} else {
							tempSum = 0;
							break;
						}
						if(tempSum == 13) {
//							System.out.println("3 bit burst error found");
//							System.out.println("actual input:  "+actualIn);
//							System.out.println("updated value: "+updatedIn);
//							System.out.println("error occured at index (zero based): "+(j - 13)
//									+" "+(j - 13 + 1)+" "+(j - 13 + 2));
							String cor1 = bitFlip((j - 13), updatedIn);
							String cor2 = bitFlip((j - 13 +1), cor1);
							String cor3 = bitFlip((j - 13 + 2), cor2);
//							System.out.println("corrected value: "+cor3);
							found3 = true;
							if(cor3.contentEquals(actualIn)) {
								hit = 1;
							}
							break;
						}
					}
				}
				if(found3 == false) {
					boolean found4 = false;
					byte []tempArr4 = new byte[13];
					for(byte j = 13; j < H[0].length - 3; j++) {
						byte temp = 0;
						for(byte i = 0; i < H.length; i++) {
							tempArr4[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
												       ^ H[i][j + 3]);
						}
						byte tempSum = 0;
						for(byte i = 0; i < tempArr4.length; i++) {
							
							if(tempArr4[i] == s[i]) {
								tempSum++;
							} else {
								tempSum = 0;
								break;
							}
							if(tempSum == 13) {
//								System.out.println("4 bit burst error found");
//								System.out.println("actual input:  "+actualIn);
//								System.out.println("updated value: "+updatedIn);
//								System.out.println("error occured at index (zero based): "
//													+(j - 13)+" "+(j - 13 + 1)+" "+(j - 13 + 2)
//													+" "+(j - 13 + 3) );
								String cor1 = bitFlip((j - 13), updatedIn);
								String cor2 = bitFlip((j - 13 + 1), cor1);
								String cor3 = bitFlip((j - 13 + 2), cor2);
								String cor4 = bitFlip((j - 13 + 3), cor3);
//								System.out.println("corrected value: "+cor4);
								found4 = true;
								if(cor4.contentEquals(actualIn)) {
									hit = 1;
								}
								break;
							}
						}
					}
					if(found4 == false) {
						boolean found5 = false;
						byte []tempArr5 = new byte[13];
						for(byte j = 13; j < H[0].length - 4; j++) {
							byte temp = 0;
							for(byte i = 0; i < H.length; i++) {
								tempArr5[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
													       ^ H[i][j + 3] ^ H[i][j + 4]);
							}
							byte tempSum = 0;
							for(byte i = 0; i < tempArr5.length; i++) {
								if(tempArr5[i] == s[i]) {
									tempSum++;
								} else {
									tempSum = 0;
									break;
								}
								if(tempSum == 13) {
//									System.out.println("5 bit burst error found");
//									System.out.println("actual input:  "+actualIn);
//									System.out.println("updated value: "+updatedIn);
//									System.out.println("error occured at index (zero based): "
//														+(j - 13)+" "+(j - 13 + 1)+" "+(j - 13 + 2)
//														+" "+(j - 13 + 3) +" "+(j - 13 + 4));
									String cor1 = bitFlip((j - 13), updatedIn);
									String cor2 = bitFlip((j - 13 + 1), cor1);
									String cor3 = bitFlip((j - 13 + 2), cor2);
									String cor4 = bitFlip((j - 13 + 3), cor3);
									String cor5 = bitFlip((j -13 + 4), cor4);
//									System.out.println("corrected value: "+cor5);
									found5 = true;
									if(cor5.contentEquals(actualIn)) {
										hit = 1;
									}
									break;
								}
							}
						}
						if(found5 == false) {
							boolean found6 = false;
							byte []tempArr6 = new byte[13];
							for(byte j = 13; j < H[0].length - 5; j++) {
								byte temp = 0;
								for(byte i = 0; i < H.length; i++) {
									tempArr6[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
														 ^ H[i][j + 3] ^ H[i][j + 4] ^ H[i][j + 5]);
								}
								byte tempSum = 0;
								for(byte i = 0; i < tempArr6.length; i++) {
									if(tempArr6[i] == s[i]) {
										tempSum++;
									} else {
										tempSum = 0;
										break;
									}
									if(tempSum == 13) {
//										System.out.println("6 bit burst error found");
//										System.out.println("actual input:  "+actualIn);
//										System.out.println("updated value: "+updatedIn);
//										System.out.println("error occured at index (zero based): "
//															+(j - 13)+" "+(j - 13 + 1)+" "+(j - 13 + 2)
//															+" "+(j - 13 + 3) + " "+(j - 13 + 4)
//															+ " "+(j - 13 + 5));
										String cor1 = bitFlip((j - 13), updatedIn);
										String cor2 = bitFlip((j - 13 + 1), cor1);
										String cor3 = bitFlip((j - 13 + 2), cor2);
										String cor4 = bitFlip((j - 13 + 3), cor3);
										String cor5 = bitFlip((j - 13 + 4), cor4);
										String cor6 = bitFlip((j - 13 + 5), cor5);
//										System.out.println("corrected value: "+cor6);
										found6 = true;
										if(cor6.contentEquals(actualIn)) {
											hit = 1;
										}
										break;
									}
								}
							}
							if(found6 == false) {
								boolean found7 = false;
								byte []tempArr7 = new byte[13];
								for(byte j = 13; j < H[0].length - 6; j++) {
									byte temp = 0;
									for(byte i = 0; i < H.length; i++) {
										tempArr7[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
															 ^ H[i][j + 3] ^ H[i][j + 4] ^ H[i][j + 5]
																	 ^ H[i][j + 6]);
									}
									byte tempSum = 0;
									for(byte i = 0; i < tempArr7.length; i++) {
										if(tempArr7[i] == s[i]) {
											tempSum++;
										} else {
											tempSum = 0;
											break;
										}
										
										if(tempSum == 13) {
//											System.out.println("7 bit burst error found");
//											System.out.println("actual input:  "+actualIn);
//											System.out.println("updated value: "+updatedIn);
//											System.out.println("error occured at index (zero based): "
//																+(j - 13)+" "+(j - 13 + 1)+" "+(j - 13 + 2)
//																+" "+(j - 13 + 3) + " "+(j - 13 + 4)
//																+ " "+(j - 13 + 5)+ " "+(j - 13 + 6));
											String cor1 = bitFlip((j - 13), updatedIn);
											String cor2 = bitFlip((j - 13 + 1), cor1);
											String cor3 = bitFlip((j - 13 + 2), cor2);
											String cor4 = bitFlip((j - 13 + 3), cor3);
											String cor5 = bitFlip((j - 13 + 4), cor4);
											String cor6 = bitFlip((j - 13 + 5), cor5);
											String cor7 = bitFlip((j - 13 + 6), cor6);
//											System.out.println("corrected value: "+cor7);
											found7 = true;
											if(cor7.contentEquals(actualIn)) {
												hit = 1;
											}
											break;
										}
									}
								}
								if(found7 == false) {
									boolean found8 = false;
									byte []tempArr8 = new byte[13];
									for(byte j = 13; j < H[0].length - 7; j++) {
										byte temp = 0;
										for(byte i = 0; i < H.length; i++) {
											tempArr8[i] = (byte) (temp ^ H[i][j] ^ H[i][j + 1] ^ H[i][j + 2]
																 ^ H[i][j + 3] ^ H[i][j + 4] ^ H[i][j + 5]
																		 ^ H[i][j + 6] ^ H[i][j + 7]);
										}
										byte tempSum = 0;
										for(byte i = 0; i < tempArr8.length; i++) {
											if(tempArr8[i] == s[i]) {
												tempSum++;
											} else {
												tempSum = 0;
												break;
											}
											if(tempSum == 13) {
//												System.out.println("8 bit burst error found");
//												System.out.println("actual input:  "+actualIn);
//												System.out.println("updated value: "+updatedIn);
//												System.out.println("error occured at index (zero based): "
//																	+(j - 13)+" "+(j - 13 + 1)+" "+(j - 13 + 2)
//																	+" "+(j - 13 + 3) + " "+(j - 13 + 4)
//																	+ " "+(j - 13 + 5)+ " "+(j - 13 + 6)
//												+ " "+(j - 13 + 7));
												String cor1 = bitFlip((j - 13), updatedIn);
												String cor2 = bitFlip((j - 13 + 1), cor1);
												String cor3 = bitFlip((j - 13 + 2), cor2);
												String cor4 = bitFlip((j - 13 + 3), cor3);
												String cor5 = bitFlip((j - 13 + 4), cor4);
												String cor6 = bitFlip((j - 13 + 5), cor5);
												String cor7 = bitFlip((j - 13 + 6), cor6);
												String cor8 = bitFlip((j - 13 + 7), cor7);
//												System.out.println("corrected value: "+cor8);
												found8 = true;
												if(cor8.contentEquals(actualIn)) {
													hit = 1;
												}
												break;
											}
										}
									}
									if(found8 == false) {
										System.out.println("9 bit burst error detected");
										System.out.println("actual input:  "+actualIn);
										System.out.println("updated value: "+updatedIn);
									}
								}
							}
							
						}
						
					}
				}
			}
		}
		return hit;
	}
}

















