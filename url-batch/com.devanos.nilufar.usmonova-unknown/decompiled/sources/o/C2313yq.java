package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* renamed from: o.yq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313yq implements GenericArrayType, Type {
    public final Type h;

    public C2313yq(Type type) {
        AbstractC0048Bt.n(type, "elementType");
        this.h = type;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return AbstractC0048Bt.h(this.h, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.h;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return PX.i(this.h) + "[]";
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
