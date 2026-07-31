package com.my.target;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class mh extends w {
    private mh() {
    }

    public static mh a() {
        return new mh();
    }

    @Override // com.my.target.w
    public nh a(nh nhVar, n nVar, s sVar) {
        gh c = nhVar.c();
        if (c == null) {
            jb b = nhVar.b();
            if (b == null || !b.b()) {
                sVar.b(q.r);
                return null;
            }
        } else {
            e a = c.a();
            if (a != null) {
                b6.b(a.g()).c();
                return nhVar;
            }
        }
        return nhVar;
    }
}
