# Java-Range
Simple implementation of range for java

All ranges are inclusive E.g. 3..6 = 3,4,5,6

## Definitions
### Integer Range
New range object with lower bound at min and upper bound at max
```java
new Range(int min, int max)
```
New range object with lower bound at min, upper bound at max and for itteration, a step size
```java
new Range(int min, int max, int step)
```
New range object with lower bound at min, upper bound at max, for itteration, a step size and a boolean to toggle between max acting as a maximum value on a number of steps
```java
new Range(int min, int max, int step, boolean num)
```
Checks if a value is within range; returning boolean
```java
r.equals(i)
```
Return -1,0,1 if a value is bellow, within or above range
```java
r.compareTo(i) 
```
Generates a random value from range with respect to step size
```java
r.random()
```
Returns a random value between min and max with step size of 1
```java
random(int min, int max)
```
Returns a random value between min and max with step size
```java
random(int min, int max, int step)
```

### Long Range
##### Is overall similar to Integer range except it uses long type

New range object with lower bound at min and upper bound at max
```java
new Range(long min, long max)
```
New range object with lower bound at min, upper bound at max and for itteration, a step size
```java
new Range(long min, long max, long step)
```
New range object with lower bound at min, upper bound at max, for itteration, a step size and a boolean to toggle between max acting as a maximum value on a number of steps
```java
new Range(long min, long max, long step, boolean num)
```
Checks if a value is within range; returning boolean
```java
r.equals(i)
```
Return -1,0,1 if a value is bellow, within or above range
```java
r.compareTo(i) 
```
Generates a random value from range with respect to step size
```java
r.random()
```
Returns a random value between min and max with step size of 1
```java
random(long min, long max)
```
Returns a random value between min and max with step size
```java
random(long min, long max, long step)
```

### Float Range
##### Returns type double

New range object with lower bound at min, a step size for itteration and a total number of itterations as num
```java
new Range(double min, int num, double step)
```
New range object with lower bound at min, upper bound at max and for itteration, a step size
```java
new Range(double min, double max, double step)
```
Checks if a value is within range; returning boolean
```java
r.equals(i)
```
Return -1,0,1 if a value is bellow, within or above range
```java
r.compareTo(i) 
```
Generates a random value from range
```java
r.random()
```
Returns a random value between min and max
```java
random(double min, double max)
```
Returns a random value between min and max with step size
```java
random(double min, double max, double step)
```
## Examples
### Integer Range
```java
for(int i:new Range(4, 10)){ 
  //your code  
}  
> [4, 5, 6, 7, 8, 9, 10]
```
```java
for(int i:new Range(4, 10, 2)){ 
  //your code  
} [4, 6, 8, 10]
> 
```
```java
for(int i:new Range(4, 10, 2, true)){ 
  //your code  
}
> [4, 6, 8, 10, 12, 14, 16, 18, 20, 22]
```
```java
int n = Range.random(4,10);
>  n = 4, 5, 6, 7, 8, 9, 10  
```
```java
int n = Range.random(4,10,2);
> n = 4, 6, 8, 10
```
```java
Range r = new Range(4,10);
int n = r.random();
> n = 4, 6, 8, 10
```
```java
Range r = new Range(4,10);
boolean b;
b = r.equals(7);
> b = true  
b = r.equals(15);
> b = false
b = r.equals(-6);
> b = false 
```
```java
Range r = new Range(4,10);
int b;
b = r.compareTo(7);
> b = 0  
b = r.compareTo(15);
> b = 1
b = r.compareTo(-6);
> b = -1 
```
### Long Range
##### Is the same as Integer range, except Range => RangeLong and int => long

### Float Range
```java
for(double i:new RangeFloat(4.0, 10.0)){ 
  //your code  
}  
> [4, 5, 6, 7, 8, 9, 10]
```
```java
for(double i:new RangeFloat(4.0, 10, 2.0)){ 
  //your code  
}
> [4, 6, 8, 10, 12, 14, 16, 18, 20, 22]
```
```java
for(double i:new RangeFloat(4.0, 10.0, 2.0)){ 
  //your code  
}
> [4, 6, 8, 10]
```
```java
double n = RangeFloat.random(4,10);
>  n = 4, 5, 6, 7, 8, 9, 10  
```
```java
double n = RangeFloat.random(4,10,2);
> n = 4, 6, 8, 10
```
```java
RangeFloat r = new RangeFloat(4,10);
double n = r.random();
> n = 4, 6, 8, 10
```
```java
RangeFloat r = new RangeFloat(4,10);
boolean b;
b = r.equals(7.5);
> b = true  
b = r.equals(15.2);
> b = false
b = r.equals(-6);
> b = false 
```
```java
RangeFloat r = new RangeFloat(4,10);
int b;
b = r.compareTo(7.2);
> b = 0  
b = r.compareTo(15);
> b = 1
b = r.compareTo(-6.7);
> b = -1 
```











