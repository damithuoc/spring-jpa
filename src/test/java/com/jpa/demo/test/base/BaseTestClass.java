package com.jpa.demo.test.base;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.PersistenceContext;

/**
 * Created by sanandasena on 1/19/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:application-context-test.xml"})
public class BaseTestClass {
}
