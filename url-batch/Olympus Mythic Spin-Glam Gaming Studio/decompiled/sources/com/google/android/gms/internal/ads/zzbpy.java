package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
final /* synthetic */ class zzbpy implements zzgub {
    static final /* synthetic */ zzbpy zza = new zzbpy();

    private /* synthetic */ zzbpy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zzbqh zzbqhVar = zzbqg.zza;
        if (!((Boolean) zzblg.zzi.zze()).booleanValue()) {
            return "failure_click_attok";
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "prepareClickUrl.attestation1");
        return "failure_click_attok";
    }
}
