package expo.modules.devlauncher.launcher.configurators;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.ViewCompat;
import androidx.media3.common.C;
import com.facebook.react.ReactActivity;
import com.facebook.react.uimanager.ViewProps;
import expo.modules.devlauncher.helpers.DevLauncherColorsHelperKt;
import expo.modules.devlauncher.launcher.manifest.DevLauncherNavigationBarVisibility;
import expo.modules.devlauncher.launcher.manifest.DevLauncherOrientation;
import expo.modules.manifests.core.Manifest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DevLauncherExpoActivityConfigurator.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rJ\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0003J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/devlauncher/launcher/configurators/DevLauncherExpoActivityConfigurator;", "", "manifest", "Lexpo/modules/manifests/core/Manifest;", "context", "Landroid/content/Context;", "<init>", "(Lexpo/modules/manifests/core/Manifest;Landroid/content/Context;)V", "applyTaskDescription", "", "activity", "Landroid/app/Activity;", "applyOrientation", "Lcom/facebook/react/ReactActivity;", "applyStatusBarConfiguration", "setStyle", "", "style", "setHidden", ViewProps.HIDDEN, "", "setTranslucent", "translucent", "setColor", "color", "", "applyNavigationBarConfiguration", "Companion", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherExpoActivityConfigurator {
    private final Context context;
    private Manifest manifest;
    public static final int $stable = 8;
    private static final String TAG = "DevLauncherExpoActivityConfigurator";

    public DevLauncherExpoActivityConfigurator(Manifest manifest, Context context) {
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        Intrinsics.checkNotNullParameter(context, "context");
        this.manifest = manifest;
        this.context = context;
    }

    public final void applyTaskDescription(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (DevLauncherColorsHelperKt.isValidColor(this.manifest.getPrimaryColor())) {
            int parseColor = Color.parseColor(this.manifest.getPrimaryColor());
            activity.setTaskDescription(new ActivityManager.TaskDescription(this.manifest.getName(), BitmapFactory.decodeResource(this.context.getResources(), this.context.getApplicationInfo().icon), parseColor));
        }
    }

    public final void applyOrientation(ReactActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String orientation = this.manifest.getOrientation();
        if (orientation != null) {
            int hashCode = orientation.hashCode();
            if (hashCode != 729267099) {
                if (hashCode != 1430647483) {
                    if (hashCode == 1544803905 && orientation.equals("default")) {
                        activity.setRequestedOrientation(-1);
                        return;
                    }
                } else if (orientation.equals(DevLauncherOrientation.LANDSCAPE)) {
                    activity.setRequestedOrientation(0);
                    return;
                }
            } else if (orientation.equals(DevLauncherOrientation.PORTRAIT)) {
                activity.setRequestedOrientation(1);
                return;
            }
        }
        activity.setRequestedOrientation(-1);
    }

    public final void applyStatusBarConfiguration(final ReactActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        JSONObject androidStatusBarOptions = this.manifest.getAndroidStatusBarOptions();
        final String optString = androidStatusBarOptions != null ? androidStatusBarOptions.optString("barStyle") : null;
        final String optString2 = androidStatusBarOptions != null ? androidStatusBarOptions.optString("backgroundColor") : null;
        final boolean z = androidStatusBarOptions == null || androidStatusBarOptions.optBoolean("translucent", true);
        final boolean z2 = androidStatusBarOptions != null && androidStatusBarOptions.optBoolean(ViewProps.HIDDEN, false);
        activity.runOnUiThread(new Runnable() { // from class: expo.modules.devlauncher.launcher.configurators.DevLauncherExpoActivityConfigurator$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                DevLauncherExpoActivityConfigurator.applyStatusBarConfiguration$lambda$0(ReactActivity.this, this, z2, z, optString, optString2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyStatusBarConfiguration$lambda$0(ReactActivity reactActivity, DevLauncherExpoActivityConfigurator devLauncherExpoActivityConfigurator, boolean z, boolean z2, String str, String str2) {
        int parseColor;
        reactActivity.getWindow().clearFlags(67108864);
        ReactActivity reactActivity2 = reactActivity;
        devLauncherExpoActivityConfigurator.setHidden(z, reactActivity2);
        devLauncherExpoActivityConfigurator.setTranslucent(z2, reactActivity2);
        String style = devLauncherExpoActivityConfigurator.setStyle(str, reactActivity2);
        String RGBAtoARGB = DevLauncherColorsHelperKt.RGBAtoARGB(str2);
        if (RGBAtoARGB == null || !DevLauncherColorsHelperKt.isValidColor(RGBAtoARGB)) {
            parseColor = Intrinsics.areEqual(style, "light-content") ? Color.parseColor("#88000000") : 0;
        } else {
            parseColor = Color.parseColor(RGBAtoARGB);
        }
        devLauncherExpoActivityConfigurator.setColor(parseColor, reactActivity2);
    }

    private final String setStyle(String style, Activity activity) {
        int i;
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        String str = "light-content";
        if (Intrinsics.areEqual(style, "light-content")) {
            i = systemUiVisibility & (-8193);
        } else {
            str = "dark-content";
            Intrinsics.areEqual(style, "dark-content");
            i = systemUiVisibility | 8192;
        }
        decorView.setSystemUiVisibility(i);
        return str;
    }

    private final void setHidden(boolean hidden, Activity activity) {
        if (hidden) {
            activity.getWindow().addFlags(1024);
            activity.getWindow().clearFlags(2048);
        } else {
            activity.getWindow().addFlags(2048);
            activity.getWindow().clearFlags(1024);
        }
    }

    private final void setTranslucent(boolean translucent, Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        if (translucent) {
            decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: expo.modules.devlauncher.launcher.configurators.DevLauncherExpoActivityConfigurator$$ExternalSyntheticLambda0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets translucent$lambda$1;
                    translucent$lambda$1 = DevLauncherExpoActivityConfigurator.setTranslucent$lambda$1(view, windowInsets);
                    return translucent$lambda$1;
                }
            });
        } else {
            decorView.setOnApplyWindowInsetsListener(null);
        }
        ViewCompat.requestApplyInsets(decorView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setTranslucent$lambda$1(View v, WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(v, "v");
        WindowInsets onApplyWindowInsets = v.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public final void setColor(int color, Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(color);
    }

    public final void applyNavigationBarConfiguration(ReactActivity activity) {
        int i;
        Intrinsics.checkNotNullParameter(activity, "activity");
        JSONObject androidNavigationBarOptions = this.manifest.getAndroidNavigationBarOptions();
        if (androidNavigationBarOptions == null) {
            return;
        }
        String optString = androidNavigationBarOptions.optString("backgroundColor");
        if (DevLauncherColorsHelperKt.isValidColor(optString)) {
            try {
                activity.getWindow().clearFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
                activity.getWindow().setNavigationBarColor(Color.parseColor(optString));
            } catch (Throwable th) {
                Log.e(TAG, "Failed to configure androidNavigationBar.backgroundColor", th);
            }
        }
        String optString2 = androidNavigationBarOptions.optString("barStyle");
        if (!Intrinsics.areEqual(optString2, "") && Build.VERSION.SDK_INT >= 26) {
            try {
                activity.getWindow().clearFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                if (Intrinsics.areEqual(optString2, "dark-content")) {
                    View decorView = activity.getWindow().getDecorView();
                    Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
            } catch (Throwable th2) {
                Log.e(TAG, "Failed to configure androidNavigationBar.barStyle", th2);
            }
        }
        String optString3 = androidNavigationBarOptions.optString(ViewProps.VISIBLE);
        if (Intrinsics.areEqual(optString3, "")) {
            return;
        }
        View decorView2 = activity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        int systemUiVisibility = decorView2.getSystemUiVisibility();
        if (optString3 != null) {
            int hashCode = optString3.hashCode();
            if (hashCode != -1197068329) {
                if (hashCode != 1137617595) {
                    if (hashCode == 1570144589 && optString3.equals(DevLauncherNavigationBarVisibility.LEANBACK)) {
                        i = 6;
                    }
                } else if (optString3.equals(DevLauncherNavigationBarVisibility.IMMERSIVE)) {
                    i = 2054;
                }
            } else if (optString3.equals(DevLauncherNavigationBarVisibility.STICKY_IMMERSIVE)) {
                i = 4102;
            }
            decorView2.setSystemUiVisibility(i | systemUiVisibility);
        }
        i = 0;
        decorView2.setSystemUiVisibility(i | systemUiVisibility);
    }
}
