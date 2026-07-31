package com.smaato.sdk.ng.rewarded;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.smaato.sdk.ng.rewarded.NextGenRewardedBroadcastReceiver;
import com.smaato.sdk.ng.utils.NGSDKLocalBroadcastManager;

/* loaded from: classes8.dex */
public class NextGenRewardedBroadcastSender {
    private final long a;
    private final NGSDKLocalBroadcastManager b;

    public NextGenRewardedBroadcastSender(Context context, long j) {
        this(j, NGSDKLocalBroadcastManager.getInstance(context));
    }

    public long getBroadcastId() {
        return this.a;
    }

    public void sendBroadcast(NextGenRewardedBroadcastReceiver.Action action, Bundle bundle) {
        Intent intent = new Intent(action.getId());
        intent.putExtra("pn_rewarded_broadcastId", this.a);
        if (bundle != null && !bundle.isEmpty()) {
            intent.putExtras(bundle);
        }
        this.b.sendBroadcast(intent);
    }

    NextGenRewardedBroadcastSender(long j, NGSDKLocalBroadcastManager nGSDKLocalBroadcastManager) {
        this.a = j;
        this.b = nGSDKLocalBroadcastManager;
    }

    public void sendBroadcast(NextGenRewardedBroadcastReceiver.Action action) {
        Intent intent = new Intent(action.getId());
        intent.putExtra("pn_rewarded_broadcastId", this.a);
        this.b.sendBroadcast(intent);
    }
}
