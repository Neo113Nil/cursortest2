package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class b extends BroadcastReceiver {
    public final WeakReference a;

    public b(c cVar) {
        this.a = new WeakReference(cVar);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        c cVar = (c) this.a.get();
        if (cVar != null) {
            cVar.a();
        }
    }
}
