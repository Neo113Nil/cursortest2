package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzgnx extends zzgnw {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzgnz.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzgnz.class, "remainingField");

    private zzgnx() {
        throw null;
    }

    /* synthetic */ zzgnx(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final void zza(zzgnz zzgnzVar, Set set, Set set2) {
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zza, zzgnzVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnw
    final int zzb(zzgnz zzgnzVar) {
        return zzb.decrementAndGet(zzgnzVar);
    }
}
