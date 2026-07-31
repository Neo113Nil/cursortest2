package expo.modules.devlauncher.launcher;

import android.content.Intent;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.bridge.ReactContext;
import expo.interfaces.devmenu.ReactHostWrapper;
import expo.modules.devlauncher.DevLauncherController;
import expo.modules.manifests.core.Manifest;
import expo.modules.updatesinterface.UpdatesInterface;
import expo.modules.updatesinterface.UpdatesInterfaceCallbacks;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DevLauncherControllerInterface.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\bJ,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H&J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H&R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0012\u0010)\u001a\u00020*X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0012\u0010/\u001a\u00020\u001aX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u0004\u0018\u000103X¦\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0012\u00108\u001a\u000209X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lexpo/modules/devlauncher/launcher/DevLauncherControllerInterface;", "Lexpo/modules/updatesinterface/UpdatesInterfaceCallbacks;", "loadApp", "", "url", "Landroid/net/Uri;", "mainActivity", "Lcom/facebook/react/ReactActivity;", "(Landroid/net/Uri;Lcom/facebook/react/ReactActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "projectUrl", "(Landroid/net/Uri;Landroid/net/Uri;Lcom/facebook/react/ReactActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAppLoaded", "context", "Lcom/facebook/react/bridge/ReactContext;", "onAppLoadedWithError", "getRecentlyOpenedApps", "", "Lexpo/modules/devlauncher/launcher/DevLauncherAppEntry;", "clearRecentlyOpenedApps", "navigateToLauncher", "getCurrentReactActivityDelegate", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "delegateSupplierDevLauncher", "Lexpo/modules/devlauncher/launcher/DevLauncherReactActivityDelegateSupplier;", "handleIntent", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "activityToBeInvalidated", "manifest", "Lexpo/modules/manifests/core/Manifest;", "getManifest", "()Lexpo/modules/manifests/core/Manifest;", "manifestURL", "getManifestURL", "()Landroid/net/Uri;", "mode", "Lexpo/modules/devlauncher/DevLauncherController$Mode;", "getMode", "()Lexpo/modules/devlauncher/DevLauncherController$Mode;", "appHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "getAppHost", "()Lexpo/interfaces/devmenu/ReactHostWrapper;", "latestLoadedApp", "getLatestLoadedApp", "useDeveloperSupport", "getUseDeveloperSupport", "()Z", "updatesInterface", "Lexpo/modules/updatesinterface/UpdatesInterface;", "getUpdatesInterface", "()Lexpo/modules/updatesinterface/UpdatesInterface;", "setUpdatesInterface", "(Lexpo/modules/updatesinterface/UpdatesInterface;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DevLauncherControllerInterface extends UpdatesInterfaceCallbacks {
    void clearRecentlyOpenedApps();

    ReactHostWrapper getAppHost();

    CoroutineScope getCoroutineScope();

    ReactActivityDelegate getCurrentReactActivityDelegate(ReactActivity activity, DevLauncherReactActivityDelegateSupplier delegateSupplierDevLauncher);

    Uri getLatestLoadedApp();

    Manifest getManifest();

    Uri getManifestURL();

    DevLauncherController.Mode getMode();

    List<DevLauncherAppEntry> getRecentlyOpenedApps();

    UpdatesInterface getUpdatesInterface();

    boolean getUseDeveloperSupport();

    boolean handleIntent(Intent intent, ReactActivity activityToBeInvalidated);

    Object loadApp(Uri uri, Uri uri2, ReactActivity reactActivity, Continuation<? super Unit> continuation);

    Object loadApp(Uri uri, ReactActivity reactActivity, Continuation<? super Unit> continuation);

    void navigateToLauncher();

    void onAppLoaded(ReactContext context);

    void onAppLoadedWithError();

    void setUpdatesInterface(UpdatesInterface updatesInterface);

    /* compiled from: DevLauncherControllerInterface.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object loadApp$default(DevLauncherControllerInterface devLauncherControllerInterface, Uri uri, ReactActivity reactActivity, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadApp");
            }
            if ((i & 2) != 0) {
                reactActivity = null;
            }
            return devLauncherControllerInterface.loadApp(uri, reactActivity, continuation);
        }

        public static /* synthetic */ Object loadApp$default(DevLauncherControllerInterface devLauncherControllerInterface, Uri uri, Uri uri2, ReactActivity reactActivity, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadApp");
            }
            if ((i & 4) != 0) {
                reactActivity = null;
            }
            return devLauncherControllerInterface.loadApp(uri, uri2, reactActivity, continuation);
        }
    }
}
