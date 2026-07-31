package io.intercom.android.sdk.m5.home.ui.components;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalLinkCard.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"ExternalLinkCard", "", "homeExternalLinkData", "Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeExternalLinkData;", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeExternalLinkData;Landroidx/compose/runtime/Composer;I)V", "ExternalLinkCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExternalLinkCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExternalLinkCard$lambda$0(HomeCards.HomeExternalLinkData homeExternalLinkData, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(homeExternalLinkData, "$homeExternalLinkData");
        ExternalLinkCard(homeExternalLinkData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExternalLinkCardPreview$lambda$1(int i, Composer composer, int i2) {
        ExternalLinkCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ExternalLinkCard(final HomeCards.HomeExternalLinkData homeExternalLinkData, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(homeExternalLinkData, "homeExternalLinkData");
        Composer startRestartGroup = composer.startRestartGroup(-1463768637);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        IntercomCardKt.IntercomCard(null, null, ComposableLambdaKt.rememberComposableLambda(1810723127, true, new ExternalLinkCardKt$ExternalLinkCard$1(homeExternalLinkData, (Context) consume), startRestartGroup, 54), startRestartGroup, 384, 3);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExternalLinkCard$lambda$0;
                    ExternalLinkCard$lambda$0 = ExternalLinkCardKt.ExternalLinkCard$lambda$0(HomeCards.HomeExternalLinkData.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExternalLinkCard$lambda$0;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void ExternalLinkCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-144974605);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ExternalLinkCardKt.INSTANCE.m11543getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.ExternalLinkCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExternalLinkCardPreview$lambda$1;
                    ExternalLinkCardPreview$lambda$1 = ExternalLinkCardKt.ExternalLinkCardPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExternalLinkCardPreview$lambda$1;
                }
            });
        }
    }
}
