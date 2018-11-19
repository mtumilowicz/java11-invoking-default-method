[![Build Status](https://travis-ci.com/mtumilowicz/java11-invoking-default-method.svg?branch=master)](https://travis-ci.com/mtumilowicz/java11-invoking-default-method)

# java11-invoking-default-method
Explicitly invoking default method from enclosing interface.

# preface
A class (or an interface) can invoke a default method 
of an interface that is explicitly mentioned in the 
class's implements clause (or the interface's extends 
clause) by using the same syntax 
`<InterfaceName>.super.<methodName>`

# project description
We provide examples with tests for mentioned above
features.

* class
    ```
    public class CustomClass implements Interface1, Interface2 {
        public String get() {
            return "CustomClass";
        }
    
        String getI1() {
            return Interface1.super.get();
        }
    
        String getI2() {
            return Interface2.super.get();
        }
    }
    ```
* interfaces
    ```
    interface Interface1 {
        default String get() {
            return "Interface1";
        }
    }
    interface Interface2 {
        default String get() {
            return "Interface2";
        }
    }
    ```
* tests in `CustomClassTest`