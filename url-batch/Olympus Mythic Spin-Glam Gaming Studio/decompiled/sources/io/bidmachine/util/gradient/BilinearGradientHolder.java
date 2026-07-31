package io.bidmachine.util.gradient;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BilinearGradientHolder.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/bidmachine/util/gradient/BilinearGradientHolder;", "Lio/bidmachine/util/gradient/ShaderHolder;", "bounds", "Landroid/graphics/RectF;", "colors", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "useRuntimeInitially", "", "(Landroid/graphics/RectF;[ILandroid/graphics/Bitmap$Config;Z)V", "bitmapShader", "Landroid/graphics/Shader;", "runtimeShader", "getShader", "isHardwareAccelerated", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class BilinearGradientHolder implements ShaderHolder {

    @NotNull
    private final Shader bitmapShader;

    @Nullable
    private final Shader runtimeShader;
    private final boolean useRuntimeInitially;

    public BilinearGradientHolder(@NotNull RectF bounds, @Size @ColorInt @NotNull int[] colors, @NotNull Bitmap.Config bitmapConfig, boolean z) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(bitmapConfig, "bitmapConfig");
        this.useRuntimeInitially = z;
        this.bitmapShader = new BilinearGradientApi01(bounds, colors, bitmapConfig);
        this.runtimeShader = (!z || Build.VERSION.SDK_INT < 33) ? null : new BilinearGradientApi33(bounds, colors);
    }

    public /* synthetic */ BilinearGradientHolder(RectF rectF, int[] iArr, Bitmap.Config config, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectF, iArr, (i & 4) != 0 ? Bitmap.Config.ARGB_8888 : config, (i & 8) != 0 ? Build.VERSION.SDK_INT >= 33 : z);
    }

    @Override // io.bidmachine.util.gradient.ShaderHolder
    @NotNull
    public Shader getShader(boolean isHardwareAccelerated) {
        Shader shader;
        return (this.useRuntimeInitially && (shader = this.runtimeShader) != null && isHardwareAccelerated) ? shader : this.bitmapShader;
    }
}
