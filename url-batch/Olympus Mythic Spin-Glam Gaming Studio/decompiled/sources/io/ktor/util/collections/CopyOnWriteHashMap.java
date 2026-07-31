package io.ktor.util.collections;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CopyOnWriteHashMap.kt */
/* loaded from: classes6.dex */
public final class CopyOnWriteHashMap {
    private static final /* synthetic */ AtomicReferenceFieldUpdater current$FU = AtomicReferenceFieldUpdater.newUpdater(CopyOnWriteHashMap.class, Object.class, "current");

    @NotNull
    private volatile /* synthetic */ Object current = MapsKt.emptyMap();

    public final Object get(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return ((Map) this.current).get(key);
    }
}
