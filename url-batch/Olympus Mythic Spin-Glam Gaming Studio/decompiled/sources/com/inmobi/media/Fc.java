package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Fc extends BroadcastReceiver implements InterfaceC4179mc {
    public final String a;
    public final /* synthetic */ Jc b;

    public Fc(Jc jc, String jsCallbackNamespace) {
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
        N3.a(context, this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("android.media.RINGER_MODE_CHANGED", intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
            InterfaceC4466x9 interfaceC4466x9 = this.b.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a("MraidMediaProcessor", "Ringer mode action changed: " + intExtra);
            }
            this.b.a(this.a, 2 != intExtra);
        }
    }
}
