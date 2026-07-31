package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.internal.ArrayListSerializer;

/* loaded from: classes5.dex */
public final class vg2 extends Lambda implements Function0 {
    public static final vg2 b = new vg2();

    public vg2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return new ArrayListSerializer(ah2.a);
    }
}
