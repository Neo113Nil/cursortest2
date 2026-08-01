package H;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0112a;
import g0.C0136z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f220b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f221c;
    public final Serializable d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f222e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f223f;

    public e(String str, String str2, String str3, List list) {
        this.f219a = 0;
        str.getClass();
        this.f220b = str;
        str2.getClass();
        this.f221c = str2;
        this.d = str3;
        list.getClass();
        this.f223f = list;
        this.f222e = str + "-" + str2 + "-" + str3;
    }

    public boolean a(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0112a c0112a = (C0112a) arrayList.get(i2);
            int i3 = c0112a.f2408a;
            if (i3 == 8) {
                if (e(c0112a.f2410c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0112a.f2409b;
                int i5 = c0112a.f2410c + i4;
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
            ((C0136z) this.f222e).a((C0112a) arrayList.get(i));
        }
        i(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f221c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0112a c0112a = (C0112a) arrayList2.get(i2);
            int i3 = c0112a.f2408a;
            C0136z c0136z = (C0136z) this.f222e;
            if (i3 == 1) {
                c0136z.a(c0112a);
                c0136z.d(c0112a.f2409b, c0112a.f2410c);
            } else if (i3 == 2) {
                c0136z.a(c0112a);
                int i4 = c0112a.f2409b;
                int i5 = c0112a.f2410c;
                RecyclerView recyclerView = c0136z.f2571a;
                recyclerView.R(i4, i5, true);
                recyclerView.f1613h0 = true;
                recyclerView.f1608e0.f2376c += i5;
            } else if (i3 == 4) {
                c0136z.a(c0112a);
                c0136z.c(c0112a.f2409b, c0112a.f2410c);
            } else if (i3 == 8) {
                c0136z.a(c0112a);
                c0136z.e(c0112a.f2409b, c0112a.f2410c);
            }
        }
        i(arrayList2);
    }

    public void c(C0112a c0112a) {
        int i;
        J.b bVar;
        int i2 = c0112a.f2408a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int j2 = j(c0112a.f2409b, i2);
        int i3 = c0112a.f2409b;
        int i4 = c0112a.f2408a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0112a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0112a.f2410c;
            bVar = (J.b) this.f220b;
            if (i5 >= i7) {
                break;
            }
            int j3 = j((i * i5) + c0112a.f2409b, c0112a.f2408a);
            int i8 = c0112a.f2408a;
            if (i8 == 2 ? j3 != j2 : !(i8 == 4 && j3 == j2 + 1)) {
                C0112a g2 = g(i8, j2, i6);
                d(g2, i3);
                bVar.c(g2);
                if (c0112a.f2408a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                j2 = j3;
            } else {
                i6++;
            }
            i5++;
        }
        bVar.c(c0112a);
        if (i6 > 0) {
            C0112a g3 = g(c0112a.f2408a, j2, i6);
            d(g3, i3);
            bVar.c(g3);
        }
    }

    public void d(C0112a c0112a, int i) {
        C0136z c0136z = (C0136z) this.f222e;
        c0136z.a(c0112a);
        int i2 = c0112a.f2408a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0136z.c(i, c0112a.f2410c);
        } else {
            int i3 = c0112a.f2410c;
            RecyclerView recyclerView = c0136z.f2571a;
            recyclerView.R(i, i3, true);
            recyclerView.f1613h0 = true;
            recyclerView.f1608e0.f2376c += i3;
        }
    }

    public int e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            C0112a c0112a = (C0112a) arrayList.get(i2);
            int i3 = c0112a.f2408a;
            if (i3 == 8) {
                int i4 = c0112a.f2409b;
                if (i4 == i) {
                    i = c0112a.f2410c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0112a.f2410c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0112a.f2409b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0112a.f2410c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0112a.f2410c;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean f() {
        return ((ArrayList) this.f221c).size() > 0;
    }

    public C0112a g(int i, int i2, int i3) {
        C0112a c0112a = (C0112a) ((J.b) this.f220b).a();
        if (c0112a != null) {
            c0112a.f2408a = i;
            c0112a.f2409b = i2;
            c0112a.f2410c = i3;
            return c0112a;
        }
        C0112a c0112a2 = new C0112a();
        c0112a2.f2408a = i;
        c0112a2.f2409b = i2;
        c0112a2.f2410c = i3;
        return c0112a2;
    }

    public void h(C0112a c0112a) {
        ((ArrayList) this.d).add(c0112a);
        int i = c0112a.f2408a;
        C0136z c0136z = (C0136z) this.f222e;
        if (i == 1) {
            c0136z.d(c0112a.f2409b, c0112a.f2410c);
            return;
        }
        if (i == 2) {
            int i2 = c0112a.f2409b;
            int i3 = c0112a.f2410c;
            RecyclerView recyclerView = c0136z.f2571a;
            recyclerView.R(i2, i3, false);
            recyclerView.f1613h0 = true;
            return;
        }
        if (i == 4) {
            c0136z.c(c0112a.f2409b, c0112a.f2410c);
        } else if (i == 8) {
            c0136z.e(c0112a.f2409b, c0112a.f2410c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0112a);
        }
    }

    public void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0112a c0112a = (C0112a) arrayList.get(i);
            c0112a.getClass();
            ((J.b) this.f220b).c(c0112a);
        }
        arrayList.clear();
    }

    public int j(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0112a c0112a = (C0112a) arrayList.get(size);
            int i5 = c0112a.f2408a;
            if (i5 == 8) {
                int i6 = c0112a.f2409b;
                int i7 = c0112a.f2410c;
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
                            c0112a.f2409b = i6 + 1;
                            c0112a.f2410c = i7 + 1;
                        } else if (i2 == 2) {
                            c0112a.f2409b = i6 - 1;
                            c0112a.f2410c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0112a.f2410c = i7 + 1;
                    } else if (i2 == 2) {
                        c0112a.f2410c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0112a.f2409b = i6 + 1;
                    } else if (i2 == 2) {
                        c0112a.f2409b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0112a.f2409b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0112a.f2410c;
                    } else if (i5 == 2) {
                        i += c0112a.f2410c;
                    }
                } else if (i2 == 1) {
                    c0112a.f2409b = i8 + 1;
                } else if (i2 == 2) {
                    c0112a.f2409b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0112a c0112a2 = (C0112a) arrayList.get(size2);
            int i9 = c0112a2.f2408a;
            J.b bVar = (J.b) this.f220b;
            if (i9 == 8) {
                int i10 = c0112a2.f2410c;
                if (i10 == c0112a2.f2409b || i10 < 0) {
                    arrayList.remove(size2);
                    bVar.c(c0112a2);
                }
            } else if (c0112a2.f2410c <= 0) {
                arrayList.remove(size2);
                bVar.c(c0112a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f219a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f220b) + ", mProviderPackage: " + ((String) this.f221c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f223f;
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
            default:
                return super.toString();
        }
    }

    public e(C0136z c0136z) {
        this.f219a = 1;
        this.f220b = new J.b(30);
        this.f221c = new ArrayList();
        this.d = new ArrayList();
        this.f222e = c0136z;
        this.f223f = new A0.h(23, this);
    }
}
