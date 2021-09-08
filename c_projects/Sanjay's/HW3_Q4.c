/*
Written by Sanjay Dhakal
ID 1001690069
Written on 03/01/2021
Written for MAE 2360-002

This code generates 20 random numbers for the value of a and b
*/
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    srand(time(NULL));
    int a;
    int b;
    int x;
    printf("Please enter a: ");
    scanf("%d", &a);
    printf("Please enter b: ");
    scanf("%d", &b);

    for (int i = 0; i <= 20; i++)
    {

        x = (rand() %
             (b - a + 1)) +
            a;

        //    x = 100.0*(rand()/10000)/100000;
        //    x = (i%3);
        //    std::cout<<"cycle: "<< i << "\t random number: " << x  << std:: endl;
        printf("%d ", x);
    }
    return 0;
}