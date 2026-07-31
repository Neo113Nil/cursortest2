package yads;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class i extends y {
    private static final long serialVersionUID = 6588350623831699109L;

    public i(Map map) {
        super(map);
    }

    @Override // yads.b0
    public final m a() {
        m mVar = this.d;
        if (mVar != null) {
            return mVar;
        }
        m b = ((gy1) this).b();
        this.d = b;
        return b;
    }
}
