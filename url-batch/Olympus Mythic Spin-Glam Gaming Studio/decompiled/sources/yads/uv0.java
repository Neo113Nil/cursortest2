package yads;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.JsonBuilder;

/* loaded from: classes5.dex */
public final class uv0 extends Lambda implements Function1 {
    public static final uv0 b = new uv0();

    public uv0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((JsonBuilder) obj).setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }
}
