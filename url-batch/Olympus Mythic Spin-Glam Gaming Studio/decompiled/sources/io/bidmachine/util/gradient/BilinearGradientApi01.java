package io.bidmachine.util.gradient;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.Size;
import io.bidmachine.util.ColorUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BilinearGradientApi01.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Lio/bidmachine/util/gradient/BilinearGradientApi01;", "Landroid/graphics/BitmapShader;", "bounds", "Landroid/graphics/RectF;", "colors", "", "config", "Landroid/graphics/Bitmap$Config;", "(Landroid/graphics/RectF;[ILandroid/graphics/Bitmap$Config;)V", "Companion", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class BilinearGradientApi01 extends BitmapShader {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ BilinearGradientApi01(RectF rectF, int[] iArr, Bitmap.Config config, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(rectF, iArr, (i & 4) != 0 ? Bitmap.Config.ARGB_8888 : config);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BilinearGradientApi01(@NotNull RectF bounds, @Size @NotNull int[] colors, @NotNull Bitmap.Config config) {
        super(r2, r3, r3);
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap createBitmap = INSTANCE.createBitmap(bounds, colors, config);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
    }

    /* compiled from: BilinearGradientApi01.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/gradient/BilinearGradientApi01$Companion;", "", "()V", "bilinearGradient", "", "bounds", "Landroid/graphics/RectF;", "colors", "withAlpha", "", "createBitmap", "Landroid/graphics/Bitmap;", "config", "Landroid/graphics/Bitmap$Config;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        static /* synthetic */ Bitmap createBitmap$default(Companion companion, RectF rectF, int[] iArr, Bitmap.Config config, int i, Object obj) {
            if ((i & 4) != 0) {
                config = Bitmap.Config.ARGB_8888;
            }
            return companion.createBitmap(rectF, iArr, config);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"UseKtx"})
        public final Bitmap createBitmap(RectF bounds, @Size int[] colors, Bitmap.Config config) {
            Bitmap bitmap;
            try {
                int width = (int) bounds.width();
                int height = (int) bounds.height();
                bitmap = Bitmap.createBitmap(width, height, config);
                bitmap.setPixels(BilinearGradientApi01.INSTANCE.bilinearGradient(bounds, colors, bitmap.hasAlpha()), 0, width, 0, 0, width, height);
            } catch (Throwable unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                return bitmap;
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(1, 1, config)");
            return createBitmap;
        }

        private final int[] bilinearGradient(RectF bounds, @Size int[] colors, boolean withAlpha) {
            int width = (int) bounds.width();
            int height = (int) bounds.height();
            int[] iArr = new int[width * height];
            for (int i = 0; i < height; i++) {
                float f = height == 1 ? 0.0f : i / (height - 1);
                for (int i2 = 0; i2 < width; i2++) {
                    iArr[(i * width) + i2] = ColorUtils.INSTANCE.blerp(colors[0], colors[1], colors[2], colors[3], width == 1 ? 0.0f : i2 / (width - 1), f, withAlpha);
                }
            }
            return iArr;
        }
    }
}
