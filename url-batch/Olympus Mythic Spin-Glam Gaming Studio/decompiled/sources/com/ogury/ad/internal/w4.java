package com.ogury.ad.internal;

import android.webkit.WebView;
import com.ogury.core.internal.LogTag;
import com.ogury.core.internal.Logger;
import com.ogury.core.internal.SourceTag;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class w4 extends u1 {
    public final /* synthetic */ x4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(x4 x4Var, Pattern pattern) {
        super(pattern);
        this.c = x4Var;
        Intrinsics.checkNotNull(pattern);
    }

    @Override // com.ogury.ad.internal.z7
    public final void a() {
        x4 x4Var = this.c;
        v4 v4Var = x4Var.c;
        if (v4Var != null) {
            b ad = x4Var.b;
            ti tiVar = (ti) v4Var;
            Intrinsics.checkNotNullParameter(ad, "ad");
            ui uiVar = tiVar.a;
            int i = uiVar.e;
            if (uiVar.f + i != uiVar.d) {
                uiVar.e = i + 1;
                y4 y4Var = uiVar.i;
                if (y4Var != null) {
                    y4Var.a();
                }
                ui uiVar2 = tiVar.a;
                int i2 = uiVar2.e;
                if (uiVar2.f + i2 == uiVar2.d && !uiVar2.g) {
                    if (i2 > 0) {
                        uiVar2.a(ad);
                    } else {
                        lb lbVar = lb.d;
                        String str = uiVar2.m;
                        uiVar2.h.removeCallbacksAndMessages(null);
                        uiVar2.g = true;
                        l0 l0Var = uiVar2.l;
                        if (l0Var != null) {
                            kb.a(l0Var, ad, lbVar, str, 28);
                        }
                    }
                }
            }
        }
        y7 y7Var = x4Var.a;
        Pattern whitelistPattern = x4Var.d;
        Intrinsics.checkNotNullExpressionValue(whitelistPattern, "whitelistPattern");
        y7Var.setClientAdapter(new u1(whitelistPattern));
        x4Var.a.setDestroyed(true);
        zi.a((WebView) x4Var.a);
    }

    @Override // com.ogury.ad.internal.z7
    public final void b(WebView webView, String url) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(url, "url");
        Logger.INSTANCE.d(LogTag.INTERNAL, SourceTag.ADS, "onPageFinished");
        x4 x4Var = this.c;
        x4Var.e = true;
        v4 v4Var = x4Var.c;
        if (v4Var != null) {
            b ad = x4Var.b;
            ti tiVar = (ti) v4Var;
            Intrinsics.checkNotNullParameter(ad, "ad");
            ui uiVar = tiVar.a;
            int i = uiVar.e;
            if (uiVar.f + i != uiVar.d) {
                uiVar.e = i + 1;
                y4 y4Var = uiVar.i;
                if (y4Var != null) {
                    y4Var.a();
                }
                ui uiVar2 = tiVar.a;
                int i2 = uiVar2.e;
                if (uiVar2.f + i2 == uiVar2.d && !uiVar2.g) {
                    if (i2 > 0) {
                        uiVar2.a(ad);
                    } else {
                        lb lbVar = lb.d;
                        String str = uiVar2.m;
                        uiVar2.h.removeCallbacksAndMessages(null);
                        uiVar2.g = true;
                        l0 l0Var = uiVar2.l;
                        if (l0Var != null) {
                            kb.a(l0Var, ad, lbVar, str, 28);
                        }
                    }
                }
            }
        }
        y7 y7Var = x4Var.a;
        Pattern whitelistPattern = x4Var.d;
        Intrinsics.checkNotNullExpressionValue(whitelistPattern, "whitelistPattern");
        y7Var.setClientAdapter(new u1(whitelistPattern));
        x4Var.a.setDestroyed(true);
        zi.a((WebView) x4Var.a);
    }

    @Override // com.ogury.ad.internal.z7
    public final void a(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        x4 x4Var = this.c;
        v4 v4Var = x4Var.c;
        if (v4Var != null) {
            b ad = x4Var.b;
            ti tiVar = (ti) v4Var;
            Intrinsics.checkNotNullParameter(ad, "ad");
            ui uiVar = tiVar.a;
            int i = uiVar.e;
            if (uiVar.f + i != uiVar.d) {
                uiVar.e = i + 1;
                y4 y4Var = uiVar.i;
                if (y4Var != null) {
                    y4Var.a();
                }
                ui uiVar2 = tiVar.a;
                int i2 = uiVar2.e;
                if (uiVar2.f + i2 == uiVar2.d && !uiVar2.g) {
                    if (i2 > 0) {
                        uiVar2.a(ad);
                    } else {
                        lb lbVar = lb.d;
                        String str = uiVar2.m;
                        uiVar2.h.removeCallbacksAndMessages(null);
                        uiVar2.g = true;
                        l0 l0Var = uiVar2.l;
                        if (l0Var != null) {
                            kb.a(l0Var, ad, lbVar, str, 28);
                        }
                    }
                }
            }
        }
        y7 y7Var = x4Var.a;
        Pattern whitelistPattern = x4Var.d;
        Intrinsics.checkNotNullExpressionValue(whitelistPattern, "whitelistPattern");
        y7Var.setClientAdapter(new u1(whitelistPattern));
        x4Var.a.setDestroyed(true);
        zi.a((WebView) x4Var.a);
    }
}
