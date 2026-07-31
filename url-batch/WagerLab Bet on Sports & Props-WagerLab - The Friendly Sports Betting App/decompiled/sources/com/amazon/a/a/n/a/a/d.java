package com.amazon.a.a.n.a.a;

import android.os.DeadObjectException;
import android.os.RemoteException;

/* compiled from: CommandServiceRemoteException.java */
/* loaded from: classes3.dex */
public class d extends com.amazon.a.a.d.b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f555a = 1;

    public d(RemoteException remoteException) {
        super(a(remoteException));
    }

    private static String a(RemoteException remoteException) {
        if (remoteException instanceof DeadObjectException) {
            return "COMMAND_SERVICE_DEAD_OBJECT_EXCEPTION";
        }
        return "COMMAND_SERVICE_REMOTE_EXCEPTION";
    }
}
