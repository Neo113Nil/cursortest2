package sg.bigo.ads.aj;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.b;

/* loaded from: classes12.dex */
public abstract class g<T extends Ad, U extends sg.bigo.ads.api.core.b> extends i<T, U> {
    public int b;
    public boolean c;

    public g(sg.bigo.ads.api.b bVar) {
        super(bVar);
        this.c = false;
    }

    public abstract int h();

    public abstract int i();

    public abstract int j();
}
