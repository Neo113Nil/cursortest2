package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class ls1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ms1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ms1[i];
    }

    @NotNull
    public final KSerializer serializer() {
        return js1.a;
    }
}
