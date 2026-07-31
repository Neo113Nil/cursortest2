package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes3.dex */
public final class lf extends SuspendLambda implements Function2 {
    public Mutex b;
    public mf c;
    public Context d;
    public int e;
    public final /* synthetic */ mf f;
    public final /* synthetic */ Context g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(mf mfVar, Context context, Continuation continuation) {
        super(2, continuation);
        this.f = mfVar;
        this.g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new lf(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new lf(this.f, this.g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:7:0x0013, B:8:0x0061, B:10:0x0065, B:12:0x0079, B:14:0x0086, B:18:0x008f, B:22:0x0098, B:25:0x009f, B:26:0x00a4, B:35:0x0045, B:37:0x0049), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0079 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:7:0x0013, B:8:0x0061, B:10:0x0065, B:12:0x0079, B:14:0x0086, B:18:0x008f, B:22:0x0098, B:25:0x009f, B:26:0x00a4, B:35:0x0045, B:37:0x0049), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        mf mfVar;
        Context context;
        mf mfVar2;
        uf ufVar;
        jf jfVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.e;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                mfVar = this.f;
                Mutex mutex = mfVar.e;
                context = this.g;
                this.b = mutex;
                this.c = mfVar;
                this.d = context;
                this.e = 1;
                Object lock = mutex.lock(null, this);
                r1 = mutex;
                if (lock == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r1 != 1) {
                    if (r1 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mfVar2 = this.c;
                    Mutex mutex2 = this.b;
                    ResultKt.throwOnFailure(obj);
                    r1 = mutex2;
                    ufVar = (uf) obj;
                    if (ufVar == null) {
                        int i = mf.$r8$clinit;
                        mfVar2.getClass();
                        jfVar = new jf(ufVar.c, ufVar.b, ufVar.a);
                    } else {
                        jfVar = null;
                    }
                    if (jfVar != null) {
                        mfVar2.a.getClass();
                        String str = jfVar.a;
                        String str2 = jfVar.b;
                        String str3 = jfVar.c;
                        if (str3 != null && str3.length() != 0 && str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                            mfVar2.d = jfVar;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    r1.unlock(null);
                    return unit;
                }
                Context context2 = this.d;
                mf mfVar3 = this.c;
                Mutex mutex3 = this.b;
                ResultKt.throwOnFailure(obj);
                mfVar = mfVar3;
                context = context2;
                r1 = mutex3;
            }
            if (mfVar.d == null) {
                long j = mf.f;
                kf kfVar = new kf(mfVar, context, null);
                this.b = r1;
                this.c = mfVar;
                this.d = null;
                this.e = 2;
                Object withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(j, kfVar, this);
                if (withTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mfVar2 = mfVar;
                obj = withTimeoutOrNull;
                r1 = r1;
                ufVar = (uf) obj;
                if (ufVar == null) {
                }
                if (jfVar != null) {
                }
            }
            Unit unit2 = Unit.INSTANCE;
            r1.unlock(null);
            return unit2;
        } catch (Throwable th) {
            r1.unlock(null);
            throw th;
        }
    }
}
