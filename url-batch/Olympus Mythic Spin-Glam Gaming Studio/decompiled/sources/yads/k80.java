package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes10.dex */
public final class k80 extends Lambda implements Function0 {
    public static final k80 b = new k80();

    public k80() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }
}
