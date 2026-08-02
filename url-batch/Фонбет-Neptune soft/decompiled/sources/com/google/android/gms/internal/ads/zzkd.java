package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzkd {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkd() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzkd(zzkf zzkfVar, zzkc zzkcVar) {
        this.zza = zzkfVar.zza;
        this.zzb = zzkfVar.zzb;
        this.zzc = zzkfVar.zzc;
    }

    public final zzkd zzd(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzdi.zzd(z);
        this.zzc = j;
        return this;
    }

    public final zzkd zze(long j) {
        this.zza = j;
        return this;
    }

    public final zzkd zzf(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzdi.zzd(z);
        this.zzb = f;
        return this;
    }

    public final zzkf zzg() {
        return new zzkf(this, null);
    }
}
