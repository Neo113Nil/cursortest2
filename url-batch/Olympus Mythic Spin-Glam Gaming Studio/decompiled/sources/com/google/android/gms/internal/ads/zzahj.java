package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public class zzahj implements zzahk {
    private final long zza;
    private final zzahi zzb;

    @Override // com.google.android.gms.internal.ads.zzahk
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahk
    public final zzahi zzc(long j) {
        return this.zzb;
    }

    public zzahj(long j, long j2) {
        this.zza = j;
        zzahl zzahlVar = j2 == 0 ? zzahl.zza : new zzahl(0L, j2);
        this.zzb = new zzahi(zzahlVar, zzahlVar);
    }
}
