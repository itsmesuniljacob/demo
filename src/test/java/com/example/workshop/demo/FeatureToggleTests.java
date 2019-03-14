package com.example.workshop.demo;

import com.example.workshop.demo.hello.FeatureToggles;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FeatureToggleTests {


    @Test
    public void testToggleFeature() {
        assertTrue(FeatureToggles.FEATURE_ONE.isActive());
    }
}
