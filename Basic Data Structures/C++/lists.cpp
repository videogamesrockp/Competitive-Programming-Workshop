#include <bits/stdc++.h>
using namespace std;

int main() {
    vector<int> v;

    for (int i = 0; i < 5; i++) {
        v.push_back(i); // Insert to the back of an array
    }
    
    for (auto it = v.begin(); it != v.end(); it++) { // Here we declare it as an iterator
	    cout << *it << "\n";  // We can use iterators to loop through values in a vector
    }

    /*
    We can use iterators to iterate through a vector
    v.begin() returns an iterator to the start of an array
    v.end() returns an iterator at the end of the array
    */

    v.erase(v.begin()); // We also use iterators to erase elements from a vector

    for (int element : v) {
	    cout << element << "\n";  // Or we can use a for-each loop, like in Java
    }

    pair<int, int> p = make_pair(5, 6);
    p.first ++;
    cout << p.first << " " << p.second;
}