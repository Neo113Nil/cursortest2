package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0304f implements InterfaceC0302d {
    public final AbstractC0313o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3784f;

    /* renamed from: g, reason: collision with root package name */
    public int f3785g;

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0313o f3780a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3781b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3782c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3783e = 1;
    public int h = 1;
    public C0305g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3786j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3787k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3788l = new ArrayList();

    public C0304f(AbstractC0313o abstractC0313o) {
        this.d = abstractC0313o;
    }

    @Override // t.InterfaceC0302d
    public final void a(InterfaceC0302d interfaceC0302d) {
        ArrayList arrayList = this.f3788l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0304f) it.next()).f3786j) {
                return;
            }
        }
        this.f3782c = true;
        AbstractC0313o abstractC0313o = this.f3780a;
        if (abstractC0313o != null) {
            abstractC0313o.a(this);
        }
        if (this.f3781b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0304f c0304f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0304f c0304f2 = (C0304f) it2.next();
            if (!(c0304f2 instanceof C0305g)) {
                i++;
                c0304f = c0304f2;
            }
        }
        if (c0304f != null && i == 1 && c0304f.f3786j) {
            C0305g c0305g = this.i;
            if (c0305g != null) {
                if (!c0305g.f3786j) {
                    return;
                } else {
                    this.f3784f = this.h * c0305g.f3785g;
                }
            }
            d(c0304f.f3785g + this.f3784f);
        }
        AbstractC0313o abstractC0313o2 = this.f3780a;
        if (abstractC0313o2 != null) {
            abstractC0313o2.a(this);
        }
    }

    public final void b(AbstractC0313o abstractC0313o) {
        this.f3787k.add(abstractC0313o);
        if (this.f3786j) {
            abstractC0313o.a(abstractC0313o);
        }
    }

    public final void c() {
        this.f3788l.clear();
        this.f3787k.clear();
        this.f3786j = false;
        this.f3785g = 0;
        this.f3782c = false;
        this.f3781b = false;
    }

    public void d(int i) {
        if (this.f3786j) {
            return;
        }
        this.f3786j = true;
        this.f3785g = i;
        Iterator it = this.f3787k.iterator();
        while (it.hasNext()) {
            InterfaceC0302d interfaceC0302d = (InterfaceC0302d) it.next();
            interfaceC0302d.a(interfaceC0302d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3802b.f3659h0);
        sb.append(":");
        switch (this.f3783e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f3786j ? Integer.valueOf(this.f3785g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3788l.size());
        sb.append(":d=");
        sb.append(this.f3787k.size());
        sb.append(">");
        return sb.toString();
    }
}
