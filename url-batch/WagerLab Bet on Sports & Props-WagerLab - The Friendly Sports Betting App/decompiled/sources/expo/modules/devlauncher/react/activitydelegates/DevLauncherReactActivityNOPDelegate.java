package expo.modules.devlauncher.react.activitydelegates;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherReactActivityNOPDelegate.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J-\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¨\u0006 "}, d2 = {"Lexpo/modules/devlauncher/react/activitydelegates/DevLauncherReactActivityNOPDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/facebook/react/ReactActivity;", "<init>", "(Lcom/facebook/react/ReactActivity;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onDestroy", "onNewIntent", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "onBackPressed", "onWindowFocusChanged", "hasFocus", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class DevLauncherReactActivityNOPDelegate extends ReactActivityDelegate {
    public static final int $stable = 8;

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onBackPressed() {
        return true;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onCreate(Bundle savedInstanceState) {
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onDestroy() {
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public boolean onNewIntent(Intent intent) {
        return true;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onPause() {
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onResume() {
    }

    @Override // com.facebook.react.ReactActivityDelegate
    public void onWindowFocusChanged(boolean hasFocus) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevLauncherReactActivityNOPDelegate(ReactActivity activity) {
        super(activity, (String) null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
