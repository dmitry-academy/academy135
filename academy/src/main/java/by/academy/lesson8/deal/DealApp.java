package by.academy.lesson8.deal;

public class DealApp {
//	1. Необходимо реализовать программу, 
//	которая будет позволять вводить сделки купли-продажи товаров между двумя участниками. 
//	В каждой сделке может быть несколько товаров, 
//	сумма сделки рассчитывается из суммы всех товаров. 
//	Сумма каждого товара рассчитывается из его стоимости и количества. 
//	Программа должна позволить ввести информацию о сделках, 
//	сохранить ее в памяти и вывести на экран. 
//	Ввод информацию осуществляется с экрана (консоли). 
//	Количество дополнительной информацию о сделке, участнике, 
//	товаре придумать самому (больше одного поля для класса). 
//	Сделка должна содержать массив продуктов.

	// Product
	// User
	// Deal
	public static void main(String[] args) {
		User s = new User("Vasgen", 40, 100);
		User b = new User("Dima", 20, 1500);

		Product[] products = new Product[10];
		products[0] = new Product("apelsin", 10, 5);
		products[1] = new Product("yabloko", 15, 3);
		products[2] = new Product("banani", 20, 8);

		Deal deal = new Deal("Minsk", b, s, products);
		System.out.println("Full deal cost: " + deal.calPrice());
	}

}
