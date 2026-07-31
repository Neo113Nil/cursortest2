package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zziiu extends zziir implements Set, KMappedMarker {

    @NotNull
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziiu(@NotNull Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziir, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new zziit(this.zza.iterator());
    }
}
