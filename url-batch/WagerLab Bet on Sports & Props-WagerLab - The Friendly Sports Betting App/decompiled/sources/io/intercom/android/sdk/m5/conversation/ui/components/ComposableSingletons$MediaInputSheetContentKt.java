package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.StringResources_androidKt;
import io.intercom.android.sdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MediaInputSheetContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$MediaInputSheetContentKt {
    public static final ComposableSingletons$MediaInputSheetContentKt INSTANCE = new ComposableSingletons$MediaInputSheetContentKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f189lambda1 = ComposableLambdaKt.composableLambdaInstance(606662528, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                MediaInputSheetContentKt.MediaInputSheetContentItem(StringResources_androidKt.stringResource(R.string.intercom_take_a_photo, composer, 0), R.drawable.intercom_ic_camera, composer, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f190lambda2 = ComposableLambdaKt.composableLambdaInstance(8250231, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                MediaInputSheetContentKt.MediaInputSheetContentItem(StringResources_androidKt.stringResource(R.string.intercom_record_a_video, composer, 0), R.drawable.intercom_ic_record, composer, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f191lambda3 = ComposableLambdaKt.composableLambdaInstance(885777890, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                MediaInputSheetContentKt.MediaInputSheetContentItem(StringResources_androidKt.stringResource(R.string.intercom_gallery, composer, 0), R.drawable.intercom_ic_gallery, composer, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f192lambda4 = ComposableLambdaKt.composableLambdaInstance(2111443683, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$MediaInputSheetContentKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                MediaInputSheetContentKt.MediaInputSheetContentItem(StringResources_androidKt.stringResource(R.string.intercom_select_files, composer, 0), R.drawable.intercom_ic_attachment, composer, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11253getLambda1$intercom_sdk_base_release() {
        return f189lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11254getLambda2$intercom_sdk_base_release() {
        return f190lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11255getLambda3$intercom_sdk_base_release() {
        return f191lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11256getLambda4$intercom_sdk_base_release() {
        return f192lambda4;
    }
}
