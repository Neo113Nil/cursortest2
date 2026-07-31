package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes12.dex */
public final class J9 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ SdkInitializationListener d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J9(Context context, String str, SdkInitializationListener sdkInitializationListener, long j, Continuation continuation) {
        super(1, continuation);
        this.b = context;
        this.c = str;
        this.d = sdkInitializationListener;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new J9(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((J9) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runBlocking$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C4479xl.a(this.b);
                Context context = AbstractC4002fj.a;
                if (context != null) {
                    File file = new File(context.getFilesDir(), "im_cached_content");
                    if (file.mkdir() || file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                    } else {
                        Intrinsics.checkNotNullExpressionValue("fj", "TAG");
                    }
                }
                BuildersKt__BuildersKt.runBlocking$default(null, new C4452wl(null), 1, null);
                String primaryAccountId = this.c;
                Intrinsics.checkNotNullParameter(primaryAccountId, "primaryAccountId");
                Context context2 = AbstractC4002fj.a;
                if (context2 != null) {
                    ConcurrentHashMap concurrentHashMap = Qa.b;
                    Pa.a(context2, "coppa_store").a("im_accid", primaryAccountId, false);
                }
                Context context3 = this.b;
                this.a = 1;
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C4426vl(context3, null), 1, null);
                if (runBlocking$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AbstractC4002fj.i = 2;
            InMobiSdk inMobiSdk = InMobiSdk.INSTANCE;
            InMobiSdk.access$provideCallback(inMobiSdk, this.d, null);
            C4000fh.a.getClass();
            BuildersKt__Builders_commonKt.launch$default(L9.e, null, null, new C3894bh(null), 3, null);
            Map access$prepareTelemetryPayload = InMobiSdk.access$prepareTelemetryPayload(inMobiSdk, this.e);
            C4425vk c4425vk = C4425vk.a;
            C4425vk.b("SdkInitialized", access$prepareTelemetryPayload, EnumC4530zk.a);
            InMobiUnifiedIdService.push(C4070i7.b);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(InMobiSdk.access$getTAG$p(), "access$getTAG$p(...)");
            e.getMessage();
            AbstractC4002fj.c = null;
            AbstractC4002fj.a = null;
            AbstractC4002fj.i = 3;
            InMobiSdk.access$provideCallback(InMobiSdk.INSTANCE, this.d, "SDK could not be initialized; an unexpected error was encountered.");
        }
        return Unit.INSTANCE;
    }
}
