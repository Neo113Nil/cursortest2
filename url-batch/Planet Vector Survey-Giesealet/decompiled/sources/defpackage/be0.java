package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class be0 implements Parcelable.ClassLoaderCreator {
    public static ce0 a(Parcel parcel, ClassLoader classLoader) {
        b2 b2Var;
        if (classLoader == null) {
            classLoader = be0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            b2Var = b2.G;
        } else if (readInt == 1) {
            b2Var = b2.M;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            b2Var = b2.K;
        }
        return new ce0(readValue, b2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ce0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
