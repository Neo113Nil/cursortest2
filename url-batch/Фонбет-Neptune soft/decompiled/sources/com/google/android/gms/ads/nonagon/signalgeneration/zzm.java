package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdfc;
import com.google.android.gms.internal.ads.zzdsf;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzm implements zzdfc {
    private final zzdsf zza;
    private final zzl zzb;
    private final String zzc;

    public zzm(zzdsf zzdsfVar, zzl zzlVar, String str) {
        this.zza = zzdsfVar;
        this.zzb = zzlVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zze(zzay zzayVar) {
        if (zzayVar == null) {
            return;
        }
        this.zzb.zzd(this.zzc, zzayVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdfc
    public final void zzf(String str) {
    }
}
