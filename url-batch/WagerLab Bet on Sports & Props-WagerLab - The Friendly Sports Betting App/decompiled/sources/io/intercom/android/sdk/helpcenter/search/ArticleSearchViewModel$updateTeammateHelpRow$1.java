package io.intercom.android.sdk.helpcenter.search;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ArticleSearchViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel", f = "ArticleSearchViewModel.kt", i = {}, l = {152}, m = "updateTeammateHelpRow", n = {}, s = {})
/* loaded from: classes8.dex */
final class ArticleSearchViewModel$updateTeammateHelpRow$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleSearchViewModel$updateTeammateHelpRow$1(ArticleSearchViewModel articleSearchViewModel, Continuation<? super ArticleSearchViewModel$updateTeammateHelpRow$1> continuation) {
        super(continuation);
        this.this$0 = articleSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateTeammateHelpRow(this);
    }
}
