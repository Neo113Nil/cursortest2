package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import io.invertase.googlemobileads.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdvs implements zzdwu, zzdvd {
    private final zzdwd zza;
    private final zzdwv zzb;
    private final zzdve zzc;
    private final zzdvn zzd;
    private final zzdvc zze;
    private final zzdwp zzf;
    private final zzdvz zzg;
    private final zzdvz zzh;
    private final String zzi;
    private final Context zzj;

    @Nullable
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW;
    private long zzq = Long.MAX_VALUE;
    private zzdvo zzr = zzdvo.NONE;
    private zzdvr zzv = zzdvr.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    zzdvs(zzdwd zzdwdVar, zzdwv zzdwvVar, zzdve zzdveVar, Context context, VersionInfoParcel versionInfoParcel, zzdvn zzdvnVar, zzdwp zzdwpVar, zzdvz zzdvzVar, zzdvz zzdvzVar2, @Nullable String str) {
        this.zza = zzdwdVar;
        this.zzb = zzdwvVar;
        this.zzc = zzdveVar;
        this.zze = new zzdvc(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzdvnVar;
        this.zzf = zzdwpVar;
        this.zzg = zzdvzVar;
        this.zzh = zzdvzVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzt.zzo().zza(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzu((zzdvo) Enum.valueOf(zzdvo.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:15:0x0026, B:17:0x0035, B:21:0x002a, B:23:0x0030), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzt(boolean z, boolean z2) {
        if (this.zzs != z) {
            this.zzs = z;
            if (z) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzo().zzk()) {
                    zzx();
                    if (z2) {
                        zzz();
                        return;
                    }
                }
            }
            if (!zzs()) {
                zzy();
            }
            if (z2) {
            }
        }
    }

    private final synchronized void zzu(zzdvo zzdvoVar, boolean z) {
        if (this.zzr != zzdvoVar) {
            if (zzs()) {
                zzy();
            }
            this.zzr = zzdvoVar;
            if (zzs()) {
                zzx();
            }
            if (z) {
                zzz();
            }
        }
    }

    private final synchronized JSONObject zzv() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzl.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdvg zzdvgVar : (List) entry.getValue()) {
                if (zzdvgVar.zzc()) {
                    jSONArray.put(zzdvgVar.zzg());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzw() {
        this.zzu = true;
        this.zzd.zza();
        this.zza.zzl(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        this.zzf.zzb(this);
        zzbbz zzbbzVar = zzbci.zzkm;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar))) {
            this.zzg.zza(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).split(f.f598a)));
        }
        zzbbz zzbbzVar2 = zzbci.zzkn;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar2))) {
            this.zzh.zza(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar2)).split(f.f598a)));
        }
        zzA(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzH());
        this.zzx = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzN();
    }

    private final synchronized void zzx() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzz() {
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzI(zzh());
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zzo().zzJ()) {
                zzw();
                return;
            }
            String zzH = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzH();
            if (TextUtils.isEmpty(zzH)) {
                return;
            }
            try {
                if (new JSONObject(zzH).optBoolean("isTestMode", false)) {
                    zzw();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(boolean z) {
        if (!this.zzu) {
            if (z) {
                zzw();
                if (!this.zzs) {
                    zzx();
                    return;
                }
            }
            if (zzs()) {
                return;
            }
            zzy();
        }
    }

    public final void zzc(boolean z) {
        if (!this.zzu && z) {
            zzw();
        }
        zzt(z, true);
    }

    public final synchronized boolean zzd() {
        return this.zzs;
    }

    public final void zze(zzdvo zzdvoVar) {
        zzu(zzdvoVar, true);
    }

    public final zzdvo zzf() {
        return this.zzr;
    }

    public final synchronized String zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && zzs()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                this.zzo = BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW;
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals(BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzz();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzO(this.zzx);
    }

    public final synchronized void zzk(String str, zzdvg zzdvgVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue() && zzs()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjK)).intValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzdvgVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkg)).booleanValue()) {
                String zzd = zzdvgVar.zzd();
                this.zzm.put(zzd, zzdvgVar);
                Map map2 = this.zzn;
                if (map2.containsKey(zzd)) {
                    List list = (List) map2.get(zzd);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzbzm) it.next()).zzc(zzdvgVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void zzl(long j) {
        this.zzw += j;
    }

    public final boolean zzm() {
        return this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkd)).longValue();
    }

    public final synchronized ListenableFuture zzn(String str) {
        zzbzm zzbzmVar;
        zzbzmVar = new zzbzm();
        Map map = this.zzm;
        if (map.containsKey(str)) {
            zzbzmVar.zzc((zzdvg) map.get(str));
        } else {
            Map map2 = this.zzn;
            if (!map2.containsKey(str)) {
                map2.put(str, new ArrayList());
            }
            ((List) map2.get(str)).add(zzbzmVar);
        }
        return zzbzmVar;
    }

    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzdn zzdnVar, zzdvr zzdvrVar) {
        if (!zzs()) {
            try {
                zzdnVar.zze(zzfee.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjI)).booleanValue()) {
            this.zzv = zzdvrVar;
            this.zza.zzm(zzdnVar, new zzbkg(this), new zzbjz(this.zzf), new zzbjm(this));
            return;
        } else {
            try {
                zzdnVar.zze(zzfee.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzp(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final boolean zzq() {
        return this.zzp != null;
    }

    public final synchronized JSONObject zzr() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            String str = this.zzk;
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append("afma-sdk-a-v");
                sb.append(str);
                jSONObject.put("sdkVersion", sb.toString());
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkj)).booleanValue()) {
                String zzu = com.google.android.gms.ads.internal.zzt.zzh().zzu();
                if (!TextUtils.isEmpty(zzu)) {
                    jSONObject.put("plugin", zzu);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() / 1000) {
                this.zzo = BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW;
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzv());
            jSONObject.put("appInfo", this.zze.zza());
            String zzd = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzd();
            if (!TextUtils.isEmpty(zzd)) {
                jSONObject.put("cld", new JSONObject(zzd));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjY)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                String obj = jSONObject2.toString();
                StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                sb2.append("Server data: ");
                sb2.append(obj);
                String sb3 = sb2.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb3);
                jSONObject.put("serverData", this.zzp);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzt.zzo().zzk());
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.client.zzbb.zza();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzw());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkl)).booleanValue()) {
                jSONObject.put("uiStorage", new JSONObject(this.zzx));
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkn))) {
                jSONObject.put("gmaDisk", this.zzh.zzb());
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkm))) {
                jSONObject.put("userDisk", this.zzg.zzb());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "Inspector.toJson");
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized boolean zzs() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjX)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzt.zzo().zzk();
        }
        return this.zzs;
    }
}
