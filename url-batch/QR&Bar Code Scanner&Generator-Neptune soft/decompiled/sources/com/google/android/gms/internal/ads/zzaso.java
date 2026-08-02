package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzaso extends Handler {
    final /* synthetic */ zzasp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaso(zzasp zzaspVar, Looper looper) {
        super(looper);
        this.zza = zzaspVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
