package t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0335f implements InterfaceC0333d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f3743f;

    /* renamed from: g, reason: collision with root package name */
    public int f3744g;

    /* renamed from: a, reason: collision with root package name */
    public o f3739a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3740b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3741c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3742e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3745j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3746k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f3747l = new ArrayList();

    public C0335f(o oVar) {
        this.d = oVar;
    }

    @Override // t.InterfaceC0333d
    public final void a(InterfaceC0333d interfaceC0333d) {
        ArrayList arrayList = this.f3747l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0335f) it.next()).f3745j) {
                return;
            }
        }
        this.f3741c = true;
        o oVar = this.f3739a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f3740b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C0335f c0335f = null;
        int i = 0;
        while (it2.hasNext()) {
            C0335f c0335f2 = (C0335f) it2.next();
            if (!(c0335f2 instanceof g)) {
                i++;
                c0335f = c0335f2;
            }
        }
        if (c0335f != null && i == 1 && c0335f.f3745j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f3745j) {
                    return;
                } else {
                    this.f3743f = this.h * gVar.f3744g;
                }
            }
            d(c0335f.f3744g + this.f3743f);
        }
        o oVar2 = this.f3739a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f3746k.add(oVar);
        if (this.f3745j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f3747l.clear();
        this.f3746k.clear();
        this.f3745j = false;
        this.f3744g = 0;
        this.f3741c = false;
        this.f3740b = false;
    }

    public void d(int i) {
        if (this.f3745j) {
            return;
        }
        this.f3745j = true;
        this.f3744g = i;
        Iterator it = this.f3746k.iterator();
        while (it.hasNext()) {
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
            interfaceC0333d.a(interfaceC0333d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3761b.f3541h0);
        sb.append(":");
        switch (this.f3742e) {
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
        sb.append(this.f3745j ? Integer.valueOf(this.f3744g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3747l.size());
        sb.append(":d=");
        sb.append(this.f3746k.size());
        sb.append(">");
        return sb.toString();
    }
}
