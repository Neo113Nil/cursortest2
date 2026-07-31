package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class e {
    public final String a;
    public final boolean b;

    public e(boolean z, String str) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != e.class) {
            return false;
        }
        e eVar = (e) obj;
        return TextUtils.equals(this.a, eVar.a) && this.b == eVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
    }
}
