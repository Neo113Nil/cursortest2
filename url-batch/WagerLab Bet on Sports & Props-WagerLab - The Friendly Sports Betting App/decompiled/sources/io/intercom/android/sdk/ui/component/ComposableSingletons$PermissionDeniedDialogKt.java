package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PermissionDeniedDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$PermissionDeniedDialogKt {
    public static final ComposableSingletons$PermissionDeniedDialogKt INSTANCE = new ComposableSingletons$PermissionDeniedDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f436lambda1 = ComposableLambdaKt.composableLambdaInstance(-593234401, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$PermissionDeniedDialogKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                PermissionDeniedDialogKt.PermissionDeniedDialog(null, "Audio permission is required to use voice input. Please enable it in the app settings.", "Settings", "Not now", Integer.valueOf(R.drawable.intercom_ic_microphone), null, null, composer, 3504, 97);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11961getLambda1$intercom_sdk_ui_release() {
        return f436lambda1;
    }
}
