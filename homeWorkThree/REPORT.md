# Complexity
## ``add(E anEntry)``
```java
public boolean add(E anEntry) {
    if (size == capacity) {
        reallocate();
    }
    theData[size] = anEntry;
    size++;
    return true;
}
```
* **O(1)** since these are just assigments

## ``add(int index, E anEntry)``
```java
public void add(int index, E anEntry) {
    if (index < 0 || index > size) {
        throw new ArrayIndexOutOfBoundsException(index);
    }
    if (size == capacity) {
        reallocate();
    }
    // Shift data in elements from index to size - 1
    for (int i = size; i > index; i--) {
        theData[i] = theData[i - 1];
    }
    // Insert the new item.
    theData[index] = anEntry;
    size++;
}
```
* **O(n)** since, in the worst case, you have to shift everything over

## ``get(int index)``
```java
public E get(int index) {
    if (index < 0 || index >= size) {
        throw new ArrayIndexOutOfBoundsException(index);
    }
    return theData[index];
}
```
* **0(1)** since there is just one return

## ``set(int index, E newValue)``
```java
public E set(int index, E newValue) {
    if (index < 0 || index >= size) {
        throw new ArrayIndexOutOfBoundsException(index);
    }
    E oldValue = theData[index];
    theData[index] = newValue;
    return oldValue;
}
```
* **O(1)** since it is just assignments and returning something

## ``remove(int index)``
```java
public E remove(int index) {
    if (index < 0 || index >= size) {
        throw new ArrayIndexOutOfBoundsException(index);
    }
    E returnValue = theData[index];
    for (int i = index + 1; i < size; i++) {
        theData[i - 1] = theData[i];
    }
    size--;
    return returnValue;
}
```
* **O(n)** since you would have to shift everything left once

## ``reallocate()``
```java
private void reallocate() {
    capacity = (capacity == 0) ? 1 : capacity * 2;
    theData = java.util.Arrays.copyOf(theData, capacity);
}
```
* **O(1)** since you are just reallocating

## ``size()``
```java
public int size() {
    return size;
}
```
* **O(1)** since you are just returning something

## ``indexOf(Object item)``
```java
public int indexOf(Object item) {
    for (int i = 0; i < size; i++) {
        if (theData[i] == null && item == null) {
            return i;
        }
        if (theData[i].equals(item)) {
            return i;
        }
    }
    return -1;
}
```
* **O(n)** since you have to loop through the whole list

## ``toString()``
```java
public String toString() {
    StringBuilder rThis = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
        if (theData[i] == null) {
            break;
        }
        if (rThis.toString().equals("[")){
            rThis.append(theData[i].toString());
        } else {
            rThis.append(", ").append(theData[i].toString());
        }
    }
    return rThis.append("]").toString();
}
```
* **O(n)** since you are looping through the whole list

## ``clear()``
```java
public void clear() {
    size = 0;
    for (int i = 0; i < capacity; i++) {
        theData[i] = null;
    }
}
```
* **O(n)** since you are looping through the whole list

## ``isEmpty()``
```java
public boolean isEmpty() {
    return size == 0;
}
```
* **O(1)** since you are just returning something

## ``remove(Object o)``
```java
public boolean remove(Object o) {
    int index = indexOf(o);
    if (index != -1) {
        remove(index);
        return true;
    }
    return false;
}
```
* **O(1)** since you are just reallocating

## ``ensureCapacity(int minCapacity)``
```java
public void ensureCapacity(int minCapacity) {
   while (capacity < minCapacity) {
       reallocate();
   }
}
```
* **O(1)**? This one is weird because `reallocate()` is O(1), and it isn't like you are increasing
  the capacity by one but rather doubling it.

## ``trimToSize()``
```java
public void trimToSize() {
    capacity = size;
    theData = Arrays.copyOf(theData, capacity);
}
```
* **O(1)** since you are just reallocating

## ``addAll(int index, Collection<? extends E> c)``
```java
public boolean addAll(int index, Collection<? extends E> c) {
    if (index < 0 || index > size) {
        throw new ArrayIndexOutOfBoundsException(index);
    }
    ensureCapacity(size + c.size());
    for (E e : c) {
        for (int i = size; i > index; i--) {
            theData[i] = theData[i - 1];
        }
        theData[index] = e;
        size++;
    }
    return true;
}
```
* **O(n^2)** since there is a nested loop

# Observed benchamrk times
* This one was weird, because sometimes I will get the average between CSArrayList and ArrayList,
  sometimes it was slower and sometimes faster. Here is an example
```
CSArrayList: append = 30.5ms, get = 106.7ms
CSArrayList: append = 24.3ms, get = 81.0ms
CSArrayList: append = 85.5ms, get = 64.7ms
CSArrayList: append = 32.2ms, get = 87.9ms
CSArrayList: append = 13.6ms, get = 85.9ms
CSArrayList: append = 37.7ms, get = 95.7ms
CSArrayList: append = 14.0ms, get = 85.9ms
CSArrayList: append = 40.2ms, get = 70.4ms
CSArrayList: append = 11.1ms, get = 83.1ms
CSArrayList: append = 54.2ms, get = 70.3ms
CSArrayList Averages: append = 34.3ms, get = 34.3ms

ArrayList: append = 25.7ms, get = 87.5ms
ArrayList: append = 42.1ms, get = 76.5ms
ArrayList: append = 12.1ms, get = 85.7ms
ArrayList: append = 36.1ms, get = 90.9ms
ArrayList: append = 14.7ms, get = 87.5ms
ArrayList: append = 53.0ms, get = 79.5ms
ArrayList: append = 33.0ms, get = 63.6ms
ArrayList: append = 14.2ms, get = 82.9ms
ArrayList: append = 13.9ms, get = 64.5ms
ArrayList: append = 15.6ms, get = 65.9ms
ArrayList Averages: append = 26.0ms, get = 26.0ms

Here we see that ArrayList is faster
```
```
CSArrayList: append = 29.8ms, get = 115.3ms
CSArrayList: append = 68.2ms, get = 92.3ms
CSArrayList: append = 31.8ms, get = 109.1ms
CSArrayList: append = 29.6ms, get = 83.5ms
CSArrayList: append = 11.4ms, get = 76.1ms
CSArrayList: append = 38.4ms, get = 85.0ms
CSArrayList: append = 34.8ms, get = 82.7ms
CSArrayList: append = 12.7ms, get = 117.5ms
CSArrayList: append = 13.0ms, get = 93.2ms
CSArrayList: append = 61.8ms, get = 85.6ms
CSArrayList Averages: append = 33.2ms, get = 33.2ms

ArrayList: append = 34.0ms, get = 101.0ms
ArrayList: append = 63.9ms, get = 98.8ms
ArrayList: append = 34.4ms, get = 82.0ms
ArrayList: append = 31.4ms, get = 87.4ms
ArrayList: append = 102.6ms, get = 78.4ms
ArrayList: append = 17.2ms, get = 86.4ms
ArrayList: append = 38.6ms, get = 73.8ms
ArrayList: append = 14.4ms, get = 94.5ms
ArrayList: append = 14.5ms, get = 76.4ms
ArrayList: append = 43.2ms, get = 87.2ms
ArrayList Averages: append = 39.4ms, get = 39.4ms`

Here we see that CSArrayList is faster
```
* I am guessing it because of that random thing in my loop. So by adding something that shows the
  highest and lowest time they had and compare, I think we would have a better idea.
```
CSArrayList: append = 32.9ms, get = 107.0ms
CSArrayList: append = 66.0ms, get = 96.5ms
CSArrayList: append = 28.4ms, get = 96.9ms
CSArrayList: append = 30.6ms, get = 69.4ms
CSArrayList: append = 39.6ms, get = 80.6ms
CSArrayList: append = 12.7ms, get = 87.1ms
CSArrayList: append = 73.0ms, get = 108.7ms
CSArrayList: append = 14.0ms, get = 76.5ms
CSArrayList: append = 14.0ms, get = 77.6ms
CSArrayList: append = 66.3ms, get = 61.6ms
CSArrayList Highest: append = 73.0ms, get = 107.0ms
CSArrayList Lowest: append = 12.7ms, get = 61.6ms
CSArrayList Averages: append = 37.8ms, get = 37.8ms

ArrayList: append = 23.4ms, get = 96.0ms
ArrayList: append = 80.7ms, get = 88.2ms
ArrayList: append = 12.8ms, get = 96.8ms
ArrayList: append = 12.7ms, get = 81.4ms
ArrayList: append = 46.1ms, get = 64.8ms
ArrayList: append = 54.3ms, get = 70.6ms
ArrayList: append = 26.9ms, get = 68.5ms
ArrayList: append = 11.2ms, get = 77.8ms
ArrayList: append = 11.2ms, get = 68.6ms
ArrayList: append = 67.8ms, get = 75.4ms
ArrayList Highest: append = 80.7ms, get = 96.0ms
ArrayList lowest: append = 11.2ms, get = 75.4ms
ArrayList Averages: append = 34.7ms, get = 34.7ms
```
* I think it is pretty close, but that overall, ArrayList does perform better
# Design Decisions and pitfalls
* Learning how to do the JUnit tests was fun, and I like how they kinda worked the same as the Rust
  tests. I also now have a better understanding of Maven.
* One thing I just couldn't figure out what the fail-fast iterators. I tried doing some googling
  but I just could not implement it, even though I understand the concept.
* One thing I wish I changed was how I did the `addAll(int index, Collection<? extends E> c)`
  function. I feel like I could have implemented it so that it was just `O(n)` by moving everything
  after `index` over the size of `c` to the right, but I was so stubborn that I didn't want to use
  logic other than the one implemented in the `add(E anEntry)` function.
