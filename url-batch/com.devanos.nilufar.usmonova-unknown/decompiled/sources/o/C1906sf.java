package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1906sf extends AbstractC2225xU implements InterfaceC2312yp {
    public Iterator h;
    public Object i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ List l;
    public final /* synthetic */ ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1906sf(List list, ArrayList arrayList, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.l = list;
        this.m = arrayList;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1906sf c1906sf = new C1906sf(this.l, this.m, interfaceC2235xe);
        c1906sf.k = obj;
        return c1906sf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1906sf) create(obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        int i = this.j;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            obj = this.k;
            it = this.l.iterator();
            list = this.m;
        } else if (i == 1) {
            Object obj2 = this.i;
            Iterator it2 = this.h;
            List list2 = (List) this.k;
            AbstractC1494mO.l(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C1840rf(1, null));
                this.k = list2;
                this.h = it2;
                this.i = null;
                this.j = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.h;
            list = (List) this.k;
            AbstractC1494mO.l(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.k = list;
        this.h = it;
        this.i = obj;
        this.j = 1;
        throw null;
    }
}
