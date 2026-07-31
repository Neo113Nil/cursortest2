package expo.modules.devmenu.devtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import expo.interfaces.devmenu.DevMenuManagerInterface;
import expo.interfaces.devmenu.ReactHostWrapper;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: DevMenuDevToolsDelegate.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0018J\u0017\u0010\u001e\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0082\bJ\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lexpo/modules/devmenu/devtools/DevMenuDevToolsDelegate;", "", "manager", "Lexpo/interfaces/devmenu/DevMenuManagerInterface;", "reactHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "<init>", "(Lexpo/interfaces/devmenu/DevMenuManagerInterface;Lexpo/interfaces/devmenu/ReactHostWrapper;)V", "_reactDevManager", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "_reactContext", "Lcom/facebook/react/bridge/ReactContext;", "reactDevManager", "getReactDevManager", "()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "devSettings", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "getDevSettings", "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "reactContext", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "reload", "", "toggleElementInspector", "togglePerformanceMonitor", "context", "Landroid/content/Context;", "openJSInspector", "runWithDevSupportEnabled", "action", "Lkotlin/Function0;", "requestOverlaysPermission", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuDevToolsDelegate {
    public static final int $stable = 8;
    private final WeakReference<ReactContext> _reactContext;
    private final WeakReference<DevSupportManager> _reactDevManager;
    private final DevMenuManagerInterface manager;

    public DevMenuDevToolsDelegate(DevMenuManagerInterface manager, ReactHostWrapper reactHost) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        this.manager = manager;
        this._reactDevManager = new WeakReference<>(reactHost.getDevSupportManager());
        this._reactContext = new WeakReference<>(reactHost.getCurrentReactContext());
    }

    public final DevSupportManager getReactDevManager() {
        return this._reactDevManager.get();
    }

    public final DeveloperSettings getDevSettings() {
        DevSupportManager reactDevManager = getReactDevManager();
        if (reactDevManager != null) {
            return reactDevManager.getDevSettings();
        }
        return null;
    }

    public final ReactContext getReactContext() {
        return this._reactContext.get();
    }

    public final void reload() {
        final DevSupportManager reactDevManager = getReactDevManager();
        if (reactDevManager == null) {
            return;
        }
        this.manager.closeMenu();
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: expo.modules.devmenu.devtools.DevMenuDevToolsDelegate$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                DevSupportManager.this.handleReloadJS();
            }
        });
    }

    public final void togglePerformanceMonitor(Context context) {
        DeveloperSettings devSettings;
        Intrinsics.checkNotNullParameter(context, "context");
        DevSupportManager reactDevManager = getReactDevManager();
        if (reactDevManager == null || (devSettings = getDevSettings()) == null) {
            return;
        }
        requestOverlaysPermission(context);
        DevSupportManager reactDevManager2 = getReactDevManager();
        if (reactDevManager2 == null) {
            return;
        }
        boolean devSupportEnabled = reactDevManager2.getDevSupportEnabled();
        reactDevManager2.setDevSupportEnabled(true);
        reactDevManager.setFpsDebugEnabled(!devSettings.isFpsDebugEnabled());
        reactDevManager2.setDevSupportEnabled(devSupportEnabled);
    }

    private final void runWithDevSupportEnabled(Function0<Unit> action) {
        DevSupportManager reactDevManager = getReactDevManager();
        if (reactDevManager == null) {
            return;
        }
        boolean devSupportEnabled = reactDevManager.getDevSupportEnabled();
        reactDevManager.setDevSupportEnabled(true);
        action.invoke();
        reactDevManager.setDevSupportEnabled(devSupportEnabled);
    }

    private final void requestOverlaysPermission(Context context) {
        if (Settings.canDrawOverlays(context)) {
            return;
        }
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getApplicationContext().getPackageName()));
        intent.setFlags(268435456);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public final void toggleElementInspector() {
        DevSupportManager reactDevManager = getReactDevManager();
        if (reactDevManager == null) {
            return;
        }
        boolean devSupportEnabled = reactDevManager.getDevSupportEnabled();
        reactDevManager.setDevSupportEnabled(true);
        DevSupportManager reactDevManager2 = getReactDevManager();
        if (reactDevManager2 != null) {
            reactDevManager2.toggleElementInspector();
        }
        reactDevManager.setDevSupportEnabled(devSupportEnabled);
    }

    public final void openJSInspector() {
        ReactContext reactContext;
        DevSupportManager reactDevManager = getReactDevManager();
        if (reactDevManager == null) {
            return;
        }
        boolean devSupportEnabled = reactDevManager.getDevSupportEnabled();
        reactDevManager.setDevSupportEnabled(true);
        DeveloperSettings devSettings = getDevSettings();
        if (devSettings == null || (reactContext = getReactContext()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(this.manager.getCoroutineScope(), null, null, new DevMenuDevToolsDelegate$openJSInspector$1$1("http://" + devSettings.getPackagerConnectionSettings().getServerIp(), reactContext, null), 3, null);
        reactDevManager.setDevSupportEnabled(devSupportEnabled);
    }
}
