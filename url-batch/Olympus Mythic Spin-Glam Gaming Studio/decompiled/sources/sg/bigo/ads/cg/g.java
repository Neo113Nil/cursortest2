package sg.bigo.ads.cg;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.cf.j;
import sg.bigo.ads.common.utils.l;
import sg.bigo.ads.common.utils.s;

/* loaded from: classes14.dex */
public abstract class g {
    public static final long c = s.a.a(30);

    @Nullable
    protected static <T extends a> T a(List<T> list) {
        if (l.a((Collection) list)) {
            return null;
        }
        T t = (T) l.a((List) list);
        if (t != null) {
            t.d = false;
        }
        return t;
    }

    public abstract j a(String str);

    public void a(boolean z) {
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
