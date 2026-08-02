package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdpy {
    private final Map zza = new HashMap();

    zzdpy() {
    }

    @Nullable
    public final synchronized zzdpx zza(String str) {
        return (zzdpx) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbra zzbraVar;
        zzdpx zza = zza(str);
        return (zza == null || (zzbraVar = zza.zzb) == null) ? "" : zzbraVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized void zzc(String str, @Nullable zzfge zzfgeVar) {
        zzbra zze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbra zzbraVar = null;
        if (zzfgeVar != null) {
            try {
                zze = zzfgeVar.zze();
            } catch (zzffn unused) {
            }
            if (zzfgeVar != null) {
                try {
                    zzbraVar = zzfgeVar.zzf();
                } catch (zzffn unused2) {
                }
            }
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzix)).booleanValue()) {
                if (zzfgeVar != null) {
                    try {
                        zzfgeVar.zzC();
                    } catch (zzffn unused3) {
                    }
                }
                z = false;
            }
            this.zza.put(str, new zzdpx(str, zze, zzbraVar, z));
        }
        zze = null;
        if (zzfgeVar != null) {
        }
        boolean z2 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzix)).booleanValue()) {
        }
        this.zza.put(str, new zzdpx(str, zze, zzbraVar, z2));
    }

    final synchronized void zzd(String str, zzbql zzbqlVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpx(str, zzbqlVar.zzf(), zzbqlVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
