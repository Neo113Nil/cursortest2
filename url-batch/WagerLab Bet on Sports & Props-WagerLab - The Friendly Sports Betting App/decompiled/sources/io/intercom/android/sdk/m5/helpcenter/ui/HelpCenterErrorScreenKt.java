package io.intercom.android.sdk.m5.helpcenter.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: HelpCenterErrorScreen.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"HelpCenterErrorScreen", "", "state", "Lio/intercom/android/sdk/m5/components/ErrorState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/m5/components/ErrorState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HelpCenterErrorScreenWithCTAPreview", "(Landroidx/compose/runtime/Composer;I)V", "HelpCenterErrorScreenWithoutCTAPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpCenterErrorScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterErrorScreen$lambda$0(ErrorState state, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        HelpCenterErrorScreen(state, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterErrorScreenWithCTAPreview$lambda$1(int i, Composer composer, int i2) {
        HelpCenterErrorScreenWithCTAPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpCenterErrorScreenWithoutCTAPreview$lambda$2(int i, Composer composer, int i2) {
        HelpCenterErrorScreenWithoutCTAPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HelpCenterErrorScreen(final ErrorState state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-1476576134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            IntercomErrorScreenKt.IntercomErrorScreen(state, modifier, startRestartGroup, i3 & WebSocketProtocol.PAYLOAD_SHORT, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterErrorScreen$lambda$0;
                    HelpCenterErrorScreen$lambda$0 = HelpCenterErrorScreenKt.HelpCenterErrorScreen$lambda$0(ErrorState.this, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterErrorScreen$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void HelpCenterErrorScreenWithCTAPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1313793298);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterErrorScreenKt.INSTANCE.m11478getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterErrorScreenWithCTAPreview$lambda$1;
                    HelpCenterErrorScreenWithCTAPreview$lambda$1 = HelpCenterErrorScreenKt.HelpCenterErrorScreenWithCTAPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterErrorScreenWithCTAPreview$lambda$1;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void HelpCenterErrorScreenWithoutCTAPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1385533872);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$HelpCenterErrorScreenKt.INSTANCE.m11479getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.HelpCenterErrorScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HelpCenterErrorScreenWithoutCTAPreview$lambda$2;
                    HelpCenterErrorScreenWithoutCTAPreview$lambda$2 = HelpCenterErrorScreenKt.HelpCenterErrorScreenWithoutCTAPreview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return HelpCenterErrorScreenWithoutCTAPreview$lambda$2;
                }
            });
        }
    }
}
