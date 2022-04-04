package ru.netology

fun main() {
    println(agoToText(1))
    println(agoToText(62))
    println(agoToText(130*60+2))
    println(agoToText(24*60*60+4))
    println(agoToText(24*60*60*2+7))
    println(agoToText(24*60*60*3+9))
}

fun agoToText(time: Int): String {
    return when (time) {
        in 0..60 -> "был(а) только что"
        in 61..60*60 -> "был(а) в сети ${minToText(time)}"
        in 60*60+1..24*60*60 -> "был(а) в сети ${hoursToText(time)}"
        in 24*60*60+1..24*60*60*2 -> "был(а) в сети сегодня"
        in 24*60*60*2+1..24*60*60*3 -> "был(а) в сети вчера"
        else -> "был(а) в сети давно"
    }
}

fun minToText(min: Int): String {
    return when (min) {
        in 1*60..1*119, in 21*60..21*119, in 31*60..31*119, in 41*60..41*119, in 51*60..51*119 -> "${min/60} минуту назад"
        in 2*60..2*119, in 22*60..22*119, in 32*60..32*119, in 42*60..42*119, in 52*60..52*119 -> "${min/60} минуты назад"
        else -> "${min/60} минут назад"
    }
}

fun hoursToText(hour: Int): String {
    return when (hour) {
        in 1*60*60..1*119*60, in 21*60*60..21*119*60 -> "${hour/(60*60)} час назад"
        in 2*60*60..2*119*60, in 3*60*60..3*119*60, in 4*60*60..4*119*60, in 22*60*60..22*119*60, in 23*60*60..23*119*60 -> "${hour/(60*60)} часа назад"
        else -> "${hour/(60*60)} часов назад"
    }
}