package sg.bigo.ads.cs;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public final class e extends g {
    public e(@NonNull sg.bigo.ads.cr.a aVar) {
        super(aVar);
    }

    @Override // sg.bigo.ads.cs.g
    protected final int a() {
        return this.a.e;
    }

    @Override // sg.bigo.ads.cs.g
    protected final List<sg.bigo.ads.av.b> b() {
        return sg.bigo.ads.aw.b.a(this.a.e, "impression", "clicked", true);
    }
}
