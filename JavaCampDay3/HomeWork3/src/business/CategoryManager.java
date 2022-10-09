package business;

import core.abstracts.Logger;
import dataAccess.abstracs.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void addCategory(List<Category> categories, Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception("Mevcut kategori bulunmaktadir");
            }
        }
        categoryDao.add(category);

        for (Logger logger : loggers){
            logger.log();
        }

    }
}
