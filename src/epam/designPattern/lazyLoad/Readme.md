# Lady Load Pattern

* To increase the performance of the application by reducing the amount of work to do
Object store from a persistent store. 
* Probably you may not want to load portions of the object state that you don't need
e.g: fetching rows from the database which are not required
* The client code may not have knowledge that the object is loading data 
## Intent

* Lazy load interrupts the process for the moment and load only when needed 
* If you are lazy about doing things. You will win when it turns out you don't need them at all


## Reference
* Pluralsight course on Design Patterns

## Applicability
* Use only when you have a object which requires multiple calls to construct an object
* Use it as a optimization to your design 
* Don't apply it every where. It will lead to performance degradation

# Lazy Initiation (Variant)
 
* Its the simplest approach
* Every property checks to see if its backing field has been initialized
* Can check if the field is null(null may be legal in your app!) 
* This variant requires access to the value to go through the property

*** 
TODO

# Value holder(Variant)   

# Virtual Proxy (Variant) 

# Ghosts (Variant)



