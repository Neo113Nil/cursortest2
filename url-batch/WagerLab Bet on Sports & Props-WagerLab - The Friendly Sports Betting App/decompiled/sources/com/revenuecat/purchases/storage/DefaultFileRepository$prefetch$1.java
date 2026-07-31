package com.revenuecat.purchases.storage;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.models.Checksum;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultFileRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.storage.DefaultFileRepository$prefetch$1", f = "DefaultFileRepository.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"url"}, s = {"L$2"})
/* loaded from: classes7.dex */
final class DefaultFileRepository$prefetch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Pair<URL, Checksum>> $urls;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DefaultFileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFileRepository$prefetch$1(List<Pair<URL, Checksum>> list, DefaultFileRepository defaultFileRepository, Continuation<? super DefaultFileRepository$prefetch$1> continuation) {
        super(2, continuation);
        this.$urls = list;
        this.this$0 = defaultFileRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultFileRepository$prefetch$1(this.$urls, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultFileRepository$prefetch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005b -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        DefaultFileRepository defaultFileRepository;
        URL url;
        LogHandler logHandler;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List<Pair<URL, Checksum>> list = this.$urls;
            DefaultFileRepository defaultFileRepository2 = this.this$0;
            it = list.iterator();
            defaultFileRepository = defaultFileRepository2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (URL) this.L$2;
            it = (Iterator) this.L$1;
            defaultFileRepository = (DefaultFileRepository) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (IOException e) {
                logHandler = defaultFileRepository.logHandler;
                logHandler.e("FileRepository", "Prefetch failed for " + url + ": " + e, e);
            }
        }
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            url = (URL) pair.component1();
            Checksum checksum = (Checksum) pair.component2();
            this.L$0 = defaultFileRepository;
            this.L$1 = it;
            this.L$2 = url;
            this.label = 1;
            if (defaultFileRepository.generateOrGetCachedFileURL(url, checksum, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
