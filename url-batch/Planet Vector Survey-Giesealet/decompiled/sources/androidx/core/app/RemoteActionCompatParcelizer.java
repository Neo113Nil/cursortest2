package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.rz0;
import defpackage.sz0;
import defpackage.tz0;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(rz0 rz0Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        tz0 tz0Var = remoteActionCompat.a;
        boolean z = true;
        if (rz0Var.e(1)) {
            tz0Var = rz0Var.g();
        }
        remoteActionCompat.a = (IconCompat) tz0Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (rz0Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((sz0) rz0Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (rz0Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((sz0) rz0Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) rz0Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (rz0Var.e(5)) {
            z2 = ((sz0) rz0Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!rz0Var.e(6)) {
            z = z3;
        } else if (((sz0) rz0Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, rz0 rz0Var) {
        rz0Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        rz0Var.h(1);
        rz0Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        rz0Var.h(2);
        Parcel parcel = ((sz0) rz0Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        rz0Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        rz0Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        rz0Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        rz0Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
