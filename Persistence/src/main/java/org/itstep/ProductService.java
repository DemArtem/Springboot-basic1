package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }
/*
    @PostConstruct
    public void init() {

        productRepository.save
                (new Product(1L,
                        "BY12345",
                        "Apple",
                        "Описание",
                        new BigDecimal(1.12),
                        1.1,
                        "data:image/png;base64,/9j/4AAQSkZJRgABAQAAAAAAAAD/2wBDAAMCAgICAgMCAgIDAwMDBAYEBAQEBAgGBgUGCQgKCgkICQkKDA8MCgsOCwkJDRENDg8QEBEQCgwSExIQEw8QEBD/2wBDAQMDAwQDBAgEBAgQCwkLEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBD/wAARCAAvAEYDASIAAhEBAxEB/8QAHQAAAQQDAQEAAAAAAAAAAAAABgAFBwgBAgMJBP/EADAQAAIBAgQEAwgCAwAAAAAAAAECAwAEBQYRIQcSMUETUWEIIjJScYGRsRRiocHh/8QAGwEAAgIDAQAAAAAAAAAAAAAABQYDBwABBAj/xAAsEQABAwIEBAQHAAAAAAAAAAABAAIDBBEFBiExEkFRcRMVsfEiI0JhkaHB/9oADAMBAAIRAxEAPwD010FLTSlWQO9YsWNB1ND+L52y9hMFxIbtrySBGfwLRfEdyB8Kn4dT0GpqOuNvEW8s79cmYE+jqiy3zAkbH4YyR2PU/wDKAY80Xk9m8N7YxNCgADLMwYnXt5UuYrjM1KTHTMuRzOycsPydV1dG2sP1aht7G3XXryU74JxIylj2H22IW19JALmMP4c8TK8bdGRtAQGUgg+oNP1riOH3+osr2GcjchHBI+3Wqz4fniwwPnjtERGkdndzIW1ZjuR96+fEOIWNGVb23n5ZIt1eJtGBB66+fpS7BnSojk8OqjB7XHqf4uesytU024t39lafl9a1ZdfrQhwqz8ufcvtPcgLiFi4hulA0Dbe64HbXfUdiDRi2xp/p52VMTZYzcFK8sToXljxqFxI7GlWT1NKplEvsrZNyB61xLVsr71omyksqXZ7zPOnEzMUl6RyveyIW76BuVR9BQ1j/ABAtrO2eJbglVUnmXc7dfvtTn7S2XbvLvEPFpXUi2xEG8t302Ifc/g6j7VXTM+IXJDjmkBZdxsNtKR60vbK5p6r1PgrKWqw6Cdm3A39AeyJ4uIJurlLgSOQ+gKsd9Ouv1qQ8Hx5sRkmUygq0SMF/t9arlY8wmROdmZmHuHtpUtZMu5HMpiA8RERG1Oo69f1S7PSAEuKF49G2oaVaj2aLuZcwYmgDLFPZlnB+ZXUj9mrCNMp6MagDgVpY299i8x0LhYEPn0Zv9fmpcixtZDs2o86sHL4c2gZxKgMcc11c/h5W9EQFx50qbYr3nGoOtKjVkIunwg1gbdRXUrWhFaIUwNlH/GThrh/EnLRtHEceI2eslnOw6HvG39W/wd6oPxF4eYnli4ewxbC3t5UkKnUEgjz16EeoNemkkYYaHvQvmjh9l7NEBhxfD4Z1PzDpQutw8VXxN0Kc8vZvnwRngEccfS9rdt15f2GXoP5HieMW5TuTtoOo/VSjw3yxcYpfqlpGPD5+aWY7Ii9gf3yjck1Z3EPZY4cyzmcWEq6nXkE7cn41p7wzhFgWCRLb4fbpFGmwUbAUJ8hfIfmnT7IxiufG1URZTx2J5k7fhCVjbx2NlDh2F84SJdAe7Hux+popwGHElAMkjkepois8oW1voEQU82uCpENgKZIIRCwMGwVZyuMji47lcLEzCP3jSp4js1QaaUq6LqKy/9k=".getBytes(),
                        Product.Category.FRUITS,Product.Brand.NESTLE,
                        new Date(2024, Calendar.JULY,29)));
    }
 */
}
