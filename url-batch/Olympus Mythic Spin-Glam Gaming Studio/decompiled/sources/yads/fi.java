package yads;

import android.view.View;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class fi {
    public final int[] a = new int[2];
    public final int[] b = new int[2];

    public final String a(View view, View view2) {
        if (!view.isAttachedToWindow() || !view2.isAttachedToWindow()) {
            return null;
        }
        view.getLocationInWindow(this.a);
        view2.getLocationInWindow(this.b);
        int[] iArr = this.a;
        int i = iArr[0];
        int[] iArr2 = this.b;
        String a = cm.a("{" + (i - iArr2[0]) + ", " + (iArr[1] - iArr2[1]) + ", " + view.getWidth() + ", " + view.getHeight() + "}");
        if (a == null) {
            return null;
        }
        return URLEncoder.encode(a, StandardCharsets.UTF_8.toString());
    }
}
