package com.revenuecat.purchases.storage;

import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.utils.UrlConnection;
import com.revenuecat.purchases.utils.UrlConnectionFactory;
import java.io.IOException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultFileRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/utils/UrlConnection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.revenuecat.purchases.storage.DefaultFileRepository$downloadFile$2", f = "DefaultFileRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class DefaultFileRepository$downloadFile$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UrlConnection>, Object> {
    final /* synthetic */ URL $url;
    int label;
    final /* synthetic */ DefaultFileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFileRepository$downloadFile$2(DefaultFileRepository defaultFileRepository, URL url, Continuation<? super DefaultFileRepository$downloadFile$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultFileRepository;
        this.$url = url;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultFileRepository$downloadFile$2(this.this$0, this.$url, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UrlConnection> continuation) {
        return ((DefaultFileRepository$downloadFile$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UrlConnectionFactory urlConnectionFactory;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        URL url = this.$url;
        LogLevel logLevel = LogLevel.VERBOSE;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.v("[Purchases] - " + logLevel.name(), "Downloading remote file from " + url);
        }
        urlConnectionFactory = this.this$0.urlConnectionFactory;
        String url2 = this.$url.toString();
        Intrinsics.checkNotNullExpressionValue(url2, "url.toString()");
        UrlConnection createConnection$default = UrlConnectionFactory.createConnection$default(urlConnectionFactory, url2, null, 2, null);
        if (createConnection$default.getResponseCode() == 200) {
            return createConnection$default;
        }
        createConnection$default.disconnect();
        throw new IOException("HTTP " + createConnection$default.getResponseCode() + " when downloading file at: " + this.$url);
    }
}
