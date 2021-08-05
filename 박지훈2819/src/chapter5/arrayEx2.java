package chapter5;

public class arrayEx2 {

	public static void main(String[] args) {
		String[] Ã¥²ÈÀÌ = new String[10];
		String[] reverseÃ¥²ÈÀÌ=new String[10];
		String[] Ã¥²ÈÀÌ2=new String[10];
		Ã¥²ÈÀÌ[4] = "ÀÚ¹ÙÀÇ Á¤¼®";
		Ã¥²ÈÀÌ[6] = "¸í Ç° ÀÚ¹Ù";
		Ã¥²ÈÀÌ[7] = "Do it ÀÚ¹ÙÇÁ·Î±×·¡¹Ö ÀÔ¹®";
		Ã¥²ÈÀÌ[8] = "ÇÁ·Î±×·¡¹Ö ÀÔ¹®";
		

		System.out.println(Ã¥²ÈÀÌ[0]);
		
		
		for(int i=0,j=Ã¥²ÈÀÌ.length-1;i<Ã¥²ÈÀÌ.length;i++,j--)
			reverseÃ¥²ÈÀÌ[j]=Ã¥²ÈÀÌ[i];
			

		for (int i = 0; i < Ã¥²ÈÀÌ.length; i++) {
			//³»°¡ÇÑ ´äÀº ¿ÖÆ²·È´ÂÁö ¾Ë¾Æº¸±â ³»°¡ Çß´ø´äÀº i<Ã¥²ÈÀÌ.length
			if (Ã¥²ÈÀÌ[i] == null && reverseÃ¥²ÈÀÌ[i]==null) { //&&µÑ´Ù Åë°úÇØ¾ß Á¶°Ç ½ÇÇà ||ÇÏ³ª¸¸ Åë°úÇØµµ ½ÇÇà
				continue;
			}
			System.out.println(Ã¥²ÈÀÌ[i]);
			System.out.println(reverseÃ¥²ÈÀÌ[i]);
		}
		/*
		reverseÃ¥²ÈÀÌ[9]=Ã¥²ÈÀÌ[0];
		reverseÃ¥²ÈÀÌ[8]=Ã¥²ÈÀÌ[1];
		reverseÃ¥²ÈÀÌ[7]=Ã¥²ÈÀÌ[2];
		reverseÃ¥²ÈÀÌ[6]=Ã¥²ÈÀÌ[3];
		reverseÃ¥²ÈÀÌ[5]=Ã¥²ÈÀÌ[4];
		reverseÃ¥²ÈÀÌ[4]=Ã¥²ÈÀÌ[5];
		*/
		for(int i=0,k=Ã¥²ÈÀÌ.length-1;i<Ã¥²ÈÀÌ.length;i++,k--) {
			Ã¥²ÈÀÌ2[k]=Ã¥²ÈÀÌ[i];
		}

		for(int i=0;i<Ã¥²ÈÀÌ.length;i++) {
			if(Ã¥²ÈÀÌ[i]==null) {// Ã¥ÀÌ ÀÖ´ÂÁö ¾ø´ÂÁö ¾Ë¾Æ³»´Â °úÁ¤ ¸¸¾à null°ªÀÌ µé¾îÀÖ´Ù¸é ´ÙÀ½À¸·Î ³Ñ¾î°¡±â¶§¹®¿¡ 
							   // Ã¥ÀÌ ÀÖÀ»‹š ±îÁö ¹Ýº¹ÇÑ´Ù´Â ÀÇ¹Ì
				continue;
			}
			for(int k = 0;k<Ã¥²ÈÀÌ2.length;k++) {
				if(Ã¥²ÈÀÌ2[k] != null) {
					continue;
				}
				Ã¥²ÈÀÌ2[k]=Ã¥²ÈÀÌ[i];
				break;
			} //ÀÎµ¦½º È®ÀÎÇÏ´Â ¹æ¹ý print(Ã¥²ÈÀÌ[i] +i)
		/*for(int i=0,k=Ã¥²ÈÀÌ.length-1;i<Ã¥²ÈÀÌ.length;i++) {
			if(Ã¥²ÈÀÌ[i]==null) {
				continue;
			}else {
				
			}
			
		}
	*/		
		
		
		
		
		for(int i=0,j=Ã¥²ÈÀÌ.length-1;i<Ã¥²ÈÀÌ.length;i++,j--) {
			if(Ã¥²ÈÀÌ[i]==null) {
				continue;
			}
			reverseÃ¥²ÈÀÌ[j]=Ã¥²ÈÀÌ[i];
			System.out.println(reverseÃ¥²ÈÀÌ[j]);
		}
	}
}
