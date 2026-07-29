package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfhn implements zzfuw {
    final /* synthetic */ zzfhq zza;
    final /* synthetic */ zzfhg zzb;

    zzfhn(zzfhq zzfhqVar, zzfhg zzfhgVar, boolean z) {
        this.zza = zzfhqVar;
        this.zzb = zzfhgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzfhg zzfhgVar = this.zzb;
        if (zzfhgVar.zzh()) {
            zzfhq zzfhqVar = this.zza;
            zzfhgVar.zze(false);
            zzfhqVar.zza(zzfhgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zzb(Object obj) {
        zzfhq zzfhqVar = this.zza;
        zzfhg zzfhgVar = this.zzb;
        zzfhgVar.zze(true);
        zzfhqVar.zza(zzfhgVar);
    }
}
