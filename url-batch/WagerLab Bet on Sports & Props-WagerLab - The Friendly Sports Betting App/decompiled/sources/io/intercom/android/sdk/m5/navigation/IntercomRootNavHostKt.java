package io.intercom.android.sdk.m5.navigation;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IntercomRootNavHost.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"IntercomRootNavHost", "", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "rootActivity", "Landroidx/activity/ComponentActivity;", "(Landroid/content/Intent;Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntercomRootNavHostKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomRootNavHost$lambda$0(Intent intent, ComponentActivity rootActivity, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        IntercomRootNavHost(intent, rootActivity, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntercomRootNavHost$lambda$1(Intent intent, ComponentActivity rootActivity, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(intent, "$intent");
        Intrinsics.checkNotNullParameter(rootActivity, "$rootActivity");
        IntercomRootNavHost(intent, rootActivity, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IntercomRootNavHost(final Intent intent, final ComponentActivity rootActivity, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(rootActivity, "rootActivity");
        Composer startRestartGroup = composer.startRestartGroup(884340874);
        IntercomRootActivityArgs argsForIntent = IntercomRootActivityArgsKt.getArgsForIntent(intent);
        if (argsForIntent instanceof IntercomRootActivityArgs.NoContent) {
            rootActivity.finish();
            LumberMill.getLogger().e("No content to display. Closing the activity.", new Object[0]);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit IntercomRootNavHost$lambda$0;
                        IntercomRootNavHost$lambda$0 = IntercomRootNavHostKt.IntercomRootNavHost$lambda$0(intent, rootActivity, i, (Composer) obj, ((Integer) obj2).intValue());
                        return IntercomRootNavHost$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1903672037, true, new IntercomRootNavHostKt$IntercomRootNavHost$2(rememberNavController, argsForIntent, rootActivity, (CoroutineScope) rememberedValue), startRestartGroup, 54), startRestartGroup, 12582912, 127);
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.navigation.IntercomRootNavHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit IntercomRootNavHost$lambda$1;
                    IntercomRootNavHost$lambda$1 = IntercomRootNavHostKt.IntercomRootNavHost$lambda$1(intent, rootActivity, i, (Composer) obj, ((Integer) obj2).intValue());
                    return IntercomRootNavHost$lambda$1;
                }
            });
        }
    }
}
