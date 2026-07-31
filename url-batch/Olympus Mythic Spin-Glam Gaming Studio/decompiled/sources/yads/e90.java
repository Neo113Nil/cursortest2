package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes6.dex */
public final class e90 extends Lambda implements Function0 {
    public static final e90 b = new e90();

    public e90() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }
}
