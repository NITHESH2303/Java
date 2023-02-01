#include <iostream>
#include <fstream>
#include <vector>
#include <string.h>

using namespace std;

int canCompleteCircuit(int gas[],int cost[]){
        int N = sizeof(gas)/sizeof(gas[0]); 
        vector<int> diff(N, 0);
        for (int i = 0; i < N; i++) {
            diff[i] = gas[i] - cost[i];
        }
        
        int i = 0;
        int j;
        int k;
        int S;
        while (i < N) {
            if (diff[i] < 0) {
                i += 1;
                continue;
            }
            S = diff[i];
            k = 1; 
            while (k < N) {
                j = (i + k) % N;
                if (S + diff[j] >= 0) { 
                    k += 1;
                    S += diff[j];
                } else {
                    break;
                }
            }
            if (k == N) { 
                return i;
            } else {
                i += k;
            }
        }
        return -1;
    }


int main(){
 int gas[100];
    for (int i = 0; i < 2; i++) {
        cin >> gas[i];
    }
    int cost[100];
    for (int i = 0; i < 2; i++) {
        cin >> cost[i];
    }
    
    cout<<canCompleteCircuit (gas,cost);
}

   
