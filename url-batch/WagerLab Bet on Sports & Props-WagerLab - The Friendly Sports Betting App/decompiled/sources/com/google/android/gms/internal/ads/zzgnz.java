package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgnm;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
abstract class zzgnz extends zzgnm.zzf {
    private static final zzgnw zzbg;
    private static final zzgpb zzbh = new zzgpb(zzgnz.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzgnw zzgnyVar;
        byte[] bArr = null;
        try {
            zzgnyVar = new zzgnx(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgnyVar = new zzgny(bArr);
        }
        zzbg = zzgnyVar;
        if (th != null) {
            zzbh.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgnz(int i) {
        this.remainingField = i;
    }

    final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzbg.zza(this, null, newSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptionsField);
    }

    final int zzC() {
        return zzbg.zzb(this);
    }

    abstract void zzf(Set set);
}
