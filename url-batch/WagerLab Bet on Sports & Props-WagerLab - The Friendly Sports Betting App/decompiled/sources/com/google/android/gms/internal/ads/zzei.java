package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzei implements zzdk {
    private Message zza;

    private zzei() {
        throw null;
    }

    /* synthetic */ zzei(byte[] bArr) {
    }

    public final zzei zzb(Message message, zzej zzejVar) {
        this.zza = message;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdk
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzej.zzn(this);
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzej.zzn(this);
        return sendMessageAtFrontOfQueue;
    }
}
