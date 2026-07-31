package com.smaato.sdk.ng.rewarded.presenter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.smaato.sdk.ng.CustomEndCardListener;
import com.smaato.sdk.ng.VideoListener;
import com.smaato.sdk.ng.models.Ad;
import com.smaato.sdk.ng.models.IntegrationType;
import com.smaato.sdk.ng.rewarded.NextGenRewardedBroadcastReceiver;
import com.smaato.sdk.ng.rewarded.activity.VastRewardedActivity;
import com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter;
import com.smaato.sdk.ng.utils.CheckUtils;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VastRewardedPresenter implements RewardedPresenter, NextGenRewardedBroadcastReceiver.Listener, VideoListener {
    private final Context a;
    private final Ad b;
    private final String c;
    private final NextGenRewardedBroadcastReceiver d;
    private final String e;
    private RewardedPresenter.Listener f;
    private VideoListener g;
    private CustomEndCardListener h;
    private boolean i;
    private boolean j = false;
    IntegrationType k;

    public VastRewardedPresenter(Context context, Ad ad, String str, IntegrationType integrationType, String str2) {
        this.a = context;
        this.b = ad;
        this.c = str;
        this.e = str2;
        if (context == null || context.getApplicationContext() == null) {
            this.d = null;
        } else {
            NextGenRewardedBroadcastReceiver nextGenRewardedBroadcastReceiver = new NextGenRewardedBroadcastReceiver(context);
            this.d = nextGenRewardedBroadcastReceiver;
            nextGenRewardedBroadcastReceiver.setListener(this);
        }
        this.k = integrationType;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.v);
        p0.startActivity(p1);
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public void destroy() {
        NextGenRewardedBroadcastReceiver nextGenRewardedBroadcastReceiver = this.d;
        if (nextGenRewardedBroadcastReceiver != null) {
            nextGenRewardedBroadcastReceiver.destroy();
        }
        this.f = null;
        this.i = true;
        this.j = false;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public Ad getAd() {
        return this.b;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public JSONObject getPlacementParams() {
        return null;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public boolean isReady() {
        return this.j;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public void load() {
        if (CheckUtils.NoThrow.checkArgument(!this.i, "VastRewardedPresenter is destroyed")) {
            this.j = true;
            RewardedPresenter.Listener listener = this.f;
            if (listener != null) {
                listener.onRewardedLoaded(this);
            }
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.NextGenRewardedBroadcastReceiver.Listener
    public void onReceivedAction(NextGenRewardedBroadcastReceiver.Action action, Bundle bundle) {
        this.d.handleAction(action, this, bundle, this.f, this, this.h);
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoDismissed(int i) {
        VideoListener videoListener = this.g;
        if (videoListener != null) {
            videoListener.onVideoDismissed(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoError(int i) {
        VideoListener videoListener = this.g;
        if (videoListener != null) {
            videoListener.onVideoError(i);
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoFinished() {
        VideoListener videoListener = this.g;
        if (videoListener != null) {
            videoListener.onVideoFinished();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoSkipped() {
        VideoListener videoListener = this.g;
        if (videoListener != null) {
            videoListener.onVideoSkipped();
        }
    }

    @Override // com.smaato.sdk.ng.VideoListener
    public void onVideoStarted() {
        VideoListener videoListener = this.g;
        if (videoListener != null) {
            videoListener.onVideoStarted();
        }
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public void setCustomEndCardListener(CustomEndCardListener customEndCardListener) {
        this.h = customEndCardListener;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public void setListener(RewardedPresenter.Listener listener) {
        this.f = listener;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public void setVideoListener(VideoListener videoListener) {
        this.g = videoListener;
    }

    @Override // com.smaato.sdk.ng.rewarded.presenter.RewardedPresenter
    public void show() {
        NextGenRewardedBroadcastReceiver nextGenRewardedBroadcastReceiver;
        if (CheckUtils.NoThrow.checkArgument(!this.i, "VastRewardedPresenter is destroyed") && (nextGenRewardedBroadcastReceiver = this.d) != null) {
            nextGenRewardedBroadcastReceiver.register();
            Intent intent = new Intent(this.a, (Class<?>) VastRewardedActivity.class);
            intent.putExtra("extra_pn_broadcast_id", this.d.getBroadcastId());
            intent.putExtra("extra_pn_zone_id", this.c);
            if (!TextUtils.isEmpty(this.e)) {
                intent.putExtra("extra_pn_watermark_data", this.e);
            }
            intent.putExtra("extra_pn_session_id", this.b.getSessionId());
            intent.putExtra("integration_type", this.k.getCode());
            intent.addFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.a, intent);
        }
    }
}
