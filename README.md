# TASK A

Johnny rides a bicycle. He starts riding on a sea level.
Every 100 meters, he logs elevation to his journal.
Letter (u) represents, that he is doing up, and letter (d) means he is going to the opposite direction.

Given input `path`, calculate number of valleys he has gone through.

Finish `code(path: String): Int` function to pass test cases.

#### Input

`path = "duuddduuuddduduu"`

#### Output

`3`

#### Explanation

Let's say _ represents sea level. / represents step up (letter 'u') and \ represents letter 'd'.

The path can be represented like this:

~~~~
_  /\    /\      _
 \/  \  /  \    /
      \/    \/\/
~~~~

He enters and leaves 3 valleys.
