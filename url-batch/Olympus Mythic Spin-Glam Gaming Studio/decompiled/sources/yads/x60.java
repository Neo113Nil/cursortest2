package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes11.dex */
public final class x60 extends Lambda implements Function1 {
    public static final x60 b = new x60();

    public x60() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((JsonBuilder) obj).setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
