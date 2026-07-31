package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdhs implements zzhpx {
    private final zzdhq zza;

    private zzdhs(zzdhq zzdhqVar) {
        this.zza = zzdhqVar;
    }

    public static zzdhs zzc(zzdhq zzdhqVar) {
        return new zzdhs(zzdhqVar);
    }

    public static JSONObject zzd(zzdhq zzdhqVar) {
        JSONObject zzc = zzdhqVar.zzc();
        zzhqf.zzb(zzc);
        return zzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
