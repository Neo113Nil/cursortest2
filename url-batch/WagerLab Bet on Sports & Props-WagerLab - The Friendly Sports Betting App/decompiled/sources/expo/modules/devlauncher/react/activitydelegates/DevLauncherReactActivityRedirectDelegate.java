package expo.modules.devlauncher.react.activitydelegates;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.ReactActivity;
import expo.modules.devlauncher.splashscreen.DevLauncherSplashScreenProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DevLauncherReactActivityRedirectDelegate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lexpo/modules/devlauncher/react/activitydelegates/DevLauncherReactActivityRedirectDelegate;", "Lexpo/modules/devlauncher/react/activitydelegates/DevLauncherReactActivityNOPDelegate;", "activity", "Lcom/facebook/react/ReactActivity;", "redirect", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "<init>", "(Lcom/facebook/react/ReactActivity;Lkotlin/jvm/functions/Function1;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "expo-dev-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DevLauncherReactActivityRedirectDelegate extends DevLauncherReactActivityNOPDelegate {
    public static final int $stable = 8;
    private final Function1<Intent, Unit> redirect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DevLauncherReactActivityRedirectDelegate(ReactActivity activity, Function1<? super Intent, Unit> redirect) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.redirect = redirect;
    }

    @Override // expo.modules.devlauncher.react.activitydelegates.DevLauncherReactActivityNOPDelegate, com.facebook.react.ReactActivityDelegate
    public void onCreate(Bundle savedInstanceState) {
        DevLauncherSplashScreenProvider devLauncherSplashScreenProvider = new DevLauncherSplashScreenProvider();
        Activity plainActivity = getPlainActivity();
        Intrinsics.checkNotNullExpressionValue(plainActivity, "getPlainActivity(...)");
        devLauncherSplashScreenProvider.attachSplashScreenViewAsync(plainActivity);
        this.redirect.invoke(getPlainActivity().getIntent());
    }
}
