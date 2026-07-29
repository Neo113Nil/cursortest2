package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaqf extends zzaqm {
    public zzaqf(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "EoDE6fB1YbrAX67hf86xlBvGVg8B3u9wZtbhQoEO0J04e2Wdeoe11h/TJjV6o6eA", "Yt/gA3cnp/3eNqW1fww4y1+dsOsHkABELCz+p4Sj9uE=", zzaliVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zze) {
            zzaox zzaoxVar = new zzaox((String) this.zzf.invoke(null, new Object[0]));
            this.zze.zzo(zzaoxVar.zza.longValue());
            this.zze.zzp(zzaoxVar.zzb.longValue());
        }
    }
}
