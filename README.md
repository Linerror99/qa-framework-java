# 🧪 QA Framework Java – Projet d'Assurance Qualité

[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=Linerror99_qa-framework-java&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=Linerror99_qa-framework-java)

Projet développé dans le cadre du module **Assurance Qualité** à l’ESIGELEC.  
Il met en œuvre un framework de tests automatisés pour une application web avec intégration continue, reporting et analyse qualité.

---

## 🧱 Stack technique

| Élement             | Outil / Version                  |
|---------------------|----------------------------------|
| Langage             | Java 21                          |
| Framework de test   | JUnit 5                          |
| Tests UI            | Selenium WebDriver               |
| Analyse statique    | SonarCloud                       |
| CI/CD               | GitHub Actions                   |
| Reporting           | Maven Surefire (HTML)            |
| Gestion dépendances | Maven                            |
| Exécution CI        | Mode headless via Chrome         |

---

## 🚀 Lancer les tests localement

```bash
mvn clean test site
