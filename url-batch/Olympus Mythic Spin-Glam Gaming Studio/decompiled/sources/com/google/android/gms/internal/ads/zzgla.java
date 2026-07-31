package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzgla implements zzggu {
    private final zzinq zza;
    private final zzinq zzb;
    private final zzinq zzc;
    private final boolean zzd;
    private final long zze;

    zzgla(zzinq zzinqVar, zzinq zzinqVar2, zzinq zzinqVar3, boolean z, long j) {
        this.zza = zzinqVar;
        this.zzb = zzinqVar2;
        this.zzc = zzinqVar3;
        this.zzd = z;
        this.zze = j;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final String zza() {
        return ((zzgmf) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzb() {
        if (this.zzd) {
            return (zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzg(zzhcq.zzw(((zzgls) this.zza.zzb()).zzb()), Throwable.class, zzgkw.zza, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgkx
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzgla.this.zzj((zzglr) obj);
                }
            }, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgky
                @Override // com.google.android.gms.internal.ads.zzhcg
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzgla.this.zzk((Boolean) obj);
                }
            }, zzhdp.zza());
        }
        zzhcq zzhcqVar = (zzhcq) zzhcy.zzj((zzhcq) zzhcy.zzg(zzhcq.zzw(((zzgnz) this.zzc.zzb()).zza()), Throwable.class, zzgkz.zza, zzhdp.zza()), new zzhcg() { // from class: com.google.android.gms.internal.ads.zzgku
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgla.this.zzh((Boolean) obj);
            }
        }, zzhdp.zza());
        zzhcqVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgkv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgla.this.zzi();
            }
        }, zzhdp.zza());
        return zzhcqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzc(Context context) {
        return ((zzgmf) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zzd(Context context, String str, View view, Activity activity) {
        return ((zzgmf) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final ListenableFuture zze(Context context, String str, View view, Activity activity) {
        return ((zzgmf) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final void zzf(InputEvent inputEvent) {
        ((zzgmf) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzggu
    public final int zzg() {
        return ((zzgmf) this.zzb.zzb()).zzg();
    }

    final /* synthetic */ ListenableFuture zzh(Boolean bool) {
        return ((zzgmf) this.zzb.zzb()).zzb();
    }

    final /* synthetic */ void zzi() {
        ((zzgls) this.zza.zzb()).zza(this.zze);
    }

    final /* synthetic */ ListenableFuture zzj(zzglr zzglrVar) {
        return ((zzgnz) this.zzc.zzb()).zza();
    }

    final /* synthetic */ ListenableFuture zzk(Boolean bool) {
        return ((zzgmf) this.zzb.zzb()).zzb();
    }
}
