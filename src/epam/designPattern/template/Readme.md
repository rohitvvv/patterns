# Template Pattern

* Model a process or algorithm of several steps.
* Allow variation in details of each step while enforcing the structure and order of steps themselves
* Lets take example of game engine. It has following methods
    * SetupGame
    * TakeTurn
    * IsGameOver
    * DisplayWinner
* The above structure can be implemented in specific games like
   * Tic Tac Toe
   * Chess
   * Monopoly
   
   
## Intent

* Initial base algorithm can have empty stub or some implementation(DRY)
* Allow subclass to implemente specific behaviour

## Benefits

* Effectively makes use of Open close principles

## Limitation
* Relies on inheritance instead of composition
* Single inheritance makes it difficult to merge two child algorithms

## Hollywood principles
* Don't call us we call them
* High level components should not depend on low level components
* Subclass are low level implementation. They don't call anything themselves
* They are only called by high level components


## Related patterns
* Strategy
* Decorator
* Factory method
 

##References
* Source Making
* Pluralsight course on Design Patterns
