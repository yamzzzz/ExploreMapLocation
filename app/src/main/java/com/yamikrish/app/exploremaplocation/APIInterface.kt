package com.yamikrish.app.exploremaplocation

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {

    @GET("search/proximity.json?app_id=WfTZvKToL104sYzeHSZE&app_code=IiOcWM9JCJaEOkCtbsW-BA")
    fun checkProximity(@Query("layer_ids") layerIds: String, @Query("proximity") proximity: String): Call<Geometry>

}