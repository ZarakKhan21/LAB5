# Decorator Pattern Implementation

This project demonstrates two implementations of the Decorator Design Pattern in Java:
1. File Data Source Decorators (compression, encryption)
2. Shape Decorators (visual decorations)
   
## Changes Made

### 1. Fixed Syntax Errors
- Removed invalid parameter naming in `System.out.println()` calls
- Corrected constructor calls by removing named parameters
- Fixed method name from `shapeDecoratorDemo()` to `shapeDecoratorDemo()`
- Balanced parentheses in nested constructor calls

### 2. Structural Improvements
- Properly organized packages:
  - File decorators in `FileDecorator.src.decorators`
  - Shape decorators in `LAB.src`
- Added UTF-8 support via `UTF8Decorator`
- Improved output formatting in Demo class

### 3. Enhanced Functionality
- Added proper handling of special characters in text data
- Implemented consistent error handling
- Improved demo output with clear section headers
