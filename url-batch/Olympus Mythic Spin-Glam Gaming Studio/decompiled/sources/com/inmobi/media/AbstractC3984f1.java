package com.inmobi.media;

import android.util.Log;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.f1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC3984f1 implements InterfaceC3958e3, InterfaceC4111jm {
    public static final String f;
    public final CoroutineScope a;
    public final InterfaceC4466x9 b;
    public AdSession c;
    public MediaEvents d;
    public AdEvents e;

    static {
        String simpleName = AbstractC3984f1.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f = simpleName;
    }

    public AbstractC3984f1(CoroutineScope coroutineScope, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.a = coroutineScope;
        this.b = interfaceC4466x9;
    }

    public void a() {
    }

    public void a(AbstractC4295qm videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
    }

    public abstract void a(String str, List list, Map map, String str2, String str3, boolean z);

    public void a(boolean z) {
    }

    public final void b() {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a(f, "initAdEvents");
        }
        try {
            this.e = AdEvents.createAdEvents(this.c);
        } catch (IllegalArgumentException e) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a(f, "Failure initAdEvents: " + Log.getStackTraceString(e));
            }
        }
    }

    public final void c() {
        InterfaceC4466x9 interfaceC4466x9 = this.b;
        if (interfaceC4466x9 != null) {
            ((C4493y9) interfaceC4466x9).a(f, "initMediaAdEvents");
        }
        try {
            this.d = MediaEvents.createMediaEvents(this.c);
        } catch (IllegalArgumentException e) {
            InterfaceC4466x9 interfaceC4466x92 = this.b;
            if (interfaceC4466x92 != null) {
                ((C4493y9) interfaceC4466x92).a(f, "Failure initMediaAdEvents: " + Log.getStackTraceString(e));
            }
        }
    }

    public final void a(InteractionType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.d == null) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a(f, "Failed to register adUserInteractionEvent with type: " + type);
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.b;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a(f, "trackAdUserInteractionEvent with type: " + type);
        }
        X4.a(this.a, new C3955e1(this, type, null));
    }

    public final void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        Intrinsics.checkNotNullParameter(adSessionContext, "adSessionContext");
        if (this.c != null) {
            InterfaceC4466x9 interfaceC4466x9 = this.b;
            if (interfaceC4466x9 != null) {
                ((C4493y9) interfaceC4466x9).a(f, "initAdSession: adSession is already created");
                return;
            }
            return;
        }
        InterfaceC4466x9 interfaceC4466x92 = this.b;
        if (interfaceC4466x92 != null) {
            ((C4493y9) interfaceC4466x92).a(f, "initAdSession");
        }
        try {
            this.c = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        } catch (Exception e) {
            InterfaceC4466x9 interfaceC4466x93 = this.b;
            if (interfaceC4466x93 != null) {
                ((C4493y9) interfaceC4466x93).a(f, "AdSession creation failed. " + e);
            }
        }
    }
}
