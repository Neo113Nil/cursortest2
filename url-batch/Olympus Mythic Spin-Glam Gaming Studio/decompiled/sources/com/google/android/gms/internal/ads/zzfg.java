package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzfg implements zzdz {

    @Nullable
    private Message zza;

    private zzfg() {
        throw null;
    }

    /* synthetic */ zzfg(byte[] bArr) {
    }

    public final zzfg zzb(Message message, zzfh zzfhVar) {
        this.zza = message;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfh.zzo(this);
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfh.zzo(this);
        return sendMessageAtFrontOfQueue;
    }
}
