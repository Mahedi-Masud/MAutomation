package youtube.module;

import common.Base;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.TestInstance;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;


//import.org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mahedi on 9/5/2016.
 */
public class YouTube extends Base{

    @Test
    public void Search() throws InterruptedException {

        typeByCss("#masthead-search-term","Hello");
        clickByCss("#search-btn");
        sleepFor(5);
    }

    @Test(priority = 2)
    public void filter() throws InterruptedException {
        typeByCss("#masthead-search-term", "Hello");
        clickByCss("#search-btn");
        clickByCss(".filter-button-container");
        sleepFor(5);
        clickByXpath(".//*[@id='filter-dropdown']/div[1]/ul/li[5]/a/span");
        sleepFor(2);
    }

    @Test
    //public class Youtube {
        public void FlashDriver() throws InterruptedException {
            //FirefoxDriver driver = new FirefoxDriver();

            FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "movie_player");

//            driver.get("http://tinyurl.com/bqnaoo7");
//            Thread.sleep(2000L);

            // let the video load
             while (Integer.parseInt(flashApp.callFlashObject("getPlayerState")) == 3){
                Thread.sleep(1000L);
            }

            // Play the video for 10 seconds
            //Thread.sleep(5000);
            flashApp.callFlashObject("pauseVideo");
            Thread.sleep(5000);
            flashApp.callFlashObject("playVideo");
            Thread.sleep(5000);
            flashApp.callFlashObject("seekTo","140","true");
            Thread.sleep(5000);
            flashApp.callFlashObject("mute");
            Thread.sleep(5000);
            flashApp.callFlashObject("setVolume","50");
            Thread.sleep(5000);

        }

    }
