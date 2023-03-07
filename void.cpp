#include<iostream>
using namespace std;

class Void {
    int a, b;
    public:
    void hello(int & a, int & b){

        a++; b++;
    }

    
};

int main(){

    Void v;
    int a = 0, b = 0;
    v.hello(a, b);
    cout << a << " " << b;

    return 0;
}

