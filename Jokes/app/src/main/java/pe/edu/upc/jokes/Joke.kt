package pe.edu.upc.jokes

import com.google.gson.annotations.SerializedName

class Joke(
    @SerializedName("joke")
    var joke: String)