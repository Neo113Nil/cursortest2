package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcon {
    private zzcgv zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzcon zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcon zzd(zzcgv zzcgvVar) {
        this.zza = zzcgvVar;
        return this;
    }
}
