package com.my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.uc;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class NativePromoCard {
    private final String a;
    private final String b;
    private final String c;
    private final ImageData d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    private NativePromoCard(uc ucVar) {
        if (TextUtils.isEmpty(ucVar.K())) {
            this.a = null;
        } else {
            this.a = ucVar.K();
        }
        if (TextUtils.isEmpty(ucVar.n())) {
            this.b = null;
        } else {
            this.b = ucVar.n();
        }
        if (TextUtils.isEmpty(ucVar.l())) {
            this.c = null;
        } else {
            this.c = ucVar.l();
        }
        this.e = ucVar.r();
        this.f = ucVar.Y();
        this.g = ucVar.D();
        this.h = ucVar.X();
        this.d = ucVar.y();
    }

    static NativePromoCard a(uc ucVar) {
        return new NativePromoCard(ucVar);
    }

    @Nullable
    public String getCtaText() {
        return this.c;
    }

    @Nullable
    public String getCurrency() {
        return this.h;
    }

    @Nullable
    public String getDescription() {
        return this.b;
    }

    @Nullable
    public String getDiscount() {
        return this.e;
    }

    @Nullable
    public ImageData getImage() {
        return this.d;
    }

    @Nullable
    public String getOldPrice() {
        return this.g;
    }

    @Nullable
    public String getPrice() {
        return this.f;
    }

    @Nullable
    public String getTitle() {
        return this.a;
    }
}
