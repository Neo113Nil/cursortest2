package io.intercom.android.sdk.articles;

/* loaded from: classes8.dex */
public interface ArticleWebViewListener {
    void articleNotFound();

    void onArticleFinishedLoading();

    void onArticleLoadingError();

    void onArticleStartedLoading();

    void scrollArticleViewTo(int i);
}
