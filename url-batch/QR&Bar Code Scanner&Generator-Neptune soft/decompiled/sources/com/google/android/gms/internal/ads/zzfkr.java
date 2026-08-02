package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfkr {
    public abstract void zzb(View view, zzfkx zzfkxVar, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzfkr zza(zzfks zzfksVar, zzfkt zzfktVar) {
        if (zzfkp.zzb()) {
            return new zzfkv(zzfksVar, zzfktVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
