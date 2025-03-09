# Sudoku Game with Solver

## Project Description
This application is a simple Sudoku game simulator with a graphical user interface. It displays pre-defined Sudoku puzzles of varying difficulty levels and includes an algorithmic solver to find solutions automatically.

## Key Features
- Display of Sudoku puzzles at different difficulty levels (easy, medium, and hard)
- Automatic puzzle solving using a backtracking algorithm
- Ability to generate new puzzles with a click of a button
- Clean and intuitive user interface with visually distinct 3x3 blocks

## Technical Specifications
- Programming Language: Java
- UI Library: Swing with Nimbus Look and Feel
- Board Structure: Standard 9x9 grid divided into 3x3 blocks

## Project Structure
- `Main.java` - Entry point for the application and window configuration
- `MainFrame.java` - Main application window setup
- `GameBoard.java` - Logic for creating and managing the game board
- `Cell.java` - Class representing an individual Sudoku cell
- `SudokuList.java` - Storage for pre-defined Sudoku puzzles
- `Solver.java` - Implementation of the Sudoku solving algorithm
- `CustomButton.java` - Base class for control buttons
- `CompleteButton.java` - Button for solving the puzzle
- `UpdateSudokuTemplateButton.java` - Button for updating to a new puzzle

## Detailed User Guide

### System Requirements
- Java Development Kit (JDK) 8 or higher
- Any operating system that supports Java (Windows, macOS, Linux)

### Installation

#### Option 1: Download and Run the JAR file
1. Download the JAR file from the repository's Releases section
2. Double-click the JAR file or run it from the command line:
   ```
   java -jar SudokuGame.jar
   ```

#### Option 2: Clone and Compile the Repository
1. **Install Java Development Kit (JDK)**:
   - Visit [Oracle's website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK
   - Download and install the latest version for your operating system
   - Verify installation by opening a terminal/command prompt and typing:
     ```
     javac -version
     ```

2. **Clone the Repository**:
   ```
   git clone https://github.com/username/sudoku-solver.git
   cd sudoku-solver
   ```

3. **Compile the Source Code**:
   ```
   javac *.java
   ```

4. **Run the Application**:
   ```
   java Main
   ```

### Using the Application

#### Starting a New Game
When you launch the application, a Sudoku puzzle is automatically loaded. The pre-filled cells (shown in red) are fixed and cannot be modified.

#### Controls
The application has two main buttons at the top:

1. **Complete Button**:
   - Click this button to automatically solve the current puzzle
   - The solution will be displayed on the board, with added numbers shown in black

2. **Update Button**:
   - Click this button to load a new Sudoku puzzle
   - The puzzles cycle through the available templates in the `SudokuList` class
