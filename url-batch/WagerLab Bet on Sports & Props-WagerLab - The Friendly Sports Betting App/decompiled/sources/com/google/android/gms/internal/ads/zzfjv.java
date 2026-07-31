package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzfjv {
    private final Context zza;
    private final Executor zzb;
    private final zzgpe zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzfjn zze;
    private final zzfie zzf;

    zzfjv(Context context, Executor executor, zzgpe zzgpeVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzfjn zzfjnVar, zzfie zzfieVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzgpeVar;
        this.zzd = zzuVar;
        this.zze = zzfjnVar;
        this.zzf = zzfieVar;
    }

    public final void zza(List list, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), zzvVar, null, null);
        }
    }

    public final void zzb(final String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar, zzfib zzfibVar, zzcyh zzcyhVar) {
        ListenableFuture zzc;
        zzfhr zzfhrVar = null;
        if (zzfie.zza() && ((Boolean) zzbeb.zzd.zze()).booleanValue()) {
            zzfhrVar = zzfhr.zzn(this.zza, 14);
            zzfhrVar.zza();
        }
        if (zzvVar != null) {
            zzc = new zzfjm(zzvVar.zza(), this.zzd, this.zzc, this.zze).zza(str);
        } else {
            zzc = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfju
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzfjv.this.zzc(str);
                }
            });
        }
        zzgot.zzq(zzc, new zzfjt(this, zzfhrVar, zzfibVar, zzcyhVar), this.zzb);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzt zzc(String str) {
        return this.zzd.zza(str);
    }

    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzu zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfie zze() {
        return this.zzf;
    }
}
