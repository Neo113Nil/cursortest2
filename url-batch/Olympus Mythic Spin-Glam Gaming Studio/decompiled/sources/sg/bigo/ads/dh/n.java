package sg.bigo.ads.dh;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class n {
    private boolean a;
    public final String b;
    public boolean c;
    public boolean d;
    public boolean e;

    public n(@NonNull String str) {
        this.d = false;
        this.a = true;
        this.e = false;
        this.b = str;
    }

    public n(@NonNull String str, byte b) {
        this(str);
        this.d = true;
    }

    public String toString() {
        return "{\"Content\":\"" + this.b + "\"}";
    }
}
