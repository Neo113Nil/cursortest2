package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzicj {
    private final zzich zza;

    private zzicj(zzich zzichVar) {
        this.zza = zzichVar;
    }

    public static zzicj zza(byte[] bArr, zzhfr zzhfrVar) {
        return new zzicj(zzich.zza(bArr));
    }

    public static zzicj zzb(int i) {
        return new zzicj(zzich.zza(zzhov.zza(i)));
    }

    public final byte[] zzc(zzhfr zzhfrVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
