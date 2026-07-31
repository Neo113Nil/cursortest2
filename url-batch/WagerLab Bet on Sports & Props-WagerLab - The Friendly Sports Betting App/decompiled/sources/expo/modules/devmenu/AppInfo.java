package expo.modules.devmenu;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.media3.common.MimeTypes;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.ReactContext;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import expo.interfaces.devmenu.ReactHostWrapper;
import expo.modules.devmenu.compose.DevMenuState;
import expo.modules.manifests.core.ExpoUpdatesManifest;
import expo.modules.manifests.core.Manifest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AppInfo.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lexpo/modules/devmenu/AppInfo;", "", "<init>", "()V", AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE, "Lexpo/modules/devmenu/AppInfo$Native;", "getNative", "()Lexpo/modules/devmenu/AppInfo$Native;", "setNative", "(Lexpo/modules/devmenu/AppInfo$Native;)V", "init", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "getNativeAppInfo", "getAppInfo", "Lexpo/modules/devmenu/compose/DevMenuState$AppInfo;", "reactHost", "Lexpo/interfaces/devmenu/ReactHostWrapper;", "Native", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AppInfo {
    public static Native native;
    public static final AppInfo INSTANCE = new AppInfo();
    public static final int $stable = 8;

    /* compiled from: AppInfo.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lexpo/modules/devmenu/AppInfo$Native;", "", "appName", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getAppVersion", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Native {
        public static final int $stable = 0;
        private final String appName;
        private final String appVersion;

        public static /* synthetic */ Native copy$default(Native r0, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.appName;
            }
            if ((i & 2) != 0) {
                str2 = r0.appVersion;
            }
            return r0.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppName() {
            return this.appName;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAppVersion() {
            return this.appVersion;
        }

        public final Native copy(String appName, String appVersion) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            return new Native(appName, appVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Native)) {
                return false;
            }
            Native r5 = (Native) other;
            return Intrinsics.areEqual(this.appName, r5.appName) && Intrinsics.areEqual(this.appVersion, r5.appVersion);
        }

        public int hashCode() {
            int hashCode = this.appName.hashCode() * 31;
            String str = this.appVersion;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Native(appName=" + this.appName + ", appVersion=" + this.appVersion + ")";
        }

        public Native(String appName, String str) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.appName = appName;
            this.appVersion = str;
        }

        public /* synthetic */ Native(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final String getAppName() {
            return this.appName;
        }

        public final String getAppVersion() {
            return this.appVersion;
        }
    }

    private AppInfo() {
    }

    public final Native getNative() {
        Native r0 = native;
        if (r0 != null) {
            return r0;
        }
        Intrinsics.throwUninitializedPropertyAccessException(AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE);
        return null;
    }

    public final void setNative(Native r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        native = r2;
    }

    public final void init(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        setNative(getNativeAppInfo(application));
    }

    private final Native getNativeAppInfo(Application application) {
        PackageManager packageManager = application.getPackageManager();
        String packageName = application.getPackageName();
        String str = packageManager.getPackageInfo(packageName, 0).versionName;
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        return new Native(packageManager.getApplicationLabel(applicationInfo).toString(), str);
    }

    public final DevMenuState.AppInfo getAppInfo(ReactHostWrapper reactHost) {
        Intrinsics.checkNotNullParameter(reactHost, "reactHost");
        String appName = getNative().getAppName();
        String appVersion = getNative().getAppVersion();
        ReactContext currentReactContext = reactHost.getCurrentReactContext();
        String sourceURL = currentReactContext != null ? currentReactContext.getSourceURL() : null;
        Manifest currentManifest = DevMenuManager.INSTANCE.getCurrentManifest();
        String str = "";
        if (currentManifest != null) {
            String name = currentManifest.getName();
            if (name != null) {
                appName = name;
            }
            String version = currentManifest.getVersion();
            if (version != null) {
                appVersion = version;
            }
            if (currentManifest instanceof ExpoUpdatesManifest) {
                str = ((ExpoUpdatesManifest) currentManifest).getRuntimeVersion();
            }
        }
        String str2 = appName;
        String str3 = appVersion;
        String str4 = str;
        if (DevMenuManager.INSTANCE.getCurrentManifestURL() != null) {
            sourceURL = DevMenuManager.INSTANCE.getCurrentManifestURL();
        }
        String jsExecutorName = reactHost.getJsExecutorName();
        String str5 = "Hermes";
        if (!StringsKt.contains$default((CharSequence) jsExecutorName, (CharSequence) "Hermes", false, 2, (Object) null)) {
            str5 = "V8";
            if (!StringsKt.contains$default((CharSequence) jsExecutorName, (CharSequence) "V8", false, 2, (Object) null)) {
                str5 = "JSC";
            }
        }
        String str6 = str5;
        if (sourceURL == null) {
            sourceURL = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
        return new DevMenuState.AppInfo(str2, sourceURL, str3, str4, null, str6, 16, null);
    }
}
