package coil.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.transform.AnimatedTransformation;
import coil.transform.PixelOpacity;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a(\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0001\u001a(\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000\u001a-\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u0002H\u0011\u0012\u0004\u0012\u00020\f0\u0014H\u0080\b\u001a#\u0010\u0019\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0080\b\u001a#\u0010\u001e\u001a\u00020\u0004*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0080\b\u001a\u0014\u0010\u001f\u001a\u00020\u0004*\u00020 2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\u0015\u001a\u00020\u0016*\u00020\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018¨\u0006!"}, d2 = {"asPostProcessor", "Landroid/graphics/PostProcessor;", "Lcoil/transform/AnimatedTransformation;", "flag", "", "Lcoil/transform/PixelOpacity;", "getFlag", "(Lcoil/transform/PixelOpacity;)I", "animatable2CallbackOf", "Landroid/graphics/drawable/Animatable2$AnimationCallback;", "onStart", "Lkotlin/Function0;", "", "onEnd", "animatable2CompatCallbackOf", "Landroidx/vectordrawable/graphics/drawable/Animatable2Compat$AnimationCallback;", "forEachIndices", "T", "", "action", "Lkotlin/Function1;", "isHardware", "", "Landroid/graphics/Bitmap$Config;", "(Landroid/graphics/Bitmap$Config;)Z", "widthPx", "Lcoil/size/Size;", "scale", "Lcoil/size/Scale;", "original", "heightPx", "toPx", "Lcoil/size/Dimension;", "coil-gif_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: coil.util.-GifUtils, reason: invalid class name */
/* loaded from: classes3.dex */
public final class GifUtils {

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: coil.util.-GifUtils$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PixelOpacity.values().length];
            try {
                iArr[PixelOpacity.UNCHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PixelOpacity.TRANSLUCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PixelOpacity.OPAQUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Scale.values().length];
            try {
                iArr2[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final PostProcessor asPostProcessor(final AnimatedTransformation animatedTransformation) {
        return new PostProcessor() { // from class: coil.util.-GifUtils$$ExternalSyntheticLambda0
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int asPostProcessor$lambda$0;
                asPostProcessor$lambda$0 = GifUtils.asPostProcessor$lambda$0(AnimatedTransformation.this, canvas);
                return asPostProcessor$lambda$0;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asPostProcessor$lambda$0(AnimatedTransformation animatedTransformation, Canvas canvas) {
        return getFlag(animatedTransformation.transform(canvas));
    }

    public static final int getFlag(PixelOpacity pixelOpacity) {
        int i = WhenMappings.$EnumSwitchMapping$0[pixelOpacity.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return -3;
        }
        if (i == 3) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Animatable2.AnimationCallback animatable2CallbackOf(final Function0<Unit> function0, final Function0<Unit> function02) {
        return new Animatable2.AnimationCallback() { // from class: coil.util.-GifUtils$animatable2CallbackOf$1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        };
    }

    public static final Animatable2Compat.AnimationCallback animatable2CompatCallbackOf(final Function0<Unit> function0, final Function0<Unit> function02) {
        return new Animatable2Compat.AnimationCallback() { // from class: coil.util.-GifUtils$animatable2CompatCallbackOf$1
            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        };
    }

    public static final <T> void forEachIndices(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            function1.invoke(list.get(i));
        }
    }

    public static final boolean isHardware(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }

    public static final int widthPx(Size size, Scale scale, Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getWidth(), scale);
    }

    public static final int heightPx(Size size, Scale scale, Function0<Integer> function0) {
        return Sizes.isOriginal(size) ? function0.invoke().intValue() : toPx(size.getHeight(), scale);
    }

    public static final int toPx(Dimension dimension, Scale scale) {
        if (dimension instanceof Dimension.Pixels) {
            return ((Dimension.Pixels) dimension).px;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[scale.ordinal()];
        if (i == 1) {
            return Integer.MIN_VALUE;
        }
        if (i == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
