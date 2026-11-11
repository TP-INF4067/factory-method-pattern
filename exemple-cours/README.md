# Factory Method Pattern - Exemple du Cours

## 📖 Description

Cet exemple illustre le patron **Factory Method** tel que présenté dans le cours INF4067.

Le patron Factory Method permet de créer des objets sans spécifier la classe concrète à instancier. La création est déléguée à une fabrique qui se charge d'instancier le bon type de produit en fonction d'un paramètre.

## 🎯 Objectif

Créer des produits de types différents (A, B, C) sans que le client ait besoin de connaître les détails d'implémentation de chaque produit.

## 🏗️ Structure

- **Produit** : Classe abstraite définissant l'interface commune
- **ProduitA, ProduitB, ProduitC** : Implémentations concrètes
- **FabriqueProduit** : Fabrique responsable de la création des produits
- **Client** : Utilise la fabrique pour obtenir des produits

## ▶️ Compilation et Exécution

```bash
# Compilation
cd src
javac *.java

# Exécution
java Client
```

## 📊 Résultat attendu

```
bonjour le monde
je suis un produit de type A
produitA.methodeproduit()
je suis un produit de type B
produitB.methodeproduit()
je suis un produit de type C
produitC.methodeproduit()
Exception: Type de produit inconnu
```
