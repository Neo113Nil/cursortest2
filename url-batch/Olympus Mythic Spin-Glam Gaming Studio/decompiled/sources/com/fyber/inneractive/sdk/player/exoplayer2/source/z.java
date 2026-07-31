package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class z {
    public static final /* synthetic */ int d = 0;
    public final int a;
    public final y[] b;
    public int c;

    static {
        new z(new y[0]);
    }

    public z(y... yVarArr) {
        this.b = yVarArr;
        this.a = yVarArr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && Arrays.equals(this.b, zVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b);
        }
        return this.c;
    }
}
