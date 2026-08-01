package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q0.AbstractC0323a;
import q0.C0324b;
import q0.InterfaceC0325c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0323a abstractC0323a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0325c interfaceC0325c = remoteActionCompat.f1437a;
        if (abstractC0323a.e(1)) {
            interfaceC0325c = abstractC0323a.g();
        }
        remoteActionCompat.f1437a = (IconCompat) interfaceC0325c;
        CharSequence charSequence = remoteActionCompat.f1438b;
        if (abstractC0323a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0324b) abstractC0323a).f3470e);
        }
        remoteActionCompat.f1438b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1439c;
        if (abstractC0323a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0324b) abstractC0323a).f3470e);
        }
        remoteActionCompat.f1439c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0323a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1440e;
        if (abstractC0323a.e(5)) {
            z2 = ((C0324b) abstractC0323a).f3470e.readInt() != 0;
        }
        remoteActionCompat.f1440e = z2;
        boolean z3 = remoteActionCompat.f1441f;
        if (abstractC0323a.e(6)) {
            z3 = ((C0324b) abstractC0323a).f3470e.readInt() != 0;
        }
        remoteActionCompat.f1441f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0323a abstractC0323a) {
        abstractC0323a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1437a;
        abstractC0323a.h(1);
        abstractC0323a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1438b;
        abstractC0323a.h(2);
        Parcel parcel = ((C0324b) abstractC0323a).f3470e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1439c;
        abstractC0323a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0323a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1440e;
        abstractC0323a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1441f;
        abstractC0323a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
