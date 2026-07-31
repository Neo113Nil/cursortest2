package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzesx extends zzbxv {
    private final String zza;
    private final zzbxt zzb;
    private final zzcgo zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzesx(String str, zzbxt zzbxtVar, zzcgo zzcgoVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcgoVar;
        this.zza = str;
        this.zzb = zzbxtVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbxtVar.zzf().toString());
            jSONObject.put("sdk_version", zzbxtVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzc(String str, zzcgo zzcgoVar) {
        synchronized (zzesx.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcq)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    zzcgoVar.zzc(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzd(String str, int i) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                JSONObject jSONObject = this.zzd;
                jSONObject.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcr)).booleanValue()) {
                    jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcq)).booleanValue()) {
                    jSONObject.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcq)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzb() {
        zzd("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcr)).booleanValue()) {
                jSONObject.put("latency", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcq)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final synchronized void zzf(String str) throws RemoteException {
        zzd(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxw
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzd(zzeVar.zzb, 2);
    }
}
