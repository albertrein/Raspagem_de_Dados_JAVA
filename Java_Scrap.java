
package java_scrap;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

/**
 * @version 1.0
 * RASPAGEM DE DADOS
 * @author albertrein
 */
public class Java_Scrap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    int page;
    page = 0;
    for(page=0;page>=0;page++){      
    String url = "http://www.vagaspoa.com.br/page/"+page;
                try {
                    Document doc = Jsoup.connect(url).get();
                    Elements e = doc.select("h2.entry-title");
                    for (int i = 0; i < e.size(); i++) {
                        System.out.println(e.get(i).text());
                        System.out.println("http://www.vagaspoa.com.br/page/"+page);
                        System.out.println("");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }    
}}
