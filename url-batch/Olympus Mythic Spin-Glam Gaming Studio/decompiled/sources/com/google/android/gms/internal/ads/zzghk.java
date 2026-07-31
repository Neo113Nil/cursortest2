package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzghk implements zzggu {
    private final ExecutorService zza;
    private final zzinq zzb;
    private final zzinq zzc;
    private final zzgqc zzd;
    private final zzinq zze;
    private final zziol zzf;
    private final zzgei zzg;

    zzghk(ExecutorService executorService, zzinq zzinqVar, zzinq zzinqVar2, zzgqc zzgqcVar, zzinq zzinqVar3, zziol zziolVar, zzgei zzgeiVar) {
        this.zza = executorService;
        this.zzb = zzinqVar;
        this.zzc = zzinqVar2;
        this.zzd = zzgqcVar;
        this.zze = zzinqVar3;
        this.zzf = zziolVar;
        this.zzg = zzgeiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final String zza() {
        return "1.904631200";
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzb() {
        return zzhcy.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzghj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzghk.this.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzc(Context context) {
        zzgia zzh = ((zzgia) this.zzf.zzb()).zzh(context);
        zzh.zzd(this.zzd.zzb());
        zzh.zzc(zzaza.zzj());
        zzh.zzb(zzgff.QUERY);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzgia zzh = ((zzgia) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(activity);
        zzh.zze(true != this.zzg.zzh() ? "" : null);
        zzh.zzd(this.zzd.zzc(context, view));
        zzh.zzc(zzaza.zzj());
        zzh.zzb(zzgff.VIEW);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzinq zzinqVar = this.zze;
        Map zzd = this.zzd.zzd();
        ((zzghs) zzinqVar.zzb()).zzb(zzd);
        zzgia zzh = ((zzgia) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(null);
        zzh.zze(str);
        zzh.zzd(zzd);
        zzh.zzb(zzgff.CLICK);
        zzh.zzc(zzaza.zzj());
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzghs) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ Void zzh() {
        ((zzgid) this.zzc.zzb()).zza();
        ((zzgiw) this.zzb.zzb()).zza();
        return null;
    }
}
