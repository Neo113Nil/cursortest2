package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public final class pb0 {
    public final i02 a;
    public final k52 b;
    public final sg2 c;

    public pb0(v3 v3Var, yu2 yu2Var, t8 t8Var, hv hvVar, i02 i02Var, z83 z83Var, k52 k52Var) {
        sg2 sg2Var = new sg2(v3Var, yu2Var, t8Var, z83Var, hvVar);
        this.a = i02Var;
        this.b = k52Var;
        this.c = sg2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, ib0 ib0Var, ContinuationImpl continuationImpl) {
        ob0 ob0Var;
        int i;
        mg2 mg2Var;
        b63 b63Var;
        if (continuationImpl instanceof ob0) {
            ob0Var = (ob0) continuationImpl;
            int i2 = ob0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ob0Var.e = i2 - Integer.MIN_VALUE;
                Object obj = ob0Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ob0Var.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List list = ib0Var.d;
                    sg2 sg2Var = this.c;
                    ob0Var.b = ib0Var;
                    ob0Var.e = 1;
                    obj = sg2Var.a(context, list, ob0Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib0Var = ob0Var.b;
                    ResultKt.throwOnFailure(obj);
                }
                mg2Var = (mg2) obj;
                b63 b63Var2 = null;
                if (mg2Var == null) {
                    i02 i02Var = this.a;
                    i02Var.a.b();
                    i02Var.b.f.c();
                } else {
                    k52 k52Var = this.b;
                    String str = ib0Var.b;
                    List list2 = ib0Var.c;
                    if (list2 == null) {
                        list2 = CollectionsKt.emptyList();
                    }
                    Map emptyMap = MapsKt.emptyMap();
                    k52Var.getClass();
                    if (str.length() <= 0) {
                        str = null;
                    }
                    if (str != null) {
                        i52 i52Var = k52Var.a;
                        String a = i52Var.b.a(str, MapsKt.emptyMap());
                        if (a.length() > 0) {
                            b63Var = i52Var.a.a(a);
                        } else {
                            boolean z = ob1.a;
                            b63Var = new z53(eo2.e);
                        }
                    } else {
                        b63Var = null;
                    }
                    vu a2 = lz1.a((mg2) null, b63Var);
                    z83 z83Var = k52Var.b;
                    io2 a3 = z83Var.e.a(z83Var.b, z83Var.c);
                    z83Var.d.getClass();
                    Map plus = MapsKt.plus(MapsKt.mapOf(TuplesKt.to("{CLICK_DEST}", wu.a(a2))), emptyMap);
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            z83Var.a.a((String) it.next(), a93.c, plus, a3);
                        }
                    }
                    b63Var2 = b63Var;
                }
                return new pz0(mg2Var, b63Var2);
            }
        }
        ob0Var = new ob0(this, continuationImpl);
        Object obj2 = ob0Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ob0Var.e;
        if (i != 0) {
        }
        mg2Var = (mg2) obj2;
        b63 b63Var22 = null;
        if (mg2Var == null) {
        }
        return new pz0(mg2Var, b63Var22);
    }
}
