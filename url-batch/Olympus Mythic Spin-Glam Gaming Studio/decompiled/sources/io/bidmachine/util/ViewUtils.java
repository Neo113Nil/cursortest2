package io.bidmachine.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C4643f8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewUtils.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0011J#\u0010\u0014\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010\u0019J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b#\u0010\u0011J!\u0010#\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010%J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b'\u0010(J+\u0010'\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b'\u0010+J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010-J+\u0010,\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b,\u0010.J1\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010/*\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0007¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b4\u00105J+\u00108\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00072\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f06H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020)H\u0007¢\u0006\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lio/bidmachine/util/ViewUtils;", "", "<init>", "()V", "", "generateViewId", "()I", "Landroid/view/View;", "child", "Landroid/view/ViewGroup;", "parent", "", "belongTo", "(Landroid/view/View;Landroid/view/ViewGroup;)Z", "view", "", "showViewSafely", "(Landroid/view/View;)V", "hideViewSafely", "color", "setBackgroundColorSafely", "(Landroid/view/View;Ljava/lang/Integer;)V", "removeFromParent", "(Landroid/view/View;)Lkotlin/Unit;", C4643f8.n, "(Landroid/view/View;)Z", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "(I)Z", "", "visibilityToString", "(I)Ljava/lang/String;", "Landroid/graphics/Rect;", "getLocationInWindow", "(Landroid/view/View;)Landroid/graphics/Rect;", "isViewTransparent", "setInsetsChanger", "typeInsets", "(Landroid/view/View;I)V", "container", "addViewSafely", "(Landroid/view/ViewGroup;Landroid/view/View;)Z", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)Z", "addSingleViewSafely", "(Landroid/view/ViewGroup;Landroid/view/View;)V", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "T", "Ljava/lang/Class;", "viewClass", "findViewByClassName", "(Landroid/view/ViewGroup;Ljava/lang/Class;)Landroid/view/View;", "findContentOrRootView", "(Landroid/view/View;)Landroid/view/View;", "Lkotlin/Function1;", "action", "doOnLayout", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "createMatchParentParams", "()Landroid/view/ViewGroup$LayoutParams;", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class ViewUtils {

    @NotNull
    public static final ViewUtils INSTANCE = new ViewUtils();

    public static final boolean isViewVisible(int visibility) {
        return visibility == 0;
    }

    private ViewUtils() {
    }

    public static final int generateViewId() {
        return View.generateViewId();
    }

    public static final boolean belongTo(@NotNull View child, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(parent, "parent");
        return ViewUtilsKt.belongTo(child, parent);
    }

    public static final void showViewSafely(@Nullable View view) {
        ViewUtilsKt.showViewSafely(view);
    }

    public static final void hideViewSafely(@Nullable View view) {
        ViewUtilsKt.hideViewSafely(view);
    }

    public static final void setBackgroundColorSafely(@Nullable View view, @Nullable Integer color) {
        ViewUtilsKt.setBackgroundColorSafely(view, color);
    }

    @Nullable
    public static final Unit removeFromParent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtilsKt.removeFromParent(view);
    }

    public static final boolean isViewVisible(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtilsKt.isViewVisible(view);
    }

    @NotNull
    public static final String visibilityToString(int visibility) {
        if (visibility == 0) {
            return "VISIBLE";
        }
        if (visibility == 4) {
            return "INVISIBLE";
        }
        if (visibility == 8) {
            return "GONE";
        }
        return "unknown";
    }

    @NotNull
    public static final Rect getLocationInWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtilsKt.getLocationInWindow(view);
    }

    public static final boolean isViewTransparent(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtilsKt.isViewTransparent(view);
    }

    @RequiresApi
    public static final void setInsetsChanger(@NotNull View view) {
        int systemBars;
        int displayCutout;
        Intrinsics.checkNotNullParameter(view, "view");
        systemBars = WindowInsets.Type.systemBars();
        displayCutout = WindowInsets.Type.displayCutout();
        setInsetsChanger(view, systemBars | displayCutout);
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i, int i2, Object obj) {
        int systemBars;
        int displayCutout;
        if ((i2 & 2) != 0) {
            systemBars = WindowInsets.Type.systemBars();
            displayCutout = WindowInsets.Type.displayCutout();
            i = systemBars | displayCutout;
        }
        setInsetsChanger(view, i);
    }

    @RequiresApi
    public static final void setInsetsChanger(@NotNull View view, int typeInsets) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewUtilsKt.setInsetsChanger(view, typeInsets);
    }

    public static final boolean addViewSafely(@NotNull ViewGroup container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return addViewSafely(container, view, null);
    }

    public static /* synthetic */ boolean addViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        return addViewSafely(viewGroup, view, layoutParams);
    }

    public static final boolean addViewSafely(@NotNull ViewGroup container, @NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtilsKt.addViewSafely$default(container, view, 0, layoutParams, 2, null);
    }

    public static final void addSingleViewSafely(@NotNull ViewGroup container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        addSingleViewSafely(container, view, null);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i, Object obj) {
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addSingleViewSafely(@NotNull ViewGroup container, @NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewUtilsKt.addSingleViewSafely(container, view, layoutParams);
    }

    @Nullable
    public static final <T extends View> T findViewByClassName(@NotNull ViewGroup parent, @NotNull Class<T> viewClass) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(viewClass, "viewClass");
        return (T) ViewUtilsKt.findViewByClassName(parent, viewClass);
    }

    @Nullable
    public static final View findContentOrRootView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return ViewUtilsKt.findContentOrRootView(view);
    }

    @NotNull
    public static final ViewGroup.LayoutParams createMatchParentParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final void doOnLayout(@NotNull View view, @NotNull Function1 action) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            action.invoke(view);
        } else {
            view.addOnLayoutChangeListener(new ViewUtilsKt$doOnLayout$1(action));
        }
    }
}
