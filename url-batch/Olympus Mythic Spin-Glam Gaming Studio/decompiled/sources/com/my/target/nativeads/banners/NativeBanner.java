package com.my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.menu.MenuAction;
import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.ImageData;
import com.my.target.e;
import com.my.target.sc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public class NativeBanner {
    String a;
    String b;
    float c;
    int d;
    boolean e;
    String f;
    String g;
    String h;
    String i;
    String j;
    Disclaimer k;
    String l;
    String m;
    String n;
    String o;
    String p;
    ImageData q;
    ImageData r;
    String s;
    List t;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class Builder {
        private final NativeBanner a = new NativeBanner();

        private Builder() {
        }

        @NonNull
        public static Builder createBuilder() {
            return new Builder();
        }

        @NonNull
        public NativeBanner build() {
            return this.a;
        }

        @NonNull
        public Builder setAdChoicesIcon(@Nullable ImageData imageData) {
            this.a.r = imageData;
            return this;
        }

        @NonNull
        public Builder setAdvertisingLabel(@Nullable String str) {
            this.a.o = str;
            return this;
        }

        @NonNull
        public Builder setAgeRestrictions(@Nullable String str) {
            this.a.l = str;
            return this;
        }

        @NonNull
        public Builder setBundleId(@Nullable String str) {
            this.a.p = str;
            return this;
        }

        @NonNull
        public Builder setCtaText(@Nullable String str) {
            this.a.h = str;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.a.i = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimer(@Nullable String str) {
            this.a.j = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimerInfo(@Nullable Disclaimer disclaimer) {
            this.a.k = disclaimer;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.a.n = str;
            return this;
        }

        @NonNull
        public Builder setErid(@Nullable String str) {
            this.a.m = str;
            return this;
        }

        @NonNull
        public Builder setHasAdChoices(boolean z) {
            this.a.e = z;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable ImageData imageData) {
            this.a.q = imageData;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.a.f = str;
            return this;
        }

        @NonNull
        public Builder setNavigationType(@NonNull String str) {
            str.getClass();
            switch (str) {
                case "web":
                case "store":
                case "webform":
                    this.a.a = str;
                    break;
            }
            return this;
        }

        @NonNull
        public Builder setRating(float f) {
            this.a.c = f;
            return this;
        }

        @NonNull
        public Builder setStoreType(@Nullable String str) {
            this.a.b = str;
            return this;
        }

        @NonNull
        public Builder setTitle(@Nullable String str) {
            this.a.g = str;
            return this;
        }

        @NonNull
        public Builder setVotes(int i) {
            this.a.d = i;
            return this;
        }
    }

    NativeBanner(sc scVar) {
        this.a = "web";
        this.f = scVar.x();
        this.a = scVar.B();
        this.b = scVar.I();
        this.c = scVar.G();
        this.d = scVar.Q();
        String K = scVar.K();
        this.g = TextUtils.isEmpty(K) ? null : K;
        String l = scVar.l();
        this.h = TextUtils.isEmpty(l) ? null : l;
        String n = scVar.n();
        this.i = TextUtils.isEmpty(n) ? null : n;
        String o = scVar.o();
        this.j = !TextUtils.isEmpty(o) ? o : null;
        this.k = scVar.p() != null ? scVar.p() : !TextUtils.isEmpty(o) ? new Disclaimer(scVar.q(), o) : null;
        String d = scVar.d();
        this.l = TextUtils.isEmpty(d) ? null : d;
        this.m = a(scVar.u());
        String s = scVar.s();
        this.n = TextUtils.isEmpty(s) ? null : s;
        String c = scVar.c();
        this.o = TextUtils.isEmpty(c) ? null : c;
        this.q = scVar.w();
        String g = scVar.g();
        this.p = TextUtils.isEmpty(g) ? null : g;
        e a = scVar.a();
        if (a == null) {
            this.e = false;
            this.r = null;
            this.s = null;
            this.t = null;
            return;
        }
        this.e = true;
        this.r = a.g();
        this.s = a.a();
        List e = a.e();
        this.t = e.isEmpty() ? null : e;
    }

    public static NativeBanner a(sc scVar) {
        return new NativeBanner(scVar);
    }

    @Nullable
    public String getAboutCompanyInfo() {
        return this.s;
    }

    @Nullable
    public ImageData getAdChoicesIcon() {
        return this.r;
    }

    @Nullable
    public List<MenuAction> getAdChoicesMenuActions() {
        if (this.t == null) {
            return null;
        }
        return new ArrayList(this.t);
    }

    @Nullable
    public String getAdvertisingLabel() {
        return this.o;
    }

    @Nullable
    public String getAgeRestrictions() {
        return this.l;
    }

    @Nullable
    public String getBundleId() {
        return this.p;
    }

    @Nullable
    public String getCtaText() {
        return this.h;
    }

    @Nullable
    public String getDescription() {
        return this.i;
    }

    @Nullable
    @Deprecated
    public String getDisclaimer() {
        return this.j;
    }

    @Nullable
    public Disclaimer getDisclaimerInfo() {
        return this.k;
    }

    @Nullable
    public String getDomain() {
        return this.n;
    }

    @Nullable
    public String getErid() {
        return this.m;
    }

    @Nullable
    public ImageData getIcon() {
        return this.q;
    }

    @Nullable
    public String getId() {
        return this.f;
    }

    @NonNull
    public String getNavigationType() {
        return this.a;
    }

    public float getRating() {
        return this.c;
    }

    @Nullable
    public String getStoreType() {
        return this.b;
    }

    @Nullable
    public String getTitle() {
        return this.g;
    }

    public int getVotes() {
        return this.d;
    }

    public boolean hasAdChoices() {
        return this.e;
    }

    @NonNull
    public String toString() {
        return "NativeBanner{id='" + this.f + "', navigationType='" + this.a + "', storeType='" + this.b + "', rating=" + this.c + ", votes=" + this.d + ", hasAdChoices=" + this.e + ", title='" + this.g + "', ctaText='" + this.h + "', description='" + this.i + "', disclaimer='" + this.j + "', disclaimerInfo=" + this.k + ", ageRestrictions='" + this.l + "', erid='" + this.m + "', domain='" + this.n + "', advertisingLabel='" + this.o + "', bundleId='" + this.p + "', icon=" + this.q + ", adChoicesIcon=" + this.r + ", aboutCompanyInfo='" + this.s + "'}";
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    NativeBanner(String str, String str2, String str3, String str4, String str5, String str6, ImageData imageData, float f, String str7, String str8, String str9, Disclaimer disclaimer, int i, String str10, String str11, boolean z, ImageData imageData2, String str12) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.n = str5;
        this.o = str6;
        this.q = imageData;
        this.c = f;
        this.l = str7;
        this.m = str8;
        this.j = str9;
        this.k = disclaimer;
        this.d = i;
        this.a = str10;
        this.b = str11;
        this.e = z;
        this.r = imageData2;
        this.p = str12;
        this.t = null;
    }

    NativeBanner() {
        this.a = "web";
    }
}
