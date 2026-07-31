package com.facebook.react.devsupport;

import android.content.Context;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import expo.modules.devlauncher.react.DevLauncherPackagerConnectionSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherSettings.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/devsupport/DevLauncherSettings;", "Lcom/facebook/react/devsupport/DevMenuSettingsBase;", "context", "Landroid/content/Context;", "debugServerHost", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "connectionSettings", "Lexpo/modules/devlauncher/react/DevLauncherPackagerConnectionSettings;", "packagerConnectionSettings", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "getPackagerConnectionSettings", "()Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "public_getPackagerConnectionSettings", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DevLauncherSettings extends DevMenuSettingsBase {
    public static final int $stable = 8;
    private DevLauncherPackagerConnectionSettings connectionSettings;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLauncherSettings(Context context, String debugServerHost) {
        super(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(debugServerHost, "debugServerHost");
        this.connectionSettings = new DevLauncherPackagerConnectionSettings(context, debugServerHost);
        getMPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override // com.facebook.react.modules.debug.interfaces.DeveloperSettings
    public PackagerConnectionSettings getPackagerConnectionSettings() {
        return this.connectionSettings;
    }

    public final PackagerConnectionSettings public_getPackagerConnectionSettings() {
        return getPackagerConnectionSettings();
    }
}
