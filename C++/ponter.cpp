#include <iostream>
using namespace std;

void nomal(int i){
    i=42;
}

void chang(int* p){
    *p=42;
}

int main(){
    int i=0;
    nomal(i);
    cout << i << endl;

    chang(&i);
    cout << i << endl;
    return 0;
}