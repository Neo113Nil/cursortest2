package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes4.dex */
public final class c0 extends y {
    public final int a;
    public final int b;

    public c0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "screenSize: { width: " + this.a + ", height: " + this.b + " }";
    }
}
