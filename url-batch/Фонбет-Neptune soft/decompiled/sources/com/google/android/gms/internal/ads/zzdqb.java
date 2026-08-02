package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdqb {
    private final zzfgc zza;
    private final zzdpy zzb;

    zzdqb(zzfgc zzfgcVar, zzdpy zzdpyVar) {
        this.zza = zzfgcVar;
        this.zzb = zzdpyVar;
    }

    final zzbom zza() throws RemoteException {
        zzbom zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbql zzb(String str) throws RemoteException {
        zzbql zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfge zzc(String str, JSONObject jSONObject) throws zzffn {
        zzbop zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpn(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpn(new zzbre());
            } else {
                zzbom zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfge zzfgeVar = new zzfge(zzb);
            this.zzb.zzc(str, zzfgeVar);
            return zzfgeVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzix)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzffn(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
