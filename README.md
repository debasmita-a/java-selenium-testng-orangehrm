# Page Object Model (POM) Framework with Java, Selenium, and TestNG
## 🚀 About the Project
This project is a test automation framework built using the Page Object Model (POM) design pattern with Java, Selenium WebDriver, and TestNG. It provides a structured and maintainable approach to writing UI automation tests for web applications.

## 🛠 Tech Stack
- Programming Language: Java
- Test Automation: Selenium WebDriver
- Test Framework: TestNG
- Build Tool: Maven
- Design Pattern: Page Object Model (POM) with Data Drivern Testing
- Reporting: TestNG Reports, Extent Reporting, Log4J
- CI/CD Integration: GitHub Actions

## 🪴Project Structure
It is a single framework to automate both web and api tests.
It is mainly a Hybrid Framework where **Page Object Model** is used to follow a modular design pattern, separating test scripts from page objects and actions, and **Data Driven Testing** has been used to run testcases with multiple sets of test data, making it more scalable.

**KEY COMPONENTS** ::

- **POM Layer** – Handles page objects, encapsulating UI elements and actions.
- **Data Layer (POJO Classes + @DataSupplier)** - Manages test data, often integrated with sources like Excel, JSON, or databases
- **Test Execution Layer (TestNG with @Test and @DataSupplier)** – Executes test cases using the provided data.
- **Utilities (Helper Classes, Configs, Logging, Reporting, etc.)** – Supports reusability.

src/  
│── **config.properties**  [_Configuration file (e.g., browser, URLs)_]   
│── main/java/        
│   │── **pages**/        [_Page Object Model classes_]               
│   │── **utils**/      [_Utility/helper classes_]            
│   │── **driver**/     [_WebDriver setup & management_]            
│   │── **enums**/        [_Enum constants (e.g., browsers, environment types)_]           
│   │── **converters**/        [_Enums to String converters_]      
│   │── **config**/     [_Configuration handling (e.g., reading properties)_]            
│
│── java/test/  
│   │── **tests**/          [_Test classes (e.g., LoginTest, DashboardTest)_]        
│   │── **base**/    [_Base test class for setup & teardown_]      

**Libraries Used ::**







