package com.ogury.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
/* loaded from: classes4.dex */
public final class d implements IInterface {
    public final IBinder a;
    public final String b;

    public d(IBinder binder, String descriptor) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.a = binder;
        this.b = descriptor;
    }

    public final String a() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            obtain.writeInterfaceToken(this.b);
            this.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            if (readString == null) {
                readString = "";
            }
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    public final boolean b() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            obtain.writeInterfaceToken(this.b);
            obtain.writeInt(1);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
