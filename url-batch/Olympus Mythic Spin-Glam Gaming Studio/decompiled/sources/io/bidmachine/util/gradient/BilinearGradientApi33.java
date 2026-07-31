package io.bidmachine.util.gradient;

import android.graphics.RectF;
import android.graphics.RuntimeShader;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BilinearGradientApi33.kt */
@RequiresApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lio/bidmachine/util/gradient/BilinearGradientApi33;", "Landroid/graphics/RuntimeShader;", "bounds", "Landroid/graphics/RectF;", "colors", "", "(Landroid/graphics/RectF;[I)V", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class BilinearGradientApi33 extends RuntimeShader {

    @NotNull
    private static final String SHADER = "\n            layout(color) uniform vec4 c00; // top-left\n            layout(color) uniform vec4 c10; // top-right\n            layout(color) uniform vec4 c01; // bottom-left\n            layout(color) uniform vec4 c11; // bottom-right\n            uniform float w;\n            uniform float h;\n            \n            half4 main(float2 p) {\n                float u = clamp(p.x / max(w, 1.0), 0.0, 1.0);\n                float v = clamp(p.y / max(h, 1.0), 0.0, 1.0);\n                vec4 col = (1.0 - u) * (1.0 - v) * c00\n                         + u * (1.0 - v) * c10\n                         + (1.0 - u) * v * c01\n                         + u * v * c11;\n                return half4(col);\n            }\n            ";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BilinearGradientApi33(@NotNull RectF bounds, @Size @NotNull int[] colors) {
        super(SHADER);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(colors, "colors");
        setFloatUniform("w", bounds.width());
        setFloatUniform("h", bounds.height());
        setColorUniform("c00", colors[0]);
        setColorUniform("c10", colors[1]);
        setColorUniform("c01", colors[2]);
        setColorUniform("c11", colors[3]);
    }
}
