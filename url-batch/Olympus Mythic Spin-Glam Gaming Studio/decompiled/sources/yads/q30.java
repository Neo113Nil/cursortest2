package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes14.dex */
public interface q30 extends n30 {
    long a(v30 v30Var);

    void a(h93 h93Var);

    default Map b() {
        return Collections.emptyMap();
    }

    void close();

    Uri d();
}
