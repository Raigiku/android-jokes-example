package pe.edu.upc.jokes

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface JokeService {

    @GET("/")
    fun getJoke(
        @Header("Accept") accept: String
    ): Call<Joke>
}