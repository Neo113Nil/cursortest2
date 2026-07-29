package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import o.AbstractC1243iZ;
import o.C1307jZ;
import o.InterfaceC1373kZ;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1243iZ abstractC1243iZ) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1373kZ interfaceC1373kZ = remoteActionCompat.a;
        boolean z = true;
        if (abstractC1243iZ.e(1)) {
            interfaceC1373kZ = abstractC1243iZ.g();
        }
        remoteActionCompat.a = (IconCompat) interfaceC1373kZ;
        CharSequence charSequence = remoteActionCompat.b;
        if (abstractC1243iZ.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1307jZ) abstractC1243iZ).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (abstractC1243iZ.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1307jZ) abstractC1243iZ).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC1243iZ.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (abstractC1243iZ.e(5)) {
            z2 = ((C1307jZ) abstractC1243iZ).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!abstractC1243iZ.e(6)) {
            z = z3;
        } else if (((C1307jZ) abstractC1243iZ).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1243iZ abstractC1243iZ) {
        abstractC1243iZ.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        abstractC1243iZ.h(1);
        abstractC1243iZ.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        abstractC1243iZ.h(2);
        Parcel parcel = ((C1307jZ) abstractC1243iZ).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC1243iZ.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC1243iZ.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        abstractC1243iZ.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        abstractC1243iZ.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
