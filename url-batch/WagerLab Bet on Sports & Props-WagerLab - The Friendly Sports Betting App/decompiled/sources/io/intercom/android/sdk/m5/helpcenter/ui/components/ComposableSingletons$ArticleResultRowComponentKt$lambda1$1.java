package io.intercom.android.sdk.m5.helpcenter.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.helpcenter.search.ArticleSearchResultRow;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleResultRowComponent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleResultRowComponentKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes8.dex */
final class ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ArticleResultRowComponentKt$lambda1$1 INSTANCE = new ComposableSingletons$ArticleResultRowComponentKt$lambda1$1();

    ComposableSingletons$ArticleResultRowComponentKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ArticleResultRowComponentKt.ArticleResultRowComponent(new ArticleSearchResultRow.ArticleResultRow("", "<highlight>Lorem Ipsum</highlight> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.", "There are many variations of passages of <highlight>Lorem Ipsum</highlight> available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.", 0), new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.ComposableSingletons$ArticleResultRowComponentKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$ArticleResultRowComponentKt$lambda1$1.invoke$lambda$0((String) obj);
                    return invoke$lambda$0;
                }
            }, BackgroundKt.m262backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m12152getBackground0d7_KjU(), null, 2, null), composer, 48, 0);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
