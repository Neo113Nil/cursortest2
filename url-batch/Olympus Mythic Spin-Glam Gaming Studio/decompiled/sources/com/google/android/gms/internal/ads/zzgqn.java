package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzgqn implements zzgqe, zzggg {
    private final Context zza;
    private final zzgrh zzb;
    private final zzhdi zzc;
    private final zzgei zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private ListenableFuture zzf = zzhcy.zza(null);

    zzgqn(Context context, zzgrh zzgrhVar, zzhdi zzhdiVar, zzgei zzgeiVar) {
        this.zza = context;
        this.zzb = zzgrhVar;
        this.zzc = zzhdiVar;
        this.zzd = zzgeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ListenableFuture zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zze()) ? zzhcy.zzb() : this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgqm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgqn.this.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    final /* synthetic */ void zze() {
        ListenableFuture submit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgql
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgqn.this.zzf();
            }
        });
        this.zzb.zze(53, submit);
        this.zzf = submit;
    }

    final /* synthetic */ zzaza zzf() {
        Context context = this.zza;
        try {
            return zzfyp.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}
