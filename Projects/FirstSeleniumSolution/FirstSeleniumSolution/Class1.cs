using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium.Appium;
using OpenQA.Selenium;
using OpenQA.Selenium.Appium.Android;
using OpenQA.Selenium.Remote;

namespace FirstSeleniumSolution
{
    class Class1
    {
        AppiumDriver<IWebElement> driver;
        public void TestMethod()
        {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.SetCapability("devicename", "Donatello");
            cap.SetCapability("apppackage", "com.example.calculator");
            driver = new AndroidDriver<IWebElement>(new Uri("http://127.0.0.1:4273/wd/hub"), cap);


        }


    }
}
