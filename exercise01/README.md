# Assignment

We are developing a terminal calculator. This calculator receive orders from a terminal console and replies with the result to each command.

## Start the calculator and exit it

### Init

Before start using the operations, we need to initialize the calculator with the command:

```
> init
ready!
```

Which will return ***ready!*** as response.

### Exit

In order to close the calculator, we will use the following command:

```
> do exit
bye bye!
```

Which will return ***bye bye!*** as response.

## Operations

All operations will start with the keyword <code>do</code> followed for the operations.

The operations can accept float numbers. E.g. *123.456*, *12.34*, *23*, *54*.

If the command ***init*** has not been used before using the command, it will return the text ***need to init***.

In the following examples, we will use the letters *A*, *B*, *C* to represent numbers.

### Operations: Sum

In order to sum two numbers, we will use the following command:

```
> do A + B
```

E.g.

```
> init
ready!
> do 2 + 3
5
```

E.g.

```
> do 2 + 3
need to init
```

### Operations: Div

In order to div two numbers, we will use the following command:

```
> do A / B
```

E.g.

```
> init
ready!
> do 4 / 2
2
```

```
> do 4 / 2
need to init
```

# How to run the exercise

Open *Android Studio* and the project ***assignmentTodo***. You will find two files:

- test/java/com.example.AssignmentTest which contains a set of test with examples to test the calculator main point.
- main/java/com.example.Assignment a main class that contains a method ***runCommand*** where all commands, as text, will be passed.

### The runCommand method

The runCommand method on the class Assignment is the main point of the console. It will receive all command as text. One command per line. After processing the command, it will return the result as string.