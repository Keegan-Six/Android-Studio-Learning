package org.kotlinlang.play
// Learning Kotlin
// https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-1?_gl=1*1fxchf9*_up*MQ..&gclid=CjwKCAiAxKy5BhBbEiwAYiW--zdqn4g_fMVcJJbzg7TzZF0nCA4TOEqa1Viz_bhG0ahIujR1QhMMaRoCs5AQAvD_BwE&gclsrc=aw.ds#codelab-https://developer.android.com/codelabs/basic-android-kotlin-compose-variables
// Function that takes  2 INT inputs and returns the sum (INT)
fun sum(x: Int, y: Int) :Int {
    return x + y;
}

fun main() {
    // declaring variables
    // use val for variables that won't change
    // use var for variables that will change
    // val (name) (data type) (value)
    val count: Int = 2;
    // can also use
    val month = "October";
    val calls = 3;
    // var (name) (data type) (value)
    var day = "Monday";
    var time = "1:06 PM";
    var date = 12;

    // using variables
    println("Hello, it is $day, $month $date, $time.");
    println("You have $count messages and $calls missed calls.");
    println("Goodbye");

    // updating variables
    day = "Tuesday";
    time = "3:46 AM";
    date++;
    println("Hello, it is $day, $month $date, $time.");
    println("You have $count messages and $calls missed calls.");
    println("Goodbye");

    // calling functions
    println(sum(1,2));

}