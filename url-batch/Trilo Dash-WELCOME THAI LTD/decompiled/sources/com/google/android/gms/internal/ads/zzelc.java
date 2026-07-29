package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzelc extends zzbvu {
    private final String zza;
    private final zzbvs zzb;
    private final zzcga zzc;
    private final JSONObject zzd;
    private boolean zze;

    public zzelc(String str, zzbvs zzbvsVar, zzcga zzcgaVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zze = false;
        this.zzc = zzcgaVar;
        this.zza = str;
        this.zzb = zzbvsVar;
        try {
            jSONObject.put("adapter_version", zzbvsVar.zzf().toString());
            jSONObject.put("sdk_version", zzbvsVar.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcga zzcgaVar) {
        synchronized (zzelc.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                zzcgaVar.zzd(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzc() {
        try {
            zzf("Signal collection timeout.");
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void zzd() {
        if (this.zze) {
            return;
        }
        this.zzc.zzd(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final synchronized void zzf(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvv
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", zzeVar.zzb);
        } catch (JSONException unused) {
        }
        this.zzc.zzd(this.zzd);
        this.zze = true;
    }
}
