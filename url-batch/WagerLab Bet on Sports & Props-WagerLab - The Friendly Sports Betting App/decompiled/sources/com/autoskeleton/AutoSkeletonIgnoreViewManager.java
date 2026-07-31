package com.autoskeleton;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.IViewGroupManager;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.AutoSkeletonIgnoreViewManagerDelegate;
import com.facebook.react.viewmanagers.AutoSkeletonIgnoreViewManagerInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.AutoSkeletonIgnoreView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoSkeletonIgnoreViewManager.kt */
@ReactModule(name = AutoSkeletonIgnoreViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001\u001cB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/autoskeleton/AutoSkeletonIgnoreViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "LAutoSkeletonIgnoreView;", "Lcom/facebook/react/viewmanagers/AutoSkeletonIgnoreViewManagerInterface;", "Lcom/facebook/react/uimanager/IViewGroupManager;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "getName", "", "createViewInstance", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getChildAt", "Landroid/view/View;", "parent", FirebaseAnalytics.Param.INDEX, "", "getChildCount", "addView", "", "child", "removeViewAt", "needsCustomLayoutForChildren", "", "Companion", "react-native-auto-skeleton_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoSkeletonIgnoreViewManager extends SimpleViewManager<AutoSkeletonIgnoreView> implements AutoSkeletonIgnoreViewManagerInterface<AutoSkeletonIgnoreView>, IViewGroupManager<AutoSkeletonIgnoreView> {
    public static final String REACT_CLASS = "AutoSkeletonIgnoreView";
    private final ViewManagerDelegate<AutoSkeletonIgnoreView> mDelegate;

    @Override // com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public AutoSkeletonIgnoreViewManager(ReactApplicationContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDelegate = new AutoSkeletonIgnoreViewManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<AutoSkeletonIgnoreView> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public AutoSkeletonIgnoreView createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AutoSkeletonIgnoreView autoSkeletonIgnoreView = new AutoSkeletonIgnoreView(context);
        autoSkeletonIgnoreView.setTag(R.id.is_my_custom_child_view, true);
        return autoSkeletonIgnoreView;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public View getChildAt(AutoSkeletonIgnoreView parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View childAt = parent.getChildAt(index);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public int getChildCount(AutoSkeletonIgnoreView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void addView(AutoSkeletonIgnoreView parent, View child, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.IViewGroupManager
    public void removeViewAt(AutoSkeletonIgnoreView parent, int index) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.removeViewAt(index);
    }
}
