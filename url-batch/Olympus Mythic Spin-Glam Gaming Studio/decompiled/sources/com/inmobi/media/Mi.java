package com.inmobi.media;

import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class Mi extends AbstractC4483y implements Bj, InterfaceC4009g {
    public final Sc b;
    public final C4456x c;
    public final PublisherCallbacks d;
    public final Ej e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mi(Sc adUnit, C4456x adComponent, PublisherCallbacks publisherCallbacks, Ej stateMachine) {
        super(adComponent);
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = adUnit;
        this.c = adComponent;
        this.d = publisherCallbacks;
        this.e = stateMachine;
    }

    @Override // com.inmobi.media.Bj
    public final void a() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-RenderedState", "Initialize Called");
        }
    }

    @Override // com.inmobi.media.Bj
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4009g
    public final void j() {
        InterfaceC4466x9 l = l();
        if (l != null) {
            ((C4493y9) l).a("AUM-RenderedState", "onDestroy");
        }
        this.e.a(new C4515z5(this.b, null, this.c), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(G g) {
        boolean z;
        InterfaceC4466x9 l;
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        if (((AdConfig) AbstractC4015g4.a.a(AdConfig.class)).getNative().getInteraction().getBlockCallbackOnExpiry()) {
            C4274q1 c4274q1 = g.a;
            if (Intrinsics.areEqual("native", "native")) {
                Intrinsics.checkNotNullParameter(g, "<this>");
                Intrinsics.checkNotNullParameter(g, "<this>");
                long timeToLive = g.a.b.getCacheConfig("native").getTimeToLive();
                long j = g.k;
                if (j == -1) {
                    j = g.j + TimeUnit.SECONDS.toMillis(timeToLive);
                }
                if (j - System.currentTimeMillis() < 0) {
                    z = true;
                    l = l();
                    if (l != null) {
                        ((C4493y9) l).b("AUM-RenderedState", "shouldBlockCallback - " + z);
                    }
                    return z;
                }
            }
        }
        z = false;
        l = l();
        if (l != null) {
        }
        return z;
    }
}
