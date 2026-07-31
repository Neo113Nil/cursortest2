package expo.interfaces.devmenu;

import com.facebook.react.ReactHost;
import com.facebook.react.ReactInstanceEventListener;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.runtime.ReactHostDelegate;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.rncompatibility.ReactNativeFeatureFlags;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* compiled from: ReactHostWrapper.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020*2\u0006\u0010+\u001a\u00020,J\u0006\u0010.\u001a\u00020*J\u0010\u0010/\u001a\u00020*2\b\b\u0002\u00100\u001a\u00020$J\b\u00101\u001a\u000202H\u0016J\u0013\u00103\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0017\u0010#\u001a\u00020$8F¢\u0006\f\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u00065"}, d2 = {"Lexpo/interfaces/devmenu/ReactHostWrapper;", "", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "reactHostProvider", "Lkotlin/Function0;", "Lcom/facebook/react/ReactHost;", "<init>", "(Lcom/facebook/react/ReactNativeHost;Lkotlin/jvm/functions/Function0;)V", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "setReactNativeHost", "(Lcom/facebook/react/ReactNativeHost;)V", "reactHost", "getReactHost", "()Lcom/facebook/react/ReactHost;", "setReactHost", "(Lcom/facebook/react/ReactHost;)V", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "lifecycleState", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "hasInstance", "", "getHasInstance", "()Z", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "getDevSupportManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "isBridgelessMode", "jsExecutorName", "", "getJsExecutorName$annotations", "()V", "getJsExecutorName", "()Ljava/lang/String;", "addReactInstanceEventListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/react/ReactInstanceEventListener;", "removeReactInstanceEventListener", "start", "destroy", "reason", "hashCode", "", "equals", "other", "expo-dev-menu-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReactHostWrapper {
    private final boolean isBridgelessMode;
    public ReactHost reactHost;
    public ReactNativeHost reactNativeHost;

    public static /* synthetic */ void getJsExecutorName$annotations() {
    }

    public ReactHostWrapper(ReactNativeHost reactNativeHost, Function0<? extends ReactHost> reactHostProvider) {
        Intrinsics.checkNotNullParameter(reactNativeHost, "reactNativeHost");
        Intrinsics.checkNotNullParameter(reactHostProvider, "reactHostProvider");
        if (ReactNativeFeatureFlags.INSTANCE.getEnableBridgelessArchitecture()) {
            ReactHost invoke = reactHostProvider.invoke();
            if (invoke == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            setReactHost(invoke);
        } else {
            setReactNativeHost(reactNativeHost);
        }
        this.isBridgelessMode = ReactNativeFeatureFlags.INSTANCE.getEnableBridgelessArchitecture();
    }

    public final ReactNativeHost getReactNativeHost() {
        ReactNativeHost reactNativeHost = this.reactNativeHost;
        if (reactNativeHost != null) {
            return reactNativeHost;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactNativeHost");
        return null;
    }

    public final void setReactNativeHost(ReactNativeHost reactNativeHost) {
        Intrinsics.checkNotNullParameter(reactNativeHost, "<set-?>");
        this.reactNativeHost = reactNativeHost;
    }

    public final ReactHost getReactHost() {
        ReactHost reactHost = this.reactHost;
        if (reactHost != null) {
            return reactHost;
        }
        Intrinsics.throwUninitializedPropertyAccessException("reactHost");
        return null;
    }

    public final void setReactHost(ReactHost reactHost) {
        Intrinsics.checkNotNullParameter(reactHost, "<set-?>");
        this.reactHost = reactHost;
    }

    public final ReactContext getCurrentReactContext() {
        if (this.isBridgelessMode) {
            return getReactHost().getCurrentReactContext();
        }
        return getReactNativeHost().getReactInstanceManager().getCurrentReactContext();
    }

    public final LifecycleState getLifecycleState() {
        if (this.isBridgelessMode) {
            return getReactHost().getLifecycleState();
        }
        LifecycleState lifecycleState = getReactNativeHost().getReactInstanceManager().getLifecycleState();
        Intrinsics.checkNotNull(lifecycleState);
        return lifecycleState;
    }

    public final boolean getHasInstance() {
        if (this.isBridgelessMode) {
            ReactContext currentReactContext = getCurrentReactContext();
            if (currentReactContext != null) {
                return currentReactContext.hasActiveReactInstance();
            }
            return false;
        }
        if (getReactNativeHost().hasInstance()) {
            ReactContext currentReactContext2 = getCurrentReactContext();
            if (currentReactContext2 != null ? currentReactContext2.hasActiveReactInstance() : false) {
                return true;
            }
        }
        return false;
    }

    public final DevSupportManager getDevSupportManager() {
        if (this.isBridgelessMode) {
            return getReactHost().getDevSupportManager();
        }
        return getReactNativeHost().getReactInstanceManager().getDevSupportManager();
    }

    /* renamed from: isBridgelessMode, reason: from getter */
    public final boolean getIsBridgelessMode() {
        return this.isBridgelessMode;
    }

    public final String getJsExecutorName() {
        if (this.isBridgelessMode) {
            Field declaredField = ReactHostImpl.class.getDeclaredField("reactHostDelegate");
            Intrinsics.checkNotNullExpressionValue(declaredField, "getDeclaredField(...)");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(getReactHost());
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostDelegate");
            return StringsKt.removeSuffix(StringsKt.removeSuffix(String.valueOf(Reflection.getOrCreateKotlinClass(((ReactHostDelegate) obj).getJsRuntimeFactory().getClass()).getSimpleName()), (CharSequence) "Instance"), (CharSequence) "Runtime");
        }
        String jsExecutorName = getReactNativeHost().getReactInstanceManager().getJsExecutorName();
        Intrinsics.checkNotNullExpressionValue(jsExecutorName, "getJsExecutorName(...)");
        return jsExecutorName;
    }

    public final void addReactInstanceEventListener(ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isBridgelessMode) {
            ReactHost reactHost = getReactHost();
            Intrinsics.checkNotNull(reactHost, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostImpl");
            ((ReactHostImpl) reactHost).addReactInstanceEventListener(listener);
            return;
        }
        getReactNativeHost().getReactInstanceManager().addReactInstanceEventListener(listener);
    }

    public final void removeReactInstanceEventListener(ReactInstanceEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.isBridgelessMode) {
            ReactHost reactHost = getReactHost();
            Intrinsics.checkNotNull(reactHost, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostImpl");
            ((ReactHostImpl) reactHost).removeReactInstanceEventListener(listener);
            return;
        }
        getReactNativeHost().getReactInstanceManager().removeReactInstanceEventListener(listener);
    }

    public final void start() {
        if (this.isBridgelessMode) {
            ReactHost reactHost = getReactHost();
            Intrinsics.checkNotNull(reactHost, "null cannot be cast to non-null type com.facebook.react.runtime.ReactHostImpl");
            ((ReactHostImpl) reactHost).start();
            return;
        }
        getReactNativeHost().getReactInstanceManager().createReactContextInBackground();
    }

    public static /* synthetic */ void destroy$default(ReactHostWrapper reactHostWrapper, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "DevLauncher reloading app";
        }
        reactHostWrapper.destroy(str);
    }

    public final void destroy(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (this.isBridgelessMode) {
            getReactHost().destroy(reason, null);
        } else {
            getReactNativeHost().clear();
        }
    }

    public int hashCode() {
        if (this.isBridgelessMode) {
            return getReactHost().hashCode();
        }
        return getReactNativeHost().hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type expo.interfaces.devmenu.ReactHostWrapper");
        ReactHostWrapper reactHostWrapper = (ReactHostWrapper) other;
        return Intrinsics.areEqual(getReactNativeHost(), reactHostWrapper.getReactNativeHost()) && Intrinsics.areEqual(getReactHost(), reactHostWrapper.getReactHost());
    }
}
