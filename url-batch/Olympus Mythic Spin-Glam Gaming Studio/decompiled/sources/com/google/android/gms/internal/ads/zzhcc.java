package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
final class zzhcc extends zzhcb {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzhce.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzhce.class, "remainingField");

    private zzhcc() {
        throw null;
    }

    /* synthetic */ zzhcc(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    final void zza(zzhce zzhceVar, Set set, Set set2) {
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zza, zzhceVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    final int zzb(zzhce zzhceVar) {
        return zzb.decrementAndGet(zzhceVar);
    }
}
