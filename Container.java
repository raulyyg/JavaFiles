// Attached: HW: 10ab
// =====================================================================
// Project: HW_10a Containers
// =====================================================================
// Programmer: Raul Garcia
// Class: CIS 18A
// =====================================================================


public abstract class Container 
{
	protected String mfr;
	protected String stockNum;
	
	public Container(String mfr, String stockNum)
	{
		this.mfr = mfr;
		this.stockNum = stockNum;
	}
	
	public abstract String toString();
	
		public static void main(String[] args) 
		{
		System.out.println("Gift Box 1"); 
		GiftBox giftBox_1 = new GiftBox("ABC Co.", "100", "white", "paper"); 
		System.out.println(giftBox_1.toString());
		
		System.out.println("\nGift Box 2"); 
		GiftBox giftBox_2 = new GiftBox("Rawlings.", "234", "blue", "silk"); 
		System.out.println(giftBox_2.toString());
		
		System.out.println("\nShipping Box 1"); 
		ShippingBox shipBox_1 = new ShippingBox("ABC Co.", "100", "4 in ", true); 
		System.out.println(shipBox_1.toString());
		
		System.out.println("\nShipping Box 2"); 
		ShippingBox shipBox_2 = new ShippingBox("Rawlings.", "234", "8 in ", false); 
		System.out.println(shipBox_2.toString());
		
		
		}
		
	

}
