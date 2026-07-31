package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5711u2 extends AbstractC5208ah {
    public final Po b;
    public final C5573ok c;

    public C5711u2(@NonNull C5532n5 c5532n5) {
        this(c5532n5, c5532n5.u(), C5573ok.c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        C5532n5 c5532n5 = this.a;
        if (!this.b.c() && !this.b.d()) {
            if (((C5804xh) c5532n5.k.a()).e) {
                C5573ok c5573ok = this.c;
                synchronized (c5573ok) {
                    c5573ok.b.d(false);
                }
            }
            C5355g9 c5355g9 = this.a.l;
            if (c5355g9.c == null) {
                c5355g9.a();
            }
            C5407i9 c5407i9 = c5355g9.c;
            c5407i9.getClass();
            c5407i9.b = new HashSet();
            c5407i9.d = 0;
            C5407i9 c5407i92 = c5355g9.c;
            c5407i92.a = true;
            C5484l9 c5484l9 = c5355g9.b;
            IBinaryDataHelper iBinaryDataHelper = c5484l9.c;
            C5458k9 c5458k9 = c5484l9.b;
            c5484l9.a.getClass();
            iBinaryDataHelper.insert("event_hashes", c5458k9.toByteArray((C5458k9) C5432j9.a(c5407i92)));
        }
        return false;
    }

    public C5711u2(C5532n5 c5532n5, Po po, C5573ok c5573ok) {
        super(c5532n5);
        this.b = po;
        this.c = c5573ok;
    }
}
