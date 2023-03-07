#include<iostream>
#include<vector>
using namespace std;

void getSubset(int arr[] , int index, int sum, vector<int>& list, vector<vector<int>> & ans){

    if(sum == 0) {
        ans.push_back(list);
        return;
    }

    if(index == 0){
        if(sum - arr[0] == 0){
            list.push_back(arr[0]);
            ans.push_back(list);
        }
        return;
    }

    if(arr[index] <= sum){
        list.push_back(arr[index]);
        getSubset(arr, index - 1, sum - arr[index], list, ans);
        list.pop_back();
    }

    getSubset(arr, index - 1, sum, list, ans);
}
int main(){

    int arr [] = {1,3,5,7};
    int sum = 10;
    vector<int> v;
    vector<vector<int>> ans;

    getSubset(arr, 3, sum, v, ans);

    for(auto list : ans){
        for(auto val : list) cout << val << " ";
        cout << endl;
    }

    return 0;
}