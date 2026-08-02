package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewc implements zzeve {
    private final Context zza;
    private final String zzb;
    private final zzfzq zzc;

    public zzewc(zzcbe zzcbeVar, Context context, String str, zzfzq zzfzqVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzewd(new JSONObject());
            }
        });
    }
}
