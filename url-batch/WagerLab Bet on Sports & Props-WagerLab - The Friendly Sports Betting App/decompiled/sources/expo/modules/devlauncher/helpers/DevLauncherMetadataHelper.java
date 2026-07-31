package expo.modules.devlauncher.helpers;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherMetadataHelper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005¨\u0006\n"}, d2 = {"Lexpo/modules/devlauncher/helpers/DevLauncherMetadataHelper;", "", "<init>", "()V", "getMetadataValue", "", "context", "Landroid/content/Context;", "key", "defaultValue", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherMetadataHelper {
    public static final int $stable = 0;
    public static final DevLauncherMetadataHelper INSTANCE = new DevLauncherMetadataHelper();

    private DevLauncherMetadataHelper() {
    }

    public static /* synthetic */ String getMetadataValue$default(DevLauncherMetadataHelper devLauncherMetadataHelper, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return devLauncherMetadataHelper.getMetadataValue(context, str, str2);
    }

    public final String getMetadataValue(Context context, String key, String defaultValue) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        return (applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(key)) ? defaultValue : String.valueOf(applicationInfo.metaData.get(key));
    }
}
