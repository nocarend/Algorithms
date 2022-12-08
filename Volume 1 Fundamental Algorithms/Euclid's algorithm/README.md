::: flushleft
**Algorithm E** (*Euclid's Algorithm*). Given two positive integers *m*
and *n*, find their *greatest common divisor*, that is, the largest
positive integer that evenly both *m* and *n*.

**E0.** \[Ensure $\textit{m}\geq\textit{n}$.\] If
$\textit{m}<\textit{n}$, exchange $\textit{m}\Leftrightarrow\textit{n}$.

**E1.** \[Find remainder.\] Divide *m* by *n* and let *r* be the
remainder. (We will have $0\leq\textit{r}<\textit{n}$.)

**E2.** \[Is it zero?\] If $\textit{r}=0$, the algorithm terminates; *n*
is the answer.

**E3.** \[Reduce.\] Set $\textit{m}\gets\textit{n}$,
$\textit{n}\gets\textit{r}$, and go back to step **E1**.
:::
