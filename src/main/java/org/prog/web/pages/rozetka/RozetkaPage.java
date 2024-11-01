package org.prog.web.pages.rozetka;

import org.openqa.selenium.WebDriver;
import org.prog.web.pages.AbstractPage;
import org.prog.web.pages.rozetka.widgets.CartWidget;
import org.prog.web.pages.rozetka.widgets.CatalogWidget;
import org.prog.web.pages.rozetka.widgets.GoodsWidget;
import org.prog.web.pages.rozetka.widgets.SearchWidget;

public class RozetkaPage extends AbstractPage {

    private final CartWidget cartWidget;
    private final CatalogWidget catalogWidget;
    private final GoodsWidget goodsWidget;
    private final SearchWidget searchWidget;

    public RozetkaPage(WebDriver driver) {
        super(driver, "https://rozetka.com.ua/");
        cartWidget = new CartWidget(driver);
        catalogWidget = new CatalogWidget(driver);
        goodsWidget = new GoodsWidget(driver);
        searchWidget = new SearchWidget(driver);
    }
}
