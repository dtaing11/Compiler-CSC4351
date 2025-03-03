# C Parser Readme

## Overview
This parser is designed to handle a subset of the C programming language. It builds an Abstract Syntax Tree (AST) using JavaCup and Java-based AST classes. The parser supports various C constructs, including variable declarations, expressions, loops, function definitions, and complex types.

---

## ✅ Features Supported
### **1️⃣ Variable Declarations**
- Basic types: `int`, `char`, `float`, `double`, `long`, `long long`
- Storage class specifiers: `extern`, `static`
- Pointers: `int *p;`, `int ******p;`
- Arrays: `int[] x = {1,2,3,4};`
- Custom types: `typedef unsigned int uint;`
- Structs & Unions: `struct Point { int x, y; };`
- Enums: `enum Color { RED, GREEN, BLUE };`

### **2️⃣ Expressions & Assignments**
- Arithmetic: `x + y`, `a * b`, `x += 1`
- Relational: `x < y`, `a >= b`
- Logical: `x && y`, `a || b`
- Bitwise: `x & y`, `a ^ b`, `x << 2`
- Pointer Dereferencing: `*p = 10;`, `*******p = 30;`
- Array Access: `x[0] = 5;`

### **3️⃣ Statements**
- Conditional: `if`, `if-else`
- Loops: `while`, `for`, `do-while`
- Function calls: `printf("Hello");`
- Return statements: `return x;`
- Block statements: `{ int x = 5; x++; }`
- Struct field access: `p.x = 10;`
- Function pointers: `int (*f)(int, int);`

### **4️⃣ Functions**
- Function declarations: `extern int foo();`
- Function definitions: `int add(int a, int b) { return a + b; }`
- Static functions: `static void helper() { ... }`

### **5️⃣ Type System**
- Basic types (`int`, `float`, `char`, etc.)
- Pointer types (`int ******p;`)
- Array types (`int[]`)
- Structs, Enums, and Unions
- Typedefs (`typedef struct Point Point;`)
- Function pointers (`int (*f)(int, int);`)

### **6️⃣ Storage Class Specifiers**
- `extern`
- `static`
- `typedef`

### **7️⃣ Symbol Table Support**
- Stores structs, enums
- Handles type lookup for custom types


