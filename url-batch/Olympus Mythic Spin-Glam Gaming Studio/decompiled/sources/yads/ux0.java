package yads;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ux0 extends Lambda implements Function1 {
    public static final ux0 b = new ux0();

    public ux0() {
        super(1);
    }

    public static String a(Map.Entry entry) {
        return entry.getKey() + "=" + entry.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return a((Map.Entry) obj);
    }
}
