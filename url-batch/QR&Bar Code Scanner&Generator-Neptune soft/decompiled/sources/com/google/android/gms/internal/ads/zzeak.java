package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeak implements zzebf, zzdzv {
    private final zzeas zza;
    private final zzebg zzb;
    private final zzdzw zzc;
    private final zzeaf zzd;
    private final zzdzu zze;
    private final zzebe zzf;
    private final String zzg;
    private boolean zzp;
    private int zzq;
    private boolean zzr;
    private final Map zzi = new HashMap();
    private final Map zzj = new HashMap();
    private final Map zzk = new HashMap();
    private String zzl = "{}";
    private String zzm = "";
    private long zzn = Long.MAX_VALUE;
    private zzeag zzo = zzeag.NONE;
    private zzeaj zzs = zzeaj.UNKNOWN;
    private final String zzh = "afma-sdk-a-v21.3.0";

    zzeak(zzeas zzeasVar, zzebg zzebgVar, zzdzw zzdzwVar, Context context, zzcgv zzcgvVar, zzeaf zzeafVar, zzebe zzebeVar) {
        this.zza = zzeasVar;
        this.zzb = zzebgVar;
        this.zzc = zzdzwVar;
        this.zze = new zzdzu(context);
        this.zzg = zzcgvVar.zza;
        this.zzd = zzeafVar;
        this.zzf = zzebeVar;
        com.google.android.gms.ads.internal.zzt.zzs().zzg(this);
    }

    private final synchronized JSONObject zzp() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzi.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdzy zzdzyVar : (List) entry.getValue()) {
                if (zzdzyVar.zzg()) {
                    jSONArray.put(zzdzyVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzq() {
        this.zzr = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzc(this);
        this.zzc.zzc(this);
        this.zzf.zzd(this);
        zzw(com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo());
    }

    private final void zzr() {
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzG(zzd());
    }

    private final synchronized void zzs(zzeag zzeagVar, boolean z) {
        if (this.zzo == zzeagVar) {
            return;
        }
        if (zzn()) {
            zzu();
        }
        this.zzo = zzeagVar;
        if (zzn()) {
            zzv();
        }
        if (z) {
            zzr();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0007, B:10:0x000b, B:12:0x001d, B:14:0x0027, B:16:0x0036, B:22:0x002b, B:24:0x0031), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzt(boolean z, boolean z2) {
        if (this.zzp == z) {
            return;
        }
        this.zzp = z;
        if (z) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhT)).booleanValue() || !com.google.android.gms.ads.internal.zzt.zzs().zzl()) {
                zzv();
                if (z2) {
                    return;
                }
                zzr();
                return;
            }
        }
        if (!zzn()) {
            zzu();
        }
        if (z2) {
        }
    }

    private final synchronized void zzu() {
        zzeag zzeagVar = zzeag.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zza();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zza();
        }
    }

    private final synchronized void zzv() {
        zzeag zzeagVar = zzeag.NONE;
        int ordinal = this.zzo.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzs(zzeag.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzl = jSONObject.optString("networkExtras", "{}");
            this.zzn = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final zzeag zza() {
        return this.zzo;
    }

    public final synchronized zzfzp zzb(String str) {
        zzchh zzchhVar;
        zzchhVar = new zzchh();
        if (this.zzj.containsKey(str)) {
            zzchhVar.zzd((zzdzy) this.zzj.get(str));
        } else {
            if (!this.zzk.containsKey(str)) {
                this.zzk.put(str, new ArrayList());
            }
            ((List) this.zzk.get(str)).add(zzchhVar);
        }
        return zzchhVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue() && zzn()) {
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
                this.zzn = Long.MAX_VALUE;
                return "";
            }
            if (this.zzl.equals("{}")) {
                return "";
            }
            return this.zzl;
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzp);
            jSONObject.put("gesture", this.zzo);
            if (this.zzn > com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzl);
                jSONObject.put("networkExtrasExpirationSecs", this.zzn);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.zzh);
            jSONObject.put("internalSdkVersion", this.zzg);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (this.zzn < com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() / 1000) {
                this.zzl = "{}";
            }
            jSONObject.put("networkExtras", this.zzl);
            jSONObject.put("adSlots", zzp());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhU)).booleanValue() && !TextUtils.isEmpty(this.zzm)) {
                com.google.android.gms.ads.internal.util.zze.zze("Policy violation data: " + this.zzm);
                jSONObject.put("policyViolations", new JSONObject(this.zzm));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhT)).booleanValue()) {
                jSONObject.put("openAction", this.zzs);
                jSONObject.put("gesture", this.zzo);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzs(e, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.zze.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdzy zzdzyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue() && zzn()) {
            if (this.zzq >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhG)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzi.containsKey(str)) {
                this.zzi.put(str, new ArrayList());
            }
            this.zzq++;
            ((List) this.zzi.get(str)).add(zzdzyVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzia)).booleanValue()) {
                String zzc = zzdzyVar.zzc();
                this.zzj.put(zzc, zzdzyVar);
                if (this.zzk.containsKey(zzc)) {
                    List list = (List) this.zzk.get(zzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzchh) it.next()).zzd(zzdzyVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhT)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
                zzq();
                return;
            }
            String zzo = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzo();
            if (TextUtils.isEmpty(zzo)) {
                return;
            }
            try {
                if (new JSONObject(zzo).optBoolean("isTestMode", false)) {
                    zzq();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzeaj zzeajVar) {
        if (!zzn()) {
            try {
                zzcyVar.zze(zzffe.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhE)).booleanValue()) {
            this.zzs = zzeajVar;
            this.zza.zzj(zzcyVar, new zzbpv(this), new zzbqg(this.zzf));
            return;
        } else {
            try {
                zzcyVar.zze(zzffe.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.zze.zzj("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j) {
        this.zzl = str;
        this.zzn = j;
        zzr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(boolean z) {
        if (!this.zzr) {
            if (z) {
                zzq();
                if (!this.zzp) {
                    zzv();
                    return;
                }
            }
            if (zzn()) {
                return;
            }
            zzu();
        }
    }

    public final void zzk(zzeag zzeagVar) {
        zzs(zzeagVar, true);
    }

    public final synchronized void zzl(String str) {
        this.zzm = str;
    }

    public final void zzm(boolean z) {
        if (!this.zzr && z) {
            zzq();
        }
        zzt(z, true);
    }

    public final synchronized boolean zzn() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhT)).booleanValue()) {
            return this.zzp || com.google.android.gms.ads.internal.zzt.zzs().zzl();
        }
        return this.zzp;
    }

    public final synchronized boolean zzo() {
        return this.zzp;
    }
}
