package io.intercom.android.sdk.helpcenter.search;

import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imageutils.JfifUtil;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¨\u0006\u0006"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ArticleSearchViewModel.kt", i = {0}, l = {JfifUtil.MARKER_SOI, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", n = {"it"}, s = {"L$1"})
/* loaded from: classes8.dex */
public final class ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>>, String, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(Continuation continuation, ArticleSearchViewModel articleSearchViewModel) {
        super(3, continuation);
        this.this$0 = articleSearchViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(FlowCollector<? super Pair<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>> flowCollector, String str, Continuation<? super Unit> continuation) {
        ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(continuation, this.this$0);
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = flowCollector;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.emitAll(r3, kotlinx.coroutines.flow.FlowKt.flowOf(new kotlin.Pair(r14, r1)), r10) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        HelpCenterApi helpCenterApi;
        boolean z;
        ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1;
        FlowCollector flowCollector;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            String str2 = (String) this.L$1;
            helpCenterApi = this.this$0.helpCenterApi;
            z = this.this$0.isFromSearchBrowse;
            String str3 = z ? "search_browse" : null;
            this.L$0 = flowCollector2;
            this.L$1 = str2;
            this.label = 1;
            articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = this;
            Object searchForArticles$default = HelpCenterApi.DefaultImpls.searchForArticles$default(helpCenterApi, str2, str3, null, articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1, 4, null);
            if (searchForArticles$default != coroutine_suspended) {
                flowCollector = flowCollector2;
                obj = searchForArticles$default;
                str = str2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str = (String) this.L$1;
        flowCollector = (FlowCollector) this.L$0;
        ResultKt.throwOnFailure(obj);
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = this;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = null;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = null;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.label = 2;
    }
}
