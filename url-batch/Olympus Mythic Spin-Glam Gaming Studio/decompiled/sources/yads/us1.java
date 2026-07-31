package yads;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class us1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new vs1(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new vs1[i];
    }

    @NotNull
    public final KSerializer serializer() {
        return ss1.a;
    }
}
