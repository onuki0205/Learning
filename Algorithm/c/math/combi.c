#include <stdio.h>

int combi(int, int); // calculate nCr fanction
int factorial(int); // calculate n! fanction

int main(){
  int n,r;
  int ans;  // value of calculated nCr

  printf("Calculate Combination fanction\n");
  printf("Input value of \"n\" and \"r\"\n");

  printf("n : ");
  scanf("%d",&n);
  printf("r : ");
  scanf("%d",&r);

  ans = combi(n, r);

  printf("%dC%d = %d\n", n, r, ans);

  return 0;
}

int combi(int n, int r){
  int nk, rk, nrk; //nk : n!, rk : r!, nrk : (n-r)!
  nk = factorial(n);
  rk = factorial(r);
  nrk = factorial(n-r);
  return nk / (rk * nrk);
}

int factorial(int a){
  int num = 1;
  for(int i = 1; i <= a; i++) num *= i;
  return num;
}
