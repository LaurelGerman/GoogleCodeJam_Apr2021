# Google Code Jam to I/O for Women 
April 17, 2021

My solutions (in Java SDK 11) to Google Code Jam for Women 2021.
You can view the competition here: https://codingcompetitions.withgoogle.com/codejamio

*Please be kind; this is a work in progress!*

Problems briefs listed below. Complete problems, including sample input and expected results, are in their respective folders in this repo. Each problem brief below notes which tests my solution currently passes.

### Problem 1: Impartial Offerings
**_Solution currently passes sample tests_**

Aroha is a big animal lover, so she spends some free time taking care of many of her loved ones' pets. She likes to offer them treats, but wants to do that in an impartial way.

Aroha decided that it was logical for pets of the same size to get the same amount of treats and for larger pets to get strictly more treats than smaller ones. For example, if she has 4 pets with her of sizes 10,20,10, and 25, she could offer 2 treats to each pet of size 10, 3 treats to the pet of size 20, and 5 treats to the pet of size 25. This requires her to buy a total of 2+3+2+5=12 treats. However, she can offer treats to all 4 pets and comply with her own rules with a total of just 7 treats by offering 1 each to the pets of size 10, 2 to the pet of size 20, and 3 to the pet of size 25.

Help Aroha plan her next pet day. Given the sizes of all pets that will accompany her, compute the minimum number of treats she needs to buy to be able to offer at least one treat to all pets while complying with her impartiality rules.


### Problem 2: Inconsistent Ordering
**_Solution currently passes sample tests and Test Set 1_**

We want to build a string with English alphabet uppercase letters in sorted order. However, we want the order to be sometimes strictly increasing and sometimes strictly decreasing.

The first letter of the string must be A. After that, the string must contain one or more blocks of letters. The i-th block must contain exactly Li letters. Each letter in the i-th block must be later in the alphabet than its preceding letter in the string if i is odd and earlier in the alphabet than its preceding letter if i is even. Notice that for the first letter of a block, its preceding letter exists, even though it is not in the block. Strings that follow all of these rules are called valid. There can be multiple valid strings, and we want to find the alphabetically first one.

For example, if there are 2 blocks of sizes L1=2 and L2=3, the string must have exactly 1+L1+L2=1+2+3=6 letters (the 1 is for the initial A). The strings XYZYBA, AZYCBA and AYZYBB are not valid for this case because they violate the required starting letter condition, and the ordering conditions in the first and second block, respectively. The string AYZYBA is valid. The string ABDCBA is also valid and, moreover, it is the alphabetically first valid string.

Given the sizes of the blocks, output the valid string that comes first in alphabetical order in the list of all valid strings. It can be shown that, for all inputs within the given limits, at least one valid string exists.


### Problem 3: Introductions Organization
**_Not attempted yet. Stay tuned!_**

After Apricot Rules LLC went through a reorganization, a new large team was formed containing M managers and N non-managers. Since many people within the team do not know each other, a number of introduction sessions are to be scheduled. We know exactly which pairs of members already know each other.

The introduction sessions are organized into time slots that take 1 minute. The first time slot starts at 8:00 AM and ends at 8:01 AM. The i-th time slot starts i−1 minutes after 8:00 AM and ends i minutes after 8:00 AM. During each time slot, there can be one or more introduction sessions. A team member can be assigned to at most one introduction session per time slot. Each introduction session must have exactly three members: an assigned manager a who must be a manager and two others b and c who can be managers or non-managers. The assigned manager a must already know b and c for the session to be scheduled. After the introduction session, b and c are considered to know each other too. If b and/or c are managers, either of them can be the assigned manager of a future introduction session that includes both.

For some pairs of people in the team, we want to know the shortest time that is needed for them to finally know each other, or whether it is impossible for that to happen through the described process. If two people know each other before any introduction sessions happen, we define that shortest time to be 0 minutes.

Even though we are interested in multiple pairs of people, we are considering the situations independently. That is, the minimum time for each pair can depend on a specific organization of the introduction that is particular to that pair only.


### Problem 4: Irrefutable Outcome
**_Not attempted yet. Stay tuned!_**

Izabella and Olga are playing a game alternating turns. Izabella plays first. The game starts with all game pieces arranged in a single row. The pieces come in two colors: indigo and orange. During Izabella's turns, she must choose and remove an indigo piece that is either the leftmost or rightmost piece remaining. During Olga's turns, she must choose and remove an orange piece that is either the leftmost or rightmost piece remaining. If at any point one of the players does not have a legal move (possibly because there are no pieces remaining), that player loses the game, and the other player is awarded 1 point plus 1 additional point for each piece that remains on the board.

We use an uppercase letter I to represent indigo pieces and an uppercase letter O to represent orange pieces. Suppose, for example, that they play with the following starting board: IOIOOOII.

On her first turn, Izabella can choose to remove either the leftmost or rightmost pieces, as both are indigo. Suppose she chooses the leftmost. Then, the board would become OIOOOII. Then, Olga would have no choice but to remove the new leftmost piece, as the rightmost piece is not orange, leaving IOOOII. Izabella can choose again, and this time she chooses the rightmost piece, leaving IOOOI for Olga's turn. At this point, Olga has no valid move, so Izabella won. Since there are 5 pieces remaining, Izabella wins 1+5=6 points in total.

Each player plays optimally trying to win and to maximize their own score. A player that cannot guarantee a win plays to minimize the opponent's score.

Given the starting board, can you find out who wins and what is their score?
