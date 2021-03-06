package com.blogger.lite.data.network;

import com.blogger.lite.data.models.OcoPosts;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by pedromolina on 2/4/18.
 */

public interface Webservice {
    @Headers("Cache-Control: no-cache")
    @GET("posts")
    Call<OcoPosts> getPosts(
      @Query("key") String key,
      @Query("pageToken") String token
    );
}
