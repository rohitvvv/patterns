# Facade Pattern

## Intent
* Provide simple interface for larger more complex peice of code 
* Make complex API simple to use
* Wrap a poorly desigined API in a better desinged one
* Expose complex objects interactions with a single interface


## Consequences
* The existing API gets simplified
* The facade requires update for every update to underlying API 
* The full capability of the API will not be avaiable via a facade

## Common Usages
* Data Access
* File and Streams are simplified using a facade

## Related Patterns
* Adapter
* FlyWeight
* Mediator

They all try to give a different outward facing view to the world.
Wrap already existing functionality. 