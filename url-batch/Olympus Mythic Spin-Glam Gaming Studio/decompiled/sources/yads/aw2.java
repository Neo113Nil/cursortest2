package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;

/* loaded from: classes15.dex */
public final class aw2 implements Runnable {
    public final /* synthetic */ hn1 b;
    public final /* synthetic */ CustomizableMediaView c;
    public final /* synthetic */ dn1 d;

    public aw2(hn1 hn1Var, CustomizableMediaView customizableMediaView, dn1 dn1Var) {
        this.b = hn1Var;
        this.c = customizableMediaView;
        this.d = dn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.c, this.d);
    }
}
