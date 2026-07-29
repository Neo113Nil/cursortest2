package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdub {
    private final zzfcr zza;
    private final zzdty zzb;

    zzdub(zzfcr zzfcrVar, zzdty zzdtyVar) {
        this.zza = zzfcrVar;
        this.zzb = zzdtyVar;
    }

    final zzbtz zza() throws RemoteException {
        zzbtz zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.zze.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbvs zzb(String str) throws RemoteException {
        zzbvs zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfct zzc(String str, JSONObject jSONObject) throws zzfcd {
        zzbuc zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbuy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbuy(new zzbwj());
            } else {
                zzbtz zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.zze.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfct zzfctVar = new zzfct(zzb);
            this.zzb.zzd(str, zzfctVar);
            return zzfctVar;
        } catch (Throwable th) {
            throw new zzfcd(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
