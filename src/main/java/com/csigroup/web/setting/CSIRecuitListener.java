package com.csigroup.web.setting;

import javax.servlet.annotation.WebListener;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

@Configuration
@WebListener
public class CSIRecuitListener extends RequestContextListener { 

}
