package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzzp extends zzxc {
    private final zzak zzc;

    private zzzp(zzbf zzbfVar, zzak zzakVar) {
        super(zzbfVar);
        this.zzc = zzakVar;
    }

    public static zzzp zzp(zzbf zzbfVar, zzak zzakVar) {
        return zzbfVar instanceof zzzp ? new zzzp(((zzzp) zzbfVar).zzb, zzakVar) : new zzzp(zzbfVar, zzakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxc, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i, zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        zzak zzakVar = this.zzc;
        zzbeVar.zzd = zzakVar;
        zzag zzagVar = zzakVar.zzb;
        zzbeVar.zzc = null;
        return zzbeVar;
    }
}
