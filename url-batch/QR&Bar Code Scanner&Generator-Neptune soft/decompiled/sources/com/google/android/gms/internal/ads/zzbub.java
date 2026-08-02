package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbub {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbuk zzc;
    private zzbuk zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbuk zza(Context context, zzcgv zzcgvVar, zzfjw zzfjwVar) {
        zzbuk zzbukVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbuk(zzc(context), zzcgvVar, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zza), zzfjwVar);
            }
            zzbukVar = this.zzc;
        }
        return zzbukVar;
    }

    public final zzbuk zzb(Context context, zzcgv zzcgvVar, zzfjw zzfjwVar) {
        zzbuk zzbukVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbuk(zzc(context), zzcgvVar, (String) zzblb.zzb.zze(), zzfjwVar);
            }
            zzbukVar = this.zzd;
        }
        return zzbukVar;
    }
}
