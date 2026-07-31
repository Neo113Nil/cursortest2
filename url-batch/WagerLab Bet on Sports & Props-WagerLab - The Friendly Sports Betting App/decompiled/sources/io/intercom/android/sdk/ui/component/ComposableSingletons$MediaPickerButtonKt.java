package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MediaPickerButton.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposableSingletons$MediaPickerButtonKt {
    public static final ComposableSingletons$MediaPickerButtonKt INSTANCE = new ComposableSingletons$MediaPickerButtonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f433lambda1 = ComposableLambdaKt.composableLambdaInstance(1720634073, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$MediaPickerButtonKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TextKt.m3581TextNvy7gAk("Open Picker", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 6, 0, 262142);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f434lambda2 = ComposableLambdaKt.composableLambdaInstance(-55957783, false, ComposableSingletons$MediaPickerButtonKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f435lambda3 = ComposableLambdaKt.composableLambdaInstance(1358094075, false, ComposableSingletons$MediaPickerButtonKt$lambda3$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_ui_release, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m11957getLambda1$intercom_sdk_ui_release() {
        return f433lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11958getLambda2$intercom_sdk_ui_release() {
        return f434lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_ui_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11959getLambda3$intercom_sdk_ui_release() {
        return f435lambda3;
    }
}
