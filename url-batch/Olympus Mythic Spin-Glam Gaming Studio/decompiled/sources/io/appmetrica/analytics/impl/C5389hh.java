package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5389hh extends AbstractC5208ah {
    public final C5355g9 b;

    public C5389hh(@NonNull C5532n5 c5532n5) {
        this(c5532n5, c5532n5.j());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        Aa aa;
        if (!StringUtils.isNullOrEmpty(c5326f6.getName())) {
            C5355g9 c5355g9 = this.b;
            String name = c5326f6.getName();
            if (c5355g9.c == null) {
                c5355g9.a();
            }
            int hashCode = name.hashCode();
            if (c5355g9.c.b.contains(Integer.valueOf(hashCode))) {
                aa = Aa.NON_FIRST_OCCURENCE;
            } else {
                C5407i9 c5407i9 = c5355g9.c;
                Aa aa2 = c5407i9.a ? Aa.FIRST_OCCURRENCE : Aa.UNKNOWN;
                if (c5407i9.d < 1000) {
                    c5407i9.b.add(Integer.valueOf(hashCode));
                    c5407i9.d++;
                } else {
                    c5407i9.a = false;
                }
                C5484l9 c5484l9 = c5355g9.b;
                C5407i9 c5407i92 = c5355g9.c;
                IBinaryDataHelper iBinaryDataHelper = c5484l9.c;
                C5458k9 c5458k9 = c5484l9.b;
                c5484l9.a.getClass();
                iBinaryDataHelper.insert("event_hashes", c5458k9.toByteArray((C5458k9) C5432j9.a(c5407i92)));
                aa = aa2;
            }
            c5326f6.k = aa;
        }
        return false;
    }

    public C5389hh(C5532n5 c5532n5, C5355g9 c5355g9) {
        super(c5532n5);
        this.b = c5355g9;
    }
}
