package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfar implements zzfsm {
    final /* synthetic */ zzfav zza;

    zzfar(zzfav zzfavVar) {
        this.zza = zzfavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfga zze;
        zzfau zzfauVar;
        zzcgp.zzh("", (zzedj) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzfav zzfavVar = this.zza;
        zze = zzfavVar.zze();
        zzfavVar.zzd = new zzfau(null, zze, null);
        zzfauVar = this.zza.zzd;
        return zzfauVar;
    }
}
