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

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfxa implements zzfwn {
    private final ExecutorService zza;
    private final zzhpr zzb;
    private final zzhpr zzc;
    private final zzgcx zzd;
    private final zzhpr zze;
    private final zzhqm zzf;
    private final zzfui zzg;

    zzfxa(ExecutorService executorService, zzhpr zzhprVar, zzhpr zzhprVar2, zzgcx zzgcxVar, zzhpr zzhprVar3, zzhqm zzhqmVar, zzfui zzfuiVar) {
        this.zza = executorService;
        this.zzb = zzhprVar;
        this.zzc = zzhprVar2;
        this.zzd = zzgcxVar;
        this.zze = zzhprVar3;
        this.zzf = zzhqmVar;
        this.zzg = zzfuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final String zza() {
        return "1.794714348";
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zzb() {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfwz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfxa.this.zzh();
                return null;
            }
        }, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zzc(Context context) {
        zzfxq zzh = ((zzfxq) this.zzf.zzb()).zzh(context);
        zzh.zzd(this.zzd.zzb());
        zzh.zzc(zzast.zzi());
        zzh.zzb(zzfvd.QUERY);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        zzfxq zzh = ((zzfxq) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(activity);
        zzh.zze(true != this.zzg.zze() ? "" : null);
        zzh.zzd(this.zzd.zzc(context, view));
        zzh.zzc(zzast.zzi());
        zzh.zzb(zzfvd.VIEW);
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        zzhpr zzhprVar = this.zze;
        Map zzd = this.zzd.zzd();
        ((zzfxi) zzhprVar.zzb()).zzb(zzd);
        zzfxq zzh = ((zzfxq) this.zzf.zzb()).zzh(context);
        zzh.zzg(view);
        zzh.zzf(null);
        zzh.zze(str);
        zzh.zzd(zzd);
        zzh.zzb(zzfvd.CLICK);
        zzh.zzc(zzast.zzi());
        return zzh.zza().zza().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final void zzf(InputEvent inputEvent) {
        if (inputEvent instanceof MotionEvent) {
            ((zzfxi) this.zze.zzb()).zza((MotionEvent) inputEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final int zzg() {
        return 2;
    }

    final /* synthetic */ Void zzh() {
        ((zzfxt) this.zzc.zzb()).zza();
        ((zzfym) this.zzb.zzb()).zza();
        return null;
    }
}
