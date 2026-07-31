package yads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes15.dex */
public final class y93 {
    public final String a;
    public final List b;
    public final byte[] c;

    public y93(int i, String str, ArrayList arrayList, byte[] bArr) {
        this.a = str;
        this.b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
        this.c = bArr;
    }
}
