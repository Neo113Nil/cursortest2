package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.vH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2080vH implements ParameterizedType, Type {
    public final Class h;
    public final Type i;
    public final Type[] j;

    public C2080vH(Class cls, Type type, ArrayList arrayList) {
        this.h = cls;
        this.i = type;
        this.j = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return AbstractC0048Bt.h(this.h, parameterizedType.getRawType()) && AbstractC0048Bt.h(this.i, parameterizedType.getOwnerType()) && Arrays.equals(this.j, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.j;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.i;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.h;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.h;
        Type type = this.i;
        if (type != null) {
            sb.append(PX.i(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(PX.i(cls));
        }
        Type[] typeArr = this.j;
        if (typeArr.length != 0) {
            P6.n0(typeArr, sb, ", ", "<", ">", "...", C2014uH.j);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode();
        Type type = this.i;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.j);
    }

    public final String toString() {
        return getTypeName();
    }
}
