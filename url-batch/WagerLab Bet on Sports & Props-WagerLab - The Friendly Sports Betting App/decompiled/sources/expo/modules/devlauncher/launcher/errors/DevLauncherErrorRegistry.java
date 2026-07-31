package expo.modules.devlauncher.launcher.errors;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherErrorRegistry.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lexpo/modules/devlauncher/launcher/errors/DevLauncherErrorRegistry;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "storeException", "", "throwable", "", "consumeException", "Lexpo/modules/devlauncher/launcher/errors/DevLauncherErrorInstance;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherErrorRegistry {
    public static final int $stable = 8;
    private final SharedPreferences sharedPreferences;

    public DevLauncherErrorRegistry(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("expo.modules.devlauncher.errorregistry", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.sharedPreferences = sharedPreferences;
    }

    public final void storeException(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String json = new Gson().toJson(new DevLauncherErrorInstance(throwable, 0L, 2, null));
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("SavedError", json);
        edit.commit();
    }

    public final DevLauncherErrorInstance consumeException() {
        String string = this.sharedPreferences.getString("SavedError", null);
        if (string == null) {
            return null;
        }
        try {
            return (DevLauncherErrorInstance) new Gson().fromJson(string, DevLauncherErrorInstance.class);
        } finally {
            SharedPreferences.Editor edit = this.sharedPreferences.edit();
            edit.remove("SavedError");
            edit.commit();
        }
    }
}
