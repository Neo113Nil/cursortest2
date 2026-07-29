package o;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class VA implements OT {
    public static final String d;
    public static final MA e;
    public final IR a;
    public final C0460Rq b;
    public final String c;

    static {
        String substring;
        String canonicalName = VA.class.getCanonicalName();
        AbstractC0048Bt.n(canonicalName, "<this>");
        int L = UT.L(canonicalName, ".");
        if (L == -1) {
            substring = "";
        } else {
            substring = canonicalName.substring(0, L);
            AbstractC0048Bt.m(substring, "substring(...)");
        }
        d = substring;
        e = new MA("NO_LOCKS", HO.t);
    }

    public VA(String str) {
        this(str, new Y1(20, new ReentrantLock()));
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!stackTrace[i].getClassName().startsWith(d)) {
                break;
            } else {
                i++;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
    }

    public final SA a(InterfaceC1455lp interfaceC1455lp) {
        return new SA(this, interfaceC1455lp);
    }

    public final PA b(InterfaceC2114vp interfaceC2114vp) {
        return new PA(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC2114vp, 1);
    }

    public final TA c(InterfaceC2114vp interfaceC2114vp) {
        return new TA(this, new ConcurrentHashMap(3, 1.0f, 2), interfaceC2114vp);
    }

    public C0260Jx d(Object obj, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return AbstractC1888sN.l(sb, this.c, ")");
    }

    public VA(String str, IR ir) {
        C0460Rq c0460Rq = C0460Rq.M;
        this.a = ir;
        this.b = c0460Rq;
        this.c = str;
    }
}
