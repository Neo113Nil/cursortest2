package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzats {
    private final Handler zza;
    private final zzatt zzb;

    public zzats(Handler handler, zzatt zzattVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzattVar;
    }

    public final void zzb(int i) {
        this.zza.post(new zzatr(this, i));
    }

    public final void zzc(int i, long j, long j2) {
        this.zza.post(new zzatp(this, i, j, j2));
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.post(new zzatn(this, str, j, j2));
    }

    public final void zze(zzauq zzauqVar) {
        this.zza.post(new zzatq(this, zzauqVar));
    }

    public final void zzf(zzauq zzauqVar) {
        this.zza.post(new zzatm(this, zzauqVar));
    }

    public final void zzg(zzasw zzaswVar) {
        this.zza.post(new zzato(this, zzaswVar));
    }
}
