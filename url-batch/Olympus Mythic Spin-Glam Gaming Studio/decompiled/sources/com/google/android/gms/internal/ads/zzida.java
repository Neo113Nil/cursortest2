package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzida extends zzidc {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzida(zzidb zzidbVar) {
        super(zzidbVar.zza);
        Objects.requireNonNull(zzidbVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
