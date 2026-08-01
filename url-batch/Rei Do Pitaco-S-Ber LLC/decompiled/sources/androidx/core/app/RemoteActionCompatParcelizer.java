package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.n70;
import defpackage.o70;
import defpackage.p70;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(n70 n70Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        p70 p70Var = remoteActionCompat.a;
        boolean z = true;
        if (n70Var.e(1)) {
            p70Var = n70Var.g();
        }
        remoteActionCompat.a = (IconCompat) p70Var;
        CharSequence charSequence = remoteActionCompat.b;
        if (n70Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((o70) n70Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (n70Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((o70) n70Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) n70Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (n70Var.e(5)) {
            z2 = ((o70) n70Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!n70Var.e(6)) {
            z = z3;
        } else if (((o70) n70Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, n70 n70Var) {
        n70Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        n70Var.h(1);
        n70Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        n70Var.h(2);
        Parcel parcel = ((o70) n70Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        n70Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        n70Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        n70Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        n70Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
