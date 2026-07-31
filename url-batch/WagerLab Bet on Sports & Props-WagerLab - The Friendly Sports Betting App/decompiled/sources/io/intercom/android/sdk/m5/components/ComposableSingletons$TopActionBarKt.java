package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: TopActionBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$TopActionBarKt {
    public static final ComposableSingletons$TopActionBarKt INSTANCE = new ComposableSingletons$TopActionBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f159lambda1 = ComposableLambdaKt.composableLambdaInstance(-1862715359, false, ComposableSingletons$TopActionBarKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f160lambda2 = ComposableLambdaKt.composableLambdaInstance(1602443263, false, ComposableSingletons$TopActionBarKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f161lambda3 = ComposableLambdaKt.composableLambdaInstance(-266401790, false, ComposableSingletons$TopActionBarKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f162lambda4 = ComposableLambdaKt.composableLambdaInstance(646731538, false, ComposableSingletons$TopActionBarKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f163lambda5 = ComposableLambdaKt.composableLambdaInstance(-1856141887, false, ComposableSingletons$TopActionBarKt$lambda5$1.INSTANCE);

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f164lambda6 = ComposableLambdaKt.composableLambdaInstance(-2124385696, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TopActionBarKt.m11189TopActionBarNpQZenA(null, "Hannah", null, null, null, null, null, false, 0L, 0L, 0L, null, null, composer, 48, 0, 8189);
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f165lambda7 = ComposableLambdaKt.composableLambdaInstance(303681578, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2874Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_gif_search_icon, composer, 0), (String) null, (Modifier) null, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12171getOnHeader0d7_KjU(), composer, 56, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f166lambda8 = ComposableLambdaKt.composableLambdaInstance(1961378572, false, ComposableSingletons$TopActionBarKt$lambda8$1.INSTANCE);

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f167lambda9 = ComposableLambdaKt.composableLambdaInstance(1748428390, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$TopActionBarKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TopActionBarKt.m11189TopActionBarNpQZenA(null, "Hannah", null, null, null, null, null, false, 0L, 0L, 0L, null, ComposableSingletons$TopActionBarKt.INSTANCE.m11157getLambda8$intercom_sdk_base_release(), composer, 48, 384, 4093);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11150getLambda1$intercom_sdk_base_release() {
        return f159lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11151getLambda2$intercom_sdk_base_release() {
        return f160lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11152getLambda3$intercom_sdk_base_release() {
        return f161lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11153getLambda4$intercom_sdk_base_release() {
        return f162lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11154getLambda5$intercom_sdk_base_release() {
        return f163lambda5;
    }

    /* renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11155getLambda6$intercom_sdk_base_release() {
        return f164lambda6;
    }

    /* renamed from: getLambda-7$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11156getLambda7$intercom_sdk_base_release() {
        return f165lambda7;
    }

    /* renamed from: getLambda-8$intercom_sdk_base_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11157getLambda8$intercom_sdk_base_release() {
        return f166lambda8;
    }

    /* renamed from: getLambda-9$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11158getLambda9$intercom_sdk_base_release() {
        return f167lambda9;
    }
}
