package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcvw implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;

    private zzcvw(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
    }

    public static zzcvw zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4) {
        return new zzcvw(zziofVar, zziofVar2, zziofVar3, zziofVar4);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzers((zzfqi) this.zza.zzb(), (zzhdi) this.zzb.zzb(), ((zzerm) this.zzd).zzb(), ((zzenj) this.zzc).zzb());
    }
}
