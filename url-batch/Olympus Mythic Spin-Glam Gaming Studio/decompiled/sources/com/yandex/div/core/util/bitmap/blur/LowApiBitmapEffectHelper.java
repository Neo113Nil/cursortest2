package com.yandex.div.core.util.bitmap.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LowApiBitmapEffectHelper.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/LowApiBitmapEffectHelper;", "Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cachedRenderScript", "Landroid/renderscript/RenderScript;", "blurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "radius", "", "blurShadow", "coercedRadius", "getBitmapScale", "getCoercedBlurRadius", "getOrCreateRenderScript", "release", "", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LowApiBitmapEffectHelper extends BitmapEffectHelper {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float MAX_BLUR = 25.0f;
    private static final float MIN_BLUR = 1.0f;

    @Nullable
    private RenderScript cachedRenderScript;

    @NotNull
    private final Context context;

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float radius) {
        if (radius <= MAX_BLUR) {
            return 1.0f;
        }
        return MAX_BLUR / radius;
    }

    public LowApiBitmapEffectHelper(@NotNull Context context) {
        this.context = context;
    }

    private final RenderScript getOrCreateRenderScript() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            return renderScript;
        }
        Context context = this.context;
        RenderScript createMultiContext = RenderScript.createMultiContext(context, RenderScript.ContextType.NORMAL, 0, context.getApplicationInfo().targetSdkVersion);
        this.cachedRenderScript = createMultiContext;
        return createMultiContext;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurBitmap(@NotNull Bitmap bitmap, float radius) {
        float f;
        Bitmap createScaledBitmap;
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, radius)) {
            return bitmap;
        }
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        if (radius > MAX_BLUR) {
            f = (radius * 1.0f) / MAX_BLUR;
            radius = 25.0f;
        } else {
            f = 1.0f;
        }
        if (f == 1.0f) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            createScaledBitmap = bitmap.copy(config, false);
        } else {
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f), (int) (bitmap.getHeight() / f), false);
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(orCreateRenderScript, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.U8_4(orCreateRenderScript));
        create.setRadius(radius);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create.destroy();
        return createScaledBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurShadow(@NotNull Bitmap bitmap, float coercedRadius) {
        if (!BlurUtils.INSTANCE.isBlurParamsValid(bitmap, coercedRadius)) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        RenderScript orCreateRenderScript = getOrCreateRenderScript();
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(orCreateRenderScript, Element.A_8(orCreateRenderScript));
        Allocation createFromBitmap = Allocation.createFromBitmap(orCreateRenderScript, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(orCreateRenderScript, createBitmap);
        create.setRadius(coercedRadius);
        create.setInput(createFromBitmap);
        create.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
        create.destroy();
        return createBitmap;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float radius) {
        return RangesKt.coerceIn(radius, 1.0f, MAX_BLUR);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderScript renderScript = this.cachedRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
        this.cachedRenderScript = null;
    }

    /* compiled from: LowApiBitmapEffectHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/LowApiBitmapEffectHelper$Companion;", "", "()V", "MAX_BLUR", "", "MIN_BLUR", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
