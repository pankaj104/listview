package abc.com.listview

import kotlin.random.Random

data  class  Fruit(    val name: String,
            val origin : String,
                    val quality : Int
) {
    companion object{
        @JvmField
         val  FRUIT_NAMES = arrayOf(
            "Apple",
            "mango", "kiwi"
        ,"Grapes"
        )
        @JvmField
        val     ORIGINS = arrayOf("patna","srinagar", "Lucknow", "Nagpur", "Aurangabad")
        @JvmStatic

    fun genRandomFruits(n:Int): ArrayList<Fruit>{
        val fruitArray =ArrayList<Fruit>(n)
        for (i in 1..n){
            fruitArray.add(
            Fruit(
                FRUIT_NAMES[Random.nextInt(4)],
                ORIGINS[Random.nextInt(5)],
                Random.nextInt(10)*100
            )
            )
        }
        return fruitArray
    }
    }
}