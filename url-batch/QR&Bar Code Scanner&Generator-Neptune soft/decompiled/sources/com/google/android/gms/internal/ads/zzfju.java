package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfju implements Runnable {
    private final zzfjw zzb;
    private String zzc;
    private String zzd;
    private zzfdv zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    zzfju(zzfjw zzfjwVar) {
        this.zzb = zzfjwVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfju zza(zzfjj zzfjjVar) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfjjVar.zzg();
            list.add(zzfjjVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzchc.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhz)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfju zzb(String str) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue() && zzfjt.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfju zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfju zzd(ArrayList arrayList) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfju zze(String str) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfju zzf(zzfdv zzfdvVar) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            this.zze = zzfdvVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfjj zzfjjVar : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfjjVar.zzk(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfjjVar.zzd(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfjjVar.zzi()) {
                    zzfjjVar.zzc(this.zzd);
                }
                zzfdv zzfdvVar = this.zze;
                if (zzfdvVar != null) {
                    zzfjjVar.zzb(zzfdvVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzfjjVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfjjVar.zzj());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfju zzh(int i) {
        if (((Boolean) zzbkl.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
