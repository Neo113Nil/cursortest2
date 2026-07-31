package com.my.target;

import com.my.target.common.CustomParams;
import com.my.target.internal.api.internalnativead.clickarea.ClickArea;
import com.my.target.internal.api.internalnativead.models.BannerContent;
import com.my.target.internal.api.internalnativead.models.InternalNativeBanner;
import com.my.target.internal.api.internalnativead.models.adchoices.InternalNativeAdChoices;
import com.my.target.j7;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class v7 implements InternalNativeBanner {
    private final j7 a;
    private final m7 b;
    private final ClickArea c;
    private BannerContent d;

    private v7(j7 j7Var) {
        this.a = j7Var;
        e a = j7Var.a();
        if (a != null) {
            this.b = m7.a(a);
        } else {
            this.b = null;
        }
        if (!j7Var.e0().equals("UNKNOWN") || !j7Var.K().isEmpty() || !j7Var.s().isEmpty()) {
            this.d = t0.a(j7Var);
        }
        this.c = f2.a(j7Var.i());
    }

    public static v7 a(j7 j7Var) {
        return new v7(j7Var);
    }

    public InternalNativeAdChoices getAdChoices() {
        return this.b;
    }

    public String getAdProductType() {
        return this.a.a0();
    }

    public ClickArea getClickArea() {
        return this.c;
    }

    public BannerContent getContent() {
        return this.d;
    }

    public CustomParams getCustomParams() {
        return this.a.Y().h();
    }

    public String getId() {
        return this.a.x();
    }

    public long getImpressionId() {
        return this.a.A();
    }

    public String getSource() {
        j7.b c0 = this.a.c0();
        if (c0 != null) {
            return c0.X();
        }
        return null;
    }

    public void setAdsLightPixelParams(String str, Map map) {
        this.a.Y().c().a(str, map);
    }

    public j7 a() {
        return this.a;
    }
}
