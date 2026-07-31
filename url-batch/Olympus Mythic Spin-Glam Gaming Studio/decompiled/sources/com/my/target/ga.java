package com.my.target;

import com.my.target.core.ui.views.promo.style2.cards.a;
import com.my.target.ja;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class ga implements ja, a.InterfaceC1682a {
    private final com.my.target.core.ui.views.promo.style2.cards.a a;
    private final ja.a b;
    private final boolean[] c;
    private final List d = new ArrayList();
    private final List e;

    private ga(com.my.target.core.ui.views.promo.style2.cards.a aVar, List list, ja.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
        this.e = new ArrayList(list);
        this.c = new boolean[list.size()];
        aVar.setListener(this);
    }

    public static ja a(com.my.target.core.ui.views.promo.style2.cards.a aVar, List list, ja.a aVar2) {
        return new ga(aVar, list, aVar2);
    }

    @Override // com.my.target.ba.a
    public void a(b bVar, boolean z, int i, int i2, n2 n2Var) {
        if (!this.a.b(i)) {
            this.a.a(i);
        } else if (z) {
            this.b.a(bVar, i2, n2Var);
        }
    }

    @Override // com.my.target.ba.a
    public void a(b bVar) {
        if (this.d.contains(bVar)) {
            return;
        }
        this.b.a(bVar);
        this.d.add(bVar);
    }

    @Override // com.my.target.core.ui.views.promo.style2.cards.a.InterfaceC1682a
    public void a(int[] iArr) {
        for (int i : iArr) {
            if (i >= 0) {
                boolean[] zArr = this.c;
                if (i < zArr.length && !zArr[i]) {
                    zArr[i] = true;
                    this.b.b((b) this.e.get(i));
                }
            }
        }
    }
}
