package yads;

import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class j53 implements xc1 {
    public final View b;

    public j53(View view) {
        this.b = view;
    }

    @Override // yads.xc1
    public final String a() {
        boolean isHardwareAccelerated = this.b.isHardwareAccelerated();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(isHardwareAccelerated)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
