package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.core.view.ViewGroupKt;
import androidx.transition.R;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import com.safedk.android.internal.special.SpecialsBridge;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewCopies.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\u0014\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u001c\u0010\f\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a$\u0010\r\u001a\u00020\n*\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u001e\u0010\u000f\u001a\u00020\n*\u00020\u00012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0011H\u0000\u001a\u0014\u0010\u0012\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¨\u0006\u0013"}, d2 = {"createOrGetVisualCopy", "Landroid/view/View;", "view", "sceneRoot", "Landroid/view/ViewGroup;", "transition", "Landroidx/transition/Transition;", "endPosition", "", "drawAndSet", "", "Landroid/widget/ImageView;", "invalidatePosition", "replace", "viewCopy", "setHierarchyImageChangeCallback", "callback", "Lkotlin/Function0;", "setScreenshotFromView", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ViewCopiesKt {
    @MainThread
    @NotNull
    public static final View createOrGetVisualCopy(@NotNull final View view, @NotNull ViewGroup viewGroup, @NotNull Transition transition, @NotNull int[] iArr) {
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        setScreenshotFromView(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        invalidatePosition(imageView, viewGroup, iArr);
        SpecialsBridge.yandexViewSetTag(view, R.id.save_overlay_view, imageView);
        replace(view, imageView, transition, viewGroup);
        setHierarchyImageChangeCallback(view, new Function0() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                ViewCopiesKt.setScreenshotFromView(imageView, view);
            }
        });
        if (!imageView.isAttachedToWindow()) {
            setHierarchyImageChangeCallback(view, null);
        } else {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view3) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view3) {
                    imageView.removeOnAttachStateChangeListener(this);
                    ViewCopiesKt.setHierarchyImageChangeCallback(view, null);
                }
            });
        }
        return imageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScreenshotFromView(final ImageView imageView, final View view) {
        Bitmap bitmap;
        if (!(view instanceof DivBorderSupports)) {
            ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
            Object drawable = imageView2 != null ? imageView2.getDrawable() : null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        if (!ViewsKt.isActuallyLaidOut(view)) {
            if (ViewsKt.isActuallyLaidOut(view) && !view.isLayoutRequested()) {
                drawAndSet(imageView, view);
                return;
            } else {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$$inlined$doOnActualLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        ViewCopiesKt.drawAndSet(imageView, view);
                    }
                });
                return;
            }
        }
        drawAndSet(imageView, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void drawAndSet(ImageView imageView, View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        imageView.setImageBitmap(createBitmap);
        DivBorderSupports divBorderSupports = view instanceof DivBorderSupports ? (DivBorderSupports) view : null;
        if (divBorderSupports == null || divBorderSupports.getDivBorderDrawer() == null) {
            return;
        }
        imageView.setClipToOutline(view.getClipToOutline());
        imageView.setOutlineProvider(view.getOutlineProvider());
    }

    private static final void invalidatePosition(View view, ViewGroup viewGroup, int[] iArr) {
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        view.offsetLeftAndRight(iArr[0] - iArr2[0]);
        view.offsetTopAndBottom(iArr[1] - iArr2[1]);
    }

    private static final void replace(final View view, final View view2, Transition transition, ViewGroup viewGroup) {
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(view2);
        transition.addListener(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$replace$1
            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionEnd(@NonNull Transition transition2, boolean z) {
                super.onTransitionEnd(transition2, z);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionStart(@NonNull Transition transition2, boolean z) {
                super.onTransitionStart(transition2, z);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionStart(@NotNull Transition transition2) {
                view.setVisibility(4);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionPause(@NotNull Transition transition2) {
                overlay.remove(view2);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionResume(@NotNull Transition transition2) {
                if (view2.getParent() == null) {
                    overlay.add(view2);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition2) {
                SpecialsBridge.yandexViewSetTag(view, R.id.save_overlay_view, null);
                view.setVisibility(0);
                overlay.remove(view2);
                transition2.removeListener(this);
            }
        });
    }

    public static /* synthetic */ void setHierarchyImageChangeCallback$default(View view, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        setHierarchyImageChangeCallback(view, function0);
    }

    public static final void setHierarchyImageChangeCallback(@NotNull View view, @Nullable Function0 function0) {
        if (view instanceof DivImageView) {
            ((DivImageView) view).setImageChangeCallback(function0);
        } else if (view instanceof ViewGroup) {
            Iterator it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                setHierarchyImageChangeCallback((View) it.next(), function0);
            }
        }
    }
}
