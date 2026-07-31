package com.fyber.inneractive.sdk.mraid;

/* loaded from: classes3.dex */
public final class z extends y {
    public final int a;
    public final int b;
    public final int d = 0;
    public final int c = 0;

    public z(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "currentPosition: { x: " + this.c + ", y: " + this.d + ", width: " + this.a + ", height: " + this.b + " }";
    }
}
