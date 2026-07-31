package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4114k extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.media.VOLUME_CHANGED_ACTION")) {
            C4272q c4272q = C4272q.a;
            F5.a.getClass();
            if (F5.y()) {
                BuildersKt__Builders_commonKt.launch$default(C4272q.g, null, null, new C4166m(null), 3, null);
            } else {
                C4272q.a((Float) null);
            }
        }
    }
}
