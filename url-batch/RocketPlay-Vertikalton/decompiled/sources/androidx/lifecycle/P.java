package androidx.lifecycle;

import b0.C0091c;

/* loaded from: classes.dex */
public interface P {
    default O a(Class cls, C0091c c0091c) {
        return b(cls);
    }

    default O b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
