package expo.modules.devmenu;

import android.app.Application;
import android.content.Context;
import android.view.View;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import expo.modules.core.interfaces.ApplicationLifecycleListener;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuPackage.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J&\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r0\u000b0\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016¨\u0006\u0017"}, d2 = {"Lexpo/modules/devmenu/DevMenuPackage;", "Lexpo/modules/core/interfaces/Package;", "Lcom/facebook/react/ReactPackage;", "<init>", "()V", "createNativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "Landroid/view/View;", "Lcom/facebook/react/uimanager/ReactShadowNode;", "createReactActivityLifecycleListeners", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "activityContext", "Landroid/content/Context;", "createReactActivityHandlers", "Lexpo/modules/core/interfaces/ReactActivityHandler;", "createApplicationLifecycleListeners", "Lexpo/modules/core/interfaces/ApplicationLifecycleListener;", "context", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuPackage implements Package, ReactPackage {
    public static final int $stable = 0;

    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.emptyList();
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager<View, ReactShadowNode<?>>> createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.emptyList();
    }

    @Override // expo.modules.core.interfaces.Package
    public List<ReactActivityLifecycleListener> createReactActivityLifecycleListeners(Context activityContext) {
        return CollectionsKt.emptyList();
    }

    @Override // expo.modules.core.interfaces.Package
    public List<ReactActivityHandler> createReactActivityHandlers(Context activityContext) {
        return CollectionsKt.emptyList();
    }

    @Override // expo.modules.core.interfaces.Package
    public List<ApplicationLifecycleListener> createApplicationLifecycleListeners(Context context) {
        return CollectionsKt.listOf(new ApplicationLifecycleListener() { // from class: expo.modules.devmenu.DevMenuPackage$createApplicationLifecycleListeners$1
            @Override // expo.modules.core.interfaces.ApplicationLifecycleListener
            public void onCreate(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                DevMenuPreferencesHandle.INSTANCE.init(application);
                AppInfo.INSTANCE.init(application);
            }
        });
    }
}
