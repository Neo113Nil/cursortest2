package kotlinx.io;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: Core.kt */
/* loaded from: classes4.dex */
public abstract class CoreKt {
    public static final Source buffered(RawSource rawSource) {
        Intrinsics.checkNotNullParameter(rawSource, "<this>");
        return new RealSource(rawSource);
    }
}
