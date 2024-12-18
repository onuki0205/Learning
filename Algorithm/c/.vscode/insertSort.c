#include <stdio.h>

int main(){
    int n;
    int a[100];

    printf("数列の要素数　：　");
    scanf("%d\n",&n);
    print("%d個の要素を入力\n",n)
    for(int i=0;i<n;i++)scanf("%d",&a[i]);

    printf("\n初期値\n");
    prot(a,n);
    insertSort(a,n);
    printf("\n最終値\n");
    prot(a,n);

    return 0;
}

void insertSort(int a[],int n){
    int v,j;
    for(int i=1;i<n;i++){
        v=a[i];
        j=i-1;
        while(j >= 0 && a[j] > v){
            a[j+1]=a[j];
            j--;
        }
        a[j+1] = v;
        prot(a,n);
    }
}

void prot(int a[], int n){
    for(int i=0;i<n;i++){
        printf("%d",a[i]);
        if(i!=n-1)printf(" ");
    }
    printf("\n");
}