package Y;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: Y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0039a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1411a;

    /* renamed from: b, reason: collision with root package name */
    public int f1412b;

    /* renamed from: c, reason: collision with root package name */
    public int f1413c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f1414e;

    /* renamed from: f, reason: collision with root package name */
    public int f1415f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1416g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f1417j;

    /* renamed from: k, reason: collision with root package name */
    public int f1418k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f1419l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f1420m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1421n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1422o;

    /* renamed from: p, reason: collision with root package name */
    public final I f1423p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1424q;

    /* renamed from: r, reason: collision with root package name */
    public int f1425r;

    public C0039a(I i) {
        i.C();
        C0058u c0058u = i.f1358t;
        if (c0058u != null) {
            c0058u.f1529b.getClassLoader();
        }
        this.f1411a = new ArrayList();
        this.f1422o = false;
        this.f1425r = -1;
        this.f1423p = i;
    }

    @Override // Y.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1416g) {
            return true;
        }
        I i = this.f1423p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f1411a.add(p2);
        p2.d = this.f1412b;
        p2.f1394e = this.f1413c;
        p2.f1395f = this.d;
        p2.f1396g = this.f1414e;
    }

    public final void c(int i) {
        if (this.f1416g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1411a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0055q abstractComponentCallbacksC0055q = p2.f1392b;
                if (abstractComponentCallbacksC0055q != null) {
                    abstractComponentCallbacksC0055q.f1512q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f1392b + " to " + p2.f1392b.f1512q);
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
            printWriter.print(this.f1425r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1424q);
            if (this.f1415f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1415f));
            }
            if (this.f1412b != 0 || this.f1413c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1412b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1413c));
            }
            if (this.d != 0 || this.f1414e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1414e));
            }
            if (this.i != 0 || this.f1417j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1417j);
            }
            if (this.f1418k != 0 || this.f1419l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1418k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1419l);
            }
        }
        ArrayList arrayList = this.f1411a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f1391a) {
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
                    str2 = "cmd=" + p2.f1391a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f1392b);
            if (z2) {
                if (p2.d != 0 || p2.f1394e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1394e));
                }
                if (p2.f1395f != 0 || p2.f1396g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f1395f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f1396g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1425r >= 0) {
            sb.append(" #");
            sb.append(this.f1425r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
