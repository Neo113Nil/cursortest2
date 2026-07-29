package o;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q7 implements InterfaceC0510To {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f88o;
    public final AbstractC0588Wo p;
    public boolean q;
    public int r;

    public Q7(AbstractC0588Wo abstractC0588Wo) {
        abstractC0588Wo.G();
        C0173Go c0173Go = abstractC0588Wo.v;
        if (c0173Go != null) {
            c0173Go.s.getClassLoader();
        }
        this.a = new ArrayList();
        this.f88o = false;
        this.r = -1;
        this.p = abstractC0588Wo;
    }

    @Override // o.InterfaceC0510To
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.p.d.add(this);
        return true;
    }

    public final void b(C1258ip c1258ip) {
        this.a.add(c1258ip);
        c1258ip.d = this.b;
        c1258ip.e = this.c;
        c1258ip.f = this.d;
        c1258ip.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (AbstractC0588Wo.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1258ip c1258ip = (C1258ip) arrayList.get(i2);
                AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = c1258ip.b;
                if (abstractComponentCallbacksC0069Co != null) {
                    abstractComponentCallbacksC0069Co.y += i;
                    if (AbstractC0588Wo.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1258ip.b + " to " + c1258ip.b.y);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.q) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0588Wo.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C1087gB());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        AbstractC0588Wo abstractC0588Wo = this.p;
        if (z2) {
            this.r = abstractC0588Wo.j.getAndIncrement();
        } else {
            this.r = -1;
        }
        abstractC0588Wo.y(this, z);
        return this.r;
    }

    public final void e(int i, AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co, String str) {
        String str2 = abstractComponentCallbacksC0069Co.R;
        if (str2 != null) {
            AbstractC1193hp.c(abstractComponentCallbacksC0069Co, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0069Co.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0069Co.F;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0069Co + ": was " + abstractComponentCallbacksC0069Co.F + " now " + str);
            }
            abstractComponentCallbacksC0069Co.F = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0069Co + " with tag " + str + " to container view with no id");
            }
            int i2 = abstractComponentCallbacksC0069Co.D;
            if (i2 != 0 && i2 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0069Co + ": was " + abstractComponentCallbacksC0069Co.D + " now " + i);
            }
            abstractComponentCallbacksC0069Co.D = i;
            abstractComponentCallbacksC0069Co.E = i;
        }
        b(new C1258ip(1, abstractComponentCallbacksC0069Co));
        abstractComponentCallbacksC0069Co.z = this.p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1258ip c1258ip = (C1258ip) arrayList.get(i);
            switch (c1258ip.a) {
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
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
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
                    str2 = "cmd=" + c1258ip.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1258ip.b);
            if (z) {
                if (c1258ip.d != 0 || c1258ip.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1258ip.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1258ip.e));
                }
                if (c1258ip.f != 0 || c1258ip.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1258ip.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1258ip.g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
