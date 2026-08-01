package Y;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1030a;

    /* renamed from: b, reason: collision with root package name */
    public int f1031b;

    /* renamed from: c, reason: collision with root package name */
    public int f1032c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1033e;

    /* renamed from: f, reason: collision with root package name */
    public int f1034f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1035g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1036j;

    /* renamed from: k, reason: collision with root package name */
    public int f1037k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1038l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1039m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1040n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1041o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1042p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1043q;

    /* renamed from: r, reason: collision with root package name */
    public int f1044r;

    public C0033a(I i) {
        i.C();
        C0052u c0052u = i.f977t;
        if (c0052u != null) {
            c0052u.f1148b.getClassLoader();
        }
        this.f1030a = new ArrayList();
        this.f1041o = false;
        this.f1044r = -1;
        this.f1042p = i;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1035g) {
            return true;
        }
        I i = this.f1042p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1030a.add(p2);
        p2.d = this.f1031b;
        p2.f1013e = this.f1032c;
        p2.f1014f = this.d;
        p2.f1015g = this.f1033e;
    }

    public final void c(int i) {
        if (this.f1035g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1030a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = p2.f1011b;
                if (abstractComponentCallbacksC0049q != null) {
                    abstractComponentCallbacksC0049q.f1131q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f1011b + " to " + p2.f1011b.f1131q);
                    }
                }
            }
        }
    }

    public final void d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1044r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1043q);
            if (this.f1034f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1034f));
            }
            if (this.f1031b != 0 || this.f1032c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1031b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1032c));
            }
            if (this.d != 0 || this.f1033e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1033e));
            }
            if (this.i != 0 || this.f1036j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1036j);
            }
            if (this.f1037k != 0 || this.f1038l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1037k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1038l);
            }
        }
        ArrayList arrayList = this.f1030a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f1010a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + p2.f1010a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f1011b);
            if (z2) {
                if (p2.d != 0 || p2.f1013e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1013e));
                }
                if (p2.f1014f != 0 || p2.f1015g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1014f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1015g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1044r >= 0) {
            sb.append(" #");
            sb.append(this.f1044r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
