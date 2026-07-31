package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Concurrent.common.kt */
/* loaded from: classes4.dex */
public abstract class Concurrent_commonKt {
    public static final Object getValue(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static final void setValue(AtomicReference atomicReference, Object obj) {
        atomicReference.set(obj);
    }
}
