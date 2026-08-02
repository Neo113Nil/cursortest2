package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzehh {
    private final String zzc;
    private zzfdn zzd = null;
    private zzfdk zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzehh(String str) {
        this.zzc = str;
    }

    private final void zzh(zzfdk zzfdkVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String str = zzfdkVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzfdkVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfS)).booleanValue() && z) {
                this.zzf = zzuVar;
            }
        }
    }

    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzdct zzb() {
        return new zzdct(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfdk zzfdkVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = zzfdkVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfdkVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfdkVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfR)).booleanValue()) {
            String str6 = zzfdkVar.zzG;
            String str7 = zzfdkVar.zzH;
            str = str6;
            str2 = str7;
            str3 = zzfdkVar.zzI;
            str4 = zzfdkVar.zzJ;
        } else {
            str = "";
            str2 = str;
            str3 = str2;
            str4 = str3;
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfdkVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        this.zza.add(zzuVar);
        this.zzb.put(str5, zzuVar);
    }

    public final void zze(zzfdk zzfdkVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzfdkVar, j, zzeVar, false);
    }

    public final void zzf(zzfdk zzfdkVar, long j, com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzfdkVar, j, null, true);
    }

    public final void zzg(zzfdn zzfdnVar) {
        this.zzd = zzfdnVar;
    }
}
