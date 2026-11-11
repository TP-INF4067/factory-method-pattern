# Factory Method Pattern - Exemple Modifié

## 📖 Description

Cet exemple est une **extension** du patron Factory Method présenté en cours. 

La modification consiste à ajouter un **quatrième type de produit (ProduitD)** pour démontrer l'extensibilité du patron.

## 🆕 Modification apportée

- **Ajout de ProduitD** : Nouveau produit concret
- **Mise à jour de FabriqueProduit** : Ajout du cas `typeD` dans le switch
- **Mise à jour du Client** : Test de création du ProduitD

## 🎯 Avantages de cette modification

Le patron Factory Method facilite l'ajout de nouveaux types de produits :
- ✅ Pas besoin de modifier le code client existant
- ✅ Ajout d'une nouvelle classe concrète (ProduitD)
- ✅ Mise à jour de la fabrique uniquement
- ✅ Respect du principe Ouvert/Fermé (Open/Closed Principle)

## 🏗️ Structure

- **Produit** : Classe abstraite définissant l'interface commune
- **ProduitA, ProduitB, ProduitC** : Implémentations concrètes existantes
- **ProduitD** : 🆕 Nouvelle implémentation concrète
- **FabriqueProduit** : Fabrique mise à jour pour supporter ProduitD
- **Client** : Utilise la fabrique pour créer tous les types de produits

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
=== Factory Method Pattern - Exemple Modifié ===

--- Création ProduitA ---
je suis un produit de type A
produitA.methodeproduit()

--- Création ProduitB ---
je suis un produit de type B
produitB.methodeproduit()

--- Création ProduitC ---
je suis un produit de type C
produitC.methodeproduit()

--- Création ProduitD (NOUVEAU) ---
je suis un produit de type D
produitD.methodeproduit()

--- Test avec produit inexistant ---
Exception: Type de produit inconnu
```

## 📝 Analyse

L'ajout de ProduitD démontre que le patron Factory Method :
1. **Encapsule** la logique de création
2. **Centralise** les décisions d'instanciation
3. **Facilite** l'évolution du code
4. **Respecte** le principe de responsabilité unique (SRP)
