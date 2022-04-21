package pageObjectTests;

import com.github.javafaker.Faker;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTest extends BaseTest{
    int count = 0;
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void flakyTest(){
        if (count++<2){
            Assert.assertTrue(false);
        }
        Assert.assertTrue(true);
    }
    @Test
    public void playlist_createPlaylist_playlistCreated() throws InterruptedException {
//        String playlistName = TestDataGenerator.getRandomString(5);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
//        System.out.println(playlistName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void playlist_renamePlaylist_playlistRenamed()  {
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.book().title();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
    @Test
    public void playlist_createPlaylist_playlistCreated1() throws InterruptedException {
//        String playlistName = TestDataGenerator.getRandomString(5);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
//        System.out.println(playlistName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void playlist_renamePlaylist_playlistRenamed1() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.book().title();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
    @Test
    public void playlist_createPlaylist_playlistCreated2() throws InterruptedException {
//        String playlistName = TestDataGenerator.getRandomString(5);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
//        System.out.println(playlistName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void playlist_renamePlaylist_playlistRenamed2() throws InterruptedException {
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.book().title();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
    @Test(enabled = false)
    public void playlist_createPlaylist_playlistCreated3(){
//        String playlistName = TestDataGenerator.getRandomString(5);
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
//        System.out.println(playlistName);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);
        Assert.assertTrue(mainPage.playlistExist(playlistId,playlistName));
    }
    @Test
    public void playlist_renamePlaylist_playlistRenamed3() {
        Faker faker = new Faker();
        String playlistName = faker.artist().name();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open(url);
        MainPage mainPage = loginPage.loginToApp(username,password);
        String playlistId = mainPage.createPlaylist(playlistName);

        String newName = faker.book().title();
        mainPage.renamePlaylist(playlistId,newName);

        Assert.assertTrue(mainPage.playlistExist(playlistId,newName));
    }
}
