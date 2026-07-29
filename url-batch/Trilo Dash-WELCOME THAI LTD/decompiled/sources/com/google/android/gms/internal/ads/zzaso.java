package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaso {
    private final Handler zza;
    private final zzasp zzb;

    public zzaso(Handler handler, zzasp zzaspVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzaspVar;
    }

    public final void zzb(int i) {
        this.zza.post(new zzasn(this, i));
    }

    public final void zzc(int i, long j, long j2) {
        this.zza.post(new zzasl(this, i, j, j2));
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.post(new zzasj(this, str, j, j2));
    }

    public final void zze(zzatm zzatmVar) {
        this.zza.post(new zzasm(this, zzatmVar));
    }

    public final void zzf(zzatm zzatmVar) {
        this.zza.post(new zzasi(this, zzatmVar));
    }

    public final void zzg(zzars zzarsVar) {
        this.zza.post(new zzask(this, zzarsVar));
    }
}
