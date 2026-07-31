package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzffo implements zzinw {
    private final zzffn zza;

    private zzffo(zzffn zzffnVar) {
        this.zza = zzffnVar;
    }

    public static zzffo zzc(zzffn zzffnVar) {
        return new zzffo(zzffnVar);
    }

    public static String zzd(zzffn zzffnVar) {
        String zza = zzffnVar.zza();
        zzioe.zzb(zza);
        return zza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
