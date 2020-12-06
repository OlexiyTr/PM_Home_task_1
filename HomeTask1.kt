package com.example.exework

fun main(){
    println("1st way")
    for(i in 0..100){
        if (i%3 == 0){
            println("Piff")
        }
        if(i%5 == 0){
            println("Paff")
        }
    }
    println("2st way")
    var x = 0
    while(x < 100){
        if (x%3 == 0){
            println("Piff")
        }
        if(x%5 == 0){
            println("Paff")
        }
        x++
    }
    println("3d way")
    var y = 0
    do {
        if (y%3 == 0){
            println("Piff")
        }
        if(y%5 == 0){
            println("Paff")
        }
        y++
    } while (y != 100)
    
}