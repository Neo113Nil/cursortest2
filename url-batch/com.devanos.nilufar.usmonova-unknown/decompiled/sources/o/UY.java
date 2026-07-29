package o;

import android.view.View;
import com.devanos.nilufar.usmonova.R;

/* loaded from: classes.dex */
public final class UY extends AbstractC1596ny implements InterfaceC2114vp {
    public static final UY i;
    public static final UY j;
    public static final UY k;
    public static final UY l;
    public static final UY m;
    public static final UY n;

    /* renamed from: o, reason: collision with root package name */
    public static final UY f116o;
    public static final UY p;
    public static final UY q;
    public final /* synthetic */ int h;

    static {
        int i2 = 1;
        i = new UY(i2, 0);
        j = new UY(i2, 1);
        k = new UY(i2, 2);
        l = new UY(i2, 3);
        m = new UY(i2, 4);
        n = new UY(i2, 5);
        f116o = new UY(i2, 6);
        p = new UY(i2, 7);
        q = new UY(i2, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UY(int i2) {
        super(1);
        this.h = 12;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                return Float.valueOf(((V3) obj).a);
            case 1:
                return new V3(((Number) obj).intValue());
            case 2:
                return Integer.valueOf((int) ((V3) obj).a);
            case 3:
                View view = (View) obj;
                AbstractC0048Bt.n(view, "currentView");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 4:
                View view2 = (View) obj;
                AbstractC0048Bt.n(view2, "viewParent");
                Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC0365Nz) {
                    return (InterfaceC0365Nz) tag;
                }
                return null;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                View view3 = (View) obj;
                AbstractC0048Bt.n(view3, "view");
                Object parent2 = view3.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                View view4 = (View) obj;
                AbstractC0048Bt.n(view4, "view");
                Object tag2 = view4.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag2 instanceof MP) {
                    return (MP) tag2;
                }
                return null;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                View view5 = (View) obj;
                AbstractC0048Bt.n(view5, "view");
                Object parent3 = view5.getParent();
                if (parent3 instanceof View) {
                    return (View) parent3;
                }
                return null;
            case 8:
                View view6 = (View) obj;
                AbstractC0048Bt.n(view6, "view");
                Object tag3 = view6.getTag(R.id.view_tree_view_model_store_owner);
                if (tag3 instanceof InterfaceC0746b00) {
                    return (InterfaceC0746b00) tag3;
                }
                return null;
            case 9:
                ((C1398ky) obj).getClass();
                return null;
            case 10:
                Boolean T = AbstractC1807r8.T((C0405Pn) obj);
                return Boolean.valueOf(T != null ? T.booleanValue() : true);
            case 11:
                Boolean T2 = AbstractC1807r8.T((C0405Pn) obj);
                return Boolean.valueOf(T2 != null ? T2.booleanValue() : true);
            case 12:
                Boolean T3 = AbstractC1807r8.T((C0405Pn) obj);
                return Boolean.valueOf(T3 != null ? T3.booleanValue() : false);
            case 13:
                AbstractC0048Bt.n((C1639ob) obj, "it");
                return IS.e;
            case 14:
                C0727aj c0727aj = (C0727aj) obj;
                if (!c0727aj.b.m) {
                    return EnumC2359zW.i;
                }
                c0727aj.n = null;
                return EnumC2359zW.h;
            case 15:
                InterfaceC2204x9 interfaceC2204x9 = (InterfaceC2204x9) obj;
                if (interfaceC2204x9.M() == 1) {
                    InterfaceC1118gg n2 = interfaceC2204x9.n();
                    AbstractC0048Bt.l(n2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = C1460lu.a;
                    if (C1460lu.j.containsKey(AbstractC0114Eh.g((InterfaceC1245ib) n2))) {
                        r1 = true;
                    }
                }
                return Boolean.valueOf(r1);
            case 16:
                CR cr = (CR) obj;
                AbstractC0048Bt.n(cr, "$this$function");
                String concat = "java/util/".concat("Spliterator");
                C1921su c1921su = TI.b;
                cr.b(concat, c1921su, c1921su);
                return C0782bY.a;
            default:
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UY(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UY(int i2, Object obj) {
        super(1);
        this.h = i2;
    }
}
