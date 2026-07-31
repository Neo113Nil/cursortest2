package com.inmobi.media;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes13.dex */
public final class Wh extends SuspendLambda implements Function2 {
    public Object a;
    public Kb b;
    public int c;
    public final /* synthetic */ Xh d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(Xh xh, long j, boolean z, Continuation continuation) {
        super(2, continuation);
        this.d = xh;
        this.e = j;
        this.f = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Wh(this.d, this.e, this.f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Wh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
    
        if (r2.b(r7, r19) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Kb kb;
        Object b;
        Db db;
        Kb dao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Xh xh = this.d;
            long j = this.e;
            boolean z = this.f;
            String str = xh.j;
            Db db2 = new Db(str, j, 0, 0L, z, xh.k.get(), 12);
            kb = (Kb) Lb.a.getValue();
            this.a = db2;
            this.b = kb;
            this.c = 1;
            b = kb.b(str, this);
            if (b != coroutine_suspended) {
                db = db2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Kb kb2 = (Kb) this.a;
            ResultKt.throwOnFailure(obj);
            dao = kb2;
            CoroutineScope coroutineScope = AbstractC3995fc.a;
            long j2 = this.e;
            Xh xh2 = this.d;
            long j3 = j2 - xh2.b;
            int i2 = xh2.c;
            Intrinsics.checkNotNullParameter(dao, "dao");
            if (!AbstractC3995fc.c.getAndSet(true)) {
                C3941dc runnable = new C3941dc(dao, j3, i2, null);
                CoroutineScope coroutineScope2 = Hl.a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                BuildersKt__Builders_commonKt.launch$default(Hl.a, null, null, new El(10000L, null, runnable), 3, null);
            }
            return Unit.INSTANCE;
        }
        kb = this.b;
        db = (Db) this.a;
        ResultKt.throwOnFailure(obj);
        b = obj;
        if (((Boolean) b).booleanValue()) {
            this.a = null;
            this.b = null;
            this.c = 2;
        } else {
            this.a = kb;
            this.b = null;
            this.c = 3;
            if (kb.a(db, this) != coroutine_suspended) {
                dao = kb;
                CoroutineScope coroutineScope3 = AbstractC3995fc.a;
                long j22 = this.e;
                Xh xh22 = this.d;
                long j32 = j22 - xh22.b;
                int i22 = xh22.c;
                Intrinsics.checkNotNullParameter(dao, "dao");
                if (!AbstractC3995fc.c.getAndSet(true)) {
                }
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }
}
