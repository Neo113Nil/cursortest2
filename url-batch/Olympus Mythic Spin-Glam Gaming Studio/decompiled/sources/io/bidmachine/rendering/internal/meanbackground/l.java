package io.bidmachine.rendering.internal.meanbackground;

import io.bidmachine.util.log.LoggerInstance;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class l {
    private static final a b = new a(null);
    private final LoggerInstance a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends ContinuationImpl {
        Object a;
        Object b;
        long c;
        /* synthetic */ Object d;
        int f;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    static final class c extends Lambda implements Function0 {
        final /* synthetic */ String a;
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, long j) {
            super(0);
            this.a = str;
            this.b = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return this.a + " took " + (System.currentTimeMillis() - this.b) + " ms";
        }
    }

    public l(LoggerInstance logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Function1 function1, Continuation continuation) {
        b bVar;
        int i;
        long currentTimeMillis;
        l lVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f = i2 - Integer.MIN_VALUE;
                Object obj = bVar.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    currentTimeMillis = System.currentTimeMillis();
                    bVar.a = this;
                    bVar.b = str;
                    bVar.c = currentTimeMillis;
                    bVar.f = 1;
                    obj = function1.invoke(bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j = bVar.c;
                    String str2 = (String) bVar.b;
                    lVar = (l) bVar.a;
                    ResultKt.throwOnFailure(obj);
                    currentTimeMillis = j;
                    str = str2;
                }
                lVar.a.d("MeanPerformanceMeasurer", new c(str, currentTimeMillis));
                return obj;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.f;
        if (i != 0) {
        }
        lVar.a.d("MeanPerformanceMeasurer", new c(str, currentTimeMillis));
        return obj2;
    }
}
