How Client uses the Adapter:
1. The client makes a request to the adapter by calling a method on int using the target interface.
2. The adapter translates the request into one or more calls on the adaptee using the adaptee interface.
3. The client receives the results of the all and never knows there is an adapter doing the translation.
=> Client and Adaptee are decoupled

Definition of Adapter pattern:
  The Adapter Pattern converts the interface of a class into another interface the client expect.
Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

Real-world adapters:
1. Enumerators: interface allows to step through the elements of a collection without knowing the specifics of how are
managed in the collection.
2. Iterators: allows to iterate through a set of items in a collection, and adds the ability to remove items

Definition of Facade Pattern:

Note:
1. Adapter Pattern is to alter an interface so that is matches one a client is expecting.
The intent of the Facade Pattern is to provide a simplified interface to a subsystem.
=> Facade's intent is to simplify, while an adapter's is to convert to interface to something different



