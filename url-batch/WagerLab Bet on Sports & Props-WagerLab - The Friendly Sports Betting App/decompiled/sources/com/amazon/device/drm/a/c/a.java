package com.amazon.device.drm.a.c;

import com.amazon.device.drm.model.LicenseResponse;
import com.amazon.device.drm.model.RequestId;

/* compiled from: LicenseResponseBuilder.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private RequestId f665a;
    private LicenseResponse.RequestStatus b;

    public LicenseResponse a() {
        return new LicenseResponse(this);
    }

    public a a(RequestId requestId) {
        this.f665a = requestId;
        return this;
    }

    public a a(LicenseResponse.RequestStatus requestStatus) {
        this.b = requestStatus;
        return this;
    }

    public RequestId b() {
        return this.f665a;
    }

    public LicenseResponse.RequestStatus c() {
        return this.b;
    }
}
