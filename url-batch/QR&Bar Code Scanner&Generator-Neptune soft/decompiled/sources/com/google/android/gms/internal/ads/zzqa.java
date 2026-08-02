package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzqa extends Handler {
    final /* synthetic */ zzqc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzqa(zzqc zzqcVar, Looper looper) {
        super(looper);
        this.zza = zzqcVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        zzqc.zza(this.zza, message);
    }
}
