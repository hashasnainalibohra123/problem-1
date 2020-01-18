#include<bits/stdc++.h>


using namespace std;

int getNoOfDigits(long long int n) {
    int p = 1;
    while(n/10) {
        n = n/10;
        p*=10;
    }
    return p;
}
char arr[26] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
};
vector<string> getAllHashValues(long long int n, vector<string> solution, long long int pos, string current) {

    if (pos == 0) {
        solution.push_back(current);
        return solution;
    }
    int c = n/pos;
    if (c == 1 && pos > 1) {
        solution = getAllHashValues(n%pos,solution,pos/10, current + arr[0]);
        int t = c*10 + (n%pos)/(pos/10);
        solution = getAllHashValues(n%(pos/10),solution,pos/100, current + arr[t - 1]);
    }
    else if (c == 2 && pos > 1) {
       solution = getAllHashValues(n%pos,solution,pos/10, current + arr[ c-1]);
       if (n/(pos/10) < 7) {
        int t = c*10 + (n%pos)/(pos/10);
        solution = getAllHashValues(n%(pos/10),solution,pos/100, current + arr[t - 1]);
       }
    }
    else {
             solution = getAllHashValues(n%pos,solution,pos/10, current + arr[ c-1]);
     }
    return solution;
}


int main() {

    long long int n;
    cin>>n;
    long long int pos = getNoOfDigits(n);
    vector<string> solution;
     solution = getAllHashValues(n,solution,pos, "");

     for (int i = 0;i < solution.size() ; i++) {
        cout<<solution[i] <<", "<<endl;
     }
     return 0;
}



//Test cases 1, 1000, 100001