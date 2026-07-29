package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.Uv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543Uv extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0621Xv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0543Uv(C0621Xv c0621Xv, int i) {
        super(0);
        this.h = i;
        this.i = c0621Xv;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C0621Xv c0621Xv = this.i;
                RM rm = c0621Xv.l;
                InterfaceC0937dx[] interfaceC0937dxArr = C0621Xv.n;
                InterfaceC0937dx interfaceC0937dx = interfaceC0937dxArr[14];
                Object invoke = rm.invoke();
                AbstractC0048Bt.m(invoke, "<get-allNonStaticMembers>(...)");
                RM rm2 = c0621Xv.m;
                InterfaceC0937dx interfaceC0937dx2 = interfaceC0937dxArr[15];
                Object invoke2 = rm2.invoke();
                AbstractC0048Bt.m(invoke2, "<get-allStaticMembers>(...)");
                return AbstractC0720ac.A0((Collection) invoke, (Collection) invoke2);
            case 1:
                C0621Xv c0621Xv2 = this.i;
                RM rm3 = c0621Xv2.h;
                InterfaceC0937dx[] interfaceC0937dxArr2 = C0621Xv.n;
                InterfaceC0937dx interfaceC0937dx3 = interfaceC0937dxArr2[10];
                Object invoke3 = rm3.invoke();
                AbstractC0048Bt.m(invoke3, "<get-declaredNonStaticMembers>(...)");
                RM rm4 = c0621Xv2.j;
                InterfaceC0937dx interfaceC0937dx4 = interfaceC0937dxArr2[12];
                Object invoke4 = rm4.invoke();
                AbstractC0048Bt.m(invoke4, "<get-inheritedNonStaticMembers>(...)");
                return AbstractC0720ac.A0((Collection) invoke3, (Collection) invoke4);
            case 2:
                C0621Xv c0621Xv3 = this.i;
                RM rm5 = c0621Xv3.i;
                InterfaceC0937dx[] interfaceC0937dxArr3 = C0621Xv.n;
                InterfaceC0937dx interfaceC0937dx5 = interfaceC0937dxArr3[11];
                Object invoke5 = rm5.invoke();
                AbstractC0048Bt.m(invoke5, "<get-declaredStaticMembers>(...)");
                RM rm6 = c0621Xv3.k;
                InterfaceC0937dx interfaceC0937dx6 = interfaceC0937dxArr3[13];
                Object invoke6 = rm6.invoke();
                AbstractC0048Bt.m(invoke6, "<get-inheritedStaticMembers>(...)");
                return AbstractC0720ac.A0((Collection) invoke5, (Collection) invoke6);
            case 3:
                return JY.d(this.i.a());
            case 4:
                C0621Xv c0621Xv4 = this.i;
                RM rm7 = c0621Xv4.h;
                InterfaceC0937dx[] interfaceC0937dxArr4 = C0621Xv.n;
                InterfaceC0937dx interfaceC0937dx7 = interfaceC0937dxArr4[10];
                Object invoke7 = rm7.invoke();
                AbstractC0048Bt.m(invoke7, "<get-declaredNonStaticMembers>(...)");
                RM rm8 = c0621Xv4.i;
                InterfaceC0937dx interfaceC0937dx8 = interfaceC0937dxArr4[11];
                Object invoke8 = rm8.invoke();
                AbstractC0048Bt.m(invoke8, "<get-declaredStaticMembers>(...)");
                return AbstractC0720ac.A0((Collection) invoke7, (Collection) invoke8);
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                WB g0 = this.i.a().g0();
                AbstractC0048Bt.m(g0, "descriptor.unsubstitutedInnerClassesScope");
                Collection h = ON.h(g0, null, 3);
                ArrayList arrayList = new ArrayList();
                for (Object obj : h) {
                    if (!AbstractC0114Eh.m((InterfaceC1118gg) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC1118gg interfaceC1118gg = (InterfaceC1118gg) it.next();
                    InterfaceC1245ib interfaceC1245ib = interfaceC1118gg instanceof InterfaceC1245ib ? (InterfaceC1245ib) interfaceC1118gg : null;
                    Class j = interfaceC1245ib != null ? JY.j(interfaceC1245ib) : null;
                    C0740aw c0740aw = j != null ? new C0740aw(j) : null;
                    if (c0740aw != null) {
                        arrayList2.add(c0740aw);
                    }
                }
                return arrayList2;
            default:
                Collection<InterfaceC1245ib> U = this.i.a().U();
                AbstractC0048Bt.m(U, "descriptor.sealedSubclasses");
                ArrayList arrayList3 = new ArrayList();
                for (InterfaceC1245ib interfaceC1245ib2 : U) {
                    AbstractC0048Bt.l(interfaceC1245ib2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class j2 = JY.j(interfaceC1245ib2);
                    C0740aw c0740aw2 = j2 != null ? new C0740aw(j2) : null;
                    if (c0740aw2 != null) {
                        arrayList3.add(c0740aw2);
                    }
                }
                return arrayList3;
        }
    }
}
