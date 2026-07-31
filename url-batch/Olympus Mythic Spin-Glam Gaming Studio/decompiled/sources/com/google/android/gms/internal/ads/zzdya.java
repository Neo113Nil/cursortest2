package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdya {
    private final zzfms zza;
    private final zzdxx zzb;

    zzdya(zzfms zzfmsVar, zzdxx zzdxxVar) {
        this.zza = zzfmsVar;
        this.zzb = zzdxxVar;
    }

    public final zzfmu zza(String str, JSONObject jSONObject) throws zzfmd {
        zzbvx zza;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zza = new zzbwv(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zza = new zzbwv(new zzbym());
            } else {
                zzbvu zzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zza = zzd.zzb(string) ? zzd.zza("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzd.zzc(string) ? zzd.zza(string) : zzd.zza("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid custom event.", e);
                    }
                }
                zza = zzd.zza(str);
            }
            zzfmu zzfmuVar = new zzfmu(zza);
            this.zzb.zza(str, zzfmuVar);
            return zzfmuVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzkS)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfmd(th);
        }
    }

    public final zzbxt zzb(String str) throws RemoteException {
        zzbxt zzd = zzd().zzd(str);
        this.zzb.zzb(str, zzd);
        return zzd;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    @VisibleForTesting
    final zzbvu zzd() throws RemoteException {
        zzbvu zzd = this.zza.zzd();
        if (zzd != null) {
            return zzd;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
