package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class wl1 implements nq {
    public static final mq h;
    public final String b;
    public final rl1 c;
    public final ql1 d;
    public final am1 e;
    public final nl1 f;
    public final tl1 g;

    static {
        ll1 ll1Var = new ll1();
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        Collections.emptyList();
        tl1 tl1Var = tl1.d;
        new nl1(ll1Var);
        new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);
        am1 am1Var = am1.H;
        h = new mq() { // from class: yads.wl1$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return wl1.a(bundle);
            }
        };
    }

    public wl1(String str, nl1 nl1Var, rl1 rl1Var, ql1 ql1Var, am1 am1Var, tl1 tl1Var) {
        this.b = str;
        this.c = rl1Var;
        this.d = ql1Var;
        this.e = am1Var;
        this.f = nl1Var;
        this.g = tl1Var;
    }

    public static wl1 a(String str) {
        ll1 ll1Var = new ll1();
        i41 i41Var = l41.c;
        um2 um2Var = um2.f;
        List emptyList = Collections.emptyList();
        um2 um2Var2 = um2.f;
        tl1 tl1Var = tl1.d;
        Uri parse = str == null ? null : Uri.parse(str);
        return new wl1("", new nl1(ll1Var), parse != null ? new rl1(parse, null, emptyList, null, um2Var2) : null, new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), am1.H, tl1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl1)) {
            return false;
        }
        wl1 wl1Var = (wl1) obj;
        return sb3.a(this.b, wl1Var.b) && this.f.equals(wl1Var.f) && sb3.a(this.c, wl1Var.c) && sb3.a(this.d, wl1Var.d) && sb3.a(this.e, wl1Var.e) && sb3.a(this.g, wl1Var.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        rl1 rl1Var = this.c;
        return this.g.hashCode() + ((this.e.hashCode() + ((this.f.hashCode() + ((this.d.hashCode() + ((hashCode + (rl1Var != null ? rl1Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public static wl1 a(Bundle bundle) {
        ql1 ql1Var;
        am1 am1Var;
        nl1 nl1Var;
        tl1 tl1Var;
        String string = bundle.getString(Integer.toString(0, 36), "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        if (bundle2 == null) {
            ql1Var = ql1.g;
        } else {
            ql1Var = (ql1) ql1.h.a(bundle2);
        }
        ql1 ql1Var2 = ql1Var;
        Bundle bundle3 = bundle.getBundle(Integer.toString(2, 36));
        if (bundle3 == null) {
            am1Var = am1.H;
        } else {
            am1Var = (am1) am1.I.a(bundle3);
        }
        am1 am1Var2 = am1Var;
        Bundle bundle4 = bundle.getBundle(Integer.toString(3, 36));
        if (bundle4 == null) {
            nl1Var = nl1.h;
        } else {
            nl1Var = (nl1) ml1.g.a(bundle4);
        }
        nl1 nl1Var2 = nl1Var;
        Bundle bundle5 = bundle.getBundle(Integer.toString(4, 36));
        if (bundle5 == null) {
            tl1Var = tl1.d;
        } else {
            tl1Var = (tl1) tl1.e.a(bundle5);
        }
        return new wl1(string, nl1Var2, null, ql1Var2, am1Var2, tl1Var);
    }
}
