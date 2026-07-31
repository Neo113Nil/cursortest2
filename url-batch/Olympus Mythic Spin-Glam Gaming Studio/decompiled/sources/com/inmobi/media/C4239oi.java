package com.inmobi.media;

import com.ogury.ad.OguryShowErrorCode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* renamed from: com.inmobi.media.oi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4239oi extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ GestureDetectorOnGestureListenerC4476xi d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4239oi(String str, GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi, long j, Continuation continuation) {
        super(2, continuation);
        this.c = str;
        this.d = gestureDetectorOnGestureListenerC4476xi;
        this.e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4239oi c4239oi = new C4239oi(this.c, this.d, this.e, continuation);
        c4239oi.b = obj;
        return c4239oi;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4239oi) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r14, r1, r13) == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m8023constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m8023constructorimpl = Result.m8023constructorimpl(ResultKt.createFailure(th));
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.c;
            Result.Companion companion2 = Result.INSTANCE;
            F9 f9 = (F9) Ve.c.getValue();
            Xe xe = new Xe(str, null, null, null, null, false, 62);
            this.a = 1;
            obj = f9.a.a(xe, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        InterfaceC3892bf interfaceC3892bf = (InterfaceC3892bf) obj;
        m8023constructorimpl = Result.m8023constructorimpl(interfaceC3892bf.c() == 200 ? TuplesKt.to(interfaceC3892bf.d().string(Charsets.UTF_8), Boxing.boxInt(200)) : TuplesKt.to(null, Boxing.boxInt(interfaceC3892bf.c())));
        GestureDetectorOnGestureListenerC4476xi gestureDetectorOnGestureListenerC4476xi = this.d;
        String str2 = this.c;
        long j = this.e;
        Throwable m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(m8023constructorimpl);
        if (m8026exceptionOrNullimpl != null) {
            InterfaceC4466x9 interfaceC4466x9 = gestureDetectorOnGestureListenerC4476xi.i;
            if (interfaceC4466x9 != null) {
                String str3 = GestureDetectorOnGestureListenerC4476xi.i1;
                Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                ((C4493y9) interfaceC4466x9).b(str3, "Error prefetching HTML content from URL: " + str2 + " " + m8026exceptionOrNullimpl.getMessage());
            }
            Hi renderViewTelemetry = gestureDetectorOnGestureListenerC4476xi.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(j, Boxing.boxShort((short) 3101));
            }
            m8023constructorimpl = TuplesKt.to(null, Boxing.boxInt(OguryShowErrorCode.AD_DISABLED_COUNTRY_NOT_OPENED));
        }
        Pair pair = (Pair) m8023constructorimpl;
        String str4 = (String) pair.component1();
        int intValue = ((Number) pair.component2()).intValue();
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C4212ni c4212ni = new C4212ni(this.d, str4, this.e, intValue, null);
        this.a = 2;
    }
}
