package sg.bigo.ads.dh;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class c extends n implements Comparable<c> {
    public final int a;

    public c(@NonNull String str, int i) {
        super(str);
        this.a = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull c cVar) {
        return this.a - cVar.a;
    }

    @Override // sg.bigo.ads.dh.n
    public final String toString() {
        return "{\"Content\":\"" + this.b + "\",\"pro_ms\":\"" + this.a + "\"}";
    }
}
