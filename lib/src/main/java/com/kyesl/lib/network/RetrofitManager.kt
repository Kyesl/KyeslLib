package com.kyesl.lib.network

import retrofit2.Retrofit

class RetrofitManager private constructor() {

    companion object {
        private const val TAG = "Kyesl.RetrofitManager"

        val instance: RetrofitManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            RetrofitManager()
        }
    }

   private lateinit var mRetrofit: Retrofit

    init {
        mRetrofit = Retrofit.Builder()
            .build()
    }

}