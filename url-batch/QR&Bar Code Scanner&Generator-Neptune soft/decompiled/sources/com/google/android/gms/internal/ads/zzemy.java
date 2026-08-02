package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzemy {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdvl zzb;

    public zzemy(zzdvl zzdvlVar) {
        this.zzb = zzdvlVar;
    }

    @CheckForNull
    public final zzbxd zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbxd) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzh("Couldn't create RTB adapter : ", e);
        }
    }
}
