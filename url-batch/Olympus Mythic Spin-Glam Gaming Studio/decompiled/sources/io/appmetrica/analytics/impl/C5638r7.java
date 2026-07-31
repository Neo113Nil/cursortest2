package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C5638r7 {
    public final InterfaceC5198a7 a;
    public final ArrayList b;

    public C5638r7(File file) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        if (file != null) {
            this.a = new Le(file, new C5301e7());
            arrayList.add(new Le(file, new Fe()));
        } else {
            this.a = new C5224b7(new C5301e7());
        }
        arrayList.add(new C5224b7(new Fe()));
    }
}
