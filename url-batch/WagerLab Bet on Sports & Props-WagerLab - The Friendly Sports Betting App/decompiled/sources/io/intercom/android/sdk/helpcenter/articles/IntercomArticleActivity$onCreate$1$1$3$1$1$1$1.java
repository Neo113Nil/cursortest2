package io.intercom.android.sdk.helpcenter.articles;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: IntercomArticleActivity.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"io/intercom/android/sdk/helpcenter/articles/IntercomArticleActivity$onCreate$1$1$3$1$1$1$1", "Lio/intercom/android/sdk/articles/ArticleWebViewListener;", "onArticleStartedLoading", "", "onArticleFinishedLoading", "onArticleLoadingError", "articleNotFound", "scrollArticleViewTo", "y", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomArticleActivity$onCreate$1$1$3$1$1$1$1 implements ArticleWebViewListener {
    final /* synthetic */ WebView $this_apply;
    final /* synthetic */ IntercomArticleActivity this$0;

    IntercomArticleActivity$onCreate$1$1$3$1$1$1$1(IntercomArticleActivity intercomArticleActivity, WebView webView) {
        this.this$0 = intercomArticleActivity;
        this.$this_apply = webView;
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        ArticleViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.onArticleStartedLoading();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        ArticleViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.onArticleFinishedLoading();
        WebView webView = this.$this_apply;
        final IntercomArticleActivity intercomArticleActivity = this.this$0;
        webView.evaluateJavascript("window.alexandriaArticleContentId", new ValueCallback() { // from class: io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                IntercomArticleActivity$onCreate$1$1$3$1$1$1$1.onArticleFinishedLoading$lambda$0(IntercomArticleActivity.this, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onArticleFinishedLoading$lambda$0(IntercomArticleActivity this$0, String str) {
        ArticleViewModel viewModel;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        viewModel = this$0.getViewModel();
        Intrinsics.checkNotNull(str);
        viewModel.articleContentIdFetched(StringsKt.removeSurrounding(str, (CharSequence) "\""));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        ArticleViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.onArticleLoadingError();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        ArticleViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.articleNotFound();
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int y) {
        ArticleViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.scrollArticleViewTo(y);
    }
}
