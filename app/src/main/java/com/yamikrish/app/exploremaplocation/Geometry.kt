package com.yamikrish.app.exploremaplocation


data class Geometry(val geometries: MutableList<Geometries>){

    data class Geometries(val geometry : String, val attributes: GeoAttributes)

    data class GeoAttributes(val PLACE_ID: String, val NAMES : String)
}
