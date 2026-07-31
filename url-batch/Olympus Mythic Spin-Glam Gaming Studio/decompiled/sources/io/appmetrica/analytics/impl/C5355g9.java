package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5355g9 {
    public final int a;
    public final C5484l9 b;
    public C5407i9 c;

    public C5355g9(C5484l9 c5484l9, int i) {
        this.a = i;
        this.b = c5484l9;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        C5407i9 c5407i9;
        int i;
        int i2;
        byte[] bArr;
        C5484l9 c5484l9 = this.b;
        c5484l9.getClass();
        try {
            bArr = c5484l9.c.get("event_hashes");
        } catch (Throwable unused) {
            C5432j9 c5432j9 = c5484l9.a;
            c5484l9.b.getClass();
            O9 o9 = new O9();
            c5432j9.getClass();
            c5407i9 = new C5407i9(o9.a, o9.b, o9.c, CollectionUtils.hashSetFromIntArray(o9.d));
        }
        if (bArr != null && bArr.length != 0) {
            C5432j9 c5432j92 = c5484l9.a;
            O9 state = c5484l9.b.toState(bArr);
            c5432j92.getClass();
            c5407i9 = new C5407i9(state.a, state.b, state.c, CollectionUtils.hashSetFromIntArray(state.d));
            this.c = c5407i9;
            i = c5407i9.c;
            i2 = this.a;
            if (i == i2) {
                c5407i9.c = i2;
                c5407i9.d = 0;
                C5484l9 c5484l92 = this.b;
                IBinaryDataHelper iBinaryDataHelper = c5484l92.c;
                C5458k9 c5458k9 = c5484l92.b;
                c5484l92.a.getClass();
                iBinaryDataHelper.insert("event_hashes", c5458k9.toByteArray((C5458k9) C5432j9.a(c5407i9)));
                return;
            }
            return;
        }
        C5432j9 c5432j93 = c5484l9.a;
        c5484l9.b.getClass();
        O9 o92 = new O9();
        c5432j93.getClass();
        c5407i9 = new C5407i9(o92.a, o92.b, o92.c, CollectionUtils.hashSetFromIntArray(o92.d));
        this.c = c5407i9;
        i = c5407i9.c;
        i2 = this.a;
        if (i == i2) {
        }
    }
}
