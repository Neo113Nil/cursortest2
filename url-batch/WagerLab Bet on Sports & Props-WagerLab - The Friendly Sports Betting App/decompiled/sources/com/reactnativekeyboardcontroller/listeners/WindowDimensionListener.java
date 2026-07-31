package com.reactnativekeyboardcontroller.listeners;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.reactnativekeyboardcontroller.extensions.FloatKt;
import com.reactnativekeyboardcontroller.extensions.ReactContextKt;
import com.reactnativekeyboardcontroller.extensions.ThemedReactContextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowDimensionListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/reactnativekeyboardcontroller/listeners/WindowDimensionListener;", "", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;)V", "lastDispatchedDimensions", "Lcom/reactnativekeyboardcontroller/listeners/Dimensions;", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "attachListener", "", "detachListener", "updateWindowDimensions", "content", "Landroid/view/ViewGroup;", "Companion", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WindowDimensionListener {
    private static int listenerID = -1;
    private final ThemedReactContext context;
    private Dimensions lastDispatchedDimensions = new Dimensions(0.0d, 0.0d);
    private ViewTreeObserver.OnGlobalLayoutListener layoutListener;

    public WindowDimensionListener(ThemedReactContext themedReactContext) {
        this.context = themedReactContext;
    }

    public final void attachListener() {
        ViewTreeObserver viewTreeObserver;
        ThemedReactContext themedReactContext = this.context;
        if (themedReactContext == null || listenerID == themedReactContext.hashCode()) {
            return;
        }
        listenerID = this.context.hashCode();
        final ViewGroup content = ReactContextKt.getContent(this.context);
        updateWindowDimensions(content);
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.reactnativekeyboardcontroller.listeners.WindowDimensionListener$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                WindowDimensionListener.this.updateWindowDimensions(content);
            }
        };
        if (content == null || (viewTreeObserver = content.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.layoutListener);
    }

    public final void detachListener() {
        ViewGroup content;
        ViewTreeObserver viewTreeObserver;
        ThemedReactContext themedReactContext = this.context;
        if (themedReactContext == null || (content = ReactContextKt.getContent(themedReactContext)) == null || (viewTreeObserver = content.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.layoutListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWindowDimensions(ViewGroup content) {
        if (content == null) {
            return;
        }
        Dimensions dimensions = new Dimensions(FloatKt.getDp(content.getWidth()), FloatKt.getDp(content.getHeight()));
        if (Intrinsics.areEqual(dimensions, this.lastDispatchedDimensions)) {
            return;
        }
        this.lastDispatchedDimensions = dimensions;
        ThemedReactContext themedReactContext = this.context;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("height", dimensions.getHeight());
        createMap.putDouble("width", dimensions.getWidth());
        Unit unit = Unit.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(createMap, "apply(...)");
        ThemedReactContextKt.emitEvent(themedReactContext, "KeyboardController::windowDidResize", createMap);
    }
}
