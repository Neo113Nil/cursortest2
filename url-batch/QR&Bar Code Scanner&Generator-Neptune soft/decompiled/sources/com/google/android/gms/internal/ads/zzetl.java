package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzetl implements zzeve {
    private final zzfzq zza;
    private final Context zzb;
    private final Set zzc;

    public zzetl(zzfzq zzfzqVar, Context context, Set set) {
        this.zza = zzfzqVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetl.this.zzc();
            }
        });
    }

    final /* synthetic */ zzetm zzc() throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                com.google.android.gms.ads.internal.zzt.zzA();
                return new zzetm(true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzeg)).booleanValue() ? "a.1.3.31-google_20220407" : null);
            }
        }
        return new zzetm(null);
    }
}
