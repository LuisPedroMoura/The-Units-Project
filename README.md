# The-Units-Project
## 'Double Trouble' - A Dimentional Analysis Language


... READ ME ... A WORK IN PROGRESS ...


The Units Project is a powerful Domain Specific Language for creating all kinds of Units that offers an interface that guarantees
checked operations between them.

### The 'Double Trouble'
Why isn't the type Double enough?
When dealing with units or quantities of a specific dimension in a General Purpose programming language there is an obvious limitation.
There is no way to distinguish two variables aside from their names. And when operating with units, adding or multiplying yields
different results, one maintains the dimension the other does not. And what if the SI units are not enough? And what if you need to
create a new base unit and derived other units from it? And what about prefix multipliers?
The Double Touble DSL allows you to create all of this very easily.
As a simple example, the code bellow creates 17 prefixed types/units with 169 different combinations to calculate area with
equivalent (same dimension) units.
```
units {
  meter "m";
  yard "yd";
  fathom "ftm";
  area "m^2" : meter * meter;
  length [meter] : (1.09361) yard | (0.546807) fathom;
}
prefixes {
  Mega "M" : 10^6;
  kilo "k" : 10^3;
  pico "p" : 10^-12;
}
```
