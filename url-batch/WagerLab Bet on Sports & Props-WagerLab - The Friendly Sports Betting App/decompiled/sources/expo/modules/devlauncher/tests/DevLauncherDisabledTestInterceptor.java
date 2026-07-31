package expo.modules.devlauncher.tests;

import kotlin.Metadata;

/* compiled from: DevLauncherDisabledTestInterceptor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lexpo/modules/devlauncher/tests/DevLauncherDisabledTestInterceptor;", "Lexpo/modules/devlauncher/tests/DevLauncherTestInterceptor;", "<init>", "()V", "allowReinitialization", "", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherDisabledTestInterceptor implements DevLauncherTestInterceptor {
    public static final int $stable = 0;

    @Override // expo.modules.devlauncher.tests.DevLauncherTestInterceptor
    public boolean allowReinitialization() {
        return false;
    }
}
