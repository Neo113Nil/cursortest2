package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzgon implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzgon(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzgon zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzgon(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        zziof zziofVar = this.zzc;
        zziof zziofVar2 = this.zzb;
        zzinq zzc = zzinv.zzc(this.zza);
        zzinq zzc2 = zzinv.zzc(zziofVar2);
        if (true == ((zzgei) zziofVar.zzb()).zzu()) {
            zzc = zzc2;
        }
        zzgoa zzgoaVar = (zzgoa) zzc.zzb();
        zzioe.zzb(zzgoaVar);
        return zzgoaVar;
    }
}
