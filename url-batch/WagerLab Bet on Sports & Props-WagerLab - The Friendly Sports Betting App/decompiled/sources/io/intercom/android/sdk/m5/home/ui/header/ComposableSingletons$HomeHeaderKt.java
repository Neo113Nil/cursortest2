package io.intercom.android.sdk.m5.home.ui.header;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeHeader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$HomeHeaderKt {
    public static final ComposableSingletons$HomeHeaderKt INSTANCE = new ComposableSingletons$HomeHeaderKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f314lambda1 = ComposableLambdaKt.composableLambdaInstance(1111020598, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "RS");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                HomeHeaderKt.HomeContentHeader(null, new HomeUiState.Content.ContentHeader(true, "", null, new HomeUiState.Content.ContentHeader.ColoredText("I am greeting.", 0.5f, null, null, "#FFFFFF", "#000000", 12, null), new HomeUiState.Content.ContentHeader.ColoredText("I am intro.", 1.0f, null, null, "#FFFFFF", "#000000", 12, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), false, null), null, true, CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)}), new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 64, null), composer, 64, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f315lambda2 = ComposableLambdaKt.composableLambdaInstance(-2058941199, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, Color.INSTANCE.m5688getGreen0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m11572getLambda1$intercom_sdk_base_release(), composer, 12583296, 123);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f316lambda3 = ComposableLambdaKt.composableLambdaInstance(555108293, false, ComposableSingletons$HomeHeaderKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f317lambda4 = ComposableLambdaKt.composableLambdaInstance(37843776, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.header.ComposableSingletons$HomeHeaderKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3409SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$HomeHeaderKt.INSTANCE.m11574getLambda3$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11572getLambda1$intercom_sdk_base_release() {
        return f314lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11573getLambda2$intercom_sdk_base_release() {
        return f315lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11574getLambda3$intercom_sdk_base_release() {
        return f316lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11575getLambda4$intercom_sdk_base_release() {
        return f317lambda4;
    }
}
