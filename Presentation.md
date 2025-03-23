# 🧪 Projet d’Assurance Qualité – QA Framework Java

---

## 🎯 Objectifs du projet

- Automatiser les tests UI d'une application web
- Appliquer les fondamentaux de l’assurance qualité
- Intégrer un pipeline CI/CD avec tests et analyse statique
- Mettre en pratique les notions ISTQB

---

## 🧱 Stack technique

| Composant       | Outil                            |
|------------------|----------------------------------|
| Langage          | Java 21                          |
| Tests            | JUnit 5 + Selenium WebDriver     |
| CI/CD            | GitHub Actions                   |
| Analyse statique | SonarCloud                       |
| Reporting        | Maven Surefire Report (HTML)     |

---

## 🧪 Démonstration du test UI

- Site cible : https://the-internet.herokuapp.com/login
- Tests réalisés :
  - Connexion valide (succès)
  - Connexion invalide (erreur)
- Exécution locale en mode graphique
- Exécution CI en mode **headless**

📸 *Ajouter captures d’écran ici*

---

## 📊 Qualité logicielle avec SonarCloud

- Analyse lancée automatiquement à chaque push
- Règles activées : bugs, duplications, code smells, conventions
- Résultat :
  - Quality Gate : ✅ Passed
  - 6 issues mineures détectées
- Lien : [Tableau de bord SonarCloud](https://sonarcloud.io/summary/new_code?id=Linerror99_qa-framework-java)

---

## 🔁 CI/CD GitHub Actions

- Pipeline automatisé :
  - Compilation
  - Tests JUnit + Selenium (mode headless)
  - Analyse SonarCloud
- Mode `headless` détecté automatiquement si variable `CI=true`
- Zéro action manuelle

📸 *Ajouter capture d'écran du job GitHub*

---

## ✅ Bilan

- Objectifs atteints : tests, qualité, CI
- Mise en œuvre complète d’un PAQ
- Suivi qualité continu et traçable
- Projet conforme à une démarche professionnelle
- Idéal pour renforcer la préparation à la certification ISTQB

---

## 👤 Informations

- Étudiant : **Laurent DJOSSOU**
- École : ESIGELEC
- Module : Assurance Qualité
- Date : Mars 2025

