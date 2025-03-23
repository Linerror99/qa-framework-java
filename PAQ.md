# 🧪 Plan d’Assurance Qualité (PAQ)

## 📌 Objectifs du projet

Ce projet a pour but de :
- Mettre en œuvre un framework de tests automatisés pour application web.
- Appliquer les principes fondamentaux de la qualité logicielle.
- Assurer la fiabilité et la maintenabilité du code via l’analyse statique.
- Intégrer une chaîne d’intégration continue (CI) avec reporting qualité.
- Préparer à la certification ISTQB par la pratique des bonnes méthodes.

---

## 🛠️ Environnement technique

| Élément               | Outil / Technologie              |
|------------------------|----------------------------------|
| Langage                | Java 21                          |
| Framework de test      | JUnit 5                          |
| Outil de test UI       | Selenium WebDriver               |
| CI/CD                  | GitHub Actions                   |
| Analyse statique       | SonarCloud                       |
| Reporting              | Maven Surefire Report (HTML)     |
| Gestion des dépendances| Maven                            |
| Navigateur             | Chrome (mode headless en CI)     |

---

## 🧪 Stratégie de test

- **Types de tests mis en œuvre** :
  - Tests UI automatisés (login avec succès + erreur)
- **Structure** :
  - Architecture Page Object Model (POM)
  - Fichiers organisés par dossier `pages/` et `tests/`
- **Critères de validation** :
  - Tous les tests doivent passer (`mvn test`)
  - Les messages d'erreur et de succès sont validés par assertions
- **Exécution locale et CI**
  - Mode graphique local
  - Mode `headless` sur GitHub Actions

---

## 🔍 Analyse statique

- **Outil utilisé** : [SonarCloud](https://sonarcloud.io)
- **Vérifications** :
  - Bugs
  - Code Smells
  - Complexité
  - Duplications
- **Déclenchement** : via pipeline GitHub Actions à chaque `push` sur `main`
- **Résultat** : Quality Gate **passed** avec 6 issues mineures

---

## 🔁 Intégration continue

- **CI/CD : GitHub Actions**
- **Étapes automatisées** :
  1. Compilation du projet
  2. Exécution des tests
  3. Lancement de l’analyse SonarCloud
- **Détection automatique de l’environnement** :
  - Mode `headless` activé si la variable d’environnement `CI` est présente
  - Compatible Linux (GitHub runners)

---

## 📊 Reporting

- **Outil** : Maven Surefire Report
- **Commande** :
  ```bash
  mvn surefire-report:report
---

## ✅ Suivi qualité

- Résultats visibles sur [SonarCloud](https://sonarcloud.io)
- Alertes visibles dans GitHub
- Badge qualité possible dans README

---

## 🌱 Enjeux éthiques / Green IT

- Tests optimisés en headless pour réduire les ressources
- Analyse statique évite les bugs post-prod (réduction maintenance)