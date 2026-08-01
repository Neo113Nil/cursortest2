package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import g1.f;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084a implements Parcelable {
    public static final Parcelable.Creator<C0084a> CREATOR = new C0.b(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1727a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1728b;

    public C0084a(Intent intent, int i) {
        this.f1727a = i;
        this.f1728b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1727a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1728b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f.e(parcel, "dest");
        parcel.writeInt(this.f1727a);
        Intent intent = this.f1728b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
