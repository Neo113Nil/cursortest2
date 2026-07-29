package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzahw {
    public final int zza;
    public final long zzb;

    private zzahw(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzahw zza(zzyt zzytVar, zzdy zzdyVar) throws IOException {
        ((zzym) zzytVar).zzm(zzdyVar.zzH(), 0, 8, false);
        zzdyVar.zzF(0);
        return new zzahw(zzdyVar.zze(), zzdyVar.zzq());
    }
}
