package com.melnik.spring.springboot.jsoup;

import ch.qos.logback.core.util.FixedDelay;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.melnik.spring.springboot.model.Tour;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

@Component
@Scope("prototype")
public class ToursJsoup {
    List<Tour> torsFirst;

    public List<Tour> getAllTours() {
        return null;
    }

    public List<Tour> getAllToursFirst() throws IOException {
        return torsFirst;
    }

    //    @Scheduled(cron = "* * */12 * * ?")// Автоматический запуск раз 12 Часов("*сек *мин */12 * * ?")
    @Scheduled(fixedDelayString = "${schedule.work}")
    public void downloadTours() throws IOException {
        //Block HtmlUnit and other system log
//                LogFactory.getFactory().setAttribute("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
        java.util.logging.Logger.getLogger("com.gargoylesoftware").setLevel(Level.OFF);
        java.util.logging.Logger.getLogger("org.apache.http.client").setLevel(Level.OFF);
        String url = "https://www.ittour.com.ua";
        // HtmlUnit emulation browser
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(true); // Enable JS interpreter, default is true
        webClient.getOptions().setCssEnabled(false); // Disable css support
        webClient.getOptions().setThrowExceptionOnScriptError(false); // Whether to throw an exception when js runs incorrectly
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setTimeout(1000); // Set the connection timeout

        HtmlPage page = webClient.getPage(url);
        webClient.waitForBackgroundJavaScript(2000); // Wait for js to execute in the background for 30 seconds
        String pageAsXml = page.asXml();
        // Jsoup parsing
        Document doc = Jsoup.parse(pageAsXml, "https://www.ittour.com.ua");
        Elements elements = doc.getElementsByClass("even ");
        Elements elements1 = doc.getElementsByClass(" ");
        // omit other operations here
        torsFirst = new ArrayList<>();
        for (Element tdFromSecondColumn : elements) {

                    torsFirst.add(new Tour(tdFromSecondColumn.child(0).child(0).text(),
                    tdFromSecondColumn.child(0).child(1).text(),
                    tdFromSecondColumn.child(1).text(),
                    tdFromSecondColumn.child(2).text(),
                    tdFromSecondColumn.child(3).text(),
                    tdFromSecondColumn.child(4).text(),
                    tdFromSecondColumn.child(5).child(0).text(),
                    tdFromSecondColumn.child(6).text(),
                    tdFromSecondColumn.child(7).text(),
                    tdFromSecondColumn.child(5).child(1).text()));
        }
        for (Element tdFromSecondColumn : elements1) {
            torsFirst.add(new Tour(tdFromSecondColumn.child(0).child(0).text(),
                    tdFromSecondColumn.child(0).child(1).text(),
                    tdFromSecondColumn.child(1).text(),
                    tdFromSecondColumn.child(2).text(),
                    tdFromSecondColumn.child(3).text(),
                    tdFromSecondColumn.child(4).text(),
                    tdFromSecondColumn.child(5).child(0).text(),
                    tdFromSecondColumn.child(6).text(),
                    tdFromSecondColumn.child(7).text(),
                    tdFromSecondColumn.child(5).child(1).text()));
        }
    }
}
