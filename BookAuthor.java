package Bke;

public class BookAuthor {
	                 String name;
	                 double price;
	                 int qty=0;
	               Author author;
	public Author getAuthor() {
		return author;
	           }
	         public BookAuthor(String name,Author author,double price){
		           super();
		          this.name=name;
		          this.price=price;
                 }
	public BookAuthor(String name,Author author,double price,int qty){
	       super();
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	           }
	
	public static void main(String[] args) {
		Author a=new Author("Lynn","lynntheintnyunt@gmail.com",'F');
		BookAuthor b=new BookAuthor("U mg mg",a,300,1);
		System.out.println("Author is \'"+a.name+"\'\t,"+a.email+"\t,"+a.gender);
		System.out.println();
		System.out.println("Book is \'"+b.name+"\'\t,"+b.price+"\t,"+b.qty);
	}
}

