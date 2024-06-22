package network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

interface MarsApiService {
    public abstract suspend fun getPhotosAsString(): String
    public abstract suspend fun getPhotos(): List<MarsPhoto>
}
//api = function = method
object MarsApi {
    val retrofitService : MarsApiService by  lazy {
        retrofit.create(MarsApiService::class.java)
    }
}
