package work.classwork.day21http;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;
import work.classwork.day20WebServersParser.MyParser;
import work.classwork.day22httpPost.Search;

import java.io.IOException;
import java.net.URISyntaxException;

public class MyHttpClient {
    public static void main(String[] args) throws IOException, URISyntaxException, ParseException {
        MyHttpClient httpClient = new MyHttpClient();
        //httpClient.httpGet();
        httpClient.search(new Search( "",true));
    }

    public void httpGet() throws URISyntaxException, IOException, ParseException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("https://www.nbrb.by/api/exrates/currencies/1");
        HttpGet request = new HttpGet(builder.build());
        CloseableHttpResponse httpResponse = client.execute(request);
        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
    }

    public void search(Search search) throws URISyntaxException, IOException, ParseException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("http://178.124.206.46:8001/app/ws/");
        HttpPost request = new HttpPost(builder.build());
        request.setEntity(new StringEntity(MyParser.fromGSON(search))); //перегрузить
        CloseableHttpResponse httpResponse = client.execute(request);
        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
    }
}
