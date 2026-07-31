package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5233bg implements Converter {
    public final Ne a;
    public final Sf b;
    public final C3 c;
    public final C5285dg d;
    public final Sa e;
    public final Sa f;

    public C5233bg() {
        this(new Ne(), new Sf(), new C3(), new C5285dg(), new Sa(100), new Sa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull C5259cg c5259cg) {
        Qi qi;
        Qi qi2;
        Qi qi3;
        Qi qi4;
        G8 g8 = new G8();
        C5318eo a = this.e.a(c5259cg.a);
        g8.a = StringUtils.getUTF8Bytes((String) a.a);
        C5318eo a2 = this.f.a(c5259cg.b);
        g8.b = StringUtils.getUTF8Bytes((String) a2.a);
        List<String> list = c5259cg.c;
        Qi qi5 = null;
        if (list != null) {
            qi = this.c.fromModel(list);
            g8.c = (C5821y8) qi.a;
        } else {
            qi = null;
        }
        Map<String, String> map = c5259cg.d;
        if (map != null) {
            qi2 = this.a.fromModel(map);
            g8.d = (E8) qi2.a;
        } else {
            qi2 = null;
        }
        Uf uf = c5259cg.e;
        if (uf != null) {
            qi3 = this.b.fromModel(uf);
            g8.e = (F8) qi3.a;
        } else {
            qi3 = null;
        }
        Uf uf2 = c5259cg.f;
        if (uf2 != null) {
            qi4 = this.b.fromModel(uf2);
            g8.f = (F8) qi4.a;
        } else {
            qi4 = null;
        }
        List<String> list2 = c5259cg.g;
        if (list2 != null) {
            qi5 = this.d.fromModel(list2);
            g8.g = (H8[]) qi5.a;
        }
        return new Qi(g8, new C5609q3(C5609q3.b(a, a2, qi, qi2, qi3, qi4, qi5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5233bg(Ne ne, Sf sf, C3 c3, C5285dg c5285dg, Sa sa, Sa sa2) {
        this.a = ne;
        this.b = sf;
        this.c = c3;
        this.d = c5285dg;
        this.e = sa;
        this.f = sa2;
    }

    @NonNull
    public final C5259cg a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
