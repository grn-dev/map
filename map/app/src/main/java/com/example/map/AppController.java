package com.example.map;
import android.app.Application;

import ir.map.sdk_map.Mapir;


public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //TODO Please add your API_KEY
        Mapir.getInstance(this, "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImMzNDk1NDI5MjhlMjYzYzk4ODY0MzA1YTllMzMwYmJkODZmZjQ4YjIxMzQyNmQ3OTRiMTQ1NDU5MWJhNWJmYTVmNGE5ZDc5MGQ4YWU1MzM0In0.eyJhdWQiOiI3ODIyIiwianRpIjoiYzM0OTU0MjkyOGUyNjNjOTg4NjQzMDVhOWUzMzBiYmQ4NmZmNDhiMjEzNDI2ZDc5NGIxNDU0NTkxYmE1YmZhNWY0YTlkNzkwZDhhZTUzMzQiLCJpYXQiOjE1ODA4NTE5NDMsIm5iZiI6MTU4MDg1MTk0MywiZXhwIjoxNTgzMzU3NTQzLCJzdWIiOiIiLCJzY29wZXMiOlsiYmFzaWMiXX0.itCyhRK_eqnYWtBlfPeb5MkF2UoE62RxrLU79akXY1mdTzQ7NGjGfe-RGbxZdQZOsGHOZsntbF3AdAtGwAEIW2_4zFPHJdExSKTQr9957FxPiQiiGYuaqRCb7zRl1GJiFuU1MvdeHku_P1JpGsfhxrUrK0R1ZFWN6ycC1foSKHAR2rl0pPRVQs06t80QhMe44HBfAgifUusZLbWPYGI1TNGWuic8S68kIzrUm4uTKaNwtYa-GZmw1GUEj3KC9iaKixlxDe30DY8nQHQWVz68TcMq6XPh5-OqejkcEfUXr_24-JlEGvNOit5QxjMF87-_0aMKTQblrrPLwItIsVPgpA");
    }
}
