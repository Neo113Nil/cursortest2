package io.intercom.android.sdk.views.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.imageutils.JfifUtil;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.models.Attribute;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: ListAttributeCollector.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$ListAttributeCollectorKt {
    public static final ComposableSingletons$ListAttributeCollectorKt INSTANCE = new ComposableSingletons$ListAttributeCollectorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f463lambda1 = ComposableLambdaKt.composableLambdaInstance(-1800430666, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                TextKt.m3581TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_choose_one, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f464lambda2 = ComposableLambdaKt.composableLambdaInstance(1608358582, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ListAttributeCollectorKt.ListAttributeCollector(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), new AttributeData(new Attribute("", "Name", TypedValues.Custom.S_STRING, false, null, CollectionsKt.listOf((Object[]) new String[]{"Android", "iOS"}), null, null, JfifUtil.MARKER_RST0, null), "123", false), false, false, null, composer, 70, 28);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f465lambda3 = ComposableLambdaKt.composableLambdaInstance(-1956971023, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12271getLambda2$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f466lambda4 = ComposableLambdaKt.composableLambdaInstance(-64058751, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ListAttributeCollectorKt.ListAttributeCollector(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), new AttributeData(new Attribute("", "Name", TypedValues.Custom.S_STRING, true, null, CollectionsKt.listOf((Object[]) new String[]{"Android", "iOS"}), null, "Android", 80, null), "123", false), false, false, null, composer, 70, 28);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f467lambda5 = ComposableLambdaKt.composableLambdaInstance(553490854, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12273getLambda4$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f468lambda6 = ComposableLambdaKt.composableLambdaInstance(753605018, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ListAttributeCollectorKt.ListAttributeCollector(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), new AttributeData(new Attribute("", "Name", TypedValues.Custom.S_STRING, false, null, CollectionsKt.listOf((Object[]) new String[]{"Android", "iOS"}), null, null, JfifUtil.MARKER_RST0, null), "123", true), false, false, null, composer, 70, 28);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f469lambda7 = ComposableLambdaKt.composableLambdaInstance(773525973, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12275getLambda6$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f470lambda8 = ComposableLambdaKt.composableLambdaInstance(-1068973666, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ListAttributeCollectorKt.ListAttributeCollector(PaddingKt.m837padding3ABfNKs(Modifier.INSTANCE, Dp.m8401constructorimpl(8)), new AttributeData(new Attribute("", "Name", TypedValues.Custom.S_STRING, true, null, CollectionsKt.listOf((Object[]) new String[]{"Android", "iOS"}), null, "Android", 80, null), "123", true), false, false, null, composer, 70, 28);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f471lambda9 = ComposableLambdaKt.composableLambdaInstance(1500985689, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.views.compose.ComposableSingletons$ListAttributeCollectorKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ListAttributeCollectorKt.INSTANCE.m12277getLambda8$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12270getLambda1$intercom_sdk_base_release() {
        return f463lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12271getLambda2$intercom_sdk_base_release() {
        return f464lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12272getLambda3$intercom_sdk_base_release() {
        return f465lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12273getLambda4$intercom_sdk_base_release() {
        return f466lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12274getLambda5$intercom_sdk_base_release() {
        return f467lambda5;
    }

    /* renamed from: getLambda-6$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12275getLambda6$intercom_sdk_base_release() {
        return f468lambda6;
    }

    /* renamed from: getLambda-7$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12276getLambda7$intercom_sdk_base_release() {
        return f469lambda7;
    }

    /* renamed from: getLambda-8$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12277getLambda8$intercom_sdk_base_release() {
        return f470lambda8;
    }

    /* renamed from: getLambda-9$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12278getLambda9$intercom_sdk_base_release() {
        return f471lambda9;
    }
}
