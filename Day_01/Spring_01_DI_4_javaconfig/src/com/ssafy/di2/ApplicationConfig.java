package com.ssafy.di2;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = {"com.ssafy.di"})
public class ApplicationConfig {


}
