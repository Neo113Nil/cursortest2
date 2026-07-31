package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.ironsource.X3;
import com.ironsource.Zf;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes11.dex */
public final class zzebi implements AppEventListener, zzdgv, com.google.android.gms.ads.internal.client.zza, zzddp, zzdej, zzdek, zzdfd, zzdds, zzfqj {
    private final List zza;
    private final zzeaw zzb;
    private long zzc;

    public zzebi(zzeaw zzeawVar, zzcob zzcobVar) {
        this.zzb = zzeawVar;
        this.zza = Collections.singletonList(zzcobVar);
    }

    private final void zzi(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, Zf.f, new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzi(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(Context context) {
        zzi(zzdek.class, X3.i.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzb(Context context) {
        zzi(zzdek.class, X3.i.u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzc(Context context) {
        zzi(zzdek.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzd(zzcch zzcchVar, String str, String str2) {
        zzi(zzddp.class, "onRewarded", zzcchVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(zzdds.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdK() {
        zzi(zzddp.class, Zf.k, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdL(zzfqc zzfqcVar, String str) {
        zzi(zzfqb.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdM(zzfqc zzfqcVar, String str) {
        zzi(zzfqb.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdN(zzfqc zzfqcVar, String str, Throwable th) {
        zzi(zzfqb.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdO(zzfqc zzfqcVar, String str) {
        zzi(zzfqb.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdP(zzcbv zzcbvVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(zzdgv.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdQ(zzflo zzfloVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void zzdr() {
        zzi(zzdej.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzds() {
        zzi(zzddp.class, Zf.g, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzdt() {
        zzi(zzddp.class, Zf.c, new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
        zzi(zzddp.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
        zzi(zzddp.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdfd
    public final void zzg() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(zzdfd.class, Zf.j, new Object[0]);
    }
}
