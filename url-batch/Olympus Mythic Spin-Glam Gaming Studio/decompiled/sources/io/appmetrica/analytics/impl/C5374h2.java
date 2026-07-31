package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C5374h2 implements ProtobufConverter {
    public final I2 a;

    public C5374h2() {
        this(new I2());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5451k2 fromModel(@NonNull C5348g2 c5348g2) {
        C5451k2 c5451k2 = new C5451k2();
        c5451k2.a = new C5425j2[c5348g2.a.size()];
        int i = 0;
        int i2 = 0;
        for (PermissionState permissionState : c5348g2.a) {
            C5425j2[] c5425j2Arr = c5451k2.a;
            C5425j2 c5425j2 = new C5425j2();
            c5425j2.a = permissionState.name;
            c5425j2.b = permissionState.granted;
            c5425j2Arr[i2] = c5425j2;
            i2++;
        }
        K2 k2 = c5348g2.b;
        if (k2 != null) {
            c5451k2.b = this.a.fromModel(k2);
        }
        c5451k2.c = new String[c5348g2.c.size()];
        Iterator it = c5348g2.c.iterator();
        while (it.hasNext()) {
            c5451k2.c[i] = (String) it.next();
            i++;
        }
        return c5451k2;
    }

    public C5374h2(I2 i2) {
        this.a = i2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5348g2 toModel(@NonNull C5451k2 c5451k2) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            C5425j2[] c5425j2Arr = c5451k2.a;
            if (i2 >= c5425j2Arr.length) {
                break;
            }
            C5425j2 c5425j2 = c5425j2Arr[i2];
            arrayList.add(new PermissionState(c5425j2.a, c5425j2.b));
            i2++;
        }
        C5400i2 c5400i2 = c5451k2.b;
        K2 model = c5400i2 != null ? this.a.toModel(c5400i2) : null;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            String[] strArr = c5451k2.c;
            if (i < strArr.length) {
                arrayList2.add(strArr[i]);
                i++;
            } else {
                return new C5348g2(arrayList, model, arrayList2);
            }
        }
    }
}
