package X;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f877a;

    /* renamed from: b, reason: collision with root package name */
    public int f878b;

    /* renamed from: c, reason: collision with root package name */
    public int f879c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f880e;

    /* renamed from: f, reason: collision with root package name */
    public int f881f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f882g;
    public String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f883j;

    /* renamed from: k, reason: collision with root package name */
    public int f884k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f885l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f886m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f887n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f888o;

    /* renamed from: p, reason: collision with root package name */
    public final I f889p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f890q;

    /* renamed from: r, reason: collision with root package name */
    public int f891r;

    public C0033a(I i) {
        i.C();
        C0052u c0052u = i.f824t;
        if (c0052u != null) {
            c0052u.f995f.getClassLoader();
        }
        this.f877a = new ArrayList();
        this.f888o = false;
        this.f891r = -1;
        this.f889p = i;
    }

    @Override // X.G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f882g) {
            return true;
        }
        I i = this.f889p;
        if (i.d == null) {
            i.d = new ArrayList();
        }
        i.d.add(this);
        return true;
    }

    public final void b(P p2) {
        this.f877a.add(p2);
        p2.d = this.f878b;
        p2.f860e = this.f879c;
        p2.f861f = this.d;
        p2.f862g = this.f880e;
    }

    public final void c(int i) {
        if (this.f882g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f877a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                P p2 = (P) arrayList.get(i2);
                AbstractComponentCallbacksC0049q abstractComponentCallbacksC0049q = p2.f858b;
                if (abstractComponentCallbacksC0049q != null) {
                    abstractComponentCallbacksC0049q.f978q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p2.f858b + " to " + p2.f858b.f978q);
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
            printWriter.print(this.f891r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f890q);
            if (this.f881f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f881f));
            }
            if (this.f878b != 0 || this.f879c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f878b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f879c));
            }
            if (this.d != 0 || this.f880e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f880e));
            }
            if (this.i != 0 || this.f883j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f883j);
            }
            if (this.f884k != 0 || this.f885l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f884k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f885l);
            }
        }
        ArrayList arrayList = this.f877a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            P p2 = (P) arrayList.get(i);
            switch (p2.f857a) {
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
                    str2 = "cmd=" + p2.f857a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p2.f858b);
            if (z2) {
                if (p2.d != 0 || p2.f860e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p2.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f860e));
                }
                if (p2.f861f != 0 || p2.f862g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p2.f861f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p2.f862g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f891r >= 0) {
            sb.append(" #");
            sb.append(this.f891r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
