package H;

import K.X;
import U.v;
import a1.AbstractC0067d;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0148a;
import g0.C0172z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f545a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f546b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f547c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f548e;

    /* renamed from: f, reason: collision with root package name */
    public Object f549f;

    public e(x1.l lVar, String str, x1.j jVar, AbstractC0067d abstractC0067d, Map map) {
        this.f545a = 2;
        i1.f.e(lVar, "url");
        i1.f.e(str, "method");
        this.f547c = lVar;
        this.f546b = str;
        this.d = jVar;
        this.f548e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0148a c0148a = (C0148a) arrayList.get(i2);
            int i3 = c0148a.f2846a;
            if (i3 == 8) {
                if (e(c0148a.f2848c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0148a.f2847b;
                int i5 = c0148a.f2848c + i4;
                while (i4 < i5) {
                    if (e(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0172z) this.f548e).a((C0148a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f547c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0148a c0148a = (C0148a) arrayList2.get(i2);
            int i3 = c0148a.f2846a;
            C0172z c0172z = (C0172z) this.f548e;
            if (i3 == 1) {
                c0172z.a(c0148a);
                c0172z.d(c0148a.f2847b, c0148a.f2848c);
            } else if (i3 == 2) {
                c0172z.a(c0148a);
                int i4 = c0148a.f2847b;
                int i5 = c0148a.f2848c;
                RecyclerView recyclerView = c0172z.f3009a;
                recyclerView.R(i4, i5, true);
                recyclerView.f1992h0 = true;
                recyclerView.f1987e0.f2814c += i5;
            } else if (i3 == 4) {
                c0172z.a(c0148a);
                c0172z.c(c0148a.f2847b, c0148a.f2848c);
            } else if (i3 == 8) {
                c0172z.a(c0148a);
                c0172z.e(c0148a.f2847b, c0148a.f2848c);
            }
        }
        j(arrayList2);
    }

    public void c(C0148a c0148a) {
        int i;
        J.b bVar;
        int i2 = c0148a.f2846a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0148a.f2847b, i2);
        int i3 = c0148a.f2847b;
        int i4 = c0148a.f2846a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0148a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0148a.f2848c;
            bVar = (J.b) this.f546b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0148a.f2847b, c0148a.f2846a);
            int i8 = c0148a.f2846a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0148a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0148a.f2846a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0148a);
        if (i6 > 0) {
            C0148a h2 = h(c0148a.f2846a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0148a c0148a, int i) {
        C0172z c0172z = (C0172z) this.f548e;
        c0172z.a(c0148a);
        int i2 = c0148a.f2846a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0172z.c(i, c0148a.f2848c);
        } else {
            int i3 = c0148a.f2848c;
            RecyclerView recyclerView = c0172z.f3009a;
            recyclerView.R(i, i3, true);
            recyclerView.f1992h0 = true;
            recyclerView.f1987e0.f2814c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0148a c0148a = (C0148a) arrayList.get(i2);
            int i3 = c0148a.f2846a;
            if (i3 == 8) {
                int i4 = c0148a.f2847b;
                if (i4 == i) {
                    i = c0148a.f2848c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0148a.f2848c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0148a.f2847b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0148a.f2848c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0148a.f2848c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f547c).size() > 0;
    }

    public v g() {
        v vVar = new v();
        vVar.d = new LinkedHashMap();
        vVar.f1207a = (x1.l) this.f547c;
        vVar.f1208b = (String) this.f546b;
        Map map = (Map) this.f548e;
        vVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        vVar.f1209c = ((x1.j) this.d).c();
        return vVar;
    }

    public C0148a h(int i, int i2, int i3) {
        C0148a c0148a = (C0148a) ((J.b) this.f546b).a();
        if (c0148a != null) {
            c0148a.f2846a = i;
            c0148a.f2847b = i2;
            c0148a.f2848c = i3;
            return c0148a;
        }
        C0148a c0148a2 = new C0148a();
        c0148a2.f2846a = i;
        c0148a2.f2847b = i2;
        c0148a2.f2848c = i3;
        return c0148a2;
    }

    public void i(C0148a c0148a) {
        ((ArrayList) this.d).add(c0148a);
        int i = c0148a.f2846a;
        C0172z c0172z = (C0172z) this.f548e;
        if (i == 1) {
            c0172z.d(c0148a.f2847b, c0148a.f2848c);
            return;
        }
        if (i == 2) {
            int i2 = c0148a.f2847b;
            int i3 = c0148a.f2848c;
            RecyclerView recyclerView = c0172z.f3009a;
            recyclerView.R(i2, i3, false);
            recyclerView.f1992h0 = true;
            return;
        }
        if (i == 4) {
            c0172z.c(c0148a.f2847b, c0148a.f2848c);
        } else if (i == 8) {
            c0172z.e(c0148a.f2847b, c0148a.f2848c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0148a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0148a c0148a = (C0148a) arrayList.get(i);
            c0148a.getClass();
            ((J.b) this.f546b).c(c0148a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0148a c0148a = (C0148a) arrayList.get(size);
            int i5 = c0148a.f2846a;
            if (i5 == 8) {
                int i6 = c0148a.f2847b;
                int i7 = c0148a.f2848c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0148a.f2847b = i6 + 1;
                            c0148a.f2848c = i7 + 1;
                        } else if (i2 == 2) {
                            c0148a.f2847b = i6 - 1;
                            c0148a.f2848c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0148a.f2848c = i7 + 1;
                    } else if (i2 == 2) {
                        c0148a.f2848c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0148a.f2847b = i6 + 1;
                    } else if (i2 == 2) {
                        c0148a.f2847b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0148a.f2847b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0148a.f2848c;
                    } else if (i5 == 2) {
                        i += c0148a.f2848c;
                    }
                } else if (i2 == 1) {
                    c0148a.f2847b = i8 + 1;
                } else if (i2 == 2) {
                    c0148a.f2847b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0148a c0148a2 = (C0148a) arrayList.get(size2);
            int i9 = c0148a2.f2846a;
            J.b bVar = (J.b) this.f546b;
            if (i9 == 8) {
                int i10 = c0148a2.f2848c;
                if (i10 == c0148a2.f2847b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0148a2);
                }
            } else if (c0148a2.f2848c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0148a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f545a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f546b) + ", mProviderPackage: " + ((String) this.f547c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f549f;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb2 = new StringBuilder("Request{method=");
                sb2.append((String) this.f546b);
                sb2.append(", url=");
                sb2.append((x1.l) this.f547c);
                x1.j jVar = (x1.j) this.d;
                if (jVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = jVar.iterator();
                    int i3 = 0;
                    while (true) {
                        X x2 = (X) it;
                        if (x2.hasNext()) {
                            Object next = x2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            V0.d dVar = (V0.d) next;
                            String str = (String) dVar.f1243a;
                            String str2 = (String) dVar.f1244b;
                            if (i3 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(str);
                            sb2.append(':');
                            sb2.append(str2);
                            i3 = i4;
                        } else {
                            sb2.append(']');
                        }
                    }
                }
                Map map = (Map) this.f548e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                i1.f.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f545a = 0;
        str.getClass();
        this.f546b = str;
        str2.getClass();
        this.f547c = str2;
        this.d = str3;
        list.getClass();
        this.f549f = list;
        this.f548e = str + "-" + str2 + "-" + str3;
    }

    public e(C0172z c0172z) {
        this.f545a = 1;
        this.f546b = new J.b(30);
        this.f547c = new ArrayList();
        this.d = new ArrayList();
        this.f548e = c0172z;
        this.f549f = new A1.d(26, this);
    }
}
