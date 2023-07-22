What is Java Reflection API?
- Java Reflection is a process of examining or modifying the run time behavior of a class at run time.

How to get the fields of a class?
- example: getDeclaredFields() method of Class class and getField() method of Class class.

Difference between getDeclaredFields() and getField() methods
- getDeclaredFields() method returns the all fields of this class including private and protected fields but excluding inherited fields.
- getField() method returns the public field of the class or interface represented by this Class object.

How to get the methods of a class?
- example: getDeclaredMethods() method of Class class and getMethod() method of Class class.

Difference between getDeclaredMethods() and getMethod() methods
- getDeclaredMethods() method returns the all methods of this class including private and protected methods but excluding inherited methods.
- getMethod() method returns the public method of the class or interface represented by this Class object.

How to set the value of a field?
- example: set() method of Field class.

How to set private field value?
- example: setAccessible() method of AccessibleObject class.

How to invoke a method of a class?
- example: invoke() method of Method class.

How to pass argument in invoke() method?
- example: null can be used as first argument if method does not accept any argument.
- code: method.invoke(obj, null);
- example: new Object[]{} can be used as second argument if method accepts multiple arguments.
- code: method.invoke(obj, new Object[]{});

How to invoke a private method of a class?
- example: setAccessible() method of AccessibleObject class.

How to invoke a static method of a class?
- example: invoke() method of Method class.
- example: null can be used as first argument if method is static.

The java.lang.Class class provides many methods that can be used to get metadata, examine and change the run time behavior of a class.

The java.lang and java.lang.reflect packages provide classes for java reflection.

Advantages of Reflection API
- To inspect the fields and methods of classes
  - example: IDEs use reflection heavily to inspect the classes.
- To instantiate classes
  - example: newInstance() method of Class class and Constructor class is used to instantiate classes by name.
- To invoke methods and get/set field values
  - example: java.lang.reflect.Method class provides methods to invoke a method at runtime.
- To create a new class at runtime
  - example: java.lang.instrument package provides instrumentation API and java.lang.ClassLoader provides methods to define a class at runtime.
- To get and set the object fields directly by bypassing the setter or getter methods
  - example: java.beans.Introspector class provides methods to override the default behavior of a bean and java.lang.reflect.Field provides methods to get and set the field values directly.
- To change the private fields of a class from outside the class
  - example: java.lang.reflect.Field class provides methods to get and set the field values directly.
- To instantiate classes which are not known at compile time, etc.
  - example: JDBC drivers use reflection to instantiate driver class.
- To get information about an unknown object at runtime, etc.
  - example: Object.getClass() method returns the instance of Class class, which provides methods to get the metadata of a class at runtime.
- To invoke methods on unknown objects at runtime, 
  - example: JUnit uses reflection to run annotated methods (methods annotated with @Test) in a test class.

Disadvantages of Reflection API
- Performance Overhead
  - example: Reflection API is slower than normal code, because it involves types of discovery, and dynamic invocations.
- Security Restrictions
  - example: A security manager can be used to restrict the use of reflection.
- Exposure of Internals
  - example: Since reflection allows code to perform operations that would be illegal in non-reflective code, such as accessing private fields and methods, the use of reflection can result in unexpected side-effects, which may render code dysfunctional and may destroy portability. Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.
- Complexity
  - example: Reflective code is harder to understand and maintain than ordinary code. Performance suffers, too.
- No Compile-Time Checking
  - example: Reflection code does not undergo compile-time checking, and so it is more likely to fail at runtime.
- Exposure of Internals
  - example: Since reflection allows code to perform operations that would be illegal in non-reflective code, such as accessing private fields and methods, the use of reflection can result in unexpected side-effects, which may render code dysfunctional and may destroy portability. Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform.


When IllegalAccessException is thrown?
- If a method is public then it can be accessed from outside the class.
- If a method is private then it can be accessed from outside the class by using the setAccessible() method of AccessibleObject class.

