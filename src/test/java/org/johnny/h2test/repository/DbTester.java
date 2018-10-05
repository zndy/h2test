package org.johnny.h2test.repository;

import org.johnny.h2test.entity.Company;
import org.johnny.h2test.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@Transactional
@SpringBootTest
@RunWith(SpringRunner.class)
public class DbTester {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private ICompanyRepository companyRepository;

    @Test
    public void test(){
//        Company company1 = companyRepository.getOne(1L);
//        System.out.println("company1 = " + company1);
        Product product1 = productRepository.getOne(1L);
        System.out.println("product1 = " + product1.getName());
    }
}
