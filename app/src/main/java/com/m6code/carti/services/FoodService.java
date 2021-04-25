package com.m6code.carti.services;

import com.m6code.carti.model.Food;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodService {
    @GET("menu.json")
    Call<List<Food>> getFoods();
}
