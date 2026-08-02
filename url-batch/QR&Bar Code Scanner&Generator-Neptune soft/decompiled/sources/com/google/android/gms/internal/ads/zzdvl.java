package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdvl {
    private final zzfey zza;
    private final zzdvi zzb;

    zzdvl(zzfey zzfeyVar, zzdvi zzdviVar) {
        this.zza = zzfeyVar;
        this.zzb = zzdviVar;
    }

    final zzbvk zza() throws RemoteException {
        zzbvk zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.zze.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbxd zzb(String str) throws RemoteException {
        zzbxd zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzffa zzc(String str, JSONObject jSONObject) throws zzfek {
        zzbvn zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbwj(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbwj(new zzbxu());
            } else {
                zzbvk zza = zza();
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
            zzffa zzffaVar = new zzffa(zzb);
            this.zzb.zzd(str, zzffaVar);
            return zzffaVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhZ)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfek(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
