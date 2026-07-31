package yads;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class k72 extends Lambda implements Function1 {
    public static final k72 b = new k72();

    public k72() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return (we3) CollectionsKt.first(((de3) obj).a);
    }
}
