package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;

/* loaded from: classes6.dex */
public final class lr1 extends Lambda implements Function0 {
    public static final lr1 b = new lr1();

    public lr1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(nr1.a);
    }
}
