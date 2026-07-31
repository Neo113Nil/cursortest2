package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Caching.kt */
/* loaded from: classes5.dex */
final class ClassValueReferences extends ClassValue {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ClassValue
    public MutableSoftReference computeValue(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MutableSoftReference();
    }
}
