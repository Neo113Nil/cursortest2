package kotlinx.serialization.internal;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Caching.kt */
/* loaded from: classes14.dex */
final class MutableSoftReference {
    public volatile SoftReference reference = new SoftReference(null);

    public final synchronized Object getOrSetWithLock(Function0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Object obj = this.reference.get();
        if (obj != null) {
            return obj;
        }
        Object mo4828invoke = factory.mo4828invoke();
        this.reference = new SoftReference(mo4828invoke);
        return mo4828invoke;
    }
}
