package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfas implements zzfsm {
    final /* synthetic */ zzfav zza;

    zzfas(zzfav zzfavVar) {
        this.zza = zzfavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsm
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfau zzfauVar;
        zzcbc zzcbcVar = (zzcbc) obj;
        this.zza.zzd = new zzfau(zzcbcVar, new zzfgc(zzcbcVar.zzj), null);
        zzfauVar = this.zza.zzd;
        return zzfauVar;
    }
}
