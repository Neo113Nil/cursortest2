package o;

import android.os.Parcel;

/* renamed from: o.Cc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057Cc extends RuntimeException {
    public C0057Cc(String str, Parcel parcel) {
        super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
    }

    public C0057Cc() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
