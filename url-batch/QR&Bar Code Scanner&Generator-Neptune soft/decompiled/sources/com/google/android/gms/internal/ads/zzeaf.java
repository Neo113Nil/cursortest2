package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeaf {
    private final zzdzs zza;
    private final zzdvi zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    zzeaf(zzdzs zzdzsVar, zzdvi zzdviVar) {
        this.zza = zzdzsVar;
        this.zzb = zzdviVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdvh zza;
        zzbxq zzbxqVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbrq zzbrqVar = (zzbrq) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhY)).booleanValue()) {
                    zzdvh zza2 = this.zzb.zza(zzbrqVar.zza);
                    if (zza2 != null && (zzbxqVar = zza2.zzc) != null) {
                        str = zzbxqVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhZ)).booleanValue() && (zza = this.zzb.zza(zzbrqVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzbrqVar.zza;
                    list2.add(new zzeae(str3, str2, this.zzb.zzc(str3), zzbrqVar.zzb ? 1 : 0, zzbrqVar.zzd, zzbrqVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzbrqVar.zza;
                list22.add(new zzeae(str32, str2, this.zzb.zzc(str32), zzbrqVar.zzb ? 1 : 0, zzbrqVar.zzd, zzbrqVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzt()) {
                    zzc();
                    return jSONArray;
                }
                zzd(this.zza.zzg());
            }
            Iterator it = this.zzd.iterator();
            while (it.hasNext()) {
                jSONArray.put(((zzeae) it.next()).zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzead(this));
    }
}
