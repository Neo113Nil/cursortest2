package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes.dex */
public final class zzau {
    private final zzk zza;
    private final zzi zzb;
    private final zzek zzc;
    private final zzbod zzd;
    private final zzccx zze;
    private final zzbyz zzf;
    private final zzboe zzg;
    private zzcah zzh;

    public zzau(zzk zzkVar, zzi zziVar, zzek zzekVar, zzbod zzbodVar, zzccx zzccxVar, zzbyz zzbyzVar, zzboe zzboeVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzekVar;
        this.zzd = zzbodVar;
        this.zze = zzccxVar;
        this.zzf = zzbyzVar;
        this.zzg = zzboeVar;
    }

    static /* bridge */ /* synthetic */ void zzs(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.zzb().zzm(context, zzaw.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbo zzc(Context context, String str, zzbvk zzbvkVar) {
        return (zzbo) new zzam(this, context, str, zzbvkVar).zzd(context, false);
    }

    public final zzbs zzd(Context context, zzq zzqVar, String str, zzbvk zzbvkVar) {
        return (zzbs) new zzai(this, context, zzqVar, str, zzbvkVar).zzd(context, false);
    }

    public final zzbs zze(Context context, zzq zzqVar, String str, zzbvk zzbvkVar) {
        return (zzbs) new zzak(this, context, zzqVar, str, zzbvkVar).zzd(context, false);
    }

    public final zzbmi zzg(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbmi) new zzaq(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbmo zzh(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbmo) new zzas(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbqu zzk(Context context, zzbvk zzbvkVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbqu) new zzag(this, context, zzbvkVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbyv zzl(Context context, zzbvk zzbvkVar) {
        return (zzbyv) new zzae(this, context, zzbvkVar).zzd(context, false);
    }

    public final zzbzc zzn(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            zzcgp.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbzc) zzaaVar.zzd(activity, z);
    }

    public final zzccl zzp(Context context, String str, zzbvk zzbvkVar) {
        return (zzccl) new zzat(this, context, str, zzbvkVar).zzd(context, false);
    }

    public final zzcfg zzq(Context context, zzbvk zzbvkVar) {
        return (zzcfg) new zzac(this, context, zzbvkVar).zzd(context, false);
    }
}
