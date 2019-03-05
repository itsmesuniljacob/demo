package com.example.workshop.demo;

import com.example.workshop.demo.hello.HelloController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.togglz.core.manager.FeatureManager;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class DemoControllerTest {

    private MockMvc mockMvc;
    private FeatureManager featureManager;

    @InjectMocks
    private HelloController helloController;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(helloController)
                .build();
    }

    @Test
    public void testHello() throws Exception {

//        if(FeatureToggles.FEATURE_ONE.isActive()) {
//            mockMvc.perform(get("/hello"))
//                    .andExpect(status().isOk())
//                    .andExpect(content().string("Hello Philips"));
//        }
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Philips"));
    }
}
