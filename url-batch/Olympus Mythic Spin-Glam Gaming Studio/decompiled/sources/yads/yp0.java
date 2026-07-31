package yads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes3.dex */
public interface yp0 {
    static {
        new yp0() { // from class: yads.yp0$$ExternalSyntheticLambda0
            @Override // yads.yp0
            public final tp0[] a() {
                return yp0.lambda$static$0();
            }
        };
    }

    static /* synthetic */ tp0[] lambda$static$0() {
        return new tp0[0];
    }

    tp0[] a();

    default tp0[] a(Uri uri, Map map) {
        return a();
    }
}
