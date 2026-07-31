package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzdjs implements zzinw {
    private final zzdjp zza;

    private zzdjs(zzdjp zzdjpVar) {
        this.zza = zzdjpVar;
    }

    public static zzdjs zza(zzdjp zzdjpVar) {
        return new zzdjs(zzdjpVar);
    }

    public static Set zzc(zzdjp zzdjpVar) {
        Set emptySet = Collections.emptySet();
        zzioe.zzb(emptySet);
        return emptySet;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzc(this.zza);
    }
}
