package yads;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes4.dex */
public final class cf1 extends SuspendLambda implements Function2 {
    public Mutex b;
    public Object c;
    public String d;
    public int e;
    public final /* synthetic */ ef1 f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf1(ef1 ef1Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f = ef1Var;
        this.g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new cf1(this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new cf1(this.f, this.g, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(1:(1:(6:5|6|7|8|9|10)(2:20|21))(1:22))(2:31|(1:33)(1:34))|23|24|(1:26)(4:27|8|9|10)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r9 = th;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ef1 ef1Var;
        Mutex mutex;
        String str;
        Mutex mutex2;
        String str2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ef1 ef1Var2 = this.f;
            Mutex mutex3 = ef1Var2.d;
            String str3 = this.g;
            this.b = mutex3;
            this.c = ef1Var2;
            this.d = str3;
            this.e = 1;
            if (mutex3.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            ef1Var = ef1Var2;
            mutex = mutex3;
            str = str3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.c;
                mutex2 = this.b;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        File file = (File) obj;
                        File file2 = new File(file, "light_bundle_script.js");
                        File file3 = new File(file, "light_bundle_script.js.tmp");
                        FilesKt.writeText$default(file3, str2, null, 2, null);
                        obj2 = Boxing.boxBoolean(file3.renameTo(file2));
                    } catch (Exception unused) {
                        obj2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        return obj2;
                    }
                    mutex2.unlock(null);
                    return obj2;
                } catch (Throwable th) {
                    th = th;
                    mutex = mutex2;
                    mutex.unlock(null);
                    throw th;
                }
            }
            str = this.d;
            ef1Var = (ef1) this.c;
            mutex = this.b;
            ResultKt.throwOnFailure(obj);
        }
        this.b = mutex;
        this.c = str;
        this.d = null;
        this.e = 2;
        ef1Var.getClass();
        obj = BuildersKt.withContext(Dispatchers.getIO(), new ye1(ef1Var, null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        str2 = str;
        mutex2 = mutex;
        File file4 = (File) obj;
        File file22 = new File(file4, "light_bundle_script.js");
        File file32 = new File(file4, "light_bundle_script.js.tmp");
        FilesKt.writeText$default(file32, str2, null, 2, null);
        obj2 = Boxing.boxBoolean(file32.renameTo(file22));
        mutex2.unlock(null);
        return obj2;
    }
}
