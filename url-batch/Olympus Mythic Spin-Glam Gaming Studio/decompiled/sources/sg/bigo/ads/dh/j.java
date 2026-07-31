package sg.bigo.ads.dh;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class j extends n {
    public boolean a;

    public j(@NonNull String str, boolean z) {
        super(str);
        this.a = z;
    }

    @Override // sg.bigo.ads.dh.n
    public final String toString() {
        return "{\"Content\":\"" + this.b + "\",\"mute\":\"" + this.a + "\"}";
    }
}
