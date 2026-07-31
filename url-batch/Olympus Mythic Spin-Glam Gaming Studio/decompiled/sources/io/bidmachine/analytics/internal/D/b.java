package io.bidmachine.analytics.internal.D;

import com.explorestack.protobuf.BytesValue;
import io.bidmachine.analytics.internal.C.a;
import io.bidmachine.analytics.internal.I.g;
import io.bidmachine.analytics.internal.g.C5900b;
import io.bidmachine.analytics.internal.g.C5903e;
import java.util.List;

/* loaded from: classes6.dex */
public final class b implements a.InterfaceC1722a {
    private final io.bidmachine.analytics.internal.s.b a;

    public b(io.bidmachine.analytics.internal.s.b bVar) {
        this.a = bVar;
    }

    @Override // io.bidmachine.analytics.internal.C.a.InterfaceC1722a
    public BytesValue a(C5903e.a aVar) {
        List b = this.a.b();
        if (b == null) {
            throw new C5900b("List is null");
        }
        if (b.isEmpty()) {
            throw new C5900b("List is empty");
        }
        if (b.size() >= this.a.a()) {
            return io.bidmachine.analytics.internal.I.d.b(g.a(b).toString());
        }
        throw new C5900b("List size less then limit for send");
    }
}
