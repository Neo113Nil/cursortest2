package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import com.safedk.android.utils.h;
import com.yandex.div.R;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Releasable;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoadableImageView.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001ZB#\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0010\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020-H\u0016J\b\u00109\u001a\u00020&H\u0016J\u000e\u0010:\u001a\b\u0012\u0002\b\u0003\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020&H\u0016J\u0010\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020\u001dH\u0016J\b\u0010?\u001a\u00020&H\u0014J\b\u0010@\u001a\u00020&H\u0014J\u0018\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\nH\u0014J\b\u0010E\u001a\u00020&H\u0016J\b\u0010F\u001a\u00020&H\u0016J\b\u0010G\u001a\u00020&H\u0016J\u0014\u0010H\u001a\u00020&2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030;H\u0016J\u0012\u0010J\u001a\u00020&2\b\u0010K\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010J\u001a\u00020&2\b\u0010L\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010M\u001a\u00020&2\b\u0010N\u001a\u0004\u0018\u00010\u000fH\u0017J\u0018\u0010O\u001a\u00020&2\u0010\b\u0002\u0010P\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%J\u0012\u0010Q\u001a\u00020&2\b\u0010L\u001a\u0004\u0018\u00010\u001dH\u0017J\u0012\u0010R\u001a\u00020&2\b\u0010L\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010S\u001a\u00020&2\b\u0010K\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010S\u001a\u00020&2\b\u0010L\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010T\u001a\u00020-H\u0002J\u0012\u0010U\u001a\u00020&2\b\u0010V\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010W\u001a\u00020-2\u0006\u0010X\u001a\u00020\nH\u0002J\f\u0010Y\u001a\u00020\u001d*\u00020\u001dH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010'\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010.R\u0014\u0010/\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010.R\u001c\u00100\u001a\u0004\u0018\u000101X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0010\u00106\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006["}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView;", "Lcom/yandex/div/internal/widget/AspectImageView;", "Lcom/yandex/div/core/view2/divs/widgets/LoadableImage;", "Lcom/yandex/div/core/widget/DivExtendableView;", "Lcom/yandex/div/core/view2/Releasable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_imageTransformer", "Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "currentBitmapWithoutFilters", "Landroid/graphics/Bitmap;", "getCurrentBitmapWithoutFilters$div_release$annotations", "()V", "getCurrentBitmapWithoutFilters$div_release", "()Landroid/graphics/Bitmap;", "setCurrentBitmapWithoutFilters$div_release", "(Landroid/graphics/Bitmap;)V", "delegate", "Lcom/yandex/div/core/widget/DivViewDelegate;", "getDelegate", "()Lcom/yandex/div/core/widget/DivViewDelegate;", "setDelegate", "(Lcom/yandex/div/core/widget/DivViewDelegate;)V", "value", "Landroid/graphics/drawable/Drawable;", "externalImage", "getExternalImage$annotations", "getExternalImage", "()Landroid/graphics/drawable/Drawable;", "setExternalImage", "(Landroid/graphics/drawable/Drawable;)V", "imageChangeCallback", "Lkotlin/Function0;", "", "imageTransformer", "getImageTransformer", "()Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "setImageTransformer", "(Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;)V", "isImageLoaded", "", "()Z", "isImagePreview", "loadReference", "Lcom/yandex/div/core/images/LoadReference;", "getLoadReference$div_release", "()Lcom/yandex/div/core/images/LoadReference;", "setLoadReference$div_release", "(Lcom/yandex/div/core/images/LoadReference;)V", "sourceDrawable", "buildDrawingCache", "autoScale", "cleanLoadingTask", "getLoadingTask", "Ljava/util/concurrent/Future;", "imageLoaded", "invalidateDrawable", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, "onAttachedToWindow", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "previewLoaded", "release", "resetImageLoaded", "saveLoadingTask", "task", "setImage", "bitmap", "drawable", "setImageBitmap", "bm", "setImageChangeCallback", "callback", "setImageDrawable", "setPlaceholder", "setPreview", "shouldScaleAccordingToDensity", "unscheduleDrawable", "who", "wrapsSize", "size", "scaleAccordingToDensity", "ImageTransformer", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class LoadableImageView extends AspectImageView implements LoadableImage, DivExtendableView, Releasable {

    @NotNull
    private ImageTransformer _imageTransformer;

    @Nullable
    private Bitmap currentBitmapWithoutFilters;

    @Nullable
    private DivViewDelegate delegate;

    @Nullable
    private Drawable externalImage;

    @Nullable
    private Function0 imageChangeCallback;

    @Nullable
    private LoadReference loadReference;

    @Nullable
    private Drawable sourceDrawable;

    @Deprecated
    public static /* synthetic */ void getCurrentBitmapWithoutFilters$div_release$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getExternalImage$annotations() {
    }

    private final boolean wrapsSize(int size) {
        return size == -3 || size == -2;
    }

    @Override // com.yandex.div.internal.widget.AspectImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.yandex.div.internal.widget.AspectImageView, android.widget.ImageView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public /* synthetic */ LoadableImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public LoadableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._imageTransformer = ImageTransformer.NOP.INSTANCE;
    }

    @Nullable
    /* renamed from: getCurrentBitmapWithoutFilters$div_release, reason: from getter */
    public final Bitmap getCurrentBitmapWithoutFilters() {
        return this.currentBitmapWithoutFilters;
    }

    public final void setCurrentBitmapWithoutFilters$div_release(@Nullable Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    @Nullable
    /* renamed from: getLoadReference$div_release, reason: from getter */
    public final LoadReference getLoadReference() {
        return this.loadReference;
    }

    public final void setLoadReference$div_release(@Nullable LoadReference loadReference) {
        this.loadReference = loadReference;
    }

    @Nullable
    /* renamed from: getImageTransformer, reason: from getter */
    public final ImageTransformer get_imageTransformer() {
        return this._imageTransformer;
    }

    public final void setImageTransformer(@Nullable ImageTransformer imageTransformer) {
        if (imageTransformer == null) {
            imageTransformer = ImageTransformer.NOP.INSTANCE;
        }
        this._imageTransformer = imageTransformer;
        Drawable drawable = this.sourceDrawable;
        if (drawable != null) {
            setImageDrawable(drawable);
        }
    }

    @Override // com.yandex.div.core.widget.DivExtendableView
    @Nullable
    public DivViewDelegate getDelegate() {
        return this.delegate;
    }

    @Override // com.yandex.div.core.widget.DivExtendableView
    public void setDelegate(@Nullable DivViewDelegate divViewDelegate) {
        this.delegate = divViewDelegate;
    }

    @Nullable
    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    public final void setExternalImage(@Nullable Drawable drawable) {
        this.externalImage = drawable != null ? scaleAccordingToDensity(drawable) : null;
        invalidate();
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public boolean isImageLoaded() {
        return Intrinsics.areEqual(getTag(R.id.image_loaded_flag), Boolean.TRUE);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public boolean isImagePreview() {
        return Intrinsics.areEqual(getTag(R.id.image_loaded_flag), Boolean.FALSE);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void imageLoaded() {
        SpecialsBridge.yandexViewSetTag(this, R.id.image_loaded_flag, Boolean.TRUE);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void previewLoaded() {
        SpecialsBridge.yandexViewSetTag(this, R.id.image_loaded_flag, Boolean.FALSE);
    }

    public void resetImageLoaded() {
        SpecialsBridge.yandexViewSetTag(this, R.id.image_loaded_flag, null);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void setPlaceholder(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void setPreview(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void setPreview(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void setImage(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void setImage(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void saveLoadingTask(@NotNull Future<?> task) {
        SpecialsBridge.yandexViewSetTag(this, R.id.bitmap_load_references_tag, task);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    @Nullable
    public Future<?> getLoadingTask() {
        Object tag = getTag(R.id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    public void cleanLoadingTask() {
        SpecialsBridge.yandexViewSetTag(this, R.id.bitmap_load_references_tag, null);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.sourceDrawable = drawable;
        if (this.externalImage != null) {
            Drawable drawable2 = getDrawable();
            Drawable drawable3 = this.externalImage;
            if (drawable2 != drawable3) {
                super.setImageDrawable(drawable3);
            }
            Function0 function0 = this.imageChangeCallback;
            if (function0 != null) {
                function0.mo4828invoke();
                return;
            }
            return;
        }
        Drawable transform = this._imageTransformer.transform(drawable);
        super.setImageDrawable(transform != null ? scaleAccordingToDensity(transform) : null);
        Function0 function02 = this.imageChangeCallback;
        if (function02 != null) {
            function02.mo4828invoke();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageBitmap(@Nullable Bitmap bm) {
        if (shouldScaleAccordingToDensity() && bm != null) {
            bm.setDensity(160);
        }
        setImageDrawable(new BitmapDrawable(getContext().getResources(), bm));
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable dr) {
        Drawable invalidateDrawable;
        DivViewDelegate delegate = getDelegate();
        if (delegate != null && (invalidateDrawable = delegate.invalidateDrawable(dr)) != null) {
            dr = invalidateDrawable;
        }
        super.invalidateDrawable(dr);
    }

    @Override // android.view.View
    public void unscheduleDrawable(@Nullable Drawable who) {
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.unscheduleDrawable(who);
        }
        super.unscheduleDrawable(who);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        DivViewDelegate delegate = getDelegate();
        if (delegate == null || delegate.onVisibilityChanged(changedView, visibility)) {
            return;
        }
        super.onVisibilityChanged(changedView, visibility);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onAttachedToWindow();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean autoScale) {
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.buildDrawingCache(autoScale);
        }
        super.buildDrawingCache(autoScale);
    }

    private final Drawable scaleAccordingToDensity(Drawable drawable) {
        if (!shouldScaleAccordingToDensity()) {
            return drawable;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return (Build.VERSION.SDK_INT < 28 || !fs$$ExternalSyntheticApiModelOutline0.m(drawable)) ? drawable : new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap != null) {
            bitmap.setDensity(160);
        }
        bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        return drawable;
    }

    private final boolean shouldScaleAccordingToDensity() {
        return (wrapsSize(getLayoutParams().width) && wrapsSize(getLayoutParams().height)) || getImageScale() == AspectImageView.Scale.NO_SCALE;
    }

    public static /* synthetic */ void setImageChangeCallback$default(LoadableImageView loadableImageView, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setImageChangeCallback");
        }
        if ((i & 1) != 0) {
            function0 = null;
        }
        loadableImageView.setImageChangeCallback(function0);
    }

    public final void setImageChangeCallback(@Nullable Function0 callback) {
        this.imageChangeCallback = callback;
    }

    public void release() {
        this.currentBitmapWithoutFilters = null;
        setExternalImage(null);
        this.sourceDrawable = null;
        resetImageLoaded();
        Future<?> loadingTask = getLoadingTask();
        if (loadingTask != null) {
            loadingTask.cancel(true);
        }
        cleanLoadingTask();
    }

    /* compiled from: LoadableImageView.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "", "transform", "Landroid/graphics/drawable/Drawable;", "drawable", "NOP", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ImageTransformer {
        @Nullable
        Drawable transform(@Nullable Drawable drawable);

        /* compiled from: LoadableImageView.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer$NOP;", "Lcom/yandex/div/core/widget/LoadableImageView$ImageTransformer;", "()V", "transform", "Landroid/graphics/drawable/Drawable;", "drawable", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class NOP implements ImageTransformer {

            @NotNull
            public static final NOP INSTANCE = new NOP();

            @Override // com.yandex.div.core.widget.LoadableImageView.ImageTransformer
            @Nullable
            public Drawable transform(@Nullable Drawable drawable) {
                return drawable;
            }

            private NOP() {
            }
        }
    }
}
