package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;

/* loaded from: classes3.dex */
public final class p80 extends Lambda implements Function0 {
    public static final p80 b = new p80();

    public p80() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(c40.a);
    }
}
