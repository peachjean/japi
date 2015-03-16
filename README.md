japi.io
=======

japi.io is a library to allow java api developers to declare usage intentions 
of different portions of their applications. Typically, access levels handle
this role, but they don't always suffice. Typical examples are:

 * when hooking into another API, something may have to be public, but you 
   don't intend for anything except that specific tool to use it (annotation 
   processors)
 * utilities in a library that can be used across multiple packages but should
   not be consumed externally
 * interfaces that should not be implemented by consumers, but indicate types
   that will be provided by the framework

Inspiration and initial annotation names derived heavily from the kiji project's
annotations: https://github.com/kijiproject/annotations
