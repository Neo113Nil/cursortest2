package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class oq extends r implements nq, Serializable {
    public final Enum[] d;

    public oq(Enum[] enumArr) {
        enumArr.getClass();
        this.d = enumArr;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.length;
    }

    @Override // defpackage.i, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        Enum[] enumArr = this.d;
        enumArr.getClass();
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.d;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        g8.m(y6.v("index: ", i, ", size: ", length));
        return null;
    }

    @Override // defpackage.r, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.d;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.r, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.d;
        enumArr.getClass();
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4) {
            return ordinal;
        }
        return -1;
    }
}
