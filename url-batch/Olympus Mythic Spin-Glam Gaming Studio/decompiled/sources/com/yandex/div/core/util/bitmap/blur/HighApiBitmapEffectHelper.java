package com.yandex.div.core.util.bitmap.blur;

import android.graphics.Bitmap;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.platform.RenderNodeApi29$$ExternalSyntheticApiModelOutline37;
import com.bytedance.sdk.component.adexpress.fb.zmn$$ExternalSyntheticApiModelOutline11;
import com.yandex.div.core.util.bitmap.BitmapEffectHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HighApiBitmapEffectHelper.kt */
@RequiresApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/HighApiBitmapEffectHelper;", "Lcom/yandex/div/core/util/bitmap/BitmapEffectHelper;", "()V", "cachedHardwareRenderer", "Landroid/graphics/HardwareRenderer;", "cachedRenderNode", "Landroid/graphics/RenderNode;", "blur", "Landroid/graphics/Bitmap;", "bitmap", "radius", "", "isShadow", "", "blurBitmap", "blurShadow", "coercedRadius", "getBitmapScale", "getCoercedBlurRadius", "getOrCreateHardwareRenderer", "getOrCreateRenderNode", "release", "", "Companion", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HighApiBitmapEffectHelper extends BitmapEffectHelper {

    @Deprecated
    public static final float BLUR_COMPATIBILITY_DIVIDER = 1.5f;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int MAX_BLURRED_IMAGES = 1;

    @Nullable
    private HardwareRenderer cachedHardwareRenderer;

    @Nullable
    private RenderNode cachedRenderNode;

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getBitmapScale(float radius) {
        return 1.0f;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public float getCoercedBlurRadius(float radius) {
        return radius;
    }

    private final HardwareRenderer getOrCreateHardwareRenderer() {
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            return hardwareRenderer;
        }
        HardwareRenderer m = zmn$$ExternalSyntheticApiModelOutline11.m();
        this.cachedHardwareRenderer = m;
        return m;
    }

    private final RenderNode getOrCreateRenderNode() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode m = RenderNodeApi29$$ExternalSyntheticApiModelOutline37.m("BlurEffect");
        this.cachedRenderNode = m;
        return m;
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurBitmap(@NotNull Bitmap bitmap, float radius) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, radius) ? bitmap : blur(bitmap, radius, false);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    @NotNull
    public Bitmap blurShadow(@NotNull Bitmap bitmap, float coercedRadius) {
        return !BlurUtils.INSTANCE.isBlurParamsValid(bitmap, coercedRadius) ? bitmap : blur(bitmap, coercedRadius, true);
    }

    @Override // com.yandex.div.core.util.bitmap.blur.BlurHelper
    public void release() {
        RenderNode renderNode = this.cachedRenderNode;
        if (renderNode != null) {
            renderNode.discardDisplayList();
        }
        this.cachedRenderNode = null;
        HardwareRenderer hardwareRenderer = this.cachedHardwareRenderer;
        if (hardwareRenderer != null) {
            hardwareRenderer.destroy();
        }
        this.cachedHardwareRenderer = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
        r0 = r10.getHardwareBuffer();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap blur(Bitmap bitmap, float radius, boolean isShadow) {
        ImageReader newInstance;
        RenderEffect createBlurEffect;
        RecordingCanvas beginRecording;
        HardwareRenderer.FrameRenderRequest createRenderRequest;
        HardwareRenderer.FrameRenderRequest waitForPresent;
        HardwareBuffer hardwareBuffer;
        Bitmap wrapHardwareBuffer;
        Bitmap copy;
        HardwareRenderer orCreateHardwareRenderer = getOrCreateHardwareRenderer();
        RenderNode orCreateRenderNode = getOrCreateRenderNode();
        newInstance = ImageReader.newInstance(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
        orCreateHardwareRenderer.setSurface(newInstance.getSurface());
        orCreateHardwareRenderer.setContentRoot(orCreateRenderNode);
        orCreateRenderNode.setPosition(0, 0, newInstance.getWidth(), newInstance.getHeight());
        float f = radius / 1.5f;
        createBlurEffect = RenderEffect.createBlurEffect(f, f, isShadow ? Shader.TileMode.DECAL : Shader.TileMode.MIRROR);
        orCreateRenderNode.setRenderEffect(createBlurEffect);
        beginRecording = orCreateRenderNode.beginRecording();
        beginRecording.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        orCreateRenderNode.endRecording();
        createRenderRequest = orCreateHardwareRenderer.createRenderRequest();
        waitForPresent = createRenderRequest.setWaitForPresent(true);
        waitForPresent.syncAndDraw();
        Image acquireNextImage = newInstance.acquireNextImage();
        if (acquireNextImage == null || hardwareBuffer == null) {
            return bitmap;
        }
        try {
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, null);
            if (wrapHardwareBuffer != null) {
                if (isShadow) {
                    Bitmap.Config config = wrapHardwareBuffer.getConfig();
                    Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
                    if (config != config2) {
                        copy = wrapHardwareBuffer.copy(config2, false);
                        wrapHardwareBuffer.recycle();
                        hardwareBuffer.close();
                        acquireNextImage.close();
                        return copy;
                    }
                }
                if (wrapHardwareBuffer.getConfig() != bitmap.getConfig()) {
                    Bitmap.Config config3 = bitmap.getConfig();
                    if (config3 == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    }
                    copy = wrapHardwareBuffer.copy(config3, false);
                } else {
                    Bitmap.Config config4 = wrapHardwareBuffer.getConfig();
                    if (config4 == null) {
                        config4 = Bitmap.Config.ARGB_8888;
                    }
                    copy = wrapHardwareBuffer.copy(config4, false);
                }
                wrapHardwareBuffer.recycle();
                hardwareBuffer.close();
                acquireNextImage.close();
                return copy;
            }
            hardwareBuffer.close();
            acquireNextImage.close();
            return bitmap;
        } catch (Throwable th) {
            hardwareBuffer.close();
            acquireNextImage.close();
            throw th;
        }
    }

    /* compiled from: HighApiBitmapEffectHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/core/util/bitmap/blur/HighApiBitmapEffectHelper$Companion;", "", "()V", "BLUR_COMPATIBILITY_DIVIDER", "", "MAX_BLURRED_IMAGES", "", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
