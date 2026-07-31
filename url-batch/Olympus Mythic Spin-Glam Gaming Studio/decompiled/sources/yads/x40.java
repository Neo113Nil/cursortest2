package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;

/* loaded from: classes12.dex */
public final class x40 extends Lambda implements Function0 {
    public static final x40 b = new x40();

    public x40() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(sa0.a);
    }
}
