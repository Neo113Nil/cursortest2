package com.smaato.sdk.ng.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.smaato.sdk.ng.utils.Logger;
import com.smaato.sdk.ng.vpaid.volume.VolumeObserver;

/* loaded from: classes13.dex */
public class VolumeChangedActionReceiver extends BroadcastReceiver {
    private static VolumeChangedActionReceiver b;
    private boolean a = false;

    public static VolumeChangedActionReceiver getInstance() {
        if (b == null) {
            b = new VolumeChangedActionReceiver();
        }
        return b;
    }

    protected void a() {
        VolumeObserver.getInstance().notifyObservers();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
            a();
        }
    }

    public void register(Context context) {
        if (this.a) {
            return;
        }
        context.registerReceiver(this, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        this.a = true;
    }

    public void unregister(Context context) {
        if (this.a) {
            try {
                context.unregisterReceiver(this);
                this.a = false;
            } catch (IllegalArgumentException e) {
                Logger.e("VolumeChangedActionReceiver", e.toString());
            }
        }
    }
}
