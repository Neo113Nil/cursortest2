package expo.modules.devlauncher.koin;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.koin.core.KoinApplication;

/* compiled from: DevLauncherKoinApp.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/devlauncher/koin/DevLauncherKoinContext;", "", "<init>", "()V", "internalApp", "Lorg/koin/core/KoinApplication;", "reinitialize", "", "app", "getApp", "()Lorg/koin/core/KoinApplication;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherKoinContext {
    public static final int $stable;
    public static final DevLauncherKoinContext INSTANCE = new DevLauncherKoinContext();
    private static KoinApplication internalApp;

    private DevLauncherKoinContext() {
    }

    static {
        Function0 function0;
        function0 = DevLauncherKoinAppKt.koinAppFactory;
        internalApp = (KoinApplication) function0.invoke();
        $stable = 8;
    }

    public final void reinitialize() {
        Function0 function0;
        internalApp.close();
        function0 = DevLauncherKoinAppKt.koinAppFactory;
        internalApp = (KoinApplication) function0.invoke();
    }

    public final KoinApplication getApp() {
        return internalApp;
    }
}
