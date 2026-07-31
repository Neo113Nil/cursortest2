package yads;

import android.content.Context;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes13.dex */
public final class xe1 {
    public final Context a;
    public final vw2 b;
    public final ef1 c;
    public final me1 d;
    public final ve1 e;

    public xe1(Context context) {
        vw2 vw2Var;
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        ef1 ef1Var = new ef1(context);
        me1 a = le1.a();
        ve1 ve1Var = new ve1(context, null, 126);
        this.a = context;
        this.b = vw2Var2;
        this.c = ef1Var;
        this.d = a;
        this.e = ve1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa A[PHI: r10
      0x00fa: PHI (r10v38 java.lang.Object) = (r10v33 java.lang.Object), (r10v1 java.lang.Object) binds: [B:26:0x00f7, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        we1 we1Var;
        Object obj;
        Object coroutine_suspended;
        int i;
        Object obj2;
        String str;
        String str2;
        CompletableDeferred completableDeferred;
        Object obj3;
        String str3;
        if (continuationImpl instanceof we1) {
            we1Var = (we1) continuationImpl;
            int i2 = we1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                we1Var.d = i2 - Integer.MIN_VALUE;
                obj = we1Var.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = we1Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    me1 me1Var = this.d;
                    we1Var.d = 1;
                    CompletableDeferred completableDeferred2 = me1Var.a;
                    if (completableDeferred2 != null) {
                        obj2 = completableDeferred2.await(we1Var);
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    } else {
                        obj2 = Unit.INSTANCE;
                    }
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    str2 = (String) obj;
                    if (str2 != null) {
                        return str2;
                    }
                    ve1 ve1Var = this.e;
                    we1Var.d = 3;
                    if (ve1Var.a(we1Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    me1 me1Var2 = this.d;
                    we1Var.d = 4;
                    completableDeferred = me1Var2.a;
                    if (completableDeferred == null) {
                    }
                    if (obj3 == coroutine_suspended) {
                    }
                    we1Var.d = 5;
                    bu2 a = this.b.a(this.a);
                    if (a != null) {
                    }
                    if (str3 != null) {
                    }
                    obj = null;
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                ResultKt.throwOnFailure(obj);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        we1Var.d = 5;
                        bu2 a2 = this.b.a(this.a);
                        str3 = a2 != null ? a2.y : null;
                        if (str3 != null || str3.length() == 0) {
                            obj = null;
                        } else {
                            ef1 ef1Var = this.c;
                            ef1Var.getClass();
                            obj = BuildersKt.withContext(Dispatchers.getIO(), new ze1(ef1Var, null), we1Var);
                        }
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                    ResultKt.throwOnFailure(obj);
                    me1 me1Var22 = this.d;
                    we1Var.d = 4;
                    completableDeferred = me1Var22.a;
                    if (completableDeferred == null) {
                        obj3 = completableDeferred.await(we1Var);
                        if (obj3 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj3 = Unit.INSTANCE;
                        }
                    } else {
                        obj3 = Unit.INSTANCE;
                    }
                    if (obj3 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    we1Var.d = 5;
                    bu2 a22 = this.b.a(this.a);
                    if (a22 != null) {
                    }
                    if (str3 != null) {
                    }
                    obj = null;
                    if (obj == coroutine_suspended) {
                    }
                }
                we1Var.d = 2;
                bu2 a3 = this.b.a(this.a);
                str = a3 == null ? a3.y : null;
                if (str != null || str.length() == 0) {
                    obj = null;
                } else {
                    ef1 ef1Var2 = this.c;
                    ef1Var2.getClass();
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new ze1(ef1Var2, null), we1Var);
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = (String) obj;
                if (str2 != null) {
                }
            }
        }
        we1Var = new we1(this, continuationImpl);
        obj = we1Var.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = we1Var.d;
        if (i != 0) {
        }
        we1Var.d = 2;
        bu2 a32 = this.b.a(this.a);
        if (a32 == null) {
        }
        if (str != null) {
        }
        obj = null;
        if (obj == coroutine_suspended) {
        }
        str2 = (String) obj;
        if (str2 != null) {
        }
    }
}
