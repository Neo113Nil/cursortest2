package io.intercom.android.sdk.helpcenter.webview;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.Gson;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.utils.ConstantsKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final Gson gson;
    private final boolean isFromSearchBrowse;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView, Gson gson, MetricTracker metricTracker, Api api, boolean z) {
        this.webView = webView;
        this.gson = gson;
        this.metricTracker = metricTracker;
        this.api = api;
        this.isFromSearchBrowse = z;
    }

    @JavascriptInterface
    public void handleAction(String str) {
        HelpCenterWebViewAction helpCenterWebViewAction = (HelpCenterWebViewAction) this.gson.fromJson(str, HelpCenterWebViewAction.class);
        String type = helpCenterWebViewAction.getType();
        final Map<String, Object> value = helpCenterWebViewAction.getValue();
        if (type == null || value == null) {
            return;
        }
        type.hashCode();
        if (type.equals(TRACK_REACTION)) {
            this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    HelpCenterWebViewInterface.this.m11080xf6582c93(value);
                }
            });
        } else if (type.equals(METRIC_EVENT)) {
            this.webView.post(new Runnable() { // from class: io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewInterface$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    HelpCenterWebViewInterface.this.m11079x132c7952(value);
                }
            });
        }
    }

    /* renamed from: lambda$handleAction$0$io-intercom-android-sdk-helpcenter-webview-HelpCenterWebViewInterface, reason: not valid java name */
    /* synthetic */ void m11079x132c7952(Map map) {
        String str = (String) map.get("action");
        String str2 = (String) map.get("object");
        String str3 = (String) map.get("place");
        HashMap hashMap = new HashMap();
        if (map.get(TtmlNode.TAG_METADATA) instanceof Map) {
            hashMap.putAll((Map) map.get(TtmlNode.TAG_METADATA));
        }
        if (this.isFromSearchBrowse) {
            hashMap.put(ConstantsKt.KEY_ARTICLE_SOURCE, "search_browse");
        }
        this.metricTracker.educateWebviewMetric(str, str2, str3, hashMap, MetricTracker.Context.FROM_HELP_CENTER_WEBVIEW);
    }

    /* renamed from: lambda$handleAction$1$io-intercom-android-sdk-helpcenter-webview-HelpCenterWebViewInterface, reason: not valid java name */
    /* synthetic */ void m11080xf6582c93(Map map) {
        Double d = (Double) map.get("article_id");
        Double d2 = (Double) map.get("article_content_id");
        Double d3 = (Double) map.get("reaction_index");
        if (d == null || d2 == null || d3 == null) {
            return;
        }
        this.api.reactToLink(String.valueOf(d.intValue()), String.valueOf(d2.intValue()), d3.intValue(), true);
    }
}
