package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdkc implements zzinw {
    private final zzdjp zza;

    private zzdkc(zzdjp zzdjpVar) {
        this.zza = zzdjpVar;
    }

    public static zzdkc zza(zzdjp zzdjpVar) {
        return new zzdkc(zzdjpVar);
    }

    public static Set zzc(zzdjp zzdjpVar) {
        return zzdjpVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
