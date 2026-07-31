package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.bd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C5230bd {
    public static final SparseArray c;
    public final String a;
    public final String b;

    static {
        SparseArray sparseArray = new SparseArray();
        c = sparseArray;
        EnumC5798xb enumC5798xb = EnumC5798xb.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C5230bd("jvm", "binder"));
        sparseArray.put(5890, new C5230bd("jvm", "file"));
        sparseArray.put(5889, new C5230bd("jvm", "file"));
        sparseArray.put(5897, new C5230bd("jni_native", "file"));
        sparseArray.put(5898, new C5230bd("jni_native", "file"));
    }

    public C5230bd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
