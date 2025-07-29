## ENUM (enumeration)

- Enum is a special java type used for collection of Constants.
- It will have fixed set of values, cannot be changed. 
- Enum classes implicitly extends java.lang.Enum, Hence cannot extend other classes
- Enum classes can implement interfaces
- Enum can class can only have private constructors, we cannot create objects of enum class
- All methods of enum are static methods, can use them without creating the objects.


### Important methods of Enum

There are 4 important methods of enum 
1. values() Returns all constants as array
2. ordinal() Returns the index of that enum (0,1,2,3...)
3. name() Returns the name 
4. valuesOf("Name") Returns value of Constant Name

Here is the example of EnumWeek [Enum Week](./EnumWeek.java)

