using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;

namespace FirstSeleniumSolution
{
    class Program
    {
        static void Main(string[] args)
        {
            /* FirefoxDriverService service = FirefoxDriverService.CreateDefaultService(@"C:\Payal");
             service.FirefoxBinaryPath = @"C:\Program Files\Mozilla Firefox\firefox.exe";

             IWebDriver driver = new FirefoxDriver(service);

             driver.Navigate().GoToUrl("http://www.google.com");
             driver.FindElement(By.PartialLinkText("Gmai")).Click();
             driver.Navigate().Back();
             driver.Navigate().Forward();
             driver.Navigate().Refresh();
             driver.Close();*/

            Class1 abc = new Class1();
            abc.TestMethod();






            //Console.ReadKey();
        }
    }
}
