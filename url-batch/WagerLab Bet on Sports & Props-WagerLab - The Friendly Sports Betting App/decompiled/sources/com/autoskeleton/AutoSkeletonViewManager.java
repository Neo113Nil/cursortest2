package com.autoskeleton;

import android.util.Log;
import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AutoSkeletonViewManagerDelegate;
import com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoSkeletonViewManager.kt */
@ReactModule(name = AutoSkeletonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001'B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001a\u0010\u0015\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0016H\u0017J!\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0017¢\u0006\u0002\u0010\u0019J\u001c\u0010\u001a\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bH\u0017J\u001a\u0010\u001c\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0016H\u0017J\u001c\u0010\u001d\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0017J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0010\u0010\"\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0002H\u0016J \u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\u0014H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/autoskeleton/AutoSkeletonViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/autoskeleton/AutoSkeletonView;", "Lcom/facebook/react/viewmanagers/AutoSkeletonViewManagerInterface;", "Lcom/facebook/react/uimanager/IViewGroupManager;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "getName", "", "createViewInstance", "Lcom/facebook/react/uimanager/ThemedReactContext;", "setIsLoading", "", ViewHierarchyConstants.VIEW_KEY, "value", "", "setShimmerSpeed", "", "setShimmerBackgroundColor", "", "(Lcom/autoskeleton/AutoSkeletonView;Ljava/lang/Integer;)V", "setGradientColors", "Lcom/facebook/react/bridge/ReadableArray;", "setDefaultRadius", "setAnimationType", "getChildAt", "Landroid/view/View;", "parent", FirebaseAnalytics.Param.INDEX, "getChildCount", "addView", "child", "removeViewAt", "needsCustomLayoutForChildren", "Companion", "react-native-auto-skeleton_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoSkeletonViewManager extends SimpleViewManager<AutoSkeletonView> implements AutoSkeletonViewManagerInterface<AutoSkeletonView>, IViewGroupManager<AutoSkeletonView> {
    public static final String REACT_CLASS = "AutoSkeletonView";
    private final ViewManagerDelegate<AutoSkeletonView> mDelegate;

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public AutoSkeletonViewManager(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDelegate = new AutoSkeletonViewManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<AutoSkeletonView> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public AutoSkeletonView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AutoSkeletonView(context);
    }

    @Override // com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface
    @ReactProp(name = "isLoading")
    public void setIsLoading(AutoSkeletonView view, boolean value) {
        if (view != null) {
            view.setIsLoading(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface
    @ReactProp(name = "shimmerSpeed")
    public void setShimmerSpeed(AutoSkeletonView view, float value) {
        if (view != null) {
            view.setShimmerSpeed(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface
    @ReactProp(name = "shimmerBackgroundColor")
    public void setShimmerBackgroundColor(AutoSkeletonView view, Integer value) {
        if (view != null) {
            view.setShimmerBackgroundColor(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface
    @ReactProp(name = "gradientColors")
    public void setGradientColors(AutoSkeletonView view, ReadableArray value) {
        Log.d("SKELETON", "SET COLORS");
        if (view != null) {
            view.setGradientColors(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface
    @ReactProp(name = "defaultRadius")
    public void setDefaultRadius(AutoSkeletonView view, float value) {
        if (view != null) {
            view.setDefaultRadius(value);
        }
    }

    @Override // com.facebook.react.viewmanagers.AutoSkeletonViewManagerInterface
    @ReactProp(name = "animationType")
    public void setAnimationType(AutoSkeletonView view, String value) {
        if (view != null) {
            view.setAnimationType(value);
        }
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public View getChildAt(AutoSkeletonView parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View childAt = parent.getChildAt(index);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(AutoSkeletonView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(AutoSkeletonView parent, View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(AutoSkeletonView parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeViewAt(index);
    }
}
