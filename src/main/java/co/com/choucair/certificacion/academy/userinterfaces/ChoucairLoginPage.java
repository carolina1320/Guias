package co.com.choucair.certificacion.academy.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage {
    public static final Target LOGIN_BUTTON = Target.the(" button that shows us the form to login").located(By.xpath("//a[@data-target='#Ingresar']"));
    public static final Target INPUT_USER = Target.the(" button that shows us the form to login").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the(" button that shows us the form to login").located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the(" button that shows us the form to login").located(By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]/button"));
}

