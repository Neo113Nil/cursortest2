package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Qa extends P2 {
    public final Ta b;

    public Qa(int i) {
        this(i, null);
    }

    public int b(@Nullable Object obj) {
        return 0;
    }

    public Qa(int i, @Nullable Ta ta) {
        super(i);
        this.b = ta;
    }

    @Override // io.appmetrica.analytics.impl.P2, io.appmetrica.analytics.impl.Ta
    @NonNull
    public final C5318eo a(@Nullable List<Object> list) {
        int i;
        int i2 = 0;
        if (list == null || (list.size() <= this.a && this.b == null)) {
            i = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i = 0;
            int i3 = 0;
            for (Object obj : list) {
                if (i3 < this.a) {
                    Ta ta = this.b;
                    if (ta != null) {
                        C5318eo a = ta.a(obj);
                        Object obj2 = a.a;
                        i += a.b.getBytesTruncated();
                        Do.a(obj, a.a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i2++;
                    i += b(obj);
                }
                i3++;
            }
            list = arrayList;
        }
        return new C5318eo(list, new E4(i2, i));
    }

    @Nullable
    @VisibleForTesting
    public final Ta b() {
        return this.b;
    }
}
