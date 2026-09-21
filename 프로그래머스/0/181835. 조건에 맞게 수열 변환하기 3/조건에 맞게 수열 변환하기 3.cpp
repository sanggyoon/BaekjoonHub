#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int k) {
    vector<int> answer(arr.size());
    for (int i=0; i<arr.size(); i++) {
        if (k % 2 == 1){
            answer[i] = arr[i] * k;
        } else if (k % 2 == 0){
            answer[i] = arr[i] + k;
        }
    }
    return answer;
}