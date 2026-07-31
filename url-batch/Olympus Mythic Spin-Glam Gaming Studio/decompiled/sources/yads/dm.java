package yads;

import java.util.Map;

/* loaded from: classes5.dex */
public final class dm {
    public final boolean a;
    public final boolean b;

    public dm(Map map) {
        String b = xz0.b(map, a11.T);
        if (b != null) {
            Boolean.parseBoolean(b);
        }
        String b2 = xz0.b(map, a11.U);
        boolean parseBoolean = b2 == null ? true : Boolean.parseBoolean(b2);
        String b3 = xz0.b(map, a11.V);
        boolean parseBoolean2 = b3 != null ? Boolean.parseBoolean(b3) : true;
        this.a = parseBoolean;
        this.b = parseBoolean2;
    }
}
