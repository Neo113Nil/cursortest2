package yads;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes13.dex */
public final class ol3 implements xc1 {
    public final boolean b;

    public ol3(boolean z) {
        this.b = z;
    }

    @Override // yads.xc1
    public final String a() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("viewable: %s", Arrays.copyOf(new Object[]{Boolean.valueOf(this.b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
