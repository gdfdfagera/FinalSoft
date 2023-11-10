# FinalSoft
# Project Structure

## The project is organized into several packages and classes:

Adapter: Contains classes related to the adapter pattern.
Decorator: Holds classes implementing the decorator pattern.
Factory: Includes classes for implementing the factory pattern.
Observer: Contains classes implementing the observer pattern.
Singleton: Holds the singleton pattern implementation.
Strategy: Contains classes associated with the strategy pattern.

## Design Patterns Used

### Singleton Pattern

Purpose: Ensures a class has only one instance and provides a global point of access to it.
Implementation: Connection to the Data Base

### Factory Method Pattern

Purpose: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
Implementation: Create a new users

### Strategy Pattern
Purpose: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
Implementation: Strategy.Admin choose one of 2 ways, delete something or add to the data base

### Observer Pattern
Purpose: Allows a subject to notify an array of observers about changes in its state.
Implementation: Notifies users about updates to the database

### Decorator Pattern
Purpose: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
Implementation: Create a new devices

### Adapter Pattern
Purpose: Allows incompatible interfaces to work together. This is done by wrapping the otherwise incompatible object in an adapter to give it a compatible interface.
Implementation: Allow to buy a certificate or a discount for someone.

These patterns are instrumental in ensuring that the project's codebase is easy to maintain, extend, and scale as new requirements emerge. Each pattern is applied following the principles of good software design to address specific issues within the project's context.