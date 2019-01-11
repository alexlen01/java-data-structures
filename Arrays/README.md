## Arrays

Conceptually, an array maps integers in the range [0, <em>n-1</em>] to objects of a given type, where <em>n</em> is the number of objects in this array. Array lookup and insertion are fast, making arrays suitable for a variety of applications.

<h4>Problem</h4>

Given an array <em>A</em> whose elements are comparable, and an index <em>i</em>, reorder the elements of <em>A</em> so that the initial elements are less than <em>A[i]</em>, and are followed by elements equal to <em>A[i]</em>, which in turn are followed by elements greater than <em>A[i]</em>, using <em>O(1)</em> space.