package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.TM;
import o.ZM;

/* loaded from: classes.dex */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i) {
        int r = ZM.r(parcel, 20293);
        ZM.n(parcel, 2, remoteMessage.bundle);
        ZM.s(parcel, r);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage createFromParcel(Parcel parcel) {
        int E = TM.E(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < E) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                TM.D(parcel, readInt);
            } else {
                bundle = TM.o(parcel, readInt);
            }
        }
        TM.s(parcel, E);
        return new RemoteMessage(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
