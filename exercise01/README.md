# Assignment

We are developing a terminal calculator. This calculator receive orders from a terminal console and replies with the result to each command.

Here an example of interaction:

```
> init
ready!
> do 2 plus 2
4
> do 2 div 4
0.5
> exit
bye bye!
```

## Start the calculator and exit it

Before start using the operations, we need to initialize the calculator with the command <code>init</code> which will response <code>ready!</code>.

In order to close the calculator, we will use the command <code>exit</code> which will response <code>bye bye!</code>.

```
> init
ready!
> do exit
bye bye!
```

## Operations

All operations will start with the keyword <code>do</code> followed for the operations.

The operations can accept float numbers. E.g. <code>123.456</code>, <code>12.34</code>, <code>23</code>, <code>54</code>.

If the command <code>init</code> has not been used before using the command, it will return the text <code>need to init!</code>.

In the following examples, we will use the letters <code>A</code>, <code>B</code>, <code>C</code> to represent numbers.

### Operations: Sum

In order to sum two numbers, we will use the following command:

```
> do A plus B
```

E.g.

```
> init
ready!
> do 2 plus 3
5
```

```
> do 2 plus 3
need to init!
```

### Operations: Div

In order to div two numbers, we will use the following command:

```
> do A div B
```

E.g.

```
> init
ready!
> do 4 div 2
2
```

```
> do 4 div 2
need to init!
```

### Operations: Sen

In order to do the sen of a degree number, we will use the following command:

```
> do sin A
```

E.g.

```
> init
ready!
> do sin 90
1
```

```
> do sin 90
need to init!
```

## Operations can be combined

The operations can be combined. To avoid complications, the operations have priority from left to right.

E.g.

```
> init
ready!
> do 2 plus 2 div 4
1
> do 2 plus 2 plus 2
6
> do sin 90 plus 5 div 2
3
> do 2 plus sin 90
3
```

# Where to start

Open [Android Studio](https://developer.android.com/sdk/index.html) and the project <code>assignmentTodo</code>. You will find two files:

- <code>test/java/com.example.AssignmentTest</code> which contains a set of test with examples to test the calculator main point.
- <code>main/java/com.example.Assignment</code> a main class that contains a method <code>execComm</code> where all commands, as text, will be passed.
- <code>main/java/com.example.Assignment</code> a main class that contains a method <code>runCommand</code> where all commands, as text, will be passed. ***THIS IS YOUR START POINT!***

### Be quick, run the tests

Everything has been set up for you to focus on the problem. We offer you some test cases that may cover most of the problems.

Though, you can modify or improve them if you need to. In that case, explain your decisions to your interviewer.

If the application does not contain already a JUNIT configuration, set it up or ask your interviewer to help you out.