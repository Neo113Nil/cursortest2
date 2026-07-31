package com.my.target;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class hd extends x {
    private final ArrayList b = new ArrayList();
    private long c;

    private hd() {
    }

    public static hd f() {
        return new hd();
    }

    public void a(sc scVar) {
        this.b.add(scVar);
    }

    public List c() {
        return new ArrayList(this.b);
    }

    public sc d() {
        if (this.b.size() > 0) {
            return (sc) this.b.get(0);
        }
        return null;
    }

    public long e() {
        return this.c;
    }

    @Override // com.my.target.x
    public int a() {
        return this.b.size();
    }

    public void a(long j) {
        this.c = j;
    }
}
