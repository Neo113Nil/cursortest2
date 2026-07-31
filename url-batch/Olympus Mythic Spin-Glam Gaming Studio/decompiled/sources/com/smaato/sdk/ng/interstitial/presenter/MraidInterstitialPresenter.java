package com.smaato.sdk.ng.interstitial.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.CustomEndCardListener;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver;
import com.smaato.sdk.ng.interstitial.activity.MraidInterstitialActivity;
import com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.utils.CheckUtils;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class MraidInterstitialPresenter implements InterstitialPresenter, NextGenInterstitialBroadcastReceiver.Listener {
    private final Context a;
    private final Ad b;
    private final String c;
    private final Integer d;
    private final NextGenInterstitialBroadcastReceiver e;
    private final String f;
    private InterstitialPresenter.Listener g;
    private boolean h;
    private boolean i = false;

    public MraidInterstitialPresenter(Context context, Ad ad, String str, Integer num, String str2) {
        this.a = context;
        this.b = ad;
        this.c = str;
        this.d = num;
        this.f = str2;
        if (context == null || context.getApplicationContext() == null) {
            this.e = null;
            return;
        }
        NextGenInterstitialBroadcastReceiver nextGenInterstitialBroadcastReceiver = new NextGenInterstitialBroadcastReceiver(context);
        this.e = nextGenInterstitialBroadcastReceiver;
        nextGenInterstitialBroadcastReceiver.setListener(this);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void destroy() {
        NextGenInterstitialBroadcastReceiver nextGenInterstitialBroadcastReceiver = this.e;
        if (nextGenInterstitialBroadcastReceiver != null) {
            nextGenInterstitialBroadcastReceiver.destroy();
        }
        this.g = null;
        this.h = true;
        this.i = false;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public Ad getAd() {
        return this.b;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public JSONObject getPlacementParams() {
        return null;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public boolean isReady() {
        return this.i;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void load() {
        if (CheckUtils.NoThrow.checkArgument(!this.h, "MraidInterstitialPresenter is destroyed")) {
            this.i = true;
            InterstitialPresenter.Listener listener = this.g;
            if (listener != null) {
                listener.onInterstitialLoaded(this);
            }
        }
    }

    @Override // com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver.Listener
    public void onReceivedAction(NextGenInterstitialBroadcastReceiver.Action action, Bundle bundle) {
        this.e.handleAction(action, bundle, this, this.g);
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void setCustomEndCardListener(CustomEndCardListener customEndCardListener) {
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void setListener(InterstitialPresenter.Listener listener) {
        this.g = listener;
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void setVideoListener(VideoListener videoListener) {
    }

    @Override // com.smaato.sdk.ng.interstitial.presenter.InterstitialPresenter
    public void show() {
        NextGenInterstitialBroadcastReceiver nextGenInterstitialBroadcastReceiver;
        if (CheckUtils.NoThrow.checkArgument(!this.h, "MraidInterstitialPresenter is destroyed") && (nextGenInterstitialBroadcastReceiver = this.e) != null) {
            nextGenInterstitialBroadcastReceiver.register();
            Intent intent = new Intent(this.a, (Class<?>) MraidInterstitialActivity.class);
            intent.putExtra("extra_pn_skip_offset", this.d);
            intent.putExtra("extra_pn_broadcast_id", this.e.getBroadcastId());
            intent.putExtra("extra_pn_zone_id", this.c);
            if (!TextUtils.isEmpty(this.f)) {
                intent.putExtra("extra_pn_watermark_data", this.f);
            }
            intent.putExtra("extra_pn_session_id", this.b.getSessionId());
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
        }
    }
}
