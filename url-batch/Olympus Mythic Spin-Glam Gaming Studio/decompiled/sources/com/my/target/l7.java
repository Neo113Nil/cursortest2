package com.my.target;

import android.text.TextUtils;
import com.my.target.internal.api.internalnativead.models.InternalImageData;
import com.my.target.internal.api.internalnativead.models.InternalNativeAdCard;
import com.my.target.j7;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class l7 implements InternalNativeAdCard {
    private final j7.a a;
    private final String b;
    private final String c;
    private final String d;
    private final InternalImageData e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    private l7(j7.a aVar) {
        this.a = aVar;
        if (TextUtils.isEmpty(aVar.K())) {
            this.b = null;
        } else {
            this.b = aVar.K();
        }
        if (TextUtils.isEmpty(aVar.n())) {
            this.c = null;
        } else {
            this.c = aVar.n();
        }
        if (TextUtils.isEmpty(aVar.l())) {
            this.d = null;
        } else {
            this.d = aVar.l();
        }
        this.f = aVar.r();
        this.g = aVar.Z();
        this.h = aVar.D();
        this.i = aVar.Y();
        if (aVar.y() != null) {
            this.e = i7.a(aVar.y());
        } else {
            this.e = null;
        }
    }

    static l7 a(j7.a aVar) {
        return new l7(aVar);
    }

    public String getCtaText() {
        return this.d;
    }

    public String getCurrency() {
        return this.i;
    }

    public String getDescription() {
        return this.c;
    }

    public String getDiscount() {
        return this.f;
    }

    public String getId() {
        return this.a.X();
    }

    public InternalImageData getImage() {
        return this.e;
    }

    public String getOldPrice() {
        return this.h;
    }

    public String getPrice() {
        return this.g;
    }

    public String getTitle() {
        return this.b;
    }

    public j7.a a() {
        return this.a;
    }
}
