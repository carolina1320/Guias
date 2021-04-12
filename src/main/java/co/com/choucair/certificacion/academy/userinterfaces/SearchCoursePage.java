package co.com.choucair.certificacion.academy.userinterfaces;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("selecciona la universidad choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("busca el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("da click buscar el curso")
            .located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("da click buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target NAME_COURSE = Target.the("da click buscar el curso")
            .located(By.id("id"));

}
