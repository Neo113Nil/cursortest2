package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.6.0 */
/* loaded from: classes5.dex */
public abstract class zzhgm implements zzhka {
    static {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhka
    public final /* synthetic */ Object zza(InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        zzhku zzaU;
        zzhhg zzF = zzhhg.zzF(inputStream, 4096);
        zzhjs zzhjsVar = (zzhjs) zzb(zzF, zzhhrVar);
        zzF.zzb(0);
        if (zzhjsVar == null || zzhjsVar.zzbi()) {
            return zzhjsVar;
        }
        if (zzhjsVar instanceof zzhgk) {
            zzaU = ((zzhgk) zzhjsVar).zzaU();
        } else {
            if (zzhjsVar instanceof zzhgl) {
                throw null;
            }
            zzaU = new zzhku(zzhjsVar);
        }
        throw zzaU.zza();
    }
}
