package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes4.dex */
public final class gd1 extends Lambda implements Function1 {
    public static final gd1 b = new gd1();

    public gd1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((JsonBuilder) obj).setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
