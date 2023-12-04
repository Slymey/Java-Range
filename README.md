# Java-Range
Simple implementation of range for java

All ranges are inclusive E.g. 3..6 = 3,4,5,6

## Definitions
### Integer Range
New range object with lower bound at min and upper bound at max
```
new Range(min, max)
```
New range object with lower bound at min, upper bound at max and for itteration a step size
```
new Range(min, num, step)
```
Checks is a value is within range; returning boolean
```
r.equals(i)
```
Return -1,0,1 if a value in bellow, within or above range
```
r.compareTo(i) 
```
Generates a random value from range with respect to step size
```
r.random()
```
Returns a random value between min and max with step size of 1
```
random(min, max)
```
Returns a random value between min and max with step size
```
random(min, max, step)
```

### Long Range
##### Is overall similar to Integer range exept it uses long type

New range object with lower bound at min and upper bound at max
```
new Range(min, max)
```
New range object with lower bound at min, upper bound at max and for itteration a step size
```
new Range(min, num, step)
```
Checks is a value is within range; returning boolean
```
r.equals(i)
```
Return -1,0,1 if a value in bellow, within or above range
```
r.compareTo(i) 
```
Generates a random value from range with respect to step size
```
r.random()
```
Returns a random value between min and max with step size of 1
```
random(min, max)
```
Returns a random value between min and max with step size
```
random(min, max, step)
```

### Float Range
##### Returns type double

New range object with lower bound at min, upper bound at max and for itteration a step size
```
new Range(min, num, step)
```
Checks is a value is within range; returning boolean
```
r.equals(i)
```
Return -1,0,1 if a value in bellow, within or above range
```
r.compareTo(i) 
```
Generates a random value from range
```
r.random()
```
Returns a random value between min and max
```
random(min, max)
```
Returns a random value between min and max with step size
```
random(min, max, step)
```
## Examples
