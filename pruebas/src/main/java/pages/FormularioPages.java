package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
@Getter

public class FormularioPages extends GeneralPage {
    @FindBy(id = "recipient-email")
    private WebElementFacade txtEmail;
    @FindBy(id = "recipient-name")
    private WebElementFacade txtName;
    @FindBy(id = "message-text")
    private WebElementFacade txtMessage;

}
