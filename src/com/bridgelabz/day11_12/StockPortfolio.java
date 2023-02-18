package com.bridgelabz.day11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    Scanner sc = new Scanner(System.in);
     public ArrayList<Stock> list=new ArrayList<>();
    public void addStock(){
        System.out.println("Enter stock name");
        String stockName = sc.next();
        System.out.println("Enter number of stock");
        int numOfStocks= sc.nextInt();
        System.out.println("Enter stock value");
        int priceOfStock=sc.nextInt();

        Stock stock = new Stock(stockName,numOfStocks,priceOfStock);
        list.add(stock);
        System.out.println();
        System.out.println("Stocks added");
    }
    public void addNumberOfStocks(){
        System.out.println("Enter number of stocks you want to add");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            addStock();
        }
    }
    public double totalStockValue(){
        double totalValue=0;
        for(Stock stock: list){
            totalValue+=stock.getNoOfStocks()*stock.getPriceOfStock();

        }
        return totalValue;
    }
}
