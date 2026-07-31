package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ec extends BroadcastReceiver implements InterfaceC4179mc {
    public final String a;
    public final /* synthetic */ Jc b;

    public Ec(Jc jc, String jsCallbackNamespace) {
        Intrinsics.checkNotNullParameter(jsCallbackNamespace, "jsCallbackNamespace");
        this.b = jc;
        this.a = jsCallbackNamespace;
    }

    @Override // com.inmobi.media.InterfaceC4179mc
    public final void a() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        context.unregisterReceiver(this);
    }

    @Override // com.inmobi.media.InterfaceC4179mc
    public final void b() {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        N3.a(context, this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("android.intent.action.HEADSET_PLUG", intent.getAction())) {
            int intExtra = intent.getIntExtra("state", 0);
            InterfaceC4466x9 interfaceC4466x9 = this.b.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("MraidMediaProcessor", "Headphone plugged state changed: " + intExtra);
            }
            this.b.b(this.a, 1 == intExtra);
        }
    }
}
