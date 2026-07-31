package io.intercom.android.sdk.ui.component;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: JumpToBottom.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.ui.component.ComposableSingletons$JumpToBottomKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$JumpToBottomKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$JumpToBottomKt$lambda1$1 INSTANCE = new ComposableSingletons$JumpToBottomKt$lambda1$1();

    ComposableSingletons$JumpToBottomKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            JumpToBottomKt.m11991JumpToBottomkNRdK3w(null, 0L, 0L, null, 0L, 0L, new Function0() { // from class: io.intercom.android.sdk.ui.component.ComposableSingletons$JumpToBottomKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 1572864, 63);
        }
    }
}
