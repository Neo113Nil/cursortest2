package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxx;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
abstract class zzfyl extends zzfxx.zzi {
    private static final zzfyi zzaX;
    private static final Logger zzaY = Logger.getLogger(zzfyl.class.getName());
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzfyi zzfykVar;
        Throwable th;
        zzfyh zzfyhVar = null;
        try {
            zzfykVar = new zzfyj(AtomicReferenceFieldUpdater.newUpdater(zzfyl.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfyl.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            zzfykVar = new zzfyk(zzfyhVar);
            th = e;
        }
        zzaX = zzfykVar;
        if (th != null) {
            zzaY.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzfyl(int i) {
        this.remaining = i;
    }

    static /* synthetic */ int zzA(zzfyl zzfylVar) {
        int i = zzfylVar.remaining - 1;
        zzfylVar.remaining = i;
        return i;
    }

    final int zzB() {
        return zzaX.zza(this);
    }

    final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(newSetFromMap);
        zzaX.zzb(this, null, newSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        set2.getClass();
        return set2;
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zzf(Set set);
}
