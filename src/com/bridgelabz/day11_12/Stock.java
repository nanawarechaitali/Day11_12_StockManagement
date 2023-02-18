package com.bridgelabz.day11_12;

public class Stock {
    private String stockName;


    private int noOfStocks;
    private int priceOfStock;
    private double totalValue;

    StockPortfolio stockPortfolio = new StockPortfolio();

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfStocks() {
        return noOfStocks;
    }

    public void setNoOfStocks(int noOfStocks) {
        this.noOfStocks = noOfStocks;
    }

    public double getPriceOfStock() {
        return priceOfStock;
    }

    public void setPriceOfStock(int  priceOfStock) {
        this.priceOfStock = priceOfStock;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Stock(String stockName,int numOfStocks,int priceOfStock) {

        this.stockName = stockName;
        this.noOfStocks=numOfStocks;
        this.priceOfStock=priceOfStock;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", noOfStocks=" + noOfStocks +
                ", priceOfStock=" + priceOfStock +
                ", totalValue=" + totalValue +
                ", stockPortfolio=" + stockPortfolio +
                '}';
    }
}




