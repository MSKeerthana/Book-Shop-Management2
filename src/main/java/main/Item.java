package main;
public class Item{
    public String itemName;
    public int Mrp;
    public  void addItem(String itemName,int mrpItem){
        this.itemName=itemName;
        this.Mrp=mrpItem;

    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return Mrp;
	}
	public void setMrp(int mrp) {
		this.Mrp = mrp;
		//System.out.println(Mrp);
	}
    
}