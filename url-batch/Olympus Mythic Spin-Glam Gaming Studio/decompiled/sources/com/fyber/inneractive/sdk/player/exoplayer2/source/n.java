package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.io.EOFException;

/* loaded from: classes6.dex */
public final class n {
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.j b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.i c;

    public n(com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr, com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.a = iVarArr;
        this.b = jVar;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.i a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar = this.c;
        if (iVar != null) {
            return iVar;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr = this.a;
        int length = iVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar2 = iVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                bVar.e = 0;
                throw th;
            }
            if (iVar2.a(bVar)) {
                this.c = iVar2;
                bVar.e = 0;
                break;
            }
            continue;
            bVar.e = 0;
            i++;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i iVar3 = this.c;
        if (iVar3 != null) {
            iVar3.a(this.b);
            return this.c;
        }
        StringBuilder sb = new StringBuilder("None of the available extractors (");
        com.fyber.inneractive.sdk.player.exoplayer2.extractor.i[] iVarArr2 = this.a;
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.a;
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < iVarArr2.length; i3++) {
            sb2.append(iVarArr2[i3].getClass().getSimpleName());
            if (i3 < iVarArr2.length - 1) {
                sb2.append(", ");
            }
        }
        sb.append(sb2.toString());
        sb.append(") could read the stream.");
        throw new a0(sb.toString());
    }
}
