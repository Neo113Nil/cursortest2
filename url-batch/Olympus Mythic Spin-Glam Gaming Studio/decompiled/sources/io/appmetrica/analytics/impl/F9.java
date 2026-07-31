package io.appmetrica.analytics.impl;

import java.util.LinkedList;

/* loaded from: classes10.dex */
public final class F9 extends AbstractC5207ag {
    public final C5856zh a;
    public final Bh b;
    public final C5544nh c;

    public F9(C5532n5 c5532n5) {
        this.a = new C5856zh(c5532n5);
        this.b = new Bh(c5532n5);
        this.c = new C5544nh(c5532n5);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5207ag
    public final AbstractC5615q9 a(int i) {
        LinkedList linkedList = new LinkedList();
        int ordinal = EnumC5798xb.a(i).ordinal();
        if (ordinal == 1) {
            linkedList.add(this.a);
        } else if (ordinal == 3) {
            linkedList.add(this.c);
        } else if (ordinal == 27) {
            linkedList.add(this.b);
            linkedList.add(this.a);
        }
        return new C5588p9(linkedList);
    }
}
