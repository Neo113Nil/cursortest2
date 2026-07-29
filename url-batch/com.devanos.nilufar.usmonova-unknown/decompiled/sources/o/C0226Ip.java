package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: o.Ip, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226Ip extends AbstractC1664p {
    public final /* synthetic */ C0252Jp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0226Ip(C0252Jp c0252Jp) {
        super(c0252Jp.l);
        this.c = c0252Jp;
    }

    @Override // o.SW
    public final boolean a() {
        return true;
    }

    @Override // o.AbstractC1664p, o.SW
    public final InterfaceC2364zb c() {
        return this.c;
    }

    @Override // o.AbstractC1205i0
    public final Collection e() {
        List<C1639ob> J;
        Iterable iterable;
        C0252Jp c0252Jp = this.c;
        int i = c0252Jp.f53o;
        int ordinal = c0252Jp.n.ordinal();
        if (ordinal == 0) {
            J = AbstractC0868ct.J(C0252Jp.s);
        } else if (ordinal == 1) {
            J = AbstractC0868ct.J(C0252Jp.s);
        } else if (ordinal == 2) {
            J = AbstractC0868ct.K(C0252Jp.t, new C1639ob(AbstractC1499mT.j, EnumC0304Lp.k.a(i)));
        } else {
            if (ordinal != 3) {
                throw new C0057Cc();
            }
            J = AbstractC0868ct.K(C0252Jp.t, new C1639ob(AbstractC1499mT.e, EnumC0304Lp.l.a(i)));
        }
        InterfaceC0761bD n = ((AbstractC1027fH) c0252Jp.m).n();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(J));
        for (C1639ob c1639ob : J) {
            InterfaceC1245ib o2 = AbstractC1052fg.o(n, c1639ob);
            if (o2 == null) {
                throw new IllegalStateException(("Built-in class " + c1639ob + " not found").toString());
            }
            List list = c0252Jp.r;
            int size = o2.z().getParameters().size();
            AbstractC0048Bt.n(list, "<this>");
            if (size < 0) {
                throw new IllegalArgumentException(AbstractC1888sN.h(size, "Requested element count ", " is less than zero.").toString());
            }
            if (size == 0) {
                iterable = C1318jk.h;
            } else {
                int size2 = list.size();
                if (size >= size2) {
                    iterable = AbstractC0720ac.J0(list);
                } else if (size == 1) {
                    iterable = AbstractC0868ct.J(AbstractC0720ac.v0(list));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list instanceof RandomAccess) {
                        for (int i2 = size2 - size; i2 < size2; i2++) {
                            arrayList2.add(list.get(i2));
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterable = arrayList2;
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC0786bc.d0(iterable));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList3.add(new C1767qX(((InterfaceC1437lX) it.next()).i()));
            }
            OW.i.getClass();
            arrayList.add(HO.q(OW.j, o2, arrayList3));
        }
        return AbstractC0720ac.J0(arrayList);
    }

    @Override // o.AbstractC1205i0
    public final C1097gL g() {
        return C1097gL.m;
    }

    @Override // o.SW
    public final List getParameters() {
        return this.c.r;
    }

    @Override // o.AbstractC1664p
    /* renamed from: m */
    public final InterfaceC1245ib c() {
        return this.c;
    }

    public final String toString() {
        return this.c.toString();
    }
}
