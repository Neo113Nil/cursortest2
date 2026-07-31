package com.fyber.inneractive.sdk.mraid;

import java.util.Locale;

/* loaded from: classes4.dex */
public final class d0 extends y {
    public final f0 a;

    public d0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "state: '" + this.a.toString().toLowerCase(Locale.US) + "'";
    }
}
