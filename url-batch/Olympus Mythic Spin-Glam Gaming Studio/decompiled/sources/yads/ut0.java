package yads;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
public final class ut0 extends Lambda implements Function1 {
    public static final ut0 b = new ut0();

    public ut0() {
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
