package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdyn implements zzdfv, com.google.android.gms.ads.internal.client.zza, zzdda, zzddu, zzddv, zzdeo, zzddd, zzasf, zzfii {
    private final List zza;
    private final zzdyb zzb;
    private long zzc;

    public zzdyn(zzdyb zzdybVar, zzcom zzcomVar) {
        this.zzb = zzdybVar;
        this.zza = Collections.singletonList(zzcomVar);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zze(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zze(zzddd.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzb(zzfdw zzfdwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final void zzbE(zzcbc zzcbcVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zze(zzdfv.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbF(zzfib zzfibVar, String str) {
        zze(zzfia.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzbG(zzfib zzfibVar, String str, Throwable th) {
        zze(zzfia.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbq(Context context) {
        zze(zzddv.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbs(Context context) {
        zze(zzddv.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddv
    public final void zzbt(Context context) {
        zze(zzddv.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzasf
    public final void zzbu(String str, String str2) {
        zze(zzasf.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzbv() {
        zze(zzdda.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzc(zzfib zzfibVar, String str) {
        zze(zzfia.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfii
    public final void zzd(zzfib zzfibVar, String str) {
        zze(zzfia.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzj() {
        zze(zzdda.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzl() {
        zze(zzddu.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzm() {
        zze(zzdda.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
        zze(zzdeo.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzo() {
        zze(zzdda.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    @ParametersAreNonnullByDefault
    public final void zzp(zzcbs zzcbsVar, String str, String str2) {
        zze(zzdda.class, "onRewarded", zzcbsVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdda
    public final void zzr() {
        zze(zzdda.class, "onRewardedVideoStarted", new Object[0]);
    }
}
