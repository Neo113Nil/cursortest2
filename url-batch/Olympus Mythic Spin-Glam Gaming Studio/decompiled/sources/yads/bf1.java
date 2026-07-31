package yads;

import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes13.dex */
public final class bf1 extends SuspendLambda implements Function2 {
    public int b;
    public final /* synthetic */ ef1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf1(ef1 ef1Var, Continuation continuation) {
        super(2, continuation);
        this.c = ef1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new bf1(this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new bf1(this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ef1 ef1Var = this.c;
                this.b = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new ye1(ef1Var, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            File file = new File((File) obj, "light_bundle_script.js");
            if (file.exists()) {
                return FilesKt.readText$default(file, null, 1, null);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
