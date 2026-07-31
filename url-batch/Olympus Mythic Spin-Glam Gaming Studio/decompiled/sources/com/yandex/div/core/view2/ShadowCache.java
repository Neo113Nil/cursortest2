package com.yandex.div.core.view2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.drawable.shapes.RoundRectShape;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShadowCache.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J \u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J4\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\f\u0010\u001e\u001a\u00020\u000b*\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/yandex/div/core/view2/ShadowCache;", "", "()V", "EDGE_OFFSET", "", "REGIONS_COLOR", "paint", "Landroid/graphics/Paint;", "shadowMap", "", "Lcom/yandex/div/core/view2/ShadowCache$ShadowCacheKey;", "Landroid/graphics/NinePatch;", "createNewShadow", "radii", "", "blur", "", "effectHelper", "Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", "createNinePatchChunk", "", "width", "height", "getShadow", "drawNewShadow", "", "Landroid/graphics/Bitmap;", "rectWidth", "rectHeight", "scale", "toNinePatch", "ShadowCacheKey", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShadowCache {
    private static final int EDGE_OFFSET = 1;
    private static final int REGIONS_COLOR = 1;

    @NotNull
    public static final ShadowCache INSTANCE = new ShadowCache();

    @NotNull
    private static final Paint paint = new Paint();

    @NotNull
    private static final Map<ShadowCacheKey, NinePatch> shadowMap = new LinkedHashMap();

    private ShadowCache() {
    }

    @Nullable
    public final NinePatch getShadow(@NotNull float[] radii, float blur, @NotNull BitmapEffectHelper effectHelper) {
        ShadowCacheKey shadowCacheKey = new ShadowCacheKey(radii, blur);
        Map<ShadowCacheKey, NinePatch> map = shadowMap;
        NinePatch ninePatch = map.get(shadowCacheKey);
        if (ninePatch != null) {
            return ninePatch;
        }
        NinePatch createNewShadow = createNewShadow(radii, blur, effectHelper);
        if (createNewShadow != null) {
            map.put(shadowCacheKey, createNewShadow);
        } else {
            createNewShadow = null;
        }
        return createNewShadow;
    }

    private final NinePatch createNewShadow(float[] radii, float blur, BitmapEffectHelper effectHelper) {
        float max = blur + Math.max(radii[1] + radii[2], radii[5] + radii[6]);
        float max2 = blur + Math.max(radii[0] + radii[7], radii[3] + radii[4]);
        if (max <= 0.0f || max2 <= 0.0f) {
            return null;
        }
        float coercedBlurRadius = effectHelper.getCoercedBlurRadius(blur);
        float bitmapScale = effectHelper.getBitmapScale(blur);
        float f = blur * 2;
        Bitmap createBitmap = Bitmap.createBitmap((int) ((max + f) * bitmapScale), (int) ((f + max2) * bitmapScale), Bitmap.Config.ALPHA_8);
        drawNewShadow(createBitmap, max, max2, radii, coercedBlurRadius, bitmapScale);
        Bitmap blurShadow = effectHelper.blurShadow(createBitmap, coercedBlurRadius);
        createBitmap.recycle();
        if (bitmapScale < 1.0f) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(blurShadow, (int) (blurShadow.getWidth() / bitmapScale), (int) (blurShadow.getHeight() / bitmapScale), true);
            blurShadow.recycle();
            blurShadow = createScaledBitmap;
        }
        return toNinePatch(blurShadow);
    }

    private final void drawNewShadow(Bitmap bitmap, float f, float f2, float[] fArr, float f3, float f4) {
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
        roundRectShape.resize(f, f2);
        Canvas canvas = new Canvas();
        canvas.setBitmap(bitmap);
        int save = canvas.save();
        canvas.translate(f3, f3);
        try {
            save = canvas.save();
            canvas.scale(f4, f4, 0.0f, 0.0f);
            roundRectShape.draw(canvas, paint);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    private final NinePatch toNinePatch(Bitmap bitmap) {
        return new NinePatch(bitmap, createNinePatchChunk(bitmap.getWidth(), bitmap.getHeight()));
    }

    private final byte[] createNinePatchChunk(int width, int height) {
        int i = height / 2;
        int i2 = width / 2;
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i2 - 1);
        order.putInt(i2 + 1);
        order.putInt(i - 1);
        order.putInt(i + 1);
        for (int i3 = 0; i3 < 9; i3++) {
            order.putInt(1);
        }
        return order.array();
    }

    /* compiled from: ShadowCache.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/yandex/div/core/view2/ShadowCache$ShadowCacheKey;", "", "radii", "", "blur", "", "([FF)V", "getBlur", "()F", "getRadii", "()[F", "equals", "", "other", "hashCode", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ShadowCacheKey {
        private final float blur;

        @NotNull
        private final float[] radii;

        public ShadowCacheKey(@NotNull float[] fArr, float f) {
            this.radii = fArr;
            this.blur = f;
        }

        @NotNull
        public final float[] getRadii() {
            return this.radii;
        }

        public final float getBlur() {
            return this.blur;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof ShadowCacheKey)) {
                return false;
            }
            ShadowCacheKey shadowCacheKey = (ShadowCacheKey) other;
            return this.blur == shadowCacheKey.blur && Arrays.equals(this.radii, shadowCacheKey.radii);
        }

        public int hashCode() {
            return (Arrays.hashCode(this.radii) * 31) + Float.hashCode(this.blur);
        }
    }
}
