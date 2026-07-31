package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcxf implements zzdej {

    @Nullable
    private final zzclm zza;
    private final zzeaj zzb;
    private final zzfld zzc;

    zzcxf(@Nullable zzclm zzclmVar, zzeaj zzeajVar, zzfld zzfldVar) {
        this.zza = zzclmVar;
        this.zzb = zzeajVar;
        this.zzc = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzclm zzclmVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoK)).booleanValue() || (zzclmVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzclmVar.zzE()) ? "0" : "1";
        zzeai zza = this.zzb.zza();
        zza.zzc("action", "hcp");
        zza.zzc("hcp", str);
        zza.zzb(this.zzc);
        zza.zzd();
    }
}
