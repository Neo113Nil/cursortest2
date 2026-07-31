package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes5.dex */
public final class zc1 extends Lambda implements Function1 {
    public static final zc1 b = new zc1();

    public zc1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        JsonBuilder jsonBuilder = (JsonBuilder) obj;
        jsonBuilder.setExplicitNulls(false);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
