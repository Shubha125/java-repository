public class OrderBiriyani{
	public static void main(String args[]){
		String foodName="Biriyani";
		int price=450;
		float gst=0.18f;
		int numberOfBiriyani=15;
		int deliveryCharge=50;
		int totalBiriyaniPrice=price*numberOfBiriyani;
		System.out.println("total price is:"+totalBiriyaniPrice);
		System.out.println("GST Calculation");
		float gstPrice=totalBiriyaniPrice*gst;
		System.out.println("gstPrice is:"+gstPrice);
		float payblePrice=totalBiriyaniPrice+gstPrice+deliveryCharge;
		System.out.println("payble Amount is:"+payblePrice);
		float discount=0.15f;
		float discountAmount=payblePrice*discount;
		System.out.println("Discount Amount:"+discountAmount);
		float grandTotal=payblePrice-discountAmount;
		System.out.println("Grand Total:"+grandTotal);
	}
}