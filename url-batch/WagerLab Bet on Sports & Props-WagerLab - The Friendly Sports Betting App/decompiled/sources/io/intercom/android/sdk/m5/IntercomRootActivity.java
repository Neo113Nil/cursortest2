package io.intercom.android.sdk.m5;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseComponentActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomRootActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/m5/IntercomRootActivity;", "Lio/intercom/android/sdk/activities/IntercomBaseComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomRootActivity extends IntercomBaseComponentActivity {
    public static final int $stable = 0;

    /* compiled from: IntercomRootActivity.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if ((getResources().getConfiguration().uiMode & 48) == 32) goto L14;
     */
    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle savedInstanceState) {
        SystemBarStyle dark;
        super.onCreate(savedInstanceState);
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            dark = SystemBarStyle.INSTANCE.light(0, 0);
            IntercomRootActivity intercomRootActivity = this;
            EdgeToEdge.enable(intercomRootActivity, dark, dark);
            ComponentActivityKt.setContent$default(intercomRootActivity, null, ComposableLambdaKt.composableLambdaInstance(1535831366, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i2) {
                    if ((i2 & 11) != 2 || !composer.getSkipping()) {
                        AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                        Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                        final IntercomRootActivity intercomRootActivity2 = IntercomRootActivity.this;
                        ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, ComposableLambdaKt.rememberComposableLambda(-1535408283, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3) {
                                if ((i3 & 11) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                Intent intent = IntercomRootActivity.this.getIntent();
                                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                                IntercomRootNavHostKt.IntercomRootNavHost(intent, IntercomRootActivity.this, composer2, 8);
                            }
                        }, composer, 54), composer, 56);
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 1, null);
        }
        dark = SystemBarStyle.INSTANCE.dark(0);
        IntercomRootActivity intercomRootActivity2 = this;
        EdgeToEdge.enable(intercomRootActivity2, dark, dark);
        ComponentActivityKt.setContent$default(intercomRootActivity2, null, ComposableLambdaKt.composableLambdaInstance(1535831366, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i2) {
                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    final IntercomRootActivity intercomRootActivity22 = IntercomRootActivity.this;
                    ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, ComposableLambdaKt.rememberComposableLambda(-1535408283, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.IntercomRootActivity$onCreate$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i3) {
                            if ((i3 & 11) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            Intent intent = IntercomRootActivity.this.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                            IntercomRootNavHostKt.IntercomRootNavHost(intent, IntercomRootActivity.this, composer2, 8);
                        }
                    }, composer, 54), composer, 56);
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Injector.get().getDataLayer().clearOpenResponse();
    }
}
