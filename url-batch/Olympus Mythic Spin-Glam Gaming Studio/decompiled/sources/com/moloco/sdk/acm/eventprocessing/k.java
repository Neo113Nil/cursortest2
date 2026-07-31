package com.moloco.sdk.acm.eventprocessing;

import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes12.dex */
public final class k implements j {

    @NotNull
    public final com.moloco.sdk.acm.http.e a;

    @NotNull
    public final com.moloco.sdk.acm.db.d b;

    @NotNull
    public final f c;

    @NotNull
    public final Function1 d;

    @NotNull
    public final String e;

    @DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestAndPurgeDBImpl", f = "RequestAndPurgeDB.kt", l = {38, 48}, m = "invoke-IoAF18A")
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object a = k.this.a(this);
            return a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a : Result.m8022boximpl(a);
        }
    }

    public k(@NotNull com.moloco.sdk.acm.http.e metricsRequest, @NotNull com.moloco.sdk.acm.db.d metricsDAO, @NotNull f dataAgeChecker, @NotNull Function1 headers) {
        Intrinsics.checkNotNullParameter(metricsRequest, "metricsRequest");
        Intrinsics.checkNotNullParameter(metricsDAO, "metricsDAO");
        Intrinsics.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.a = metricsRequest;
        this.b = metricsDAO;
        this.c = dataAgeChecker;
        this.d = headers;
        this.e = "RequestAndPurgeDB";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.eventprocessing.j
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull Continuation continuation) {
        a aVar;
        Object coroutine_suspended;
        int i;
        k kVar;
        com.moloco.sdk.acm.http.d a2;
        Object a3;
        k kVar2;
        Throwable m8026exceptionOrNullimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.acm.db.d dVar = this.b;
                    aVar.a = this;
                    aVar.d = 1;
                    obj = dVar.a(aVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    kVar = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kVar2 = (k) aVar.a;
                        ResultKt.throwOnFailure(obj);
                        a3 = ((Result) obj).getValue();
                        if (Result.m8029isSuccessimpl(a3)) {
                            com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, kVar2.e, "Request Success", false, 4, null);
                        }
                        m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a3);
                        if (m8026exceptionOrNullimpl != null) {
                            com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.a, kVar2.e, "Request failure: " + m8026exceptionOrNullimpl.getMessage(), null, false, 12, null);
                        }
                        return a3;
                    }
                    kVar = (k) aVar.a;
                    ResultKt.throwOnFailure(obj);
                }
                List<com.moloco.sdk.acm.db.b> list = (List) obj;
                com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, kVar.e, list.size() + " events processed.", false, 4, null);
                a2 = new b(kVar.c).a(list);
                if (!a2.a().isEmpty() && a2.b().isEmpty()) {
                    return Result.m8023constructorimpl("No metrics to process");
                }
                com.moloco.sdk.acm.http.e eVar = kVar.a;
                Function1 function1 = kVar.d;
                aVar.a = kVar;
                aVar.d = 2;
                a3 = eVar.a(a2, function1, aVar);
                if (a3 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                kVar2 = kVar;
                if (Result.m8029isSuccessimpl(a3)) {
                }
                m8026exceptionOrNullimpl = Result.m8026exceptionOrNullimpl(a3);
                if (m8026exceptionOrNullimpl != null) {
                }
                return a3;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.d;
        if (i != 0) {
        }
        List<com.moloco.sdk.acm.db.b> list2 = (List) obj2;
        com.moloco.sdk.acm.services.e.b(com.moloco.sdk.acm.services.e.a, kVar.e, list2.size() + " events processed.", false, 4, null);
        a2 = new b(kVar.c).a(list2);
        if (!a2.a().isEmpty()) {
        }
        com.moloco.sdk.acm.http.e eVar2 = kVar.a;
        Function1 function12 = kVar.d;
        aVar.a = kVar;
        aVar.d = 2;
        a3 = eVar2.a(a2, function12, aVar);
        if (a3 != coroutine_suspended) {
        }
    }
}
