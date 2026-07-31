package yads;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes15.dex */
public final class y60 extends Lambda implements Function0 {
    public static final y60 b = new y60();

    public y60() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo4828invoke() {
        return JsonKt.Json$default(null, x60.b, 1, null);
    }
}
