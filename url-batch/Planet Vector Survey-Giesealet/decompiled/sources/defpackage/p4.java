package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class p4 extends tk0 implements qu {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ q4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(q4 q4Var, kj kjVar) {
        super(kjVar);
        this.g = q4Var;
    }

    @Override // defpackage.h9
    public final kj create(Object obj, kj kjVar) {
        p4 p4Var = new p4(this.g, kjVar);
        p4Var.f = obj;
        return p4Var;
    }

    @Override // defpackage.qu
    public final Object invoke(Object obj, Object obj2) {
        return ((p4) create((ju0) obj, (kj) obj2)).invokeSuspend(ky0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (r13 != r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
    
        if (r13 == r5) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0054 -> B:6:0x0057). Please report as a decompilation issue!!! */
    @Override // defpackage.h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ju0 ju0Var;
        Object obj2;
        int i = this.e;
        q4 q4Var = this.g;
        ck ckVar = ck.d;
        if (i == 0) {
            rg0.u(obj);
            ju0Var = (ju0) this.f;
            this.f = ju0Var;
            this.e = 1;
            obj = yu0.a(ju0Var, (r3 & 1) != 0, sg0.e, this);
        } else if (i == 1) {
            ju0Var = (ju0) this.f;
            rg0.u(obj);
        } else {
            if (i != 2) {
                g8.s("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ju0Var = (ju0) this.f;
            rg0.u(obj);
            List list = ((qg0) obj).a;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((wg0) obj3).d) {
                    arrayList.add(obj3);
                }
            }
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                long j = ((wg0) obj2).a;
                vg0 vg0Var = q4Var.j;
                if (y6.C(vg0Var) && j == vg0Var.a) {
                    break;
                }
                i2++;
            }
            wg0 wg0Var = (wg0) obj2;
            if (wg0Var == null) {
                wg0Var = (wg0) zd.d0(arrayList);
            }
            if (wg0Var != null) {
                q4Var.j = new vg0(wg0Var.a);
                q4Var.d = new ra0(wg0Var.c);
            }
            if (arrayList.isEmpty()) {
                q4Var.j = null;
                return ky0.a;
            }
            this.f = ju0Var;
            this.e = 2;
            obj = ju0Var.b(sg0.e, this);
        }
        wg0 wg0Var2 = (wg0) obj;
        q4Var.j = new vg0(wg0Var2.a);
        q4Var.d = new ra0(wg0Var2.c);
        this.f = ju0Var;
        this.e = 2;
        obj = ju0Var.b(sg0.e, this);
    }
}
