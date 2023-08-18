package br.com.luizlcezario.me.converter;

public enum CoinName {
    AED("Dirham dos Emirados"),
    ARS("Peso Argentino"),
    AUD("Dólar Australiano"),
    BOB("Boliviano"),
    BRL("Real Brasileiro"),
    BTC("Bitcoin"),
    CAD("Dólar Canadense"),
    CHF("Franco Suíço"),
    CLP("Peso Chileno"),
    CNY("Yuan Chinês"),
    COP("Peso Colombiano"),
    DKK("Coroa Dinamarquesa"),
    DOGE("Dogecoin"),
    ETH("Ethereum"),
    EUR("Euro"),
    GBP("Libra Esterlina"),
    HKD("Dólar de Hong Kong"),
    ILS("Novo Shekel Israelense"),
    INR("Rúpia Indiana"),
    JPY("Iene Japonês"),
    LTC("Litecoin"),
    MXN("Peso Mexicano"),
    NOK("Coroa Norueguesa"),
    NZD("Dólar Neozelandês"),
    PEN("Sol do Peru"),
    PLN("Zlóti Polonês"),
    PYG("Guarani Paraguaio"),
    RUB("Rublo Russo"),
    SAR("Riyal Saudita"),
    SEK("Coroa Sueca"),
    SGD("Dólar de Cingapura"),
    THB("Baht Tailandês"),
    TRY("Nova Lira Turca"),
    TWD("Dólar Taiuanês"),
    USD("Dólar Americano"),
    USDT("Dólar Americano"),
    UYU("Peso Uruguaio"),
    VEF("Bolívar Venezuelano"),
    XRP("XRP"),
    ZAR("Rand Sul-Africano");

    String description;

    public String getCoinName() {
        return description;
    }

    public static CoinName getId(String description) {
        for (CoinName coinName : CoinName.values()) {
            if (coinName.description.equals(description)) {
                return coinName;
            }
        }
        return null;
    }

    CoinName(String description) {
        this.description = description;
    }
}
