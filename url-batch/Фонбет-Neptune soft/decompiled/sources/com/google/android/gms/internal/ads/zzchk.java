package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzchk implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;

    public zzchk(zzhfu zzhfuVar, zzhfu zzhfuVar2) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbuv zzb() {
        Context zza = ((zzcgp) this.zza).zza();
        zzfki zzfkiVar = (zzfki) this.zzb.zzb();
        com.google.android.gms.ads.internal.zzu.zzf().zzb(zza, VersionInfoParcel.forPackage(), zzfkiVar).zza("google.afma.request.getAdDictionary", zzbnl.zza, zzbnl.zza);
        zzbno zzb = com.google.android.gms.ads.internal.zzu.zzf().zzb(zza, VersionInfoParcel.forPackage(), zzfkiVar);
        zzbni zzbniVar = zzbnl.zza;
        return new zzbux(zza, zzb.zza("google.afma.sdkConstants.getSdkConstants", zzbniVar, zzbniVar), VersionInfoParcel.forPackage());
    }
}
