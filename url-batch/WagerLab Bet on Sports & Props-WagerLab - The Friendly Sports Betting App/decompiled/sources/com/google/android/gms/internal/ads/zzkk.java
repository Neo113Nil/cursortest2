package com.google.android.gms.internal.ads;

import androidx.media3.common.C;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzkk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkk() {
        this.zza = C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = C.TIME_UNSET;
    }

    /* synthetic */ zzkk(zzkl zzklVar, byte[] bArr) {
        this.zza = zzklVar.zza;
        this.zzb = zzklVar.zzb;
        this.zzc = zzklVar.zzc;
    }

    public final zzkk zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzkk zzb(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzghc.zza(z);
        this.zzb = f;
        return this;
    }

    public final zzkk zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == C.TIME_UNSET) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzghc.zza(z);
        this.zzc = j;
        return this;
    }

    public final zzkl zzd() {
        return new zzkl(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }
}
