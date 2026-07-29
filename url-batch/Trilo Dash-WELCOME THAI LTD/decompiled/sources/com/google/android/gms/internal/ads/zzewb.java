package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzewb implements zzemr {
    final /* synthetic */ zzewc zza;

    zzewb(zzewc zzewcVar) {
        this.zza = zzewcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemr
    public final void zza() {
        this.zza.zza = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r0.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhy.zzei)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzemr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        com.google.android.gms.ads.internal.client.zzq zza;
        ViewGroup viewGroup5;
        com.google.android.gms.ads.internal.client.zzq zza2;
        zzexc zzexcVar;
        zzcfo zzcfoVar;
        zzcvd zzcvdVar = (zzcvd) obj;
        zzcvd zzcvdVar2 = this.zza.zza;
        if (zzcvdVar2 != null) {
            zzcvdVar2.zzV();
        }
        zzewc zzewcVar = this.zza;
        zzewcVar.zza = zzcvdVar;
        viewGroup = zzewcVar.zzd;
        viewGroup.removeAllViews();
        viewGroup2 = this.zza.zzd;
        View zzb = zzcvdVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        viewGroup2.addView(zzb, com.google.android.gms.ads.internal.util.zzs.zzn());
        if (!zzcvdVar.zze()) {
            zzcfoVar = this.zza.zzi;
        }
        com.google.android.gms.ads.internal.overlay.zzr zze = zzewc.zze(this.zza, zzcvdVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != zzcvdVar.zzh() ? 9 : 11);
        zze.zzb(zzcvdVar.zzg() && !zzcvdVar.zzf());
        viewGroup3 = this.zza.zzd;
        viewGroup3.addView(zze, layoutParams);
        zzcvdVar.zzd(this.zza);
        zzewc zzewcVar2 = this.zza;
        viewGroup4 = zzewcVar2.zzd;
        zza = zzfcc.zza(zzewcVar2.zzc, Collections.singletonList(zzewcVar2.zza.zzc()));
        viewGroup4.setMinimumHeight(zza.zzc);
        zzewc zzewcVar3 = this.zza;
        viewGroup5 = zzewcVar3.zzd;
        zza2 = zzfcc.zza(zzewcVar3.zzc, Collections.singletonList(zzewcVar3.zza.zzc()));
        viewGroup5.setMinimumWidth(zza2.zzf);
        zzewc zzewcVar4 = this.zza;
        zzexcVar = zzewcVar4.zzh;
        zzexcVar.zzl(new zzcvq(zzcvdVar, zzewcVar4));
        zzcvdVar.zzW();
    }
}
