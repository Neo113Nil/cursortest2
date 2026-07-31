package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdwq implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzdwq(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzdwq zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzdwq(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        int i = ((zzddg) this.zzc).zza().zzp.zza;
        if (i != 0) {
            return i + (-1) != 0 ? ((zzert) this.zzb).zzb() : ((zzert) this.zza).zzb();
        }
        throw null;
    }
}
