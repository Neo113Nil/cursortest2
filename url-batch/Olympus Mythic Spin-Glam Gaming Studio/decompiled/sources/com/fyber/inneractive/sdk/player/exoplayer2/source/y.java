package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class y {
    public final int a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] b;
    public int c;

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.b = oVarArr;
        this.a = oVarArr.length;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.b;
            if (i >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && Arrays.equals(this.b, yVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }
}
