package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewr implements zzeve {
    final zzfzq zza;
    final Context zzb;
    final zzbee zzc;

    public zzewr(zzbee zzbeeVar, zzfzq zzfzqVar, Context context, byte[] bArr) {
        this.zzc = zzbeeVar;
        this.zza = zzfzqVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzews(new JSONObject());
            }
        });
    }
}
