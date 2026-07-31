package com.smaato.sdk.ng.interstitial;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.smaato.sdk.ng.interstitial.NextGenInterstitialBroadcastReceiver;
import com.smaato.sdk.ng.utils.NGSDKLocalBroadcastManager;

/* loaded from: classes13.dex */
public class NextGenInterstitialBroadcastSender {
    private final long a;
    private final NGSDKLocalBroadcastManager b;

    public NextGenInterstitialBroadcastSender(Context context, long j) {
        this(j, NGSDKLocalBroadcastManager.getInstance(context));
    }

    public long getBroadcastId() {
        return this.a;
    }

    public void sendBroadcast(NextGenInterstitialBroadcastReceiver.Action action) {
        sendBroadcast(action, null);
    }

    NextGenInterstitialBroadcastSender(long j, NGSDKLocalBroadcastManager nGSDKLocalBroadcastManager) {
        this.a = j;
        this.b = nGSDKLocalBroadcastManager;
    }

    public void sendBroadcast(NextGenInterstitialBroadcastReceiver.Action action, Bundle bundle) {
        Intent intent = new Intent(action.getId());
        intent.putExtra("pn_broadcastId", this.a);
        if (bundle != null && !bundle.isEmpty()) {
            intent.putExtras(bundle);
        }
        this.b.sendBroadcast(intent);
    }
}
