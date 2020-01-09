package web;

public class Phone {
	private String name;
	private String desc;
	private String price;
	private String imgURL;
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Phone(String name, String desc, String price, String imgURL) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.imgURL = imgURL;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImgURL() {
		return imgURL;
	}
	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", desc=" + desc + ", price=" + price + ", imgURL=" + imgURL + "]";
	}
	

}
