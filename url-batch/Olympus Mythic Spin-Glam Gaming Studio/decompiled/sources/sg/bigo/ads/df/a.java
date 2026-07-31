package sg.bigo.ads.df;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.r;

/* loaded from: classes3.dex */
public final class a extends b {
    public AtomicBoolean a;
    private AtomicBoolean p;

    public a(r rVar, e[] eVarArr, e[] eVarArr2, e[] eVarArr3, e[] eVarArr4, Map<String, String> map) {
        super(rVar, eVarArr, eVarArr2, eVarArr3, eVarArr4, map);
        this.a = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
    }

    public final void a(Context context) {
        if (this.a.compareAndSet(false, true)) {
            super.a(context, 0);
        }
    }
}
