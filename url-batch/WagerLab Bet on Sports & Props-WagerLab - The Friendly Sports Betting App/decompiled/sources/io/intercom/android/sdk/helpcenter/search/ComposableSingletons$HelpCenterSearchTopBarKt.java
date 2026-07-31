package io.intercom.android.sdk.helpcenter.search;

import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HelpCenterSearchTopBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$HelpCenterSearchTopBarKt {
    public static final ComposableSingletons$HelpCenterSearchTopBarKt INSTANCE = new ComposableSingletons$HelpCenterSearchTopBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f99lambda1 = ComposableLambdaKt.composableLambdaInstance(-456122237, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_search_for_help, composer, 0), null, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12159getDescriptionText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer, IntercomTheme.$stable).getType04(), composer, 0, 0, 131066);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f100lambda2 = ComposableLambdaKt.composableLambdaInstance(202432040, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, composer, 0), StringResources_androidKt.stringResource(R.string.intercom_clear, composer, 0), (Modifier) null, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12173getPrimaryIcon0d7_KjU(), composer, 8, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f101lambda3 = ComposableLambdaKt.composableLambdaInstance(-420729176, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.helpcenter.search.ComposableSingletons$HelpCenterSearchTopBarKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(io.intercom.android.sdk.ui.R.drawable.intercom_ic_back, composer, 0), StringResources_androidKt.stringResource(R.string.intercom_navigation_back, composer, 0), (Modifier) null, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12173getPrimaryIcon0d7_KjU(), composer, 8, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11072getLambda1$intercom_sdk_base_release() {
        return f99lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11073getLambda2$intercom_sdk_base_release() {
        return f100lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11074getLambda3$intercom_sdk_base_release() {
        return f101lambda3;
    }
}
