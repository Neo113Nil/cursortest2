package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdvi {
    private final Map zza = new HashMap();

    zzdvi() {
    }

    @Nullable
    public final synchronized zzdvh zza(String str) {
        return (zzdvh) this.zza.get(str);
    }

    @Nullable
    public final zzdvh zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdvh zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbxq zzbxqVar;
        zzdvh zza = zza(str);
        return (zza == null || (zzbxqVar = zza.zzb) == null) ? "" : zzbxqVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zzd(String str, @Nullable zzffa zzffaVar) {
        zzbxq zze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbxq zzbxqVar = null;
        if (zzffaVar != null) {
            try {
                zze = zzffaVar.zze();
            } catch (zzfek unused) {
            }
            if (zzffaVar != null) {
                try {
                    zzbxqVar = zzffaVar.zzf();
                } catch (zzfek unused2) {
                }
            }
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhZ)).booleanValue()) {
                if (zzffaVar != null) {
                    try {
                        zzffaVar.zzA();
                    } catch (zzfek unused3) {
                    }
                }
                this.zza.put(str, new zzdvh(str, zze, zzbxqVar, z));
            }
            z = true;
            this.zza.put(str, new zzdvh(str, zze, zzbxqVar, z));
        }
        zze = null;
        if (zzffaVar != null) {
        }
        boolean z2 = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhZ)).booleanValue()) {
        }
        z2 = true;
        this.zza.put(str, new zzdvh(str, zze, zzbxqVar, z2));
    }

    final synchronized void zze(String str, zzbxd zzbxdVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdvh(str, zzbxdVar.zzf(), zzbxdVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
