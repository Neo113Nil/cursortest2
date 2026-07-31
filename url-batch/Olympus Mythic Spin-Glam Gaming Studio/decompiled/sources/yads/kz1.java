package yads;

import android.content.Context;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class kz1 {
    public final vw2 a;
    public final o82 b;
    public final j82 c;

    public kz1(Context context, v3 v3Var, i5 i5Var, yu2 yu2Var) {
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
        o82 o82Var = new o82(context, v3Var, i5Var, yu2Var);
        j82 j82Var = new j82();
        this.a = vw2Var2;
        this.b = o82Var;
        this.c = j82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(kz1 kz1Var, ph phVar, ContinuationImpl continuationImpl) {
        gz1 gz1Var;
        int i;
        ph phVar2;
        ph phVar3;
        de3 de3Var;
        if (continuationImpl instanceof gz1) {
            gz1Var = (gz1) continuationImpl;
            int i2 = gz1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gz1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = gz1Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gz1Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (phVar.c instanceof dn1) {
                        Intrinsics.checkNotNull(phVar, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<R of com.monetization.ads.network.model.AssetKt.castGeneric>");
                        phVar2 = phVar;
                    } else {
                        phVar2 = null;
                    }
                    if (phVar2 == null) {
                        return phVar;
                    }
                    o82 o82Var = kz1Var.b;
                    de3 de3Var2 = ((dn1) phVar2.c).b;
                    gz1Var.b = phVar2;
                    gz1Var.e = 1;
                    o82Var.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new k82(de3Var2, o82Var, null), gz1Var);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ph phVar4 = phVar2;
                    obj = withContext;
                    phVar3 = phVar4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    phVar3 = gz1Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                de3Var = (de3) obj;
                if (de3Var == null) {
                    dn1 dn1Var = (dn1) phVar3.c;
                    if (dn1Var.c == null && dn1Var.a == null) {
                        return null;
                    }
                }
                dn1 dn1Var2 = (dn1) phVar3.c;
                return new ph(phVar3.a, phVar3.b, new dn1(dn1Var2.a, de3Var, dn1Var2.c), phVar3.d, phVar3.e, phVar3.f, phVar3.g);
            }
        }
        gz1Var = new gz1(kz1Var, continuationImpl);
        Object obj2 = gz1Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gz1Var.e;
        if (i != 0) {
        }
        de3Var = (de3) obj2;
        if (de3Var == null) {
        }
        dn1 dn1Var22 = (dn1) phVar3.c;
        return new ph(phVar3.a, phVar3.b, new dn1(dn1Var22.a, de3Var, dn1Var22.c), phVar3.d, phVar3.e, phVar3.f, phVar3.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, dz1 dz1Var, ContinuationImpl continuationImpl) {
        hz1 hz1Var;
        int i;
        List list;
        dz1 dz1Var2 = dz1Var;
        if (continuationImpl instanceof hz1) {
            hz1Var = (hz1) continuationImpl;
            int i2 = hz1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hz1Var.e = i2 - Integer.MIN_VALUE;
                Object obj = hz1Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = hz1Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    bu2 a = this.a.a(context);
                    if (a == null || !a.E0) {
                        return dz1Var2;
                    }
                    List list2 = dz1Var2.a.a;
                    hz1Var.b = dz1Var2;
                    hz1Var.e = 1;
                    obj = BuildersKt.withContext(Dispatchers.getIO(), new jz1(list2, this, null), hz1Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dz1Var2 = hz1Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                list = (List) obj;
                if (list != null) {
                    return null;
                }
                s12 s12Var = dz1Var2.a;
                s12 s12Var2 = new s12(list, s12Var.b, s12Var.c, s12Var.d, s12Var.e, s12Var.f, s12Var.g, s12Var.h, s12Var.i, s12Var.j);
                return new dz1(dz1Var2.c, dz1Var2.b, s12Var2);
            }
        }
        hz1Var = new hz1(this, continuationImpl);
        Object obj2 = hz1Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hz1Var.e;
        if (i != 0) {
        }
        list = (List) obj2;
        if (list != null) {
        }
    }
}
