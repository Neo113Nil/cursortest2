package com.my.target;

import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class pg {
    final List a;
    final th b;

    private pg(List list, th thVar) {
        this.a = list;
        this.b = thVar;
    }

    public static pg a(List list, th thVar) {
        return new pg(list, thVar);
    }

    public th b() {
        return this.b;
    }

    public List a() {
        return this.a;
    }
}
