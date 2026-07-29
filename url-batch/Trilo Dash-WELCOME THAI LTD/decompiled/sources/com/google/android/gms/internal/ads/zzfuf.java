package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftr;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
abstract class zzfuf extends zzftr.zzi {
    private static final zzfuc zzaV;
    private static final Logger zzaW = Logger.getLogger(zzfuf.class.getName());
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfuc zzfueVar;
        Throwable th;
        zzfub zzfubVar = null;
        try {
            zzfueVar = new zzfud(AtomicReferenceFieldUpdater.newUpdater(zzfuf.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfuf.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzfueVar = new zzfue(zzfubVar);
            th = th2;
        }
        zzaV = zzfueVar;
        if (th != null) {
            zzaW.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfuf(int i) {
        this.remaining = i;
    }

    static /* synthetic */ int zzA(zzfuf zzfufVar) {
        int i = zzfufVar.remaining - 1;
        zzfufVar.remaining = i;
        return i;
    }

    final int zzB() {
        return zzaV.zza(this);
    }

    final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzaV.zzb(this, null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zzf(Set set);
}
