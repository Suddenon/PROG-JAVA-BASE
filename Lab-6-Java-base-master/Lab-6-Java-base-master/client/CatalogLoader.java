package ru.billing.client;

import ru.billing.exceptions.CatalogLoadException;
import ru.billing.warehouse.ItemCatalog;

public interface CatalogLoader {
    void load(ItemCatalog itemCatalog) throws CatalogLoadException;
}
