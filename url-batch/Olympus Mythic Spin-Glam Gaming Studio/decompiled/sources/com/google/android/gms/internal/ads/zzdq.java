package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes13.dex */
public final class zzdq {
    public static final zzdq zza = new zzdq(0, 0, false);
    private final int zzb;
    private final int zzc;
    private final boolean zzd;

    public zzdq(int i, int i2) {
        this(i, i2, true);
    }

    private zzdq(int i, int i2, boolean z) {
        this.zzd = z;
        this.zzb = i;
        this.zzc = i2;
    }

    public final int zza() {
        zzguk.zzi(this.zzd);
        return this.zzb;
    }

    public final int zzb() {
        zzguk.zzi(this.zzd);
        return this.zzc;
    }

    public final boolean zzc() {
        return this.zzd;
    }
}
