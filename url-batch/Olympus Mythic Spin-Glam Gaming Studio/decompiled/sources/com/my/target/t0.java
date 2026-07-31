package com.my.target;

import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.ImageData;
import com.my.target.internal.api.internalnativead.models.BannerContent;
import com.my.target.internal.api.internalnativead.models.InternalHtmlData;
import com.my.target.internal.api.internalnativead.models.InternalImageData;
import com.my.target.internal.api.internalnativead.models.InternalVideo;
import com.my.target.internal.api.internalnativead.models.SizedImage;
import com.my.target.internal.api.internalnativead.models.survey.InternalSurveyData;
import com.my.target.j7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class t0 implements BannerContent {
    private final j7 a;
    private final i0 b;
    private i7 c;
    private i7 d;
    private SizedImage e;
    private final String f;
    private Disclaimer g;
    private g7 h;
    private f8 i;
    private List j;

    private t0(j7 j7Var) {
        this.a = j7Var;
        if (j7Var.w() != null) {
            this.c = i7.a(j7Var.w());
        }
        if (j7Var.y() != null) {
            this.d = i7.a(j7Var.y());
        }
        if (j7Var.d0() != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = j7Var.d0().iterator();
            while (it.hasNext()) {
                arrayList.add(i7.a((ImageData) it.next()));
            }
            this.e = yg.a(arrayList);
        }
        this.f = j7Var.z();
        this.g = j7Var.p();
        if (j7Var.Z() != null) {
            this.h = g7.a(j7Var.Z());
        }
        if (j7Var.b0() != null) {
            this.i = f8.a(j7Var.b0());
        }
        if (j7Var.X() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = j7Var.X().iterator();
            while (it2.hasNext()) {
                arrayList2.add(l7.a((j7.a) it2.next()));
            }
            this.j = arrayList2;
        }
        this.b = i0.a(j7Var);
    }

    public static t0 a(j7 j7Var) {
        return new t0(j7Var);
    }

    public String getAdvertisingLabel() {
        return this.a.c();
    }

    public String getAgeRestriction() {
        return this.a.d();
    }

    public List getCardsData() {
        return this.j;
    }

    public String getCtaText() {
        return this.a.l();
    }

    public String getDescription() {
        return this.a.n();
    }

    public Disclaimer getDisclaimer() {
        Disclaimer disclaimer = this.g;
        if (disclaimer == null) {
            return null;
        }
        return disclaimer.copy();
    }

    public String getDomain() {
        return this.a.s();
    }

    public InternalHtmlData getHtmlData() {
        return this.h;
    }

    public InternalImageData getIcon() {
        return this.c;
    }

    public SizedImage getImage() {
        return this.e;
    }

    public InternalImageData getImageContent() {
        return this.d;
    }

    public String getImageDominantColor() {
        return this.f;
    }

    public String getMediaType() {
        return this.a.e0();
    }

    public InternalSurveyData getSurvey() {
        return this.a.h0();
    }

    public String getTitle() {
        return this.a.K();
    }

    public InternalVideo getVideo() {
        return this.i;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public i0 getAppInfo() {
        return this.b;
    }
}
