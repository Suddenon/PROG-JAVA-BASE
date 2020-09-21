package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.exceptions.ItemAlreadyExistsException;
import ru.billing.stockList.Category;
import ru.billing.stockList.FoodItem;
import ru.billing.stockList.GenericItem;
import ru.billing.warehouse.ItemCatalog;

import java.util.Date;

public class CatalogStubLoader implements CatalogLoader {
    @Override
    public void load(ItemCatalog catalog) throws CatalogLoadException {
        GenericItem item1 = new GenericItem("Sony TV",23000, Category.GENERAL);
        FoodItem item2 = new FoodItem("Bread",12,null,new Date(),(short)10);
        try {
            catalog.addItem(item1);
            catalog.addItem(item2);
        }
        catch (ItemAlreadyExistsException ex) {
            throw new CatalogLoadException(ex);
        }

    }
}
