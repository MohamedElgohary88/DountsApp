package com.chocolate.dountsapp

fun <T> List<T>.repeat(times: Int): List<T> {
    return List(times) { index -> this[index % size] }
}
