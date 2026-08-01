package H;

import T.u;
import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0085a;
import f0.C0109z;
import i1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f212b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f213c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f214e;

    /* renamed from: f, reason: collision with root package name */
    public Object f215f;

    public e(i1.m mVar, String str, i1.k kVar, s sVar, Map map) {
        this.f211a = 2;
        X0.d.e(mVar, "url");
        X0.d.e(str, "method");
        this.f213c = mVar;
        this.f212b = str;
        this.d = kVar;
        this.f214e = map;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0085a c0085a = (C0085a) arrayList.get(i2);
            int i3 = c0085a.f2029a;
            if (i3 == 8) {
                if (e(c0085a.f2031c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0085a.f2030b;
                int i5 = c0085a.f2031c + i4;
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
            ((C0109z) this.f214e).a((C0085a) arrayList.get(i));
        }
        j(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f213c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0085a c0085a = (C0085a) arrayList2.get(i2);
            int i3 = c0085a.f2029a;
            C0109z c0109z = (C0109z) this.f214e;
            if (i3 == 1) {
                c0109z.a(c0085a);
                c0109z.d(c0085a.f2030b, c0085a.f2031c);
            } else if (i3 == 2) {
                c0109z.a(c0085a);
                int i4 = c0085a.f2030b;
                int i5 = c0085a.f2031c;
                RecyclerView recyclerView = c0109z.f2189a;
                recyclerView.O(i4, i5, true);
                recyclerView.f1446f0 = true;
                recyclerView.f1441c0.f1996c += i5;
            } else if (i3 == 4) {
                c0109z.a(c0085a);
                c0109z.c(c0085a.f2030b, c0085a.f2031c);
            } else if (i3 == 8) {
                c0109z.a(c0085a);
                c0109z.e(c0085a.f2030b, c0085a.f2031c);
            }
        }
        j(arrayList2);
    }

    public void c(C0085a c0085a) {
        int i;
        J.b bVar;
        int i2 = c0085a.f2029a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int k2 = k(c0085a.f2030b, i2);
        int i3 = c0085a.f2030b;
        int i4 = c0085a.f2029a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0085a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0085a.f2031c;
            bVar = (J.b) this.f212b;
            if (i5 >= i7) {
                break;
            }
            int k3 = k((i * i5) + c0085a.f2030b, c0085a.f2029a);
            int i8 = c0085a.f2029a;
            if (i8 == 2 ? k3 != k2 : !(i8 == 4 && k3 == k2 + 1)) {
                C0085a h = h(i8, k2, i6);
                d(h, i3);
                bVar.c(h);
                if (c0085a.f2029a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                k2 = k3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0085a);
        if (i6 > 0) {
            C0085a h2 = h(c0085a.f2029a, k2, i6);
            d(h2, i3);
            bVar.c(h2);
        }
    }

    public void d(C0085a c0085a, int i) {
        C0109z c0109z = (C0109z) this.f214e;
        c0109z.a(c0085a);
        int i2 = c0085a.f2029a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0109z.c(i, c0085a.f2031c);
        } else {
            int i3 = c0085a.f2031c;
            RecyclerView recyclerView = c0109z.f2189a;
            recyclerView.O(i, i3, true);
            recyclerView.f1446f0 = true;
            recyclerView.f1441c0.f1996c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0085a c0085a = (C0085a) arrayList.get(i2);
            int i3 = c0085a.f2029a;
            if (i3 == 8) {
                int i4 = c0085a.f2030b;
                if (i4 == i) {
                    i = c0085a.f2031c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0085a.f2031c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0085a.f2030b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0085a.f2031c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0085a.f2031c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f213c).size() > 0;
    }

    public u g() {
        u uVar = new u();
        uVar.d = new LinkedHashMap();
        uVar.f752a = (i1.m) this.f213c;
        uVar.f753b = (String) this.f212b;
        Map map = (Map) this.f214e;
        uVar.d = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        uVar.f754c = ((i1.k) this.d).c();
        return uVar;
    }

    public C0085a h(int i, int i2, int i3) {
        C0085a c0085a = (C0085a) ((J.b) this.f212b).a();
        if (c0085a != null) {
            c0085a.f2029a = i;
            c0085a.f2030b = i2;
            c0085a.f2031c = i3;
            return c0085a;
        }
        C0085a c0085a2 = new C0085a();
        c0085a2.f2029a = i;
        c0085a2.f2030b = i2;
        c0085a2.f2031c = i3;
        return c0085a2;
    }

    public void i(C0085a c0085a) {
        ((ArrayList) this.d).add(c0085a);
        int i = c0085a.f2029a;
        C0109z c0109z = (C0109z) this.f214e;
        if (i == 1) {
            c0109z.d(c0085a.f2030b, c0085a.f2031c);
            return;
        }
        if (i == 2) {
            int i2 = c0085a.f2030b;
            int i3 = c0085a.f2031c;
            RecyclerView recyclerView = c0109z.f2189a;
            recyclerView.O(i2, i3, false);
            recyclerView.f1446f0 = true;
            return;
        }
        if (i == 4) {
            c0109z.c(c0085a.f2030b, c0085a.f2031c);
        } else if (i == 8) {
            c0109z.e(c0085a.f2030b, c0085a.f2031c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0085a);
        }
    }

    public void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0085a c0085a = (C0085a) arrayList.get(i);
            c0085a.getClass();
            ((J.b) this.f212b).c(c0085a);
        }
        arrayList.clear();
    }

    public int k(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0085a c0085a = (C0085a) arrayList.get(size);
            int i5 = c0085a.f2029a;
            if (i5 == 8) {
                int i6 = c0085a.f2030b;
                int i7 = c0085a.f2031c;
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
                            c0085a.f2030b = i6 + 1;
                            c0085a.f2031c = i7 + 1;
                        } else if (i2 == 2) {
                            c0085a.f2030b = i6 - 1;
                            c0085a.f2031c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0085a.f2031c = i7 + 1;
                    } else if (i2 == 2) {
                        c0085a.f2031c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0085a.f2030b = i6 + 1;
                    } else if (i2 == 2) {
                        c0085a.f2030b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0085a.f2030b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0085a.f2031c;
                    } else if (i5 == 2) {
                        i += c0085a.f2031c;
                    }
                } else if (i2 == 1) {
                    c0085a.f2030b = i8 + 1;
                } else if (i2 == 2) {
                    c0085a.f2030b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0085a c0085a2 = (C0085a) arrayList.get(size2);
            int i9 = c0085a2.f2029a;
            J.b bVar = (J.b) this.f212b;
            if (i9 == 8) {
                int i10 = c0085a2.f2031c;
                if (i10 == c0085a2.f2030b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0085a2);
                }
            } else if (c0085a2.f2031c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0085a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f211a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f212b) + ", mProviderPackage: " + ((String) this.f213c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f215f;
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
                sb2.append((String) this.f212b);
                sb2.append(", url=");
                sb2.append((i1.m) this.f213c);
                i1.k kVar = (i1.k) this.d;
                if (kVar.size() != 0) {
                    sb2.append(", headers=[");
                    Iterator it = kVar.iterator();
                    int i3 = 0;
                    while (true) {
                        Q0.a aVar = (Q0.a) it;
                        if (aVar.hasNext()) {
                            Object next = aVar.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                            P0.b bVar = (P0.b) next;
                            String str = (String) bVar.f620a;
                            String str2 = (String) bVar.f621b;
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
                Map map = (Map) this.f214e;
                if (!map.isEmpty()) {
                    sb2.append(", tags=");
                    sb2.append(map);
                }
                sb2.append('}');
                String sb3 = sb2.toString();
                X0.d.d(sb3, "StringBuilder().apply(builderAction).toString()");
                return sb3;
        }
    }

    public e(String str, String str2, String str3, List list) {
        this.f211a = 0;
        str.getClass();
        this.f212b = str;
        str2.getClass();
        this.f213c = str2;
        this.d = str3;
        list.getClass();
        this.f215f = list;
        this.f214e = str + "-" + str2 + "-" + str3;
    }

    public e(C0109z c0109z) {
        this.f211a = 1;
        this.f212b = new J.b(30);
        this.f213c = new ArrayList();
        this.d = new ArrayList();
        this.f214e = c0109z;
        this.f215f = new B0.d(23, this);
    }
}
