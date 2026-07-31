package io.appmetrica.analytics.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes10.dex */
public final class G2 extends BroadcastReceiver {
    public final BiConsumer a;
    public final ICommonExecutor b;

    public G2(C5194a3 c5194a3, ICommonExecutor iCommonExecutor) {
        this.a = c5194a3;
        this.b = iCommonExecutor;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.b.execute(new F2(this, context, intent));
    }
}
