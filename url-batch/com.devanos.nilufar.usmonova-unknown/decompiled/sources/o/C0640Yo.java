package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.Yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0640Yo implements Parcelable {
    public static final Parcelable.Creator<C0640Yo> CREATOR = new J1(5);
    public ArrayList h;
    public ArrayList i;
    public R7[] j;
    public int k;
    public String l;
    public ArrayList m;
    public ArrayList n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f134o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.h);
        parcel.writeStringList(this.i);
        parcel.writeTypedArray(this.j, i);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeStringList(this.m);
        parcel.writeTypedList(this.n);
        parcel.writeTypedList(this.f134o);
    }
}
