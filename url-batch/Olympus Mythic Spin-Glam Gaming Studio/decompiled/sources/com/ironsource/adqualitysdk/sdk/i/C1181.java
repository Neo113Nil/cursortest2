package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.יּ, reason: contains not printable characters */
/* loaded from: classes11.dex */
public final class C1181 implements InterfaceC0595 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1011 f3013;

    public C1181(C1011 c1011) {
        this.f3013 = c1011;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r3.equals(com.ironsource.adqualitysdk.sdk.StringFog.decrypt("Rd6ZJIgU\n", "BJrMasFAetI=\n")) != false) goto L33;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0595
    /* renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo3938(ArrayList arrayList, C1189 c1189) {
        C1011 c1011 = this.f3013;
        char c = 0;
        String str = (String) arrayList.get(0);
        c1011.getClass();
        switch (str.hashCode()) {
            case -1810696374:
                if (str.equals(StringFog.decrypt("kIX4OmO1WfGZ\n", "3My+fyDsGr0=\n"))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1166291365:
                if (str.equals(StringFog.decrypt("h0eBHz8x6A==\n", "1BPOTX52rWk=\n"))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -276710660:
                if (str.equals(StringFog.decrypt("WahdGCNEV1pWpEs=\n", "D+EZXWwUGxs=\n"))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -54373961:
                if (str.equals(StringFog.decrypt("KxGfmwFNjGg+F4WM\n", "aF7R1UQO2CE=\n"))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 63879010:
                if (str.equals(StringFog.decrypt("hbvLK54=\n", "xvqIY9stV8I=\n"))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1167718561:
                if (str.equals(StringFog.decrypt("AivUdA5iMKAU\n", "QHmbNUohcfM=\n"))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1813675631:
                if (str.equals(StringFog.decrypt("T0QD6smJrQ==\n", "HQFSv4za+VE=\n"))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1815350732:
                if (str.equals(StringFog.decrypt("nLwnhKxnVw==\n", "zvl0y+AxEtk=\n"))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1926303783:
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return WebViewEventCategory.ADUNIT;
            case 1:
                return WebViewEventCategory.VIDEOPLAYER;
            case 2:
                return WebViewEventCategory.REQUEST;
            case 3:
                return WebViewEventCategory.RESOLVE;
            case 4:
                return WebViewEventCategory.CACHE;
            case 5:
                return WebViewEventCategory.CONNECTIVITY;
            case 6:
                return WebViewEventCategory.STORAGE;
            case 7:
                return WebViewEventCategory.BROADCAST;
            case '\b':
                return WebViewEventCategory.LIFECYCLE;
            default:
                return null;
        }
    }
}
