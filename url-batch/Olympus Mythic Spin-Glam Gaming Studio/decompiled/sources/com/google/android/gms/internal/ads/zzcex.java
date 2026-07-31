package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzcex {

    @GuardedBy
    private final Map zza = new HashMap();

    @GuardedBy
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzcek zzd;

    zzcex(Context context, zzcek zzcekVar) {
        this.zzc = context;
        this.zzd = zzcekVar;
    }

    final synchronized void zza(zzcev zzcevVar) {
        this.zzb.add(zzcevVar);
    }

    final synchronized void zzb(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzceu zzceuVar = new zzceu(this, str);
            map.put(str, zzceuVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzceuVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }

    final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
