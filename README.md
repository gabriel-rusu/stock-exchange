<p align="center">
  <a href="" rel="noopener">
 <img src="https://i.imgur.com/AZ2iWek.png" alt="Project logo"></a>
</p>
<h3 align="center">Stock Exchange</h3>

<div align="center">

  [![Hackathon](https://img.shields.io/badge/hackathon-DevHacks-brightgreen.svg)](https://www.devtalks.ro/devhacks/) 
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE.md)

</div>

<p align="center"> 
An application that shows the evolution of the stock price of the automobile industry in Germany, France and Italy. The evolution is 
determined by the data provided by the <strong>London Stock Exchange</strong>, which was the host of the Fintech category. 
    <br> 
</p>

## 📝 Table of Contents
- [Problem Statement](#problem_statement)
- [Idea / Solution](#idea)
- [Dependencies / Limitations](#limitations)
- [Future Scope](#future_scope)
- [Usage](#usage)
- [Technology Stack](#tech_stack)
- [Authors](#authors)

## 🧐 Problem Statement <a name = "problem_statement"></a>
It is useful to design and follow a specific format when writing a problem statement. While there are several options
for doing this, the following is a simple and straightforward template often used in Business Analysis to maintain
focus on defining the problem.

- IDEAL: This section is used to describe the desired or “to be” state of the process or product. At large, this section 
should illustrate what the expected environment would look like once the solution is implemented.
- REALITY: This section is used to describe the current or “as is” state of the process or product. 
- CONSEQUENCES: This section is used to describe the impacts on the business if the problem is not fixed or improved upon.
This includes costs associated with loss of money, time, productivity, competitive advantage, and so forth.

Following this format will result in a workable document that can be used to understand the problem and elicit
requirements that will lead to a winning solution. 

## 💡 Idea / Solution <a name = "idea"></a>

The solution consisted of a financial application that can display the evolution of automotive indexes in the most important 3 european countries. The app lets the user select the time frame and the country in which he wants to invest and then it will display a chart showing the performance of the automotive sector based on the user selection.

## ⛓️ Dependencies / Limitations <a name = "limitations"></a>
- Currently the app can display only the performance of the automotive industry 
- The performance can be traced back at maximum to 12 months
- It allows the selection of only 3 countries

## 🚀 Future Scope <a name = "future_scope"></a>
Write about what you could not develop during the course of the Hackathon; and about what your project can achieve 
in the future.

## 🏁 Getting Started <a name = "getting_started"></a>
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
To check if you already have the requirements
run the following command(cmd/linux terminal):
- for __Java__: ``` java --version```
- for __Maven__: ``` mvn --version ```

If you don't have the requirements above mentioned you should follow the following links to install them:
- [Maven](https://maven.apache.org/)
- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html)

### Installing
To run the app you should follow the next steps, after installing the requirements. In the root folder of the project type:

```
mvn install
```

If the above command succeeds you should have a new folder called target. After this to run the app you should type:
```
mvn exec:java
```

## 🎈 Usage <a name="usage"></a>
Add notes about how to use the system.

## ⛏️ Built With <a name = "tech_stack"></a>
- [Swing](https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html) - UI Library
- [JDK](https://www.oracle.com/ro/java/technologies/javase/javase-jdk8-downloads.html) - virtual machine for Java apps
- [Maven](https://maven.apache.org/) - build system for Java apps
- [Visual Studio Code](https://code.visualstudio.com/) - code editor

## ✍️ Authors <a name = "authors"></a>
- [@gabriel-rusu](https://github.com/gabriel-rusu) - Java GUI that displays all the information in a meaningful way.
- [@ParaschivaMihai](https://github.com/ParaschivaMihai) -  Matlab scripts that generates some of the graphics shown in the application.
- [@Mrrrazzz](https://github.com/Mrrrazzz) - Matlab scripts that generates some of the graphics shown in the application.
- [@the-sergiu](https://github.com/the-sergiu) - interpreting the data received from the Hackathon organiser **London Stock Exchange**.

