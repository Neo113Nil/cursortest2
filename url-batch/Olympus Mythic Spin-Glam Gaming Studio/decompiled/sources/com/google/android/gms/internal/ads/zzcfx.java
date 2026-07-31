package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.applovin.impl.n7$$ExternalSyntheticBackport3;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.AdActivity;
import com.safedk.android.analytics.brandsafety.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcfx {

    @VisibleForTesting
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzl;

    @VisibleForTesting
    long zza = -1;

    @VisibleForTesting
    long zzb = -1;

    @VisibleForTesting
    int zzc = -1;

    @VisibleForTesting
    int zzd = -1;

    @VisibleForTesting
    long zze = 0;
    private final Object zzj = new Object();
    private final Object zzk = new Object();

    @VisibleForTesting
    int zzg = 0;

    @VisibleForTesting
    int zzh = 0;

    @VisibleForTesting
    int zzi = 0;
    private int zzm = 0;
    private final Map zzn = new HashMap();
    private final Map zzo = new HashMap();

    public zzcfx(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzl = zzgVar;
    }

    private final void zzj() {
        if (((Boolean) zzblo.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }

    public final int zzd() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzl;
                long zzm = zzgVar.zzm();
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzb == -1) {
                    if (currentTimeMillis - zzm > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbL)).longValue()) {
                        this.zzd = -1;
                    } else {
                        this.zzd = zzgVar.zzo();
                    }
                    this.zzb = j;
                    this.zza = j;
                } else {
                    this.zza = j;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeF)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.zzc++;
                    int i = this.zzd + 1;
                    this.zzd = i;
                    if (i == 0) {
                        this.zze = 0L;
                        zzgVar.zzp(currentTimeMillis);
                    } else {
                        this.zze = currentTimeMillis - zzgVar.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        zzj();
    }

    public final void zzg() {
        zzj();
    }

    public final Bundle zzh(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            try {
                bundle = new Bundle();
                if (!this.zzl.zzx()) {
                    bundle.putString(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.zzf);
                }
                bundle.putLong("basets", this.zzb);
                bundle.putLong("currts", this.zza);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.zzc);
                bundle.putInt("preqs_in_session", this.zzd);
                bundle.putLong("time_in_session", this.zze);
                bundle.putInt("pclick", this.zzg);
                bundle.putInt("pimp", this.zzh);
                Context zza = zzccf.zza(context);
                int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z = false;
                if (identifier == 0) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                            z = true;
                        } else {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to fetch AdActivity theme");
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z);
                bundle.putInt("consent_form_action_identifier", zzd());
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    public final zzcfw zzi(Set set, @Nullable String str) {
        synchronized (this.zzk) {
            try {
                int i = this.zzm;
                this.zzm = i + 1;
                if (set.isEmpty()) {
                    return new zzcfw(i, -1, -1);
                }
                String m = n7$$ExternalSyntheticBackport3.m(StringUtils.COMMA, new TreeSet(set));
                Map map = this.zzn;
                Integer num = (Integer) map.get(m);
                int i2 = 0;
                int intValue = num == null ? 0 : num.intValue();
                map.put(m, Integer.valueOf(intValue + 1));
                if (str == null) {
                    return new zzcfw(i, intValue, -1);
                }
                StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(m).length());
                sb.append(str);
                sb.append(m.ad);
                sb.append(m);
                String sb2 = sb.toString();
                Map map2 = this.zzo;
                Integer num2 = (Integer) map2.get(sb2);
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                map2.put(sb2, Integer.valueOf(i2 + 1));
                return new zzcfw(i, intValue, i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
