fun main() {
    genap(arrayOf(1,2,3,4,5,6,7,8,9,10))
}

fun genap(num: Array<Int>){
    for(i in num.indices){
        if(num[i]%2==0){
            println(num[i])
        }else{
        }
    }
}