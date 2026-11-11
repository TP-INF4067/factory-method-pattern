# Factory Method Pattern - TP INF4067

## 📚 Contexte

Ce dépôt contient l'implémentation du patron **Factory Method** dans le cadre du devoir nᵒ 1 du cours INF4067 - Patrons de construction.

**Étudiant** : AGOMO ROVALNOLD  
**Matricule** : [Votre matricule]  
**Date** : 11/11/2026

## 🎯 Objectif

Le patron **Factory Method** permet de créer des objets sans spécifier explicitement leur classe concrète. La création est déléguée à une méthode qui peut être redéfinie dans les sous-classes.

## 📁 Structure du projet

```
factory-method-pattern/
│
├── README.md (ce fichier)
│
├── exemple-cours/
│   ├── README.md
│   ├── diagramme-classe.png
│   └── src/
│       ├── Produit.java
│       ├── ProduitA.java
│       ├── ProduitB.java
│       ├── ProduitC.java
│       ├── FabriqueProduit.java
│       └── Client.java
│
└── exemple-modifie/
    ├── README.md
    ├── diagramme-classe.png
    └── src/
        ├── Produit.java
        ├── ProduitA.java
        ├── ProduitB.java
        ├── ProduitC.java
        ├── ProduitD.java (🆕)
        ├── FabriqueProduit.java
        └── Client.java
```

## 📖 Description des exemples

### 1️⃣ Exemple du cours

Implémentation conforme au cours avec 3 types de produits (A, B, C).

👉 Voir [exemple-cours/README.md](exemple-cours/README.md)

### 2️⃣ Exemple modifié

Extension avec un 4ème type de produit (D) pour démontrer l'extensibilité du patron.

👉 Voir [exemple-modifie/README.md](exemple-modifie/README.md)

## ⚙️ Comment tester

### Exemple du cours
```bash
cd exemple-cours/src
javac *.java
java Client
```

### Exemple modifié
```bash
cd exemple-modifie/src
javac *.java
java Client
```

## 🎓 Concepts clés

### Participants du patron

- **Produit** : Interface/classe abstraite définissant le contrat
- **ProduitConcret** : Implémentations concrètes (A, B, C, D)
- **Fabrique** : Classe responsable de la création des produits
- **Client** : Utilise la fabrique sans connaître les classes concrètes

### Avantages

✅ Encapsulation de la création d'objets  
✅ Découplage entre le client et les classes concrètes  
✅ Facilite l'ajout de nouveaux types de produits  
✅ Respect du principe Ouvert/Fermé (Open/Closed)  
✅ Centralisation de la logique de création

### Inconvénients

❌ Peut devenir complexe avec beaucoup de types  
❌ Nécessite une classe fabrique supplémentaire  
❌ Couplage avec le switch/if pour déterminer le type

## 📊 Diagrammes de classes

Les diagrammes UML sont disponibles dans chaque dossier d'exemple :
- `exemple-cours/diagramme-classe.png`
- `exemple-modifie/diagramme-classe.png`

## 🔗 Liens utiles

- [Organisation GitHub TP-INF4067](https://github.com/TP-INF4067)
- [Dépôt Abstract Factory Pattern](https://github.com/TP-INF4067/abstract-factory-pattern)

## 📝 Références

- Support de cours INF4067 - Design Patterns
- "Design Patterns: Elements of Reusable Object-Oriented Software" (GoF)

---

**© 2026 - INF4067 - Université [Votre université]**
