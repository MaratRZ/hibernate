package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import ru.gb.config.DbConfig;
import ru.gb.config.HibernateConfig;
import ru.gb.dao.ManufacturerDao;
import ru.gb.dao.OldJdbcManufacturerDao;
import ru.gb.dao.OldJdbcProductDao;
import ru.gb.dao.ProductDao;
import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

public class ShopApp {

    public static void main(String[] args) {

        // Вывод продукта через Hibernate
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        ProductDao productDao = context.getBean(ProductDao.class);
        System.out.println(productDao.findTitleById(5L));
        System.out.println("---------------------------------");
        System.out.println(productDao.findById(5L));
        System.out.println("---------------------------------");
        for (Product product : productDao.findAll()) {
            System.out.println(product);
        }

        // Вывод продукта через Named Parameter Jdbc Template
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        ProductDao productDao = context.getBean(ProductDao.class);
//        System.out.println(productDao.findTitleById(5L));
//        System.out.println("---------------------------------");
//        System.out.println(productDao.findById(5L));
//        System.out.println("---------------------------------");
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }

//        // Вывод наименования продукта через Jdbc Template
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        ProductDao productDao = context.getBean(ProductDao.class);
//        System.out.println(productDao.findTitleById(5L));

        // Вывод всех продуктов через SpringJdbc
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        ProductDao productDao = context.getBean(ProductDao.class);
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }

        // Вывод всех продуктов через jdbc
//        OldJdbcProductDao productDao = new OldJdbcProductDao();
//        for (Product product : productDao.findAll()) {
//            System.out.println(product);
//        }

        // Manufacturer
        // ------------------------
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));
//        System.out.println("---------------------------------");
//        System.out.println(manufacturerDao.findById(3L));
//        System.out.println("---------------------------------");
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.findNameById(3L));
//        System.out.println("---------------------------------");
//        System.out.println(manufacturerDao.findById(3L));
//        System.out.println("---------------------------------");
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }

//        OldJdbcManufacturerDao oldJdbcManufacturerDao = new OldJdbcManufacturerDao();
//        for (Manufacturer manufacturer : oldJdbcManufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }
    }
}
