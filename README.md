# TP : API RESTful pour le Calcul de la Somme de Deux Nombres

## Description
Ce projet est une **API RESTful simple** développée avec **Spring Boot**.  
Elle permet à un utilisateur de soumettre deux nombres et de recevoir leur somme.

## Fonctionnalités
- Envoyer deux nombres via une requête HTTP.
- Calculer la somme des deux nombres.
- Retourner le résultat au format JSON.

## Structure du projet
- **entites**
  - `Nombres` : classe contenant les deux nombres à additionner (`a` et `b`).  
- **service**
  - `CalculService` : classe avec la méthode pour calculer la somme.  
- **controller**
  - `CalculateurController` : classe gérant les requêtes RESTful.  

## Technologies utilisées
- Java
- Spring Boot
- Spring Web



