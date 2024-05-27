
- algo : quick-find
init | union | connected
N N 1

slow

- QIUCK UNION
faster but too slow
algo : quick-union 
init | union | connected
N N N

trees can get too tall, the final operations can get too expensive

- WEIGHTED QU
solution : quick-union weighted quick union
smaller tree goes below

implementation:
find : identical as quick union


## analysis WEIGHTED QU: 
if there's a 1000 : 10
million : 20
billion : 30

- performance :
[algo-ds-solution-weighted]
algo : weighted QU
init | union | connected
N lgN lgN

is easy to improved?

## improvement 2:
quick union with path compression.
[path-compression-improvement2]

implementation
[implementation-path-compression]


## DEMO:
smaller tree goes below, 
when there is only two,
union(4,3) -> they get linked without importance of order, but

union(3,8)
8 goes as a child, because 3 is in a bigger tree

equals size trees, the root get unified, (doesnt matter which goes down which goes below)

trees of sizes, a tree that have 6 nodes, and another have 4, the smaller goes always belows !
[weighted-quick-union-demo]


image-processing, percolation
[applications-union-find]
percolation: social-network


[understanding-percolation]
from top to bottom to flow

- PERCOLATION TRANSITION
p > p* percolates
p < p*

only solution is in computation, those simulation uses union find algorithm
[understanding-percolation]

[solution-percolation]

to avoid: brute force
[brute-force-to-avoid]
[SRC]:
https://www.coursera.org/learn/algorithms-part1/lecture/OLXM8/union-find-applications


QUIZZ:
When opening one new site in the percolation simulation, how many times is 
𝑢
𝑛
𝑖
𝑜
𝑛
(
)
union() called?

It is called for each neighboring site that is already open. There are 4 possible neighbors, but some of them may not already be open.

