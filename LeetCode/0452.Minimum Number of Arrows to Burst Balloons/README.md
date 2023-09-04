 ### Approach ###
### Greedy Algorithm ###
This problem is a variation of **Activity Selection Problem** where main approach is to find out the 
**non overlapping intervals**.<br/>
We pick the first element in the array and then iterate through other elements.
Whenever current elements start is greater than previous end,we add the counter and make current element's
end as end.

Finally we return the counter.






