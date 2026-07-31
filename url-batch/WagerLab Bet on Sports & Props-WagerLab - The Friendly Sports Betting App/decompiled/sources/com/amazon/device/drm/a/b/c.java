package com.amazon.device.drm.a.b;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.drm.model.RequestId;

/* compiled from: KiwiRequestHandler.java */
/* loaded from: classes3.dex */
public class c implements com.amazon.device.drm.a.c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f664a = "c";

    @Override // com.amazon.device.drm.a.c
    public void a(Context context, Intent intent) {
    }

    @Override // com.amazon.device.drm.a.c
    public void a(RequestId requestId) {
        com.amazon.device.drm.a.e.b.a(f664a, "sendGetLicense");
        new com.amazon.device.drm.a.a.b(requestId).e();
    }
}
