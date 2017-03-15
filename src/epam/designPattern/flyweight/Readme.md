# FlyWeight Design Pattern

* Use sharing to support large number of fine grained objects
* People consider it as a creation pattern as it uses factory. 
* However the major focus is about structuring of objects.
* Refactoring design pattern. Once its sufficiently established there is a object 
creation overhead.  
##Intent

* Reduce storage costs for large number of objects
* We don't create object for every word in a word document
* Retain Object Oriented Granularity and flexibility
* So basically use sharing to support large number of fine grained objects

# Example
* Browser does not load the same image twice
* It essentially creates a flyweight object which references the cached object

## Consequences

* Group of objects are replaced by a few shared objects 
* The number of instances are reduced
* Shared objects don't have a identity. 

# Checklist 
* Ensure that Object creation overhead requires attention
* Divide the target class state into intrinsic(sharable state) and extrinsic(non sharable)
* Create a factory that can cache and reuse existing class instances
* The client must use the factory instead of new to request objects
* The client must compute the non shareable state and supply that state to the class method

## Rules
* Flyweight shows how to make a lot of little objects. Facace shows how to make a single object to represent an entire 
subtystem. 
* Flyweight explain when and how state objects can be shared
 
##References
* Source Making
* PluralSight course on Design Patterns
