package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zznb extends zzxc {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zznb(zznc zzncVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzncVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i, zzbd zzbdVar, boolean z) {
        zzbf zzbfVar = this.zzb;
        zzbd zzd = zzbfVar.zzd(i, zzbdVar, z);
        if (zzbfVar.zzb(zzd.zzc, this.zzc, 0L).zzb()) {
            zzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
        } else {
            zzd.zzf = true;
        }
        return zzd;
    }
}
