package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class d0 {
    public final String a;
    public final List b;
    public final byte[] c;

    public d0(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.a = str;
        this.b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.c = bArr;
    }
}
