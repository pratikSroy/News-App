package com.example.appnews;

import com.example.appnews.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener <NewsApiResponse>{
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
