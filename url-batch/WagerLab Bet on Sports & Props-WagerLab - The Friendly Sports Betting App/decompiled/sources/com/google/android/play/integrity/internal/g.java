package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public final class g extends a implements i {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(Bundle bundle, r rVar) throws RemoteException {
        Parcel a2 = a();
        c.c(a2, bundle);
        a2.writeStrongBinder(rVar);
        b(6, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(Bundle bundle, k kVar) throws RemoteException {
        Parcel a2 = a();
        c.c(a2, bundle);
        a2.writeStrongBinder(kVar);
        b(3, a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void e(Bundle bundle, k kVar) throws RemoteException {
        Parcel a2 = a();
        c.c(a2, bundle);
        a2.writeStrongBinder(kVar);
        b(2, a2);
    }
}
