package com.inmobi.media;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C4146l5 extends CustomTabsCallback {
    public final /* synthetic */ C4172m5 a;

    public C4146l5(C4172m5 c4172m5) {
        this.a = c4172m5;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onActivityLayout(int i, int i2, int i3, int i4, int i5, Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        super.onActivityLayout(i, i2, i3, i4, i5, extras);
        Intrinsics.checkNotNullExpressionValue("m5", "access$getLOG_TAG$cp(...)");
        Y2 y2 = this.a.c;
        if (y2 != null) {
            y2.a(i, i2, i3, i4, i5);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, Bundle bundle) {
        super.onNavigationEvent(i, bundle);
        Intrinsics.checkNotNullExpressionValue("m5", "access$getLOG_TAG$cp(...)");
        Y2 y2 = this.a.c;
        if (y2 != null) {
            C4199n5 c4199n5 = y2.g;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 6 && c4199n5.c == null) {
                            if (c4199n5.d == 4) {
                                c4199n5.c = Boolean.TRUE;
                            } else {
                                c4199n5.c = Boolean.FALSE;
                            }
                            if (Intrinsics.areEqual(c4199n5.c, Boolean.TRUE)) {
                                C4081ii c4081ii = (C4081ii) c4199n5.e.get();
                                if (c4081ii != null) {
                                    Za landingPageFunnelState = Za.i;
                                    C4152lb c4152lb = c4199n5.a;
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState, "landingPageFunnelState");
                                    c4081ii.a.getLandingPageHandler().a(landingPageFunnelState, c4152lb, (Integer) 8003);
                                }
                                C4081ii c4081ii2 = (C4081ii) c4199n5.e.get();
                                if (c4081ii2 != null) {
                                    InterfaceC4466x9 interfaceC4466x9 = c4081ii2.a.i;
                                    if (interfaceC4466x9 != null) {
                                        String str = GestureDetectorOnGestureListenerC4476xi.i1;
                                        Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                                        ((C4493y9) interfaceC4466x9).a(str, "onCCTPageLoadedSuccessfully");
                                    }
                                    c4081ii2.a.D();
                                }
                            } else {
                                C4081ii c4081ii3 = (C4081ii) c4199n5.e.get();
                                if (c4081ii3 != null) {
                                    Za landingPageFunnelState2 = Za.j;
                                    C4152lb c4152lb2 = c4199n5.a;
                                    Intrinsics.checkNotNullParameter(landingPageFunnelState2, "landingPageFunnelState");
                                    c4081ii3.a.getLandingPageHandler().a(landingPageFunnelState2, c4152lb2, (Integer) 8005);
                                }
                            }
                        }
                    } else if (c4199n5.c == null) {
                        c4199n5.c = Boolean.FALSE;
                        C4081ii c4081ii4 = (C4081ii) c4199n5.e.get();
                        if (c4081ii4 != null) {
                            Za landingPageFunnelState3 = Za.j;
                            C4152lb c4152lb3 = c4199n5.a;
                            Intrinsics.checkNotNullParameter(landingPageFunnelState3, "landingPageFunnelState");
                            c4081ii4.a.getLandingPageHandler().a(landingPageFunnelState3, c4152lb3, (Integer) 8004);
                        }
                    }
                } else if (c4199n5.c == null) {
                    c4199n5.c = Boolean.TRUE;
                    C4081ii c4081ii5 = (C4081ii) c4199n5.e.get();
                    if (c4081ii5 != null) {
                        O2.a(c4081ii5, Za.i, c4199n5.a);
                    }
                    C4081ii c4081ii6 = (C4081ii) c4199n5.e.get();
                    if (c4081ii6 != null) {
                        InterfaceC4466x9 interfaceC4466x92 = c4081ii6.a.i;
                        if (interfaceC4466x92 != null) {
                            String str2 = GestureDetectorOnGestureListenerC4476xi.i1;
                            Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                            ((C4493y9) interfaceC4466x92).a(str2, "onCCTPageLoadedSuccessfully");
                        }
                        c4081ii6.a.D();
                    }
                }
            } else if (!c4199n5.b) {
                c4199n5.b = true;
                C4081ii c4081ii7 = (C4081ii) c4199n5.e.get();
                if (c4081ii7 != null) {
                    O2.a(c4081ii7, Za.h, c4199n5.a);
                }
            }
            c4199n5.d = i;
            if (i == 1) {
                C4081ii c4081ii8 = (C4081ii) y2.i.get();
                if (c4081ii8 != null) {
                    GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                    c4081ii8.a(C3947di.a("IN_NATIVE_BROWSER", "onPageStart"));
                    return;
                }
                return;
            }
            if (i == 4) {
                C4081ii c4081ii9 = (C4081ii) y2.i.get();
                if (c4081ii9 != null) {
                    GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                    c4081ii9.a(C3947di.a("IN_NATIVE_BROWSER", "onNavigatingAway"));
                    return;
                }
                return;
            }
            if (i == 5) {
                C4081ii c4081ii10 = (C4081ii) y2.i.get();
                if (c4081ii10 != null) {
                    GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                    c4081ii10.a(C3947di.a("IN_NATIVE_BROWSER", "onVisible"));
                }
                C4081ii c4081ii11 = (C4081ii) y2.i.get();
                if (c4081ii11 != null) {
                    InterfaceC4466x9 interfaceC4466x93 = c4081ii11.a.i;
                    if (interfaceC4466x93 != null) {
                        String str3 = GestureDetectorOnGestureListenerC4476xi.i1;
                        Intrinsics.checkNotNullExpressionValue(str3, "access$getTAG$cp(...)");
                        ((C4493y9) interfaceC4466x93).a(str3, "onCCTScreenDisplayed");
                    }
                    c4081ii11.a.getListener().f(c4081ii11.a);
                    c4081ii11.a.b((String) null, (String) null, (String) null);
                    return;
                }
                return;
            }
            if (i != 6) {
                return;
            }
            C4081ii c4081ii12 = (C4081ii) y2.i.get();
            if (c4081ii12 != null) {
                GestureDetectorOnGestureListenerC4476xi.g1.getClass();
                c4081ii12.a(C3947di.a("IN_NATIVE_BROWSER", "onHidden"));
            }
            C4081ii c4081ii13 = (C4081ii) y2.i.get();
            if (c4081ii13 != null) {
                InterfaceC4466x9 interfaceC4466x94 = c4081ii13.a.i;
                if (interfaceC4466x94 != null) {
                    String str4 = GestureDetectorOnGestureListenerC4476xi.i1;
                    Intrinsics.checkNotNullExpressionValue(str4, "access$getTAG$cp(...)");
                    ((C4493y9) interfaceC4466x94).a(str4, "onCCTScreenDismissed");
                }
                c4081ii13.a.W();
            }
        }
    }
}
