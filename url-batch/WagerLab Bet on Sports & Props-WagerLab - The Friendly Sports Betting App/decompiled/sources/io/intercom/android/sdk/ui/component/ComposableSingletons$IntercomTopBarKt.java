package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: IntercomTopBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$IntercomTopBarKt {
    public static final ComposableSingletons$IntercomTopBarKt INSTANCE = new ComposableSingletons$IntercomTopBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f427lambda1 = ComposableLambdaKt.composableLambdaInstance(1581505149, false, ComposableSingletons$IntercomTopBarKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f428lambda2 = ComposableLambdaKt.composableLambdaInstance(697934641, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IntercomTopBarKt.m11988IntercomTopBarbogVsAg(null, "TopBar Title", null, null, 0L, 0L, null, null, composer, 48, 253);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f429lambda3 = ComposableLambdaKt.composableLambdaInstance(323337919, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ic_download, composer, 0), (String) null, SizeKt.m889size3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(24)), IntercomTheme.INSTANCE.getColors(composer, 6).m12171getOnHeader0d7_KjU(), composer, 440, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f430lambda4 = ComposableLambdaKt.composableLambdaInstance(-2021873251, false, ComposableSingletons$IntercomTopBarKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f431lambda5 = ComposableLambdaKt.composableLambdaInstance(-1858201762, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$IntercomTopBarKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IntercomTopBarKt.m11988IntercomTopBarbogVsAg(null, "TopBar Title", null, null, 0L, 0L, null, ComposableSingletons$IntercomTopBarKt.INSTANCE.m11954getLambda4$intercom_sdk_ui_release(), composer, 12582960, 125);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11951getLambda1$intercom_sdk_ui_release() {
        return f427lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11952getLambda2$intercom_sdk_ui_release() {
        return f428lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11953getLambda3$intercom_sdk_ui_release() {
        return f429lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_ui_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11954getLambda4$intercom_sdk_ui_release() {
        return f430lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11955getLambda5$intercom_sdk_ui_release() {
        return f431lambda5;
    }
}
