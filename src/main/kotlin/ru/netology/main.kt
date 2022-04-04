package ru.netology

fun main() {
    println(agoToText(1))
    println(agoToText(61))
    println(agoToText(60*60+2))
    println(agoToText(24*60*60+4))
    println(agoToText(24*60*60*2+7))
}

fun agoToText(time: Int): String {
    return when (time) {
        in 0..60 -> "был(а) только что"
        in 61..60*60 -> "был(а) в сети ${minToText(time)}"
        in 60*60+1..24*60*60 -> "был(а) в сети"
        in 24*60*60+1..24*60*60*2 -> "был(а) в сети сегодня"
        in 24*60*60*2+1..24*60*60*3 -> "был(а) в сети вчера"
        else -> "давно"
    }
}

fun minToText(min: Int): String {
    return when (min) {
        1, 21, 31, 41, 51 -> "$min минуту назад"
        2, 22, 32, 42, 52 -> "$min минуты назад"
        else -> "$min минут назад"
    }
}

fun hoursToText(hour: Int): String {
    return when (hour) {
        1, 21 -> "$hour час назад"
        2, 3, 4, 22, 23 -> "$hour часа назад"
        else -> "$hour часов назад"
    }
}