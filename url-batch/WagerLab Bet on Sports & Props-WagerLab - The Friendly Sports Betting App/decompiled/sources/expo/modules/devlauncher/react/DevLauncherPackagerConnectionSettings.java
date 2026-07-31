package expo.modules.devlauncher.react;

import android.content.Context;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherPackagerConnectionSettings.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lexpo/modules/devlauncher/react/DevLauncherPackagerConnectionSettings;", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "context", "Landroid/content/Context;", "serverIp", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "value", "debugServerHost", "getDebugServerHost", "()Ljava/lang/String;", "setDebugServerHost", "(Ljava/lang/String;)V", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherPackagerConnectionSettings extends PackagerConnectionSettings {
    public static final int $stable = 8;
    private String serverIp;

    @Override // com.facebook.react.packagerconnection.PackagerConnectionSettings
    public void setDebugServerHost(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLauncherPackagerConnectionSettings(Context context, String serverIp) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serverIp, "serverIp");
        this.serverIp = serverIp;
    }

    @Override // com.facebook.react.packagerconnection.PackagerConnectionSettings
    /* renamed from: getDebugServerHost, reason: from getter */
    public String getServerIp() {
        return this.serverIp;
    }
}
