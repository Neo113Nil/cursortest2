package yads;

import android.graphics.RectF;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes4.dex */
public final class kp0 implements xc1 {
    public final int b;
    public final RectF c;

    public kp0(int i, RectF rectF) {
        this.b = i;
        this.c = rectF;
    }

    @Override // yads.xc1
    public final String a() {
        String str;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Integer valueOf = Integer.valueOf(this.b);
        RectF rectF = this.c;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            str = null;
        }
        String format = String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(new Object[]{valueOf, str}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
