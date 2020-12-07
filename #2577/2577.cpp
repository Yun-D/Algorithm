#include <iostream>
using namespace std;
/*
1. abc를 곱한 값에 0~9가 몇 번 쓰였는지 출력
2. 몇 번 쓰였는지 '누적'되어야 함!!
*/

int main(){
    int a, b, c;
    int result=0;
    int num[10] = {0}; //0~9의 개수를 담을 배열을 0으로 초기화
    
    cin >> a;
    cin >> b;
    cin >> c;
    if (a<100 || b<100 || c<100 || a>1000 || b>1000 || c>1000) //조건 정리
        return -1;
    
    result = a*b*c;
    
    while(result != 0){
        //num[i] = result % 10; 는 누적이 안되므로 저 계산식을 안으로 넣자!
        num[result%10] += 1; //누적!
        result = result / 10;
    }
    
    for(int i=0; i<=9; i++)
        cout << num[i] <<endl;
    
    return 0;
}