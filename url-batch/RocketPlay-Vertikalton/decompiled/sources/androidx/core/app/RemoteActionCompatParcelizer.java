package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import q0.AbstractC0334a;
import q0.b;
import q0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0334a abstractC0334a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1822a;
        if (abstractC0334a.e(1)) {
            cVar = abstractC0334a.g();
        }
        remoteActionCompat.f1822a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1823b;
        if (abstractC0334a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0334a).f3855e);
        }
        remoteActionCompat.f1823b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1824c;
        if (abstractC0334a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0334a).f3855e);
        }
        remoteActionCompat.f1824c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0334a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1825e;
        if (abstractC0334a.e(5)) {
            z2 = ((b) abstractC0334a).f3855e.readInt() != 0;
        }
        remoteActionCompat.f1825e = z2;
        boolean z3 = remoteActionCompat.f1826f;
        if (abstractC0334a.e(6)) {
            z3 = ((b) abstractC0334a).f3855e.readInt() != 0;
        }
        remoteActionCompat.f1826f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0334a abstractC0334a) {
        abstractC0334a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1822a;
        abstractC0334a.h(1);
        abstractC0334a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1823b;
        abstractC0334a.h(2);
        Parcel parcel = ((b) abstractC0334a).f3855e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1824c;
        abstractC0334a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0334a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1825e;
        abstractC0334a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1826f;
        abstractC0334a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
