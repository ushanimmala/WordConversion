package com.sample.converttonumbers;


public class CommonMethods {
	
	public String numToWord(int count,int[] number){
		  String wordString ="";
		  for(int j=count-1;j>=0;j--){
			  System.out.println(number[j]);  
		  }
			  
		  if(count==7){
			wordString=TenLakhPlace(number);
		  }
		  if(count==6){
			wordString=onelakhPlace(number);
		  }
		  if(count==5){
			 wordString=TenThousandPlace(number);
		  }
		  if(count==4){
			  wordString=ThousandspLace(number);
		  }
		  if(count==3){
			  wordString=Hundredsplace(number);
		  }
		  if(count==2){
			  wordString=twosplace(number[0], number[1]);
		  }
		  
		return wordString;
	  }
	
	private String TenLakhPlace(int[] number){
		String tenLakhPlace="";
		
		if(number[5]!=0){
			tenLakhPlace+=twosplace(number[5],number[6])+" LAKH ";
			if(number[4]!=0){
				tenLakhPlace+=TenThousandPlace(number);
			}
		}
		
		return tenLakhPlace;
	}
	
	private String onelakhPlace(int[] number){
		String onelakhplace="";
		
		if(number[5]!=0){
			onelakhplace+=onesplace(number[5])+" LAKH ";
			if(number[4]!=0){
				onelakhplace+=TenThousandPlace(number);
			}else{
				onelakhplace+=ThousandspLace(number);
			}
		}else{
			onelakhplace+=ThousandspLace(number);
		}
		
		return onelakhplace;
	}
	
	public String TenThousandPlace(int[] number){
		String tenThousandStr="";
		if(number[4]!=0){
			tenThousandStr+=twosplace(number[3], number[4])+" THOUSAND ";
			if(number[2]!=0){
				tenThousandStr+=Hundredsplace(number);
			}
		}else{
			tenThousandStr+=ThousandspLace(number);
		}
		
		return tenThousandStr;
	}
	
	public String ThousandspLace(int[] number){
		  String thousandsStr="";
		  if(number[3]!=0){
			  thousandsStr+=onesplace(number[3])+" THOUSAND ";
			  	if(number[2]!=0){
			  		thousandsStr+=Hundredsplace(number);
			  	}else{
			  		thousandsStr+=twosplace(number[0], number[1]);
			  	}
		  }else{
			  thousandsStr+=twosplace(number[0], number[1]);
		  }
		  return thousandsStr;
	  }
	
	
	public String Hundredsplace(int[] number){
		  String hunStr="";
		  
		  if(number[2]!=0){
			  hunStr=onesplace(number[2])+" HUNDRED ";
			  if(number[0]!=0 || number[1]!=0){
				  hunStr+=" AND "+twosplace(number[0], number[1]);
			  }
		  }else{
			  hunStr+=onesplace(number[0]);
		  }
		  
		  return hunStr;
	  }
	
	
	 public String onesplace(int num){
		  String onesStr="";
		  
		  switch(num){
		  case 1: onesStr=Constants.ONE;
		  			break;
		  case 2: onesStr=Constants.TWO;
		  			break;
		  case 3: onesStr=Constants.THREE;
					break;
		  case 4: onesStr=Constants.FOUR;
					break;
		  case 5: onesStr=Constants.FIVE;
					break;
		  case 6: onesStr=Constants.SIX;
					break;
		  case 7: onesStr=Constants.SEVEN;
					break;
		  case 8: onesStr=Constants.EIGHT;
				   break;
		  case 9: onesStr=Constants.NINE;
		  		   break;
		  
		  }
		  
		  return onesStr;
		  
	  }
	 
	 
	 String twosplace(int lastDigit,int lastbutonedigit){
		  String twosStr="";
		  
		  if(lastbutonedigit==0){
			  twosStr=onesplace(lastDigit);
		  }
		  
		  if(lastbutonedigit==1){
			  switch(lastDigit){
			  case 1: twosStr=Constants.ELEVEN;
			  			break;
			  case 2: twosStr=Constants.TWELEVE;
			  			break;
			  case 3: twosStr=Constants.THIRTEEN;
						break;
			  case 4: twosStr=Constants.FOURTEEN;
						break;
			  case 5: twosStr=Constants.FIFTEEN;
						break;
			  case 6: twosStr=Constants.SIXTEEN;
						break;
			  case 7: twosStr=Constants.SEVENTEEN;
						break;
			  case 8: twosStr=Constants.EIGHTTEEN;
					   break;
			  case 9: twosStr=Constants.NINETEEN;
			  		   break;
			  case 0 :twosStr="TEN";
			  		 break;
			  }
			  
		  }else if(lastbutonedigit ==2){
			  twosStr=Constants.TWENTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==3){
			  twosStr=Constants.THIRTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==4){
			  twosStr=Constants.FOURTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==5){
			  twosStr=Constants.FIFTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==6){
			  twosStr=Constants.SIXTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==7){
			  twosStr=Constants.SEVENTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==8){
			  twosStr=Constants.EIGHTTY+" "+onesplace(lastDigit);
		  }else if(lastbutonedigit ==9){
			  twosStr=Constants.NINTY+" "+onesplace(lastDigit);
		  }
		  
		  
		return twosStr;  
	  }


}
