package com.ysocorp.ysonetwork;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.X3;
import com.safedk.android.utils.Logger;
import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.enums.YNEnumPlacementType;
import com.ysocorp.ysonetwork.utils.YNLog;
import com.ysocorp.ysonetwork.webview.YNWebToAndroid;
import com.ysocorp.ysonetwork.webview.YNWebViewActivity;
import com.ysocorp.ysonetwork.webview.YNWebViewFragment;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class YNAdsDisplay {
    private static final HashMap<String, WebView> mBanners = new HashMap<>();
    private final Activity mActivity;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    public YNAdsDisplay(Activity activity) {
        this.mActivity = activity;
    }

    public void load(YNManager.YNRequest yNRequest, YNEnumPlacementType yNEnumPlacementType, String str) {
        if (yNEnumPlacementType == YNEnumPlacementType.Banner) {
            bannerLoad(yNRequest, str);
        }
    }

    public void bannerLoad(final YNManager.YNRequest yNRequest, final String str) {
        YNLog.Info("[YNAdsDisplay] :: BannerLoad : key = " + yNRequest.key + ", id = " + yNRequest.id + ", path = " + str);
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.YNAdsDisplay$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                YNAdsDisplay.this.lambda$bannerLoad$0(yNRequest, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bannerLoad$0(YNManager.YNRequest yNRequest, String str) {
        float f = this.mActivity.getResources().getDisplayMetrics().density;
        new FrameLayout.LayoutParams((int) (320.0f * f), (int) (f * 50.0f)).gravity = 81;
        new YNWebToAndroid(yNRequest, YNEnumPlacementType.Banner, str, this.mActivity, new WebView(this.mActivity));
    }

    public void show(YNManager.YNRequest yNRequest, YNEnumPlacementType yNEnumPlacementType, String str) {
        if (yNEnumPlacementType == YNEnumPlacementType.Banner) {
            bannerShow(yNRequest, str);
        } else if (yNEnumPlacementType == YNEnumPlacementType.Interstitial) {
            interstitialShow(yNRequest, str);
        } else if (yNEnumPlacementType == YNEnumPlacementType.Rewarded) {
            rewardedShow(yNRequest, str);
        }
    }

    private boolean forcedShowIntent(YNManager.YNRequest yNRequest) {
        JSONObject optJSONObject;
        return yNRequest != null && (optJSONObject = yNRequest.data.optJSONObject("setting")) != null && optJSONObject.has("wvm") && optJSONObject.optInt("wvm", 0) == 1;
    }

    public void interstitialShow(YNManager.YNRequest yNRequest, String str) {
        YNLog.Info("[YNAdsDisplay] :: InterstitialShow : key = " + yNRequest.key + ", id = " + yNRequest.id + ", path = " + str);
        if (forcedShowIntent(yNRequest)) {
            startIntent(yNRequest, YNEnumPlacementType.Interstitial, str);
        } else {
            startFragment(yNRequest, YNEnumPlacementType.Interstitial, str);
        }
    }

    public void rewardedShow(YNManager.YNRequest yNRequest, String str) {
        YNLog.Info("[YNAdsDisplay] :: RewardedShow : key = " + yNRequest.key + ", id = " + yNRequest.id + ", path = " + str);
        if (forcedShowIntent(yNRequest)) {
            startIntent(yNRequest, YNEnumPlacementType.Rewarded, str);
        } else {
            startFragment(yNRequest, YNEnumPlacementType.Rewarded, str);
        }
    }

    public void bannerShow(final YNManager.YNRequest yNRequest, final String str) {
        YNLog.Info("[YNAdsDisplay] :: BannerShow : key = " + yNRequest.key + ", id = " + yNRequest.id + ", path = " + str);
        bannerHide(yNRequest.key);
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.YNAdsDisplay$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                YNAdsDisplay.this.lambda$bannerShow$1(yNRequest, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bannerShow$1(YNManager.YNRequest yNRequest, String str) {
        float f = this.mActivity.getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (320.0f * f), (int) (f * 50.0f));
        layoutParams.gravity = 81;
        WebView webView = new WebView(this.mActivity);
        mBanners.put(yNRequest.key, webView);
        webView.setLayoutParams(layoutParams);
        new YNWebToAndroid(yNRequest, YNEnumPlacementType.Banner, str, this.mActivity, webView);
        ((FrameLayout) this.mActivity.findViewById(android.R.id.content)).addView(webView);
    }

    private void startIntent(final YNManager.YNRequest yNRequest, final YNEnumPlacementType yNEnumPlacementType, final String str) {
        YNLog.Info("[YNAdsDisplay] :: StartIntent : key = " + yNRequest.key + ", id = " + yNRequest.id + ", type = " + yNEnumPlacementType.toString() + ", path = " + str);
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.YNAdsDisplay$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                YNAdsDisplay.this.lambda$startIntent$2(yNRequest, yNEnumPlacementType, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startIntent$2(YNManager.YNRequest yNRequest, YNEnumPlacementType yNEnumPlacementType, String str) {
        Intent intent = new Intent(this.mActivity, (Class<?>) YNWebViewActivity.class);
        intent.putExtra(X3.i.n, this.mActivity.getRequestedOrientation());
        intent.putExtra("key", yNRequest.key);
        intent.putExtra("id", yNRequest.id);
        intent.putExtra("type", yNEnumPlacementType.toString());
        intent.putExtra("path", str);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.mActivity, intent);
    }

    public void startFragment(final YNManager.YNRequest yNRequest, final YNEnumPlacementType yNEnumPlacementType, final String str) {
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.YNAdsDisplay$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                YNAdsDisplay.this.lambda$startFragment$3(yNRequest, yNEnumPlacementType, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFragment$3(YNManager.YNRequest yNRequest, YNEnumPlacementType yNEnumPlacementType, String str) {
        ViewGroup viewGroup = (ViewGroup) this.mActivity.findViewById(android.R.id.content);
        if (viewGroup.isHardwareAccelerated()) {
            YNLog.Info("[YNAdsDisplay] :: StartFragment : key = " + yNRequest.key + ", id = " + yNRequest.id + ", type = " + yNEnumPlacementType.toString() + ", path = " + str);
            FrameLayout frameLayout = new FrameLayout(this.mActivity);
            int generateViewId = View.generateViewId();
            frameLayout.setId(generateViewId);
            frameLayout.setZ(1.0f);
            frameLayout.bringToFront();
            viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            YNWebViewFragment newInstance = YNWebViewFragment.newInstance(yNRequest.key, yNRequest.id, yNEnumPlacementType, str);
            FragmentTransaction beginTransaction = this.mActivity.getFragmentManager().beginTransaction();
            beginTransaction.replace(generateViewId, newInstance);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
            return;
        }
        startIntent(yNRequest, yNEnumPlacementType, str);
    }

    private void bannerHide(final String str) {
        YNLog.Info("[YNAdsDisplay] :: BannerHide : key = " + str + ", isHere = " + mBanners.containsKey(str));
        this.mActivity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.YNAdsDisplay$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                YNAdsDisplay.lambda$bannerHide$4(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$bannerHide$4(String str) {
        HashMap<String, WebView> hashMap = mBanners;
        WebView webView = hashMap.get(str);
        if (webView != null) {
            ((ViewGroup) webView.getParent()).removeView(webView);
            hashMap.remove(str);
        }
    }
}
