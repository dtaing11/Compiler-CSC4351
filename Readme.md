# C Parser Readme

## Overview
This parser is designed to handle a subset of the C programming language. It builds an Abstract Syntax Tree (AST) using JavaCup and Java-based AST classes. The parser supports various C constructs, including variable declarations, expressions, loops, function definitions, and complex types.

---

## ✅ Features Supported

### **1️⃣ Variable Declarations**
- **Basic types:** `int`, `char`, `float`, `double`, `long`, `long long`
  ```c
  int x;
  char c;
  float f;
  ```
- **Storage class specifiers:** `extern`, `static`
  ```c
  extern int globalVar;
  static int localVar;
  ```
- **Pointers:** `int *p;`, `int ******p;`
  ```c
  int *p;
  int ******ptr;
  ```
- **Arrays:** `int[] x = {1,2,3,4};`
  ```c
  int x[] = {1, 2, 3, 4};
  ```
- **Custom types:** `typedef unsigned int uint;`
  ```c
  typedef unsigned int uint;
  uint num;
  ```
- **Structs & Unions:** `struct Point { int x, y; };`
  ```c
  struct Point {
      int x;
      int y;
  };
  ```
- **Enums:** `enum Color { RED, GREEN, BLUE };`
  ```c
  enum Color { RED, GREEN, BLUE };
  ```

### **2️⃣ Expressions & Assignments**
- **Arithmetic:** `x + y`, `a * b`, `x += 1`
  ```c
  x = y + 5;
  x += 1;
  ```
- **Relational:** `x < y`, `a >= b`
  ```c
  if (x < y) {...}
  ```
- **Logical:** `x && y`, `a || b`
  ```c
  if (x && y) {...}
  ```
- **Bitwise:** `x & y`, `a ^ b`, `x << 2`
  ```c
  int result = x & y;
  ```
- **Pointer Dereferencing:** `*p = 10;`, `*******p = 30;`
  ```c
  *ptr = 10;
  *******ptr = 30;
  ```
- **Array Access:** `x[0] = 5;`
  ```c
  x[0] = 5;
  ```

### **3️⃣ Statements**
- **Conditional:** `if`, `if-else`
  ```c
  if (x > 0) {
      y = 1;
  } else {
      y = 0;
  }
  ```
- **Loops:** `while`, `for`, `do-while`
  ```c
  while (x > 0) {
      x--;
  }
  ```
- **Function calls:** `printf("Hello");`
  ```c
  printf("Hello");
  ```
- **Return statements:** `return x;`
  ```c
  return x;
  ```
- **Block statements:** `{ int x = 5; x++; }`
  ```c
  {
      int x = 5;
      x++;
  }
  ```
- **Struct field access:** `p.x = 10;`
  ```c
  struct Point p;
  p.x = 10;
  ```
- **Function pointers:** `int (*f)(int, int);`
  ```c
  int (*f)(int, int);
  ```

### **4️⃣ Functions**
- **Function declarations:** `extern int foo();`
  ```c
  extern int foo();
  ```
- **Function definitions:** `int add(int a, int b) { return a + b; }`
  ```c
  int add(int a, int b) {
      return a + b;
  }
  ```
- **Static functions:** `static void helper() { ... }`
  ```c
  static void helper() {
      // Function body
  }
  ```

### **5️⃣ Type System**
- **Basic types** (`int`, `float`, `char`, etc.)
- **Pointer types** (`int ******p;`)
- **Array types** (`int[]`)
- **Structs, Enums, and Unions**
- **Typedefs** (`typedef struct Point Point;`)
- **Function pointers** (`int (*f)(int, int);`)

### **6️⃣ Storage Class Specifiers**
- `extern`
- `static`
- `typedef`

### **7️⃣ Symbol Table Support**
- Stores structs, enums
- Handles type lookup for custom types

### **8️⃣ Additional Features**
- **Bit-fields in structs:** `unsigned int x : 3;`
  ```c
  struct Example {
      unsigned int x : 3;
  };
  ```
- **Sizeof operator:** `sizeof(type)`, `sizeof(expression)`
  ```c
  int size = sizeof(int);
  ```
- **Inline functions:** `extern inline int foo();`
  ```c
  extern inline int foo();
  ```

---

## 🚀 **Future Enhancements** (To be Implemented)
- Error handling improvements
- Support for more complex function pointer syntax

This parser is now capable of handling a comprehensive subset of C syntax! 🚀
