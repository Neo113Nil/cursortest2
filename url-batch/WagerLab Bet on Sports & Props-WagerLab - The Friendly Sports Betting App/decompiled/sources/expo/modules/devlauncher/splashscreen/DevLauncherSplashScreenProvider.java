package expo.modules.devlauncher.splashscreen;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherSplashScreenProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/devlauncher/splashscreen/DevLauncherSplashScreenProvider;", "", "<init>", "()V", "attachSplashScreenViewAsync", "Lexpo/modules/devlauncher/splashscreen/DevLauncherSplashScreen;", "activity", "Landroid/app/Activity;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherSplashScreenProvider {
    public static final int $stable = 0;

    public final DevLauncherSplashScreen attachSplashScreenViewAsync(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        if (viewGroup == null) {
            return null;
        }
        DevLauncherSplashScreen devLauncherSplashScreen = new DevLauncherSplashScreen(activity);
        viewGroup.addView(devLauncherSplashScreen);
        return devLauncherSplashScreen;
    }
}
