package com.openclassrooms.netapp.Utils;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RESTAdapter {

    private GithubService githubService;

    public RESTAdapter(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        githubService = retrofit.create(GithubService.class);
    }
    public GithubService getGithubService(){return githubService;}
}
