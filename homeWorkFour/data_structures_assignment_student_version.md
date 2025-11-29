# Programming Assignment: Real-World Data Structures

## 1. Overview

In this assignment you will implement and demonstrate a **real-world use** of one of these data structures:

- **Linked list**
- **Stack**
- **Queue**

---

## 2. Files You Will Use

You will be given starter code that includes the data structure implementations and simple driver files.

### Linked list

- `CSLinkedList.java`
- `CSLinkedListDriver.java`

### Stack

- `ListStack.java`
- `StackInt.java`
- `ListStackDriver.java`

### Queue

- `ArrayQueue.java`
- `ArrayQueueDriver.java`

**Do not change:**

- Class names
- Existing public method names or parameters

**You may:**

- Add small helper methods to:
  - `CSLinkedList`
  - `ListStack`
  - `ArrayQueue`
- Add as many helper methods as you want to the driver files:
  - `CSLinkedListDriver`
  - `ListStackDriver`
  - `ArrayQueueDriver`

---

## 3. What You Need to Submit

### A. Code

Submit either:

- A **GitHub repository**

Your submission must include:

- All `.java` files you modified:
  - Your driver file (`CSLinkedListDriver`, `ListStackDriver`, or `ArrayQueueDriver`)
  - Any helper methods you added to the data structure class

> Tip: Make it easy to run your code. In `main`, clearly call the method for **your** task  
> (for example, `runLL3_CourseWaitlist();`).

---

### B. One-Page Write-Up for the exercises you sign up to present

A 1-page document (**PDF or DOCX**) that includes:

1. **Scenario description**
   - In your own words: what real-world thing are you modeling?
2. **Why this data structure?**
   - Why is a linked list / stack / queue a good fit here?
   - What would be annoying or harder with a plain array?
3. **Small hand-traced example**
   - Choose a short sequence of operations.
   - Show the contents of the data structure **after each step**.
   - You can draw boxes/arrows or just write lists like `[A, B, C]`.

---

### C. 3–5 Minute Presentation

In class, you will briefly present:

1. **Your scenario**  
2. **Your data structure choice** (and why it makes sense)  
3. **A small example**, step-by-step  
4. **A sentence or two about efficiency**  
   - Example: “Adding at the front of a linked list is O(1), so it’s fast even if the list is long.”

You do **not** need fancy slides; a simple set of slides or the whiteboard is fine.

Use this outline:

1. **Title slide** (or title on the board)
   - Example: `S3 – Balanced Parentheses with a Stack`
2. **Scenario**
3. **Why this data structure?**
4. **Step-by-step example**
5. **Very short Big-O comment**

---

## 4. How to Run Your Code (View RUN_INSTRUCTIONS.md)

---

## 5. Task List

### Part A – Linked List Tasks (LL1–LL10)

Use **`CSLinkedList<E>`** and **`CSLinkedListDriver.java`**.

---

#### LL1 – Music Playlist Manager

- **Scenario:** Maintain an ordered list of songs in a playlist.
- **What to implement:**
  - Create a `CSLinkedList<String> playlist`.
  - Add several songs to the end of the list.
  - Insert a new song at index 0 (top of playlist).
  - Remove a song from the middle.
  - Print the playlist after each change.
- **Key idea:** Linked lists make inserting/removing in the middle or front easier than arrays.

---

#### LL2 – To-Do List with Priorities

- **Scenario:** You keep a list of tasks; **urgent** tasks go to the front.
- **What to implement:**
  - `CSLinkedList<String> todo`.
  - Add regular tasks to the end.
  - Insert urgent tasks at index 0.
  - Remove completed tasks by index.
- **Key idea:** Compare inserting at the front in a linked list vs an array.

---

#### LL3 – Course Waitlist (No Duplicates)

- **Scenario:** Students join a waitlist, but duplicates are not allowed.
- **What to implement:**
  - Add a method in `CSLinkedList`:
    ```java
    public boolean addIfAbsent(E item){}
    ```
  - Only add an item if it is not already in the list.
  - In the driver, show adding names (with some duplicates) and print the final waitlist.
- **Key idea:** Traversing the list to check for duplicates.

---

#### LL4 – Text Editor Line Manager

- **Scenario:** A simple text editor stores lines of code in order.
- **What to implement:**
  - `CSLinkedList<String> lines` representing each line.
  - Insert a new line in the middle (like pressing Enter).
  - Delete a line (like Delete/Backspace).
  - Print lines with line numbers before and after changes.
- **Key idea:** Insert / delete in the middle of a sequence.

---

#### LL5 – Recently Contacted Friends (Move to Front)

- **Scenario:** When you message a friend, they move to the top of the “recently contacted” list.
- **What to implement:**
  - Add a method to `CSLinkedList`:
    ```java
    public void moveToFront(E item){}
    ```
  - If the item exists, remove it and add it at index 0.
  - Demonstrate with several names.
- **Key idea:** Move an existing item to the front efficiently.

---

#### LL6 – Shopping List: Insert After Item

- **Scenario:** If you buy X, you also want to buy Y right after.
- **What to implement:**
  - Add to `CSLinkedList`:
    ```java
    public boolean addAfter(E target, E newItem){}
    ```
  - Insert `newItem` after the first occurrence of `target`.
  - Demonstrate, e.g., inserting "Sugar" after "Coffee".
- **Key idea:** Insert directly *after* a specific item.

---

#### LL7 – Bus Route Stops

- **Scenario:** A bus route is a sequence of stops that sometimes changes.
- **What to implement:**
  - Use `CSLinkedList<String>` for stops.
  - Add a new stop in the middle.
  - Remove a stop that is closed.
  - Print the route before and after.
- **Key idea:** Modify a sequence in the middle easily.

---

#### LL8 – Event Schedule (Insert by Time)

- **Scenario:** You manage scheduled events in time order.
- **What to implement:**
  - Add to `CSLinkedList`:
    ```java
    public void addInOrder(E item, Comparator<E> cmp){}
    ```
  - Insert events like `"09:00 Breakfast"` so the list stays sorted.
- **Key idea:** Keep a linked list **sorted** as you insert.

---

#### LL9 – Bug Tracker List (Remove by ID)

- **Scenario:** You have a list of bug IDs; when a bug is fixed, remove it.
- **What to implement:**
  - Add to `CSLinkedList`:
    ```java
    public boolean removeFirstOccurrence(E item){}
    ```
  - Demonstrate removing a specific ID when there may be duplicates.
- **Key idea:** Find and remove only the **first** match.

---

#### LL10 – Playlist Shuffle Copy

- **Scenario:** Create a separate shuffled copy of a playlist.
- **What to implement:**
  - Add to `CSLinkedList`:
    ```java
    public CSLinkedList<E> copy(){}
    ```
  - Copy the playlist, then change the copy (e.g., swap some elements).
  - Show that the original list does **not** change.
- **Key idea:** Copy a data structure and modify the copy independently.

---

### Part B – Stack Tasks (S1–S9)

Use **`ListStack<E>`**, `StackInt`, and **`ListStackDriver.java`**.

---

#### S1 – Browser Back Button

- **Scenario:** Simulate the browser’s **Back** button.
- **What to implement:**
  - Use a `ListStack<String>` of page URLs.
  - Push pages as you visit them.
  - Pop when you press “Back”.
  - Show the current page and history.
- **Key idea:** Last page visited is the first one you go back from (**LIFO**).

---

#### S2 – Undo in a Text Editor

- **Scenario:** Implement a simple **undo** feature.
- **What to implement:**
  - Use `ListStack<String>` to store document text versions.
  - Before/after each change, push the old state.
  - Pop to undo one or more changes.
- **Key idea:** Most recent change is undone first.

---

#### S3 – Checking Balanced Parentheses

- **Scenario:** Check if an expression has balanced parentheses.
- **What to implement:**
  - Use `ListStack<Character>`.
  - Push `'('` and pop for `')'`.
  - Print whether each test string is balanced or not.
- **Key idea:** Use the stack to match pairs of parentheses.

---

#### S4 – Reversing a Word

- **Scenario:** Reverse a word or string with a stack.
- **What to implement:**
  - Use `ListStack<Character>`.
  - Push all characters of a word.
  - Pop to build the reversed word.
- **Key idea:** LIFO = natural reversing.

---

#### S5 – Directory Navigation

- **Scenario:** Simulate `cd` and `cd ..` in a command line.
- **What to implement:**
  - Use `ListStack<String>` for folder names.
  - `cd folder` → push folder.
  - `cd ..` → pop.
- **Key idea:** Stacks model **nested folders**.

---

#### S6 – Calculator History

- **Scenario:** Track a history of calculator operations.
- **What to implement:**
  - Use `ListStack<String>` for operations (e.g., `"5 + 3 = 8"`).
  - Push each operation.
  - Pop to undo the last operation.
- **Key idea:** Undo the most recent calculation.

---

#### S7 – Palindrome Checker

- **Scenario:** Check if a word is a palindrome.
- **What to implement:**
  - Use `ListStack<Character>`.
  - Push characters, then pop and compare to original.
- **Key idea:** Compare the string to its reversed version.

---

#### S8 – Function Call Stack Simulator

- **Scenario:** Simulate a simple function call stack.
- **What to implement:**
  - Use `ListStack<String>` for function names.
  - Push on “call”, pop on “return”.
- **Key idea:** How real languages keep track of function calls.

---

#### S9 – Stack of Plates (Capacity-Limited Stack)

- **Scenario:** A stack of plates has a maximum height.
- **What to implement:**
  - Give the stack a simple “capacity”.
  - Don’t allow pushes if size == capacity; print a message instead.
- **Key idea:** Real stacks have **limits** (like memory / stack overflow).

---

### Part C – Queue Tasks (Q1–Q9)

Use **`ArrayQueue<E>`** and **`ArrayQueueDriver.java`**.

---

#### Q1 – Print Queue

- **Scenario:** Documents sent to a printer in order.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue several documents.
  - Dequeue to “print” them.
- **Key idea:** First document sent is printed first (**FIFO**).

---

#### Q2 – Call Center Queue

- **Scenario:** Calls answered in the order they arrive.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue caller names.
  - Dequeue as calls are answered.
- **Key idea:** A queue matches real call center behavior.

---

#### Q3 – Theme Park Ride Line

- **Scenario:** People line up for a ride.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue riders.
  - Dequeue them as they board.
- **Key idea:** People who wait the longest go first.

---

#### Q4 – Customer Service Tickets

- **Scenario:** Support tickets handled in order received.
- **What to implement:**
  - Use `ArrayQueue<Integer>` (ticket numbers).
  - Enqueue ticket IDs.
  - Dequeue to “handle” them.
- **Key idea:** FIFO ticket handling.

---

#### Q5 – Task Scheduling Queue

- **Scenario:** A CPU processes tasks one at a time in order.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue tasks.
  - Dequeue them to “run” them.
- **Key idea:** Simple queue-based scheduling.

---

#### Q6 – Checkout Line at a Store

- **Scenario:** Customers line up to pay.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue customers as they arrive.
  - Dequeue as they check out.
- **Key idea:** Real-life line behavior modeled by a queue.

---

#### Q7 – Message Queue in a Chat App

- **Scenario:** Chat messages are queued before delivery.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue messages in the order they are sent.
  - Dequeue as they are delivered.
- **Key idea:** Messages delivered in the **same order** they were sent.

---

#### Q8 – Print Spooling with Burst of Jobs

- **Scenario:** A burst of print jobs arrives.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Enqueue a bunch of jobs at once.
  - Dequeue them to simulate printing.
- **Key idea:** Queue grows and then shrinks during a burst.

---

#### Q9 – Round-Robin Service (Single Queue)

- **Scenario:** Cycle through people, giving each a turn.
- **What to implement:**
  - Use `ArrayQueue<String>`.
  - Dequeue a person, “serve” them, and enqueue them again if they still need service.
  - Stop after a fixed number of rounds.
- **Key idea:** **Fair sharing** using a rotating queue.

---

Good luck! Focus on:

- Using the correct data structure,
- Making the behavior **easy to see** from your printed output,
- And being able to **explain** your choices in simple terms in your comments.
