package io.bidmachine.rendering.internal.detector.brokencreative.algorithm;

import android.graphics.Bitmap;
import android.graphics.Color;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.model.BrokenCreativeAlgorithmParams;
import io.bidmachine.util.ColorUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public abstract class a {
    private final BrokenCreativeAlgorithmParams a;

    public a(BrokenCreativeAlgorithmParams algorithmParams) {
        Intrinsics.checkNotNullParameter(algorithmParams, "algorithmParams");
        this.a = algorithmParams;
    }

    public final BrokenCreativeAlgorithmParams a() {
        return this.a;
    }

    public abstract Boolean a(Bitmap bitmap);

    public final Boolean b(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            return a(image);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(Float f, Boolean bool) {
        if (k.b()) {
            k.b("BrokenCreativeDetector", this.a.getType().name() + " result - " + f + " (isBroken - " + bool + ')', new Object[0]);
        }
    }

    public final int b(int i) {
        return (int) ((Color.red(i) * 0.299f) + (Color.green(i) * 0.587f) + (Color.blue(i) * 0.114f));
    }

    public final float a(int i) {
        return (ColorUtils.redToRatio(i) * 0.299f) + (ColorUtils.greenToRatio(i) * 0.587f) + (ColorUtils.blueToRatio(i) * 0.114f);
    }

    public final int a(Bitmap bitmap, int i, int i2) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return b(bitmap.getPixel(i, i2));
    }
}
