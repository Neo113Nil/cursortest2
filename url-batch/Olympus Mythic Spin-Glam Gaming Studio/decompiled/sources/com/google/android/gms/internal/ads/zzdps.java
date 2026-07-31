package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdps implements zzinw {
    private final zzdpn zza;

    private zzdps(zzdpn zzdpnVar) {
        this.zza = zzdpnVar;
    }

    public static zzdps zzc(zzdpn zzdpnVar) {
        return new zzdps(zzdpnVar);
    }

    public static zzdvv zzd(zzdpn zzdpnVar) {
        zzdvv zzd = zzdpnVar.zzd();
        zzioe.zzb(zzd);
        return zzd;
    }

    public final zzdvv zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
