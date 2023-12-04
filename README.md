# Java-Range
Simple implementation of range for java

All ranges are inclusive E.g. 3..6 = 3,4,5,6

## Definitions
### Integer Range
New range object with lower bound at min and upper bound at max
```java
new Range(min, max)
```
New range object with lower bound at min, upper bound at max and for itteration a step size
```java
new Range(min, num, step)
```
Checks is a value is within range; returning boolean
```java
r.equals(i)
```
Return -1,0,1 if a value in bellow, within or above range
```java
r.compareTo(i) 
```
Generates a random value from range with respect to step size
```java
r.random()
```
Returns a random value between min and max with step size of 1
```java
random(min, max)
```
Returns a random value between min and max with step size
```java
random(min, max, step)
```

### Long Range
##### Is overall similar to Integer range exept it uses long type

New range object with lower bound at min and upper bound at max
```java
new Range(min, max)
```
New range object with lower bound at min, upper bound at max and for itteration a step size
```java
new Range(min, num, step)
```
Checks is a value is within range; returning boolean
```java
r.equals(i)
```
Return -1,0,1 if a value in bellow, within or above range
```java
r.compareTo(i) 
```
Generates a random value from range with respect to step size
```java
r.random()
```
Returns a random value between min and max with step size of 1
```java
random(min, max)
```
Returns a random value between min and max with step size
```java
random(min, max, step)
```

### Float Range
##### Returns type double

New range object with lower bound at min, upper bound at max and for itteration a step size
```java
new Range(min, num, step)
```
Checks is a value is within range; returning boolean
```java
r.equals(i)
```
Return -1,0,1 if a value in bellow, within or above range
```java
r.compareTo(i) 
```
Generates a random value from range
```java
r.random()
```
Returns a random value between min and max
```java
random(min, max)
```
Returns a random value between min and max with step size
```java
random(min, max, step)
```
## Examples
### Integer Range
```java
for(int i:new Range(5, 10)){ 
  //your code  
}
```
```
5,6,7,8,9,10
```
```java
for(int i:new Range(5, 10, 2)){ 
  //your code  
}
```
```
5,7,9,11,13,15,17,19,21,23
```
```java
for(int i:new Range(4, (10-4)/2+1, 2)){ 
  //your code  
}
```
```
4,6,8,10
```













