package com.caiojacintho.javacore.concorrencia.dominio;

public final class Quote {
    private final String store;
    private final Double price;
    private final Discount.Code discountCode;

    private Quote(String store, Double price, Discount.Code discountCode) {
        this.store = store;
        this.price = price;
        this.discountCode = discountCode;
    }


    /**
     * Create new Quote objct from the value following the pattern storeName:price:discountCode
     * @param value containing storeName:price:discountCode
     * @return new Quote with values from @param value
     */
    public static Quote newQuote(String value) {
        String[] values = value.split(":");
        return new Quote(values[0], Double.valueOf(values[1].replace(',','.')), Discount.Code.valueOf(values[2]));

    }

    @Override
    public String toString() {
        return "Quote{" +
                "store='" + store + '\'' +
                ", price=" + price +
                ", discountCode=" + discountCode +
                '}';
    }

    public String getStore() {
        return store;
    }

    public Double getPrice() {
        return price;
    }

    public Discount.Code getDiscountCode() {
        return discountCode;
    }
}
