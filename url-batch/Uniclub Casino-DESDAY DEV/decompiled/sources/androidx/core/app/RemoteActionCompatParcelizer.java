package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import m0.AbstractC0270a;
import m0.C0271b;
import m0.InterfaceC0272c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0270a abstractC0270a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0272c interfaceC0272c = remoteActionCompat.f1288a;
        if (abstractC0270a.e(1)) {
            interfaceC0272c = abstractC0270a.g();
        }
        remoteActionCompat.f1288a = (IconCompat) interfaceC0272c;
        CharSequence charSequence = remoteActionCompat.f1289b;
        if (abstractC0270a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0271b) abstractC0270a).f3199e);
        }
        remoteActionCompat.f1289b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1290c;
        if (abstractC0270a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0271b) abstractC0270a).f3199e);
        }
        remoteActionCompat.f1290c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0270a.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1291e;
        if (abstractC0270a.e(5)) {
            z2 = ((C0271b) abstractC0270a).f3199e.readInt() != 0;
        }
        remoteActionCompat.f1291e = z2;
        boolean z3 = remoteActionCompat.f1292f;
        if (abstractC0270a.e(6)) {
            z3 = ((C0271b) abstractC0270a).f3199e.readInt() != 0;
        }
        remoteActionCompat.f1292f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0270a abstractC0270a) {
        abstractC0270a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1288a;
        abstractC0270a.h(1);
        abstractC0270a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1289b;
        abstractC0270a.h(2);
        Parcel parcel = ((C0271b) abstractC0270a).f3199e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1290c;
        abstractC0270a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0270a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1291e;
        abstractC0270a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1292f;
        abstractC0270a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
