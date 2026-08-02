package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfkm {
    private final Context zza;
    private final Executor zzb;
    private final zzcgu zzc;
    private final zzfjw zzd;

    zzfkm(Context context, Executor executor, zzcgu zzcguVar, zzfjw zzfjwVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcguVar;
        this.zzd = zzfjwVar;
    }

    final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    final /* synthetic */ void zzb(String str, zzfju zzfjuVar) {
        zzfjj zza = zzfji.zza(this.zza, 14);
        zza.zzf();
        zza.zze(this.zzc.zza(str));
        if (zzfjuVar == null) {
            this.zzd.zzb(zza.zzj());
        } else {
            zzfjuVar.zza(zza);
            zzfjuVar.zzg();
        }
    }

    public final void zzc(final String str, final zzfju zzfjuVar) {
        if (zzfjw.zza() && ((Boolean) zzbkl.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkl
                @Override // java.lang.Runnable
                public final void run() {
                    zzfkm.this.zzb(str, zzfjuVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkk
                @Override // java.lang.Runnable
                public final void run() {
                    zzfkm.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
