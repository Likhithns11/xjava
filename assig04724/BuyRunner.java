class BuyRunner{
public static void main(String[] args)
{
	Buy.product("Dominos",89);
	System.out.println("------------------");
	Buy.product("Dominos",-22);
	System.out.println("------------------");
	Buy.product("Dominos",112);
	System.out.println("------------------");
	BookMyShow.bookMovieTicket("Adduri","GT mall PVR",3,199.9);
	System.out.println("------------------");
	BookMyShow.bookMovieTicket("Adduri","GT mall PVR",899,-199.9);
	System.out.println("------------------");
	BookMyShow.bookMovieTicket("Adduri","GT mall PVR",11,399.9);
	System.out.println("------------------");
	Food.buyEgg(100,6);
	System.out.println("------------------");
	Food.buyEgg(200,-3);
	System.out.println("------------------");
	Food.buyEgg(1000,7986);
	System.out.println("------------------");
	Food.buyShampoo(5,1,"chick","01/05/2024");
	System.out.println("------------------");
	Food.buyShampoo(8,4,"chick","01/05/2024");
	System.out.println("------------------");
	Food.buyShampoo(56,71,"chick","01/05/2024");
	System.out.println("------------------");
	Food.buyCake('M',"pastry","Black Forest",750.2,4);
	System.out.println("------------------");
	Food.buyCake('M',"normal cake","choclate",999.9,-4);
	System.out.println("------------------");
	Laptop.buyLaptop("ASUS",8523,45999.00,3500,15.2,"windows",512,164);
	System.out.println("------------------");
	Laptop.buyLaptop("ASUS",85263,85999.00,-3500,-15.2,"windows",7512,1694);
	System.out.println("------------------");
	BookMyShow.buySmartWatch("Fasttrack",5000.0,"black",'a',3);
	System.out.println("------------------");
	BookMyShow.buySmartWatch("Fasttrack",11000.0,"black",'a',8);
	System.out.println("------------------");
	BookMyShow.buySmartWatch("Fasttrack",42000.0,"black",'a',-8);
	
}
}