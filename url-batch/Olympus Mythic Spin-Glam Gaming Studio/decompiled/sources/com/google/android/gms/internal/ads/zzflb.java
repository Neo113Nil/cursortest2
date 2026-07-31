package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzflb implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;

    private zzflb(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
    }

    public static zzflb zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzflb(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfla((zzfkq) this.zza.zzb(), (zzfkh) this.zzb.zzb(), (zzflp) this.zzc.zzb());
    }
}
