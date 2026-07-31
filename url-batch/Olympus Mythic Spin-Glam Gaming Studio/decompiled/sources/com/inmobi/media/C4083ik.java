package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C4083ik extends BroadcastReceiver {
    public static final void a(Intent intent, Context context) {
        AbstractC4135kk.a(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.ik$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C4083ik.a(intent, context);
            }
        };
        Context context2 = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }
}
