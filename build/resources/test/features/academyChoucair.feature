#Autor: Carolina vargas
@stories
Feature: Academy Choucair
  As an user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1
  Scenario:  Search for a automation course
    Given than Rose want to learn automation at the Academy Choucair
      | strUser  | strPassword   |
      | 28869621 | Choucair2020* |
    When  she search for the course on the choucair Academy platform
      | strCourse               |
      | Metodologia Bancolombia |
    Then  she finds the course called
      | strCourse               |
      | Metodologia Bancolombia |
