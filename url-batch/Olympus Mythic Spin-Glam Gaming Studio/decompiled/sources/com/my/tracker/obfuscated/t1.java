package com.my.tracker.obfuscated;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes9.dex */
public final class t1 {

    private static class a extends BroadcastReceiver {
        final s a;

        public a(s sVar) {
            this.a = sVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED".equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("payload");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    x2.a("RuStoreRemoteConfigHandler: received: action=" + intent.getAction() + ", payload=" + stringExtra);
                    this.a.a(stringExtra);
                } catch (Exception e) {
                    x2.a("RuStoreRemoteConfigHandler: error " + e);
                }
            }
        }
    }

    private t1() {
    }

    public static t1 a() {
        return new t1();
    }

    public void a(Context context, s sVar) {
        a aVar = new a(sVar);
        IntentFilter intentFilter = new IntentFilter("ru.rustore.sdk.remoteconfig.SEGMENT_HANDLED");
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(aVar, intentFilter);
        } else {
            context.registerReceiver(aVar, intentFilter, 4);
        }
    }
}
