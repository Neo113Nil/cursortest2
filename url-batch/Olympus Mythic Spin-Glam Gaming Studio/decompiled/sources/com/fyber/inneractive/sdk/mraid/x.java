package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class x extends y {
    public final int a;
    public final int b;

    public x(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "adSize: { width: " + this.a + ", height: " + this.b + " }";
    }
}
