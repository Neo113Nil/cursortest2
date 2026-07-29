package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzcyx implements zzfuw {
    final /* synthetic */ zzcyz zza;

    zzcyx(zzcyz zzcyzVar) {
        this.zza = zzcyzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzdgw zzdgwVar;
        zzdgwVar = this.zza.zzf;
        zzdgwVar.zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdgw zzdgwVar;
        zzdgwVar = this.zza.zzf;
        zzdgwVar.zzk(true);
    }
}
