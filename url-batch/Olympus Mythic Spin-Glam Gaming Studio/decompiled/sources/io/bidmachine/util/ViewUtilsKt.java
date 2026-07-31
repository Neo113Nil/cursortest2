package io.bidmachine.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import com.ironsource.C4643f8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u0006*\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001d\u0010\f\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0015\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u001d\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u001d\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010\u001f\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010!*\u00020\u0000*\u00020\u00012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0004\b$\u0010%\u001a\u0011\u0010&\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b&\u0010\u0011\u001a\u0013\u0010'\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b'\u0010(\u001a\u0013\u0010*\u001a\u0004\u0018\u00010)*\u00020\u0000¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010-\u001a\u0004\u0018\u00010,*\u00020\u0000¢\u0006\u0004\b-\u0010.\u001a-\u00101\u001a\u00020\u0006*\u00020\u00002\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060/H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0017\u00103\u001a\u00020\u0000*\u00020\u0000H\u0086@ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a1\u00109\u001a\u00020\u0006*\u00020\u00002\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\n¢\u0006\u0004\b9\u0010:\u001a\u0019\u0010=\u001a\u00020\u0006*\u00020\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>\u001a\u0019\u0010=\u001a\u00020\u0006*\u00020?2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010@\u001a\u0019\u0010A\u001a\u00020\u0006*\u00020\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bA\u0010>\u001a\u0019\u0010A\u001a\u00020\u0006*\u00020?2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bA\u0010@\u001a\u0011\u0010B\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\bB\u0010C\u001a\u0011\u0010D\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\bD\u0010C\u001a\u0019\u0010E\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\bE\u0010F\u001a\u0019\u0010K\u001a\u00020J*\u00020G2\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010P\u001a\u0004\u0018\u00010O*\u00020M2\u0006\u0010N\u001a\u00020\n¢\u0006\u0004\bP\u0010Q\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020O0R*\u00020M¢\u0006\u0004\bS\u0010T\u001a\u0011\u0010U\u001a\u00020J*\u00020M¢\u0006\u0004\bU\u0010V\u001a+\u0010Y\u001a\u00020\u0006*\u00020W2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00060/H\u0086\bø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006["}, d2 = {"Landroid/view/View;", "Landroid/view/ViewGroup;", "parent", "", "belongTo", "(Landroid/view/View;Landroid/view/ViewGroup;)Z", "", "showViewSafely", "(Landroid/view/View;)V", "hideViewSafely", "", "color", "setBackgroundColorSafely", "(Landroid/view/View;Ljava/lang/Integer;)V", "removeFromParent", "(Landroid/view/View;)Lkotlin/Unit;", C4643f8.n, "(Landroid/view/View;)Z", "Landroid/graphics/Rect;", "getLocationInWindow", "(Landroid/view/View;)Landroid/graphics/Rect;", "isViewTransparent", "typeInsets", "setInsetsChanger", "(Landroid/view/View;I)V", "view", "index", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "addViewSafely", "(Landroid/view/ViewGroup;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z", "addSingleViewSafely", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "T", "Ljava/lang/Class;", "viewClass", "findViewByClassName", "(Landroid/view/ViewGroup;Ljava/lang/Class;)Landroid/view/View;", "isContentView", "findContentOrRootView", "(Landroid/view/View;)Landroid/view/View;", "Landroid/app/Activity;", "findActivity", "(Landroid/view/View;)Landroid/app/Activity;", "Landroid/view/Window;", "findWindow", "(Landroid/view/View;)Landroid/view/Window;", "Lkotlin/Function1;", "action", "doOnLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "awaitLayout", "(Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leftPx", "topPx", "rightPx", "bottomPx", "addPadding", "(Landroid/view/View;IIII)V", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDrawListener", "addOnPreDrawListenerSafely", "(Landroid/view/View;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "Landroid/view/ViewTreeObserver;", "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "removeOnPreDrawListenerSafely", "getWidthDp", "(Landroid/view/View;)I", "getHeightDp", "contains", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "Landroid/graphics/Paint;", "", "text", "", "measureText", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;)F", "Landroid/text/Layout;", "line", "", "getLineText", "(Landroid/text/Layout;I)Ljava/lang/String;", "", "getTextList", "(Landroid/text/Layout;)Ljava/util/List;", "getMaxLineWidth", "(Landroid/text/Layout;)F", "Landroid/graphics/Canvas;", "block", "withSaveAndRestore", "(Landroid/graphics/Canvas;Lkotlin/jvm/functions/Function1;)V", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewUtilsKt {
    public static final boolean belongTo(@NotNull View view, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            return Intrinsics.areEqual(parent2, parent) || belongTo((View) parent2, parent);
        }
        return false;
    }

    @AnyThread
    public static final void showViewSafely(@Nullable final View view) {
        if (view == null) {
            return;
        }
        UiUtils.onUiThread(new SafeRunnable() { // from class: io.bidmachine.util.ViewUtilsKt$showViewSafely$1
            @Override // io.bidmachine.util.SafeRunnable
            public void onRun() {
                view.setVisibility(0);
            }
        });
    }

    @AnyThread
    public static final void hideViewSafely(@Nullable final View view) {
        if (view == null) {
            return;
        }
        UiUtils.onUiThread(new SafeRunnable() { // from class: io.bidmachine.util.ViewUtilsKt$hideViewSafely$1
            @Override // io.bidmachine.util.SafeRunnable
            public void onRun() {
                view.setVisibility(8);
            }
        });
    }

    @Nullable
    public static final Unit removeFromParent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return Unit.INSTANCE;
    }

    public static final boolean isViewVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return ViewUtils.isViewVisible(view.getVisibility());
    }

    @NotNull
    public static final Rect getLocationInWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static final boolean isViewTransparent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getAlpha() == 0.0f;
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i, int i2, Object obj) {
        int systemBars;
        int displayCutout;
        if ((i2 & 1) != 0) {
            systemBars = WindowInsets.Type.systemBars();
            displayCutout = WindowInsets.Type.displayCutout();
            i = systemBars | displayCutout;
        }
        setInsetsChanger(view, i);
    }

    @RequiresApi
    public static final void setInsetsChanger(@NotNull View view, final int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: io.bidmachine.util.ViewUtilsKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                WindowInsets insetsChanger$lambda$3;
                insetsChanger$lambda$3 = ViewUtilsKt.setInsetsChanger$lambda$3(i, view2, windowInsets);
                return insetsChanger$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setInsetsChanger$lambda$3(int i, View selfView, WindowInsets windowInsets) {
        Insets insets;
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(selfView, "selfView");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        insets = windowInsets.getInsets(i);
        Intrinsics.checkNotNullExpressionValue(insets, "windowInsets.getInsets(typeInsets)");
        i2 = insets.left;
        i3 = insets.top;
        i4 = insets.right;
        i5 = insets.bottom;
        selfView.setPadding(i2, i3, i4, i5);
        return windowInsets;
    }

    public static /* synthetic */ boolean addViewSafely$default(ViewGroup viewGroup, View view, int i, ViewGroup.LayoutParams layoutParams, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            layoutParams = null;
        }
        return addViewSafely(viewGroup, view, i, layoutParams);
    }

    public static final boolean addViewSafely(@NotNull ViewGroup viewGroup, @NotNull View view, int i, @Nullable ViewGroup.LayoutParams layoutParams) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            removeFromParent(view);
            if (layoutParams != null) {
                viewGroup.addView(view, i, layoutParams);
            } else {
                viewGroup.addView(view, i);
            }
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 2) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addSingleViewSafely(@NotNull ViewGroup viewGroup, @NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            viewGroup.removeAllViews();
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
        addViewSafely$default(viewGroup, view, 0, layoutParams, 2, null);
    }

    @Nullable
    public static final <T extends View> T findViewByClassName(@NotNull ViewGroup viewGroup, @NotNull Class<T> viewClass) {
        T t;
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(viewClass, "viewClass");
        try {
            if (Intrinsics.areEqual(viewGroup.getClass(), viewClass)) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof ViewGroup) && (t = (T) findViewByClassName((ViewGroup) childAt, viewClass)) != null) {
                    return t;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean isContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getId() == 16908290;
    }

    @Nullable
    public static final View findContentOrRootView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (isContentView(view)) {
            return view;
        }
        ViewParent parent = view.getParent();
        View view2 = null;
        while (parent instanceof View) {
            view2 = (View) parent;
            if (isContentView(view2)) {
                break;
            }
            parent = view2.getParent();
        }
        return view2;
    }

    @Nullable
    public static final Activity findActivity(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        View findContentOrRootView = findContentOrRootView(view);
        Context context = findContentOrRootView != null ? findContentOrRootView.getContext() : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return UtilsKt.findActivity$default((ContextWrapper) context, 0, 1, null);
        }
        return null;
    }

    @Nullable
    public static final Window findWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Activity findActivity = findActivity(view);
        if (findActivity != null) {
            return findActivity.getWindow();
        }
        return null;
    }

    public static final void doOnLayout(@NotNull View view, @NotNull Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            action.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new ViewUtilsKt$doOnLayout$1(action));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnLayoutChangeListener, io.bidmachine.util.ViewUtilsKt$awaitLayout$2$listener$1] */
    @Nullable
    public static final Object awaitLayout(@NotNull final View view, @NotNull Continuation continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(view));
        } else {
            final ?? r1 = new View.OnLayoutChangeListener() { // from class: io.bidmachine.util.ViewUtilsKt$awaitLayout$2$listener$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnLayoutChangeListener(this);
                    cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(view2));
                }
            };
            cancellableContinuationImpl.invokeOnCancellation(new Function1() { // from class: io.bidmachine.util.ViewUtilsKt$awaitLayout$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Throwable th) {
                    view.removeOnLayoutChangeListener(r1);
                }
            });
            view.addOnLayoutChangeListener(r1);
            if (!view.isLaidOut() && !view.isLayoutRequested()) {
                view.requestLayout();
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final void addPadding(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft() + i, view.getPaddingTop() + i2, view.getPaddingRight() + i3, view.getPaddingBottom() + i4);
    }

    public static final void addOnPreDrawListenerSafely(@NotNull View view, @NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onPreDrawListener, "onPreDrawListener");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            addOnPreDrawListenerSafely(viewTreeObserver, onPreDrawListener);
        }
    }

    public static final void addOnPreDrawListenerSafely(@NotNull ViewTreeObserver viewTreeObserver, @NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Intrinsics.checkNotNullParameter(viewTreeObserver, "<this>");
        Intrinsics.checkNotNullParameter(onPreDrawListener, "onPreDrawListener");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        }
    }

    public static final void removeOnPreDrawListenerSafely(@NotNull View view, @NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onPreDrawListener, "onPreDrawListener");
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            removeOnPreDrawListenerSafely(viewTreeObserver, onPreDrawListener);
        }
    }

    public static final void removeOnPreDrawListenerSafely(@NotNull ViewTreeObserver viewTreeObserver, @NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        Intrinsics.checkNotNullParameter(viewTreeObserver, "<this>");
        Intrinsics.checkNotNullParameter(onPreDrawListener, "onPreDrawListener");
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        }
    }

    public static final int getWidthDp(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return UtilsKt.pxToDp(context, view.getWidth());
    }

    public static final int getHeightDp(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        return UtilsKt.pxToDp(context, view.getHeight());
    }

    public static final boolean contains(@NotNull ViewGroup viewGroup, @NotNull View view) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        return view.getParent() == viewGroup;
    }

    public static final float measureText(@NotNull Paint paint, @NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        return paint.measureText(text, 0, text.length());
    }

    @Nullable
    public static final String getLineText(@NotNull Layout layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (i < 0 || i >= layout.getLineCount()) {
            return null;
        }
        CharSequence text = layout.getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        return text.subSequence(layout.getLineStart(i), layout.getLineEnd(i)).toString();
    }

    @NotNull
    public static final List<String> getTextList(@NotNull Layout layout) {
        String obj;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        ArrayList arrayList = new ArrayList();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            String lineText = getLineText(layout, i);
            if (lineText != null && (obj = StringsKt.trim(lineText).toString()) != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final float getMaxLineWidth(@NotNull Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            float lineWidth = layout.getLineWidth(i);
            if (lineWidth > f) {
                f = lineWidth;
            }
        }
        return f;
    }

    public static final void withSaveAndRestore(@NotNull Canvas canvas, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        int save = canvas.save();
        try {
            block.invoke(canvas);
        } finally {
            InlineMarker.finallyStart(1);
            canvas.restoreToCount(save);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final void setBackgroundColorSafely(@Nullable View view, @Nullable Integer num) {
        if (view == null || num == null) {
            return;
        }
        try {
            view.setBackgroundColor(num.intValue());
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
    }
}
