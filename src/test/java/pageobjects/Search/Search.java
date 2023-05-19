package pageobjects.Search;

import driver.NamesParser;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;
import pageobjects.objects.Names;

import java.io.IOException;
import java.net.URISyntaxException;

public class Search {
    public static void main(String[] args) throws IOException, URISyntaxException, ParseException {
        Search runhttpClient = new Search();

    }


    public void searchLongname(Names longname) throws URISyntaxException, IOException, ParseException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder("http://178.124.206.46:8001/app/ws/");
        HttpPost request = new HttpPost(builder.build());
        request.setEntity(new StringEntity(NamesParser.main())); //перегрузить
        CloseableHttpResponse httpResponse = client.execute(request);
        System.out.println(EntityUtils.toString(httpResponse.getEntity()));
    }
}
