package CurencyRatePrivat;

import java.io.IOException;

public class Main {
//
//    static String JSON_TEXT;
//
//    static {
//        JSON_TEXT = """
//                    [
//
//                    {
//                        "ccy":"EUR",
//                            "base_ccy":"UAH",
//                            "buy":"40.00000",
//                            "sale":"41.00000"
//                    },
//
//                    {
//                        "ccy":"USD",
//                            "base_ccy":"UAH",
//                            "buy":"38.40000",
//                            "sale":"38.90000"
//                    }]
//
//                }
//
//
//
//                """;
//    }

    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5");

    }
}


