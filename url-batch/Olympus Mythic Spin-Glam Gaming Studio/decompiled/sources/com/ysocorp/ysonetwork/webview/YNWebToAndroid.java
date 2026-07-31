package com.ysocorp.ysonetwork.webview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.safedk.android.utils.Logger;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.YsoNetwork;
import com.ysocorp.ysonetwork.enums.YNEnumPlacementType;
import com.ysocorp.ysonetwork.http.YNHttpClient;
import com.ysocorp.ysonetwork.utils.YNLog;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class YNWebToAndroid {
    public final Activity activity;
    private boolean isClosed = false;
    private boolean isDisplayed;
    public YNManager.YNRequest req;
    private final YNEnumPlacementType type;
    private final WebView webView;
    private String webViewState;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public void finish() {
    }

    public YNWebToAndroid(YNManager.YNRequest yNRequest, YNEnumPlacementType yNEnumPlacementType, String str, Activity activity, WebView webView) {
        this.isDisplayed = false;
        this.webView = webView;
        this.req = yNRequest;
        this.type = yNEnumPlacementType;
        this.activity = activity;
        this.isDisplayed = yNRequest.isWebViewDisplayed;
        String str2 = yNRequest.webViewState;
        if (str2 != null) {
            this.webViewState = str2;
        }
        webView.setLayerType(2, null);
        webView.setBackgroundColor(-1);
        WebSettings webSettings = getWebSettings(webView);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(webSettings, Boolean.FALSE);
        } catch (Exception e) {
            YNLog.Info(e.getMessage());
        }
        webView.addJavascriptInterface(this, "YsoAdsNative");
        webView.setVisibility(4);
        if (this.type == YNEnumPlacementType.Banner) {
            YsoNetwork.ActionDisplay actionDisplay = this.req.actionDisplay;
            if (actionDisplay != null) {
                actionDisplay.onDisplay(webView);
                webView.setVisibility(0);
            }
        } else {
            webView.setWebViewClient(new YNWebViewClient(this));
        }
        webView.loadUrl(str);
    }

    @NonNull
    @SuppressLint({"SetJavaScriptEnabled"})
    private static WebSettings getWebSettings(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setCacheMode(-1);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMixedContentMode(0);
        return settings;
    }

    public void sendMessageToYNManager(String str) {
        String str2;
        str2 = this.type + str + "Back";
        YNLog.Info("[YNWebToAndroid] :: sendMessageToYNManager : method = " + str2);
        str2.hashCode();
        switch (str2) {
            case "bannerCloseBack":
                YNManager.getInstance().bannerCloseCallback(this.req);
                break;
            case "rewardedClickBack":
                YNManager.getInstance().rewardedClickCallback(this.req);
                break;
            case "interstitialClickBack":
                YNManager.getInstance().interstitialClickCallback(this.req);
                break;
            case "rewardedCloseBack":
                YNManager.getInstance().rewardedCloseCallback(this.req);
                break;
            case "interstitialDisplayBack":
                YNManager.getInstance().interstitialDisplayCallback(this.req);
                break;
            case "interstitialCloseBack":
                YNManager.getInstance().interstitialCloseCallback(this.req);
                break;
            case "rewardedDisplayBack":
                YNManager.getInstance().rewardedDisplayCallback(this.req);
                break;
            case "bannerClickBack":
                YNManager.getInstance().bannerClickCallback(this.req);
                break;
            case "bannerDisplayBack":
                YNManager.getInstance().bannerDisplayCallback(this.req);
                break;
            default:
                YNLog.Warning("[YNWebToAndroid] :: sendMessageToYNManager : unknown method = " + str2);
                break;
        }
    }

    public void displayEvent(String str) {
        YNLog.Info("[YNWebToAndroid] :: Display : " + str + " : isDisplayed = " + this.isDisplayed + ", isClosed = " + this.isClosed);
        this.webView.setVisibility(0);
        this.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebToAndroid$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                YNWebToAndroid.this.lambda$displayEvent$0();
            }
        });
        if (this.isDisplayed || this.isClosed) {
            return;
        }
        this.isDisplayed = true;
        this.req.isWebViewDisplayed = true;
        YNLog.Info("[YNWebToAndroid] :: Display : " + str + " : display : isDisplayed = true, isClosed = false");
        sendMessageToYNManager("Display");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$displayEvent$0() {
        this.webView.bringToFront();
    }

    public void closeEventWithError(String str, String str2) {
        YNLog.Info("[YNWebToAndroid] :: Close With Error : " + str + " : isDisplayed = " + this.isDisplayed + ", isClosed = " + this.isClosed);
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        YNLog.Info("[YNWebToAndroid] :: Close With Error : " + str + " : close : isDisplayed = " + this.isDisplayed + ", isClosed = true");
        StringBuilder sb = new StringBuilder();
        sb.append("[YNWebToAndroid] :: Close With Error : ");
        sb.append(str);
        sb.append(" : YNManager::Show:WebView: ");
        sb.append(str2);
        YNLog.Info(sb.toString());
        YNHttpClient.getInstance().requestTrackUrl(this.req.data, "Show", "END", "YNManager::Show:WebView: " + str2, Boolean.TRUE, (Long) null);
        this.req.actionDisplay.onClose(this.isDisplayed, false);
        YNManager.getInstance().deleteRequest(this.req, "Show Display WebView Error");
        this.webView.stopLoading();
        this.webView.setVisibility(8);
        finish();
    }

    public void closeEvent(boolean z) {
        YNLog.Info("[YNWebToAndroid] :: Close : isDisplayed = " + this.isDisplayed + ", isClosed = " + this.isClosed + ", isCompleted = " + z);
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        YNLog.Info("[YNWebToAndroid] :: Close : isDisplayed = " + this.isDisplayed + ", isClosed = true, isCompleted = " + z);
        YNHttpClient.getInstance().requestTrackUrl(this.req.data, "Show", "END", (String) null, Boolean.FALSE, (Long) null);
        YsoNetwork.ActionDisplay actionDisplay = this.req.actionDisplay;
        boolean z2 = this.isDisplayed;
        actionDisplay.onClose(z2, z2 && z);
        YNManager.getInstance().deleteRequest(this.req, "Show Display Close");
        this.webView.stopLoading();
        this.webView.setVisibility(8);
        finish();
    }

    /* renamed from: clickEvent, reason: merged with bridge method [inline-methods] */
    public void lambda$openUrl$2(String str) {
        YNLog.Info("[YNWebToAndroid] :: Click : isDisplayed = " + this.isDisplayed + ", isClosed = " + this.isClosed);
        sendMessageToYNManager("Click");
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setPackage("com.android.vending");
            intent.putExtra("overlay", true);
            intent.putExtra("callerId", this.activity.getPackageName());
            if (intent.resolveActivity(this.activity.getPackageManager()) != null) {
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.activity, intent);
            } else {
                safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.activity, new Intent("android.intent.action.VIEW", parse));
            }
        } catch (Exception e) {
            YNLog.Error("[YNWebToAndroid] :: Click : error = " + e.getMessage());
        }
    }

    @JavascriptInterface
    public String getState() {
        YNLog.Info("[YNWebToAndroid] :: getState event is call");
        return this.webViewState;
    }

    @JavascriptInterface
    public void setState(final String str) {
        YNLog.Info("[YNWebToAndroid] :: setState event is call");
        this.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebToAndroid$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                YNWebToAndroid.this.lambda$setState$1(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setState$1(String str) {
        this.webViewState = str;
        this.req.webViewState = str;
    }

    @JavascriptInterface
    public void openUrl(final String str) {
        YNLog.Info("[YNWebToAndroid] :: openUrl event is call");
        this.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebToAndroid$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                YNWebToAndroid.this.lambda$openUrl$2(str);
            }
        });
    }

    @JavascriptInterface
    public void close() {
        YNLog.Info("[YNWebToAndroid] :: close event is call");
        this.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebToAndroid$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                YNWebToAndroid.this.lambda$close$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$3() {
        closeEvent(true);
    }

    @JavascriptInterface
    public void skip() {
        YNLog.Info("[YNWebToAndroid] :: skip event is call");
        this.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebToAndroid$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                YNWebToAndroid.this.lambda$skip$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$skip$4() {
        closeEvent(false);
    }

    @JavascriptInterface
    public void handleJavaScriptError(final String str) {
        YNLog.Info("[YNWebToAndroid] :: handleJavaScriptError event is call");
        this.activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.webview.YNWebToAndroid$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                YNWebToAndroid.this.lambda$handleJavaScriptError$5(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleJavaScriptError$5(String str) {
        closeEventWithError("handleJavaScriptError", "JavascriptInterfaceError: " + str);
    }
}
