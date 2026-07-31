package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class x extends ObjectInputStream {
    public final List a;

    public x(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Class<?> c = super.resolveClass(desc);
        if (this.a == null || Number.class.isAssignableFrom(c) || Intrinsics.areEqual(String.class, c) || Intrinsics.areEqual(Boolean.class, c) || c.isArray() || this.a.contains(c)) {
            Intrinsics.checkNotNullExpressionValue(c, "c");
            return c;
        }
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Deserialization is not allowed for ");
        a.append(desc.getName());
        throw new IOException(a.toString());
    }
}
