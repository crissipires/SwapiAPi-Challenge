<h1 align="center">🚀 Backend challenge</h1>

<p align="center">Welcome. This is the Star Wars Backend Challenge!</p>

<p align="center">
    <a href="#about"> ⚔️ The challenge</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
    <a href="#solution"> 🥇 My solution</a>&nbsp;&nbsp;&nbsp;
</p>

![image](https://images.unsplash.com/photo-1623476408624-721c9185d569?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=869&q=80)


## Table of Contents

- [🧠 Context](#-context)
  - [⚔️ The Challenge](#️-the-challenge)
  - [🏁 Requirements](#-requirements)
  - [🤟 You Must](#-you-must)
  - [🚰 Ideal Flux](#-ideal-flux)
- [✔️ Evaluation Criteria](#️-evaluation-criteria)
- [:notebook: To-do list](#notebook-to-do-list)
- [You can](#-you-can)

# 🧠 Context

To test your intergalactical coding habilities, we brought from a far, far galaxy a unique challenge for coders capable to work with APIs.
We need to obtain some information about the StarWars movies in order to *present* to some of our partners how great the SW Cinematographic Universe is.

- Use the [SWAPI](https://swapi.dev/) API to get the data you need.

##  <a id="about"> ⚔️ The Challenge </a>

The challenge is far, far simple: you must get the data asked at [You Must](#-you-must) using the SWAPI API and exhibit the results visually the best way you can. You can create a presentation, graphics, Charts or what you feel is the best. 

### 🏁 Requirements

- API Knowlegment
- JAVA Knowlegment

#### 🤟 You Must:

- [ ] Code in Java
- [ ] You must find the characters who appear the most in the SW movies (you can put them in order if you want);
- [ ] Obtain the Planets Size (Area) and order them (bigger to smaller);
- [ ] Verify how many pilots did the Millenium Falcon had and who were they?;
- [ ] Present the results the best way you can

### 🚰 Ideal Flux

- Find characters and movies via the API;
- Get the planets and the Area of ​​each one;
  - :warning: Find the diameter and calculate the area;
- Find the ship;
  - How many pilots drove it;
  - Their respective names;
- Visually represent the data obtained
---

**Essential Operations**

- [ ] Read the documentation;
- [ ] Save the characters, planets and pilots in variables;
- [ ] Save what you find necessary in variables;
- [ ] :warning: display the code output data;
 

## ✔️ Evaluation Criteria

In addition to the requirements raised above, we will look at the following criteria when correcting the challenge:

- If the challenge was fully accomplished;
- Whether the steps were successfully completed;
- If the code is clean and well documented;
- If the code is optimized;
- The form of presentation;
- Concern for the end user;


### :notebook: To-do list

- [x] Fully take the challenge
  - [x] find the characters who appear the most in the SW movies;
  - [x] Get the Area of the planets and sort from Largest to Smallest;
  - [x] Check how many people have piloted our dear Millennium Falcon and display their names;
- [ ] Include details of your solution in the README
  - [ ] what was accomplished in the challenge;
  - [ ] instructions on how to check what was fulfilled;
  - [ ] print the images that prove your solutions;
  - [ ] README must be in English;

---
 
 ## <a id="solution"> ✔️ Challenge completed </a>


### 🧪 Technologies 

To solve this problem i use:

- Java 
- Spring WebFlux
- Thymeleaf

### ⚙️ WebService

According to the Spring documentation, Webflux is Spring's reactive stack that was added from version 5 of the framework that is present in Springboot version 2.0 or higher. With it it is possible to make synchronous and asynchronous calls.

The Components package is where i access the star wars api and return the information I need.
The Configuration package where i configure all application beans. 
The Controller class calls the view and maps each request to a service layer routine.
The Service class implements all of the business logic of the application.
The Model package the entity structure of each call and transforms the response into a flow


### 📉 Visualization of the obtained data

#### Base url = ```http://localhost:8080/starwars/```

Path = ```/characters/appearmost```

Characters who appear the most in the SW movies

![FireShot Capture 013 - Google Charts Example - Spring Boot - localhost](https://user-images.githubusercontent.com/67839316/146838886-25c5cdd0-3c4c-4f9b-9bc7-d230a3ac12f8.png)

Path = ```/planetsArea"```

Area of the planets sorted from Largest to Smallest

![download](https://user-images.githubusercontent.com/67839316/146839268-954fd2ef-8e88-4506-bb5a-15eca9ea0a17.jpeg)

Path = ```/pilotsmf```

People who drove the Millenium Falcon and theys names

![download (1)](https://user-images.githubusercontent.com/67839316/146839364-cf2a98de-6f37-4b23-b0f5-7fccf0805886.jpeg)



Made with 💙 by Crissiano Pires
