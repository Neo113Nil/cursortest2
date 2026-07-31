package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final class zzbpl implements zzhcv {
    final /* synthetic */ zzclm zza;

    zzbpl(zzclm zzclmVar) {
        this.zza = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzclm zzclmVar = this.zza;
        new com.google.android.gms.ads.internal.util.zzbt(zzclmVar.getContext(), zzclmVar.zzs().afmaVersion, str, null, zzclmVar.zzC() != null ? zzclmVar.zzC().zzax : null).zzb();
    }
}
