package t;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f implements InterfaceC0367d {
    public final p d;

    /* renamed from: f, reason: collision with root package name */
    public int f4138f;

    /* renamed from: g, reason: collision with root package name */
    public int f4139g;

    /* renamed from: a, reason: collision with root package name */
    public p f4134a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4135b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4136c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f4137e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4140j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f4141k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f4142l = new ArrayList();

    public f(p pVar) {
        this.d = pVar;
    }

    @Override // t.InterfaceC0367d
    public final void a(InterfaceC0367d interfaceC0367d) {
        ArrayList arrayList = this.f4142l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f4140j) {
                return;
            }
        }
        this.f4136c = true;
        p pVar = this.f4134a;
        if (pVar != null) {
            pVar.a(this);
        }
        if (this.f4135b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f4140j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f4140j) {
                    return;
                } else {
                    this.f4138f = this.h * gVar.f4139g;
                }
            }
            d(fVar.f4139g + this.f4138f);
        }
        p pVar2 = this.f4134a;
        if (pVar2 != null) {
            pVar2.a(this);
        }
    }

    public final void b(p pVar) {
        this.f4141k.add(pVar);
        if (this.f4140j) {
            pVar.a(pVar);
        }
    }

    public final void c() {
        this.f4142l.clear();
        this.f4141k.clear();
        this.f4140j = false;
        this.f4139g = 0;
        this.f4136c = false;
        this.f4135b = false;
    }

    public void d(int i) {
        if (this.f4140j) {
            return;
        }
        this.f4140j = true;
        this.f4139g = i;
        Iterator it = this.f4141k.iterator();
        while (it.hasNext()) {
            InterfaceC0367d interfaceC0367d = (InterfaceC0367d) it.next();
            interfaceC0367d.a(interfaceC0367d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f4156b.f3992h0);
        sb.append(":");
        switch (this.f4137e) {
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
        sb.append(this.f4140j ? Integer.valueOf(this.f4139g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f4142l.size());
        sb.append(":d=");
        sb.append(this.f4141k.size());
        sb.append(">");
        return sb.toString();
    }
}
