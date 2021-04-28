package com.te.springcoreannotationassignment.config;

import org.springframework.context.annotation.Import;

@Import({CustomerConfig.class,OrderConfig.class})
public class BothConfig {

}
