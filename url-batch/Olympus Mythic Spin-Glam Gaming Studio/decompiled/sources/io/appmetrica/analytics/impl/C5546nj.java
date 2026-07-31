package io.appmetrica.analytics.impl;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.nj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C5546nj extends AbstractC5208ah {
    public C5546nj(@NotNull C5532n5 c5532n5) {
        super(c5532n5);
        c5532n5.a().a();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NotNull C5326f6 c5326f6) {
        Object remove;
        for (Map.Entry entry : c5326f6.p.entrySet()) {
            C5238bl c5238bl = this.a.u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                c5238bl.getClass();
                if (bArr.length != 0) {
                    remove = c5238bl.b.put(str, bArr);
                    C5341fl c5341fl = c5238bl.a;
                    c5341fl.d.insert(c5341fl.a, c5341fl.c.toByteArray((C5315el) c5341fl.b.fromModel(c5238bl.b)));
                }
            }
            remove = c5238bl.b.remove(str);
            C5341fl c5341fl2 = c5238bl.a;
            c5341fl2.d.insert(c5341fl2.a, c5341fl2.c.toByteArray((C5315el) c5341fl2.b.fromModel(c5238bl.b)));
        }
        return true;
    }
}
