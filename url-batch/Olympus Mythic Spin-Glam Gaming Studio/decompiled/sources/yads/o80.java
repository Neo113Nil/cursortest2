package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;

/* loaded from: classes11.dex */
public final class o80 extends Lambda implements Function0 {
    public static final o80 b = new o80();

    public o80() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(j50.a);
    }
}
