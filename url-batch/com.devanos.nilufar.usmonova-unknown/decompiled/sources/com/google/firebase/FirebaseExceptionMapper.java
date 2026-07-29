package com.google.firebase;

import com.google.android.gms.common.api.Status;
import o.MT;

/* loaded from: classes.dex */
public class FirebaseExceptionMapper implements MT {
    @Override // o.MT
    public final Exception getException(Status status) {
        return status.h == 8 ? new FirebaseException(status.a()) : new FirebaseApiNotAvailableException(status.a());
    }
}
