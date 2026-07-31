package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbr;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
abstract class zzhce extends zzhbr.zzf {
    private static final zzhcb zzbr;
    private static final zzhdg zzbs = new zzhdg(zzhce.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzhcb zzhcdVar;
        byte[] bArr = null;
        try {
            zzhcdVar = new zzhcc(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzhcdVar = new zzhcd(bArr);
        }
        zzbr = zzhcdVar;
        if (th != null) {
            zzbs.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzhce(int i) {
        this.remainingField = i;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzbr.zza(this, null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    final int zzC() {
        return zzbr.zzb(this);
    }

    abstract void zzf(Set set);
}
