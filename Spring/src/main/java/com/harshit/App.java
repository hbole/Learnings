package com.harshit;

import com.harshit.configByJavaCode.ConfigByJavaCode;
import com.harshit.configByXML.ConfigByXML;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //configuring and running spring project using xml based configuration
        //ConfigByXML.runProjectConfigByXML();

        //configuring and running spring project using java code based configuration
        ConfigByJavaCode.runProjectByJavaConfig();
    }
}
