package yads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final class s0 {
    public final m0 a;

    public s0(v3 v3Var, yu2 yu2Var, t8 t8Var, hv hvVar, j52 j52Var, i02 i02Var, z83 z83Var, k52 k52Var, zb zbVar) {
        this.a = new m0(v3Var, yu2Var, t8Var, hvVar, j52Var, i02Var, z83Var, k52Var, zbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r11.equals("divkit_adtune") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r5 = new yads.ib(new yads.yb(r9.f, r12), new yads.gi0(), new yads.u9(r10, r9.a, r9.b), r9.d, r9.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        if (r11.equals("adtune") == false) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, yads.oz0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T, yads.oz0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012c -> B:10:0x012e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(View view, ArrayList arrayList, ContinuationImpl continuationImpl) {
        r0 r0Var;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        Iterator it;
        Ref$ObjectRef ref$ObjectRef2;
        View view2;
        l0 l0Var;
        if (continuationImpl instanceof r0) {
            r0Var = (r0) continuationImpl;
            int i2 = r0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.g = i2 - Integer.MIN_VALUE;
                Object obj = r0Var.e;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = r0Var.g;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = new oz0(arrayList == null || arrayList.isEmpty());
                    if (arrayList != null) {
                        it = arrayList.iterator();
                        ref$ObjectRef2 = ref$ObjectRef;
                        view2 = view;
                        while (it.hasNext()) {
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return ref$ObjectRef.element;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = r0Var.d;
                ref$ObjectRef2 = r0Var.c;
                View view3 = r0Var.b;
                ResultKt.throwOnFailure(obj);
                oz0 oz0Var = (oz0) obj;
                if (oz0Var != null) {
                    oz0 oz0Var2 = (oz0) ref$ObjectRef2.element;
                    boolean z = oz0Var2.a || oz0Var.a;
                    pz0 pz0Var = oz0Var2.b;
                    if (pz0Var == null) {
                        pz0Var = oz0Var.b;
                    }
                    ref$ObjectRef2.element = new oz0(z, pz0Var);
                }
                view2 = view3;
                while (it.hasNext()) {
                    j0 j0Var = (j0) it.next();
                    m0 m0Var = this.a;
                    Context context = view2.getContext();
                    i52 i52Var = new i52(m0Var.e.a);
                    String a = j0Var.a();
                    int hashCode = a.hashCode();
                    if (hashCode != -1422015845) {
                        if (hashCode == 94756344) {
                            if (a.equals("close")) {
                                l0Var = new wv(m0Var.d, m0Var.f);
                            }
                            l0Var = null;
                        } else {
                            if (hashCode == 629233382) {
                                if (a.equals("deeplink")) {
                                    l0Var = new kb0(new pb0(m0Var.a, m0Var.b, m0Var.c, m0Var.d, m0Var.f, m0Var.g, m0Var.h));
                                }
                            } else if (hashCode == 1039116149) {
                            }
                            l0Var = null;
                        }
                        while (it.hasNext()) {
                        }
                    }
                    l0 l0Var2 = l0Var != null ? l0Var : null;
                    if (l0Var2 != null) {
                        r0Var.b = view2;
                        r0Var.c = ref$ObjectRef2;
                        r0Var.d = it;
                        r0Var.g = 1;
                        Object a2 = l0Var2.a(view2, j0Var, r0Var);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        view3 = view2;
                        obj = a2;
                        oz0 oz0Var3 = (oz0) obj;
                        if (oz0Var3 != null) {
                        }
                        view2 = view3;
                        while (it.hasNext()) {
                        }
                    }
                }
                ref$ObjectRef = ref$ObjectRef2;
                return ref$ObjectRef.element;
            }
        }
        r0Var = new r0(this, continuationImpl);
        Object obj2 = r0Var.e;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0Var.g;
        if (i != 0) {
        }
    }
}
