package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C5570oh extends AbstractC5208ah {
    public final Re b;
    public final ProtobufStateStorage c;
    public final L2 d;
    public final C5581p2 e;
    public final E2 f;

    public C5570oh(C5532n5 c5532n5, Re re) {
        this(c5532n5, re, ((AbstractC5420in) C5369gn.a(C5348g2.class)).create(c5532n5.getContext()), new L2(c5532n5.getContext()), new C5581p2(), new E2(c5532n5.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5208ah
    public final boolean a(@NonNull C5326f6 c5326f6) {
        C5532n5 c5532n5 = this.a;
        c5532n5.b.toString();
        if (!c5532n5.t.c() || !c5532n5.x()) {
            return false;
        }
        C5348g2 c5348g2 = (C5348g2) this.c.read();
        List list = c5348g2.a;
        K2 k2 = c5348g2.b;
        L2 l2 = this.d;
        l2.getClass();
        C5348g2 c5348g22 = null;
        K2 a = AndroidUtils.isApiAchieved(28) ? H2.a(l2.a, l2.b) : null;
        List list2 = c5348g2.c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f.a, "getting available providers", "location manager", Collections.emptyList(), new D2());
        Re re = this.b;
        Context context = this.a.a;
        re.getClass();
        ArrayList a2 = new C5288dj(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(a2, list)) {
            a2 = null;
        }
        if (a2 != null || !Do.a(k2, a) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (a2 != null) {
                list = a2;
            }
            c5348g22 = new C5348g2(list, a, list3);
        }
        if (c5348g22 != null) {
            E9 e9 = c5532n5.n;
            C5326f6 a3 = C5326f6.a(c5326f6, c5348g22.a, c5348g22.b, this.e, c5348g22.c);
            e9.a(a3, C5470kl.a(e9.c.b(a3), a3.i));
            long currentTimeSeconds = e9.i.currentTimeSeconds();
            e9.k = currentTimeSeconds;
            e9.a.a(currentTimeSeconds);
            this.c.save(c5348g22);
            return false;
        }
        if (!c5532n5.A()) {
            return false;
        }
        E9 e92 = c5532n5.n;
        C5326f6 a4 = C5326f6.a(c5326f6, c5348g2.a, c5348g2.b, this.e, c5348g2.c);
        e92.a(a4, C5470kl.a(e92.c.b(a4), a4.i));
        long currentTimeSeconds2 = e92.i.currentTimeSeconds();
        e92.k = currentTimeSeconds2;
        e92.a.a(currentTimeSeconds2);
        return false;
    }

    public C5570oh(C5532n5 c5532n5, Re re, ProtobufStateStorage protobufStateStorage, L2 l2, C5581p2 c5581p2, E2 e2) {
        super(c5532n5);
        this.b = re;
        this.c = protobufStateStorage;
        this.d = l2;
        this.e = c5581p2;
        this.f = e2;
    }
}
