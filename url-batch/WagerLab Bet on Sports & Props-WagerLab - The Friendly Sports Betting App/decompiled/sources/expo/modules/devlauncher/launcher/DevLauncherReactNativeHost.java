package expo.modules.devlauncher.launcher;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import expo.modules.devlauncher.DevLauncherControllerKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherReactNativeHost.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lexpo/modules/devlauncher/launcher/DevLauncherReactNativeHost;", "Lcom/facebook/react/ReactNativeHost;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "launcherIp", "", "<init>", "(Landroid/app/Application;Ljava/lang/String;)V", "getPackages", "", "Lcom/facebook/react/ReactPackage;", "getUseDeveloperSupport", "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherReactNativeHost extends ReactNativeHost {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLauncherReactNativeHost(Application application, String str) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    @Override // com.facebook.react.ReactNativeHost
    protected List<ReactPackage> getPackages() {
        throw new IllegalStateException(DevLauncherControllerKt.DEV_LAUNCHER_IS_NOT_AVAILABLE);
    }

    @Override // com.facebook.react.ReactNativeHost
    public boolean getUseDeveloperSupport() {
        throw new IllegalStateException(DevLauncherControllerKt.DEV_LAUNCHER_IS_NOT_AVAILABLE);
    }
}
