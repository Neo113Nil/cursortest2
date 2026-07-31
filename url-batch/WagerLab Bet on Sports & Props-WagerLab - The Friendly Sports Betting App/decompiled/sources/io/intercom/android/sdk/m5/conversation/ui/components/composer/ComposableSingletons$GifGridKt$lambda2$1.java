package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GifGrid.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$GifGridKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$GifGridKt$lambda2$1 INSTANCE = new ComposableSingletons$GifGridKt$lambda2$1();

    ComposableSingletons$GifGridKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            GifGridKt.GifGrid(null, CollectionsKt.emptyList(), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$GifGridKt$lambda2$1.invoke$lambda$0((Block) obj);
                    return invoke$lambda$0;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$GifGridKt$lambda-2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = ComposableSingletons$GifGridKt$lambda2$1.invoke$lambda$1((String) obj);
                    return invoke$lambda$1;
                }
            }, composer, 3504, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(Block it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
