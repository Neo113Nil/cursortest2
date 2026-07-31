package com.inmobi.media;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4392ud implements Ya {
    public final /* synthetic */ C4444wd a;

    public C4392ud(C4444wd c4444wd) {
        this.a = c4444wd;
    }

    @Override // com.inmobi.media.Ya
    public final void a(String trackerName, Map macros) {
        Intrinsics.checkNotNullParameter(trackerName, "trackerName");
        Intrinsics.checkNotNullParameter(macros, "macros");
    }

    @Override // com.inmobi.media.Ya
    public final void b(String str, String str2, String str3) {
    }

    @Override // com.inmobi.media.Ya
    public final void a() {
        InterfaceC4466x9 interfaceC4466x9 = this.a.a.g;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "User left application");
        }
        AbstractC4036h abstractC4036h = (AbstractC4036h) this.a.a.f;
        abstractC4036h.getClass();
        Bj bj = ((Nc) abstractC4036h).c;
        Mi mi = bj instanceof Mi ? (Mi) bj : null;
        if (mi != null) {
            InterfaceC4466x9 l = mi.l();
            if (l != null) {
                ((C4493y9) l).a("AUM-RenderedState", "onUserLeftApplication");
            }
            X4.a(mi.k(), new Li(mi, null));
        }
    }

    @Override // com.inmobi.media.Ya
    public final void a(String str, String message, String str2) {
        Intrinsics.checkNotNullParameter(message, "message");
        InterfaceC4466x9 interfaceC4466x9 = this.a.a.g;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).b("PublisherViewClickHandler", "Landing page error: " + message + " " + str2);
        }
    }

    @Override // com.inmobi.media.Ya
    public final void a(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        InterfaceC4466x9 interfaceC4466x9 = this.a.a.g;
        if (interfaceC4466x9 != null) {
            ComponentName component = intent.getComponent();
            ((C4493y9) interfaceC4466x9).a("PublisherViewClickHandler", "Starting activity: " + (component != null ? component.getClassName() : null));
        }
        this.a.a(intent);
    }
}
