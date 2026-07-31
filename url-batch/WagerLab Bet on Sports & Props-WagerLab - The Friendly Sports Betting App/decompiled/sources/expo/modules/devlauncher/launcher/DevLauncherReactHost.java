package expo.modules.devlauncher.launcher;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.facebook.react.ReactHost;
import expo.modules.devlauncher.DevLauncherControllerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherReactHost.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lexpo/modules/devlauncher/launcher/DevLauncherReactHost;", "", "<init>", "()V", "create", "Lcom/facebook/react/ReactHost;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "launcherIp", "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherReactHost {
    public static final int $stable = 0;
    public static final DevLauncherReactHost INSTANCE = new DevLauncherReactHost();

    private DevLauncherReactHost() {
    }

    public final ReactHost create(Application application, String launcherIp) {
        Intrinsics.checkNotNullParameter(application, "application");
        throw new IllegalStateException(DevLauncherControllerKt.DEV_LAUNCHER_IS_NOT_AVAILABLE);
    }
}
