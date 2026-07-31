package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzhgq implements zzhmt {
    static final /* synthetic */ zzhgq zza = new zzhgq();

    private /* synthetic */ zzhgq() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) {
        zzhgu zzhguVar = (zzhgu) zzhfjVar;
        int i = zzhgr.zza;
        if (zzhguVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
        }
        zzhgn zzhgnVar = new zzhgn(null);
        zzhgnVar.zza(zzhguVar);
        zzhgnVar.zzc(num);
        zzhgnVar.zzb(zzicj.zzb(zzhguVar.zzc()));
        return zzhgnVar.zzd();
    }
}
