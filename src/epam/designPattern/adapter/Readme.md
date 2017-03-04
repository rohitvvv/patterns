# Adapter Pattern


Use this when your class cannot make use of a functionality because of incompatible interface

This is important for pluggable architectures

Eclipse IDE plugins follow Adapter Pattern


##Intent
The intent of this pattern is to convert an 
interface to interface another client expects

Allow classes with incompatible interfaces to work together

For e.g: You want to use an existing client but the interface does not match


## Jargon
* Client : One who wants to use the feature
* Adaptee: The feature a Client wants to use but cannot use 
* Adapter: A Interface
* ConcreateAdatpter: An implementation of Adatper

## Example

Pattern class
id
name
age


PatternRenderer(List<Pattern> patterns)

toString list 

But we want a tabluar representation


void DataRender(TextWriter writer)

we don't have easy access to Datarenderer


## Related Patterns
Repository
Strategy
Facade