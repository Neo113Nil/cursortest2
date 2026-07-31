package sg.bigo.ads.an;

import android.graphics.Point;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes5.dex */
public final class i {
    public Point a;
    public Point b;

    public i() {
    }

    public i(Point point, Point point2) {
        this.a = point;
        this.b = point2;
    }

    public final String a() {
        if (this.b == null) {
            return "";
        }
        return this.b.x + StringUtils.COMMA + this.b.y;
    }
}
