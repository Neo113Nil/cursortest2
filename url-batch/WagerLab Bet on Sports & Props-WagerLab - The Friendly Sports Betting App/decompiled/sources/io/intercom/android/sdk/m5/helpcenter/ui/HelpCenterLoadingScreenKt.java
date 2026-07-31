package io.intercom.android.sdk.m5.helpcenter.ui;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.facebook.shimmer.ShimmerFrameLayout;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.ui.components.LoadingComponentKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HelpCenterLoadingScreen.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"HelpCenterLoadingScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HomeLoadingContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterLoadingScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterLoadingScreen$lambda$3(Modifier modifier, int i, int i2, Composer composer, int i3) {
        HelpCenterLoadingScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeLoadingContentPreview$lambda$4(int i, Composer composer, int i2) {
        HomeLoadingContentPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HelpCenterLoadingScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(581033983);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final long m12174getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m12174getPrimaryText0d7_KjU();
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(1093772715);
            boolean changed = startRestartGroup.changed(m12174getPrimaryText0d7_KjU);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ShimmerFrameLayout HelpCenterLoadingScreen$lambda$2$lambda$1;
                        HelpCenterLoadingScreen$lambda$2$lambda$1 = HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$2$lambda$1(m12174getPrimaryText0d7_KjU, (Context) obj);
                        return HelpCenterLoadingScreen$lambda$2$lambda$1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView((Function1) rememberedValue, fillMaxSize$default, null, startRestartGroup, 0, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterLoadingScreen$lambda$3;
                    HelpCenterLoadingScreen$lambda$3 = HelpCenterLoadingScreenKt.HelpCenterLoadingScreen$lambda$3(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterLoadingScreen$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmerFrameLayout HelpCenterLoadingScreen$lambda$2$lambda$1(long j, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ShimmerFrameLayout buildLoadingContainer = LoadingComponentKt.buildLoadingContainer(context);
        buildLoadingContainer.addView(LoadingComponentKt.m11749buildLoadingContentbw27NRU(context, j, R.drawable.intercom_help_center_loading_state));
        return buildLoadingContainer;
    }

    @IntercomPreviews
    public static final void HomeLoadingContentPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-192893266);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterLoadingScreenKt.INSTANCE.m11481getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterLoadingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HomeLoadingContentPreview$lambda$4;
                    HomeLoadingContentPreview$lambda$4 = HelpCenterLoadingScreenKt.HomeLoadingContentPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HomeLoadingContentPreview$lambda$4;
                }
            });
        }
    }
}
