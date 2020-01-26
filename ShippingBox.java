
public class ShippingBox extends Container
{
	private String thickness;
	private boolean waterProof;
	
	public ShippingBox(String mfr, String stockNum, String thickness, boolean waterSafe )
	{
		super(mfr, stockNum);
		this.thickness = thickness;
		this.waterProof = waterSafe;
	
	}
	
	public String toString()
	{
		String strWaterSafe;
		if(waterProof)
			strWaterSafe = "No";
		else
			strWaterSafe = "Yes";
			
		return "Manufacturer: " + mfr + "\nStock Number: " + stockNum + "\nThickness: " + thickness + "\nWater Proof: " + strWaterSafe;  
	}
	
}
