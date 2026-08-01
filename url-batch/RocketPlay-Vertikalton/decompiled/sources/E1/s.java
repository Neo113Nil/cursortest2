package E1;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class s {
    public static int a(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(AbstractC0001b.d(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }
}
