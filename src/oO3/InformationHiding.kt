package oO3

// Information hiding is the principle of limiting access to a class from the outside - for example when you use a class from another class you ->
// should not have unrestricted access to all the internal functions/methods. Instead you should only be able to work with a well defined interface.

import java.time.Instant

// Within the java class we import above we will have access to the public properties and methods

// This is crucial to be able to really assert your classes and the methods within your classes are really going to do what you want them to do and behave how they're expected
// And ensures that nobody can mess with or make changes to your class if you don't intend them to be able to