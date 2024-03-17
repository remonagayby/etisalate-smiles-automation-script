package api;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class APIRequest {

    public void priceRequest() {
        HttpResponse<String> request = Unirest.get("https://www.etisalat.ae/b2c/eshop/getDeviceSku/bgSku3804197268")
                .header("ADRUM", "isAjax:true")
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Language", "en-US,en;q=0.9")
                .header("Cache-Control", "no-cache")
                .header("Channel", "Portal")
                .header("Connection", "keep-alive")
                .header("Cookie", "s_ips=639; s_tp=3971; s_ppv=en-ae:www.etisalat.ae:viewproducts,21,16,847,1,6;")
                .header("ADRUM_BT2=R", "24|i:720|e:73; ADRUM_BT1=R:24|i:720|e:73|d:0; ADRUM_BTa=R:24|g:3a69539d-7ff4-")
                .header("49c8-8de6-16fae51c7d0a|n", "customer1_8330acca-5d30-48e6-8384-57b66386c1ba;")
                .header("If-Modified-Since", "0")
                .header("Locale", "en_AE")
                .header("Referer", "https://www.etisalat.ae/b2c/eshop/deviceconfiguration?productId=prod2360102&skuId=bgSku3804197268&catName=Smartphones&listVal=Smartph")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko)")
                .header("X-CSRF-TOKEN", "c769915a-92f7-4e89-9220-cb7569411430")
                .header("isloggedin", "null")
                .header("sec-ch-ua", "\"Chromium\";v=\"122\", \"Not(A:Brand\";v=\"24\", \"Google Chrome\";v=\"122\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .asString();

        System.out.println(request.getBody());
    }
}
