<div align="center">

# Java-Basics

**A growing collection of core Java concepts — algorithms, data structures, and fundamentals — implemented from scratch with clean code and clear explanations.**

Built while learning. Meant to be readable, runnable, and useful for anyone — beginner or not.

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](./LICENSE)
![Java](https://img.shields.io/badge/Java-JDK%2017%2B-orange)
[![GitHub](https://img.shields.io/badge/GitHub-KawshikSubash-181717?logo=github)](https://github.com/KawshikSubash)

</div>

---

## 📖 About

This repository is a personal record of Java concepts as I learn them — every folder is a self-contained topic with its own code, comments, and documentation. No external dependencies, no build tools required. Just Java.

Each topic includes:
- A `.java` file with the full implementation, commented line by line
- A `readme.md` explaining what the topic is, how it works, and how to run it

---

## 📋 Requirements

You only need the **Java Development Kit (JDK)** installed. Nothing else.

| Requirement | Version |
|---|---|
| JDK | 17 or higher (any recent version works) |
| OS | Windows, macOS, Linux, or Android (via Termux) |

Check if you already have it:
```bash
java -version
javac -version
```
If both print a version number, skip ahead to [Installation](#️-installation--setup).

---

## ⚙️ Installation & Setup

<details>
<summary><b>🪟 Windows (Command Prompt / PowerShell)</b></summary>

1. Download the JDK from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [Eclipse Temurin](https://adoptium.net/) (free, open-source).
2. Run the installer and complete setup.
3. Verify installation:
   ```cmd
   java -version
   javac -version
   ```
4. Clone the repository:
   ```cmd
   git clone https://github.com/KawshikSubash/Java-Basics.git
   cd Java-Basics
   ```

</details>

<details>
<summary><b>🐧 Ubuntu / Debian Linux</b></summary>

1. Install the JDK:
   ```bash
   sudo apt update
   sudo apt install default-jdk -y
   ```
2. Verify installation:
   ```bash
   java -version
   javac -version
   ```
3. Clone the repository:
   ```bash
   git clone https://github.com/KawshikSubash/Java-Basics.git
   cd Java-Basics
   ```

</details>

<details>
<summary><b>🍎 macOS</b></summary>

1. Install via Homebrew:
   ```bash
   brew install openjdk
   ```
2. Verify installation:
   ```bash
   java -version
   javac -version
   ```
3. Clone the repository:
   ```bash
   git clone https://github.com/KawshikSubash/Java-Basics.git
   cd Java-Basics
   ```

</details>

<details>
<summary><b>📱 Termux (Android)</b></summary>

1. Update packages and install Java + Git:
   ```bash
   pkg update && pkg upgrade -y
   pkg install openjdk-17 git -y
   ```
2. Verify installation:
   ```bash
   java -version
   javac -version
   ```
3. Clone the repository:
   ```bash
   git clone https://github.com/KawshikSubash/Java-Basics.git
   cd Java-Basics
   ```

</details>

---

## ▶️ Running Any Topic

Once cloned, navigate into any topic folder, compile, and run:

```bash
cd Sorting
javac Sorting.java
java Sorting
```

Replace `Sorting` with any other topic folder + filename — the same three commands (`cd`, `javac`, `java`) work everywhere, on every OS listed above.

---

## 📚 Topics

| # | Topic | Path | Description |
|---|---|---|---|
| 1 | Prime Numbers | [`/PrimeNumbers`](./PrimeNumbers) | Checking and generating prime numbers |
| 2 | Sorting | [`/Sorting`](./Sorting) | Core sorting algorithms implemented from scratch |

*(This table grows as new topics are added — check back for updates.)*

---

## 🤝 Contributing

This is primarily a personal learning repository, but suggestions, corrections, or better implementations are always welcome — feel free to open an issue or a pull request.

---

## 📄 License

This project is licensed under the **MIT License** — see [LICENSE](./LICENSE) for details.

---

## 👤 Author

<div align="center">

**Kawshik Subash**

[![GitHub](https://img.shields.io/badge/GitHub-KawshikSubash-181717?logo=github)](https://github.com/KawshikSubash)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-kawshiksubash-0A66C2?logo=linkedin)](https://linkedin.com/in/kawshiksubash)
[![Email](https://img.shields.io/badge/Email-kawshiksubash06467%40gmail.com-D14836?logo=gmail&logoColor=white)](mailto:kawshiksubash06467@gmail.com)

</div>
