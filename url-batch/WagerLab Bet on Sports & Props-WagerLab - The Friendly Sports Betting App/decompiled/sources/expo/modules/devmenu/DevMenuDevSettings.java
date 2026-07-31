package expo.modules.devmenu;

import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import expo.interfaces.devmenu.ReactHostWrapper;
import expo.modules.devmenu.devtools.DevMenuDevToolsDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevMenuDevSettings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/devmenu/DevMenuDevSettings;", "", "<init>", "()V", "getDevSettings", "Lexpo/modules/devmenu/DevToolsSettings;", "reactHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevMenuDevSettings {
    public static final int $stable = 0;
    public static final DevMenuDevSettings INSTANCE = new DevMenuDevSettings();

    private DevMenuDevSettings() {
    }

    public final DevToolsSettings getDevSettings(ReactHostWrapper reactHost) {
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        DeveloperSettings devSettings = new DevMenuDevToolsDelegate(DevMenuManager.INSTANCE, reactHost).getDevSettings();
        return new DevToolsSettings(devSettings != null ? devSettings.isElementInspectorEnabled() : false, devSettings != null ? devSettings.isHotModuleReplacementEnabled() : true, devSettings != null ? devSettings.isFpsDebugEnabled() : false);
    }
}
