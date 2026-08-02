package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeyf implements zzeou {
    final /* synthetic */ zzeyg zza;

    zzeyf(zzeyg zzeygVar) {
        this.zza = zzeygVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final void zza() {
        this.zza.zza = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
    
        if (r0.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbjc.zzep)).intValue()) goto L9;
     */
    @Override // com.google.android.gms.internal.ads.zzeou
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
        zzezg zzezgVar;
        zzcgv zzcgvVar;
        zzcwl zzcwlVar = (zzcwl) obj;
        zzcwl zzcwlVar2 = this.zza.zza;
        if (zzcwlVar2 != null) {
            zzcwlVar2.zzV();
        }
        zzeyg zzeygVar = this.zza;
        zzeygVar.zza = zzcwlVar;
        viewGroup = zzeygVar.zzd;
        viewGroup.removeAllViews();
        viewGroup2 = this.zza.zzd;
        View zzb = zzcwlVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        viewGroup2.addView(zzb, com.google.android.gms.ads.internal.util.zzs.zzn());
        if (!zzcwlVar.zze()) {
            zzcgvVar = this.zza.zzi;
        }
        com.google.android.gms.ads.internal.overlay.zzr zze = zzeyg.zze(this.zza, zzcwlVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != zzcwlVar.zzh() ? 9 : 11);
        zze.zzb(zzcwlVar.zzg() && !zzcwlVar.zzf());
        viewGroup3 = this.zza.zzd;
        viewGroup3.addView(zze, layoutParams);
        zzcwlVar.zzd(this.zza);
        zzeyg zzeygVar2 = this.zza;
        viewGroup4 = zzeygVar2.zzd;
        zza = zzfej.zza(zzeygVar2.zzc, Collections.singletonList(zzeygVar2.zza.zzc()));
        viewGroup4.setMinimumHeight(zza.zzc);
        zzeyg zzeygVar3 = this.zza;
        viewGroup5 = zzeygVar3.zzd;
        zza2 = zzfej.zza(zzeygVar3.zzc, Collections.singletonList(zzeygVar3.zza.zzc()));
        viewGroup5.setMinimumWidth(zza2.zzf);
        zzeyg zzeygVar4 = this.zza;
        zzezgVar = zzeygVar4.zzh;
        zzezgVar.zzl(new zzcwy(zzcwlVar, zzeygVar4));
        zzcwlVar.zzW();
    }
}
