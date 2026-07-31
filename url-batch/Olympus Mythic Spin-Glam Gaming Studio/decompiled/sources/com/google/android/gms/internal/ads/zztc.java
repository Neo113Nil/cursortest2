package com.google.android.gms.internal.ads;

import android.media.AudioTrack$StreamEventCallback;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes5.dex */
final class zztc {
    final /* synthetic */ zztd zza;
    private final Handler zzb;
    private final AudioTrack$StreamEventCallback zzc;

    /* synthetic */ zztc(zztd zztdVar, byte[] bArr) {
        Objects.requireNonNull(zztdVar);
        this.zza = zztdVar;
        final Handler zzd = zzfm.zzd(null);
        this.zzb = zzd;
        zzta zztaVar = new zzta(this);
        this.zzc = zztaVar;
        Objects.requireNonNull(zzd);
        zztdVar.zzt().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zztb
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzd.post(runnable);
            }
        }, zztaVar);
    }

    final /* synthetic */ void zza() {
        this.zza.zzt().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
