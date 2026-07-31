package com.my.target.nativeads.banners;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.ad;
import com.my.target.c7;
import com.my.target.common.models.Disclaimer;
import com.my.target.common.models.Html;
import com.my.target.common.models.ImageData;
import com.my.target.common.models.collage.Collage;
import com.my.target.eb;
import com.my.target.sc;
import com.my.target.uc;
import com.my.target.v4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class NativePromoBanner extends NativeBanner {
    private String A;
    private final Collage B;
    private final float u;
    private final ImageData v;
    private final String w;
    private final ArrayList x;
    private final Html y;
    private String z;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class Builder {
        boolean a;
        private float b;
        private int c;
        private float d;
        private String e = "web";
        private String f;
        private String g;
        private ImageData h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private ImageData n;
        private String o;
        private String p;
        private String q;
        private Disclaimer r;
        private String s;
        private ImageData t;
        private String u;
        private Collage v;
        private Html w;

        private Builder() {
        }

        @NonNull
        public static Builder createBuilder() {
            return new Builder();
        }

        @NonNull
        public NativePromoBanner build() {
            return new NativePromoBanner(this.g, this.i, this.j, this.k, this.l, this.n, this.b, this.o, this.p, this.q, this.r, this.c, this.e, this.f, this.d, this.s, this.t, this.u, this.a, this.h, this.m, this.v, this.w);
        }

        @NonNull
        public Builder setAdChoicesIcon(@Nullable ImageData imageData) {
            this.h = imageData;
            return this;
        }

        @NonNull
        public Builder setAdvertisingLabel(@Nullable String str) {
            this.l = str;
            return this;
        }

        @NonNull
        public Builder setAgeRestrictions(@Nullable String str) {
            this.o = str;
            return this;
        }

        @NonNull
        public Builder setBundleId(@Nullable String str) {
            this.m = str;
            return this;
        }

        @NonNull
        public Builder setCollage(@Nullable Collage collage) {
            this.v = collage;
            return this;
        }

        @NonNull
        public Builder setCtaText(@Nullable String str) {
            this.j = str;
            return this;
        }

        @NonNull
        public Builder setDescription(@Nullable String str) {
            this.s = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimer(@Nullable String str) {
            this.q = str;
            return this;
        }

        @NonNull
        public Builder setDisclaimerInfo(@Nullable Disclaimer disclaimer) {
            this.r = disclaimer;
            return this;
        }

        @NonNull
        public Builder setDomain(@Nullable String str) {
            this.k = str;
            return this;
        }

        @NonNull
        public Builder setErid(@Nullable String str) {
            this.p = str;
            return this;
        }

        @NonNull
        public Builder setHasAdChoices(boolean z) {
            this.a = z;
            return this;
        }

        @NonNull
        public Builder setHtml(@Nullable Html html) {
            this.w = html;
            return this;
        }

        @NonNull
        public Builder setIcon(@Nullable ImageData imageData) {
            this.n = imageData;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.g = str;
            return this;
        }

        @NonNull
        public Builder setImage(@Nullable ImageData imageData) {
            this.t = imageData;
            return this;
        }

        @NonNull
        public Builder setImageDominantColor(@Nullable String str) {
            this.u = str;
            return this;
        }

        @NonNull
        public Builder setNavigationType(@NonNull String str) {
            str.getClass();
            switch (str) {
                case "web":
                case "store":
                case "webform":
                    this.e = str;
                    break;
            }
            return this;
        }

        @NonNull
        public Builder setRating(float f) {
            this.b = f;
            return this;
        }

        @NonNull
        public Builder setStoreType(@Nullable String str) {
            this.f = str;
            return this;
        }

        @NonNull
        public Builder setTitle(@Nullable String str) {
            this.i = str;
            return this;
        }

        @NonNull
        public Builder setVideoDuration(float f) {
            this.d = f;
            return this;
        }

        @NonNull
        public Builder setVotes(int i) {
            this.c = i;
            return this;
        }
    }

    NativePromoBanner(String str, String str2, String str3, String str4, String str5, ImageData imageData, float f, String str6, String str7, String str8, Disclaimer disclaimer, int i, String str9, String str10, float f2, String str11, ImageData imageData2, String str12, boolean z, ImageData imageData3, String str13, Collage collage, Html html) {
        super(str, str2, str3, str11, str4, str5, imageData, f, str6, str7, str8, disclaimer, i, str9, str10, z, imageData3, str13);
        this.x = new ArrayList();
        this.v = imageData2;
        this.w = str12;
        this.u = f2;
        this.B = collage;
        this.y = html;
    }

    public static NativePromoBanner b(sc scVar) {
        return new NativePromoBanner(scVar);
    }

    private void c(sc scVar) {
        if (hasVideo()) {
            return;
        }
        List c0 = scVar.c0();
        if (c0.isEmpty()) {
            return;
        }
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            this.x.add(NativePromoCard.a((uc) it.next()));
        }
    }

    @NonNull
    public ArrayList<NativePromoCard> getCards() {
        return this.x;
    }

    @Nullable
    public String getCategory() {
        return this.z;
    }

    @Nullable
    public Collage getCollage() {
        return this.B;
    }

    @Nullable
    public Html getHtml() {
        return this.y;
    }

    @Nullable
    public ImageData getImage() {
        return this.v;
    }

    @Nullable
    public String getImageDominantColor() {
        return this.w;
    }

    @Nullable
    public String getSubCategory() {
        return this.A;
    }

    public float getVideoDuration() {
        return this.u;
    }

    public boolean hasVideo() {
        return v4.a(this.u, 0.0f) == 1;
    }

    public boolean isHtml5() {
        return this.y != null;
    }

    @Override // com.my.target.nativeads.banners.NativeBanner
    @NonNull
    public String toString() {
        return "NativePromoBanner{id=" + this.f + ", videoDuration=" + this.u + ", image=" + this.v + ", collage=" + this.B + ", html=" + this.y + ", nativePromoCards=" + this.x + ", category='" + this.z + "', subCategory='" + this.A + "', navigationType='" + this.a + "', storeType='" + this.b + "', rating=" + this.c + ", votes=" + this.d + ", hasAdChoices=" + this.e + ", title='" + this.g + "', ctaText='" + this.h + "', description='" + this.i + "', disclaimer='" + this.j + "', disclaimerInfo='" + this.k + "', ageRestrictions='" + this.l + "', erid='" + this.m + "', domain='" + this.n + "', advertisingLabel='" + this.o + "', bundleId='" + this.p + "', icon=" + this.q + ", adChoicesIcon=" + this.r + '}';
    }

    private NativePromoBanner(sc scVar) {
        super(scVar);
        this.x = new ArrayList();
        eb d0 = scVar.d0();
        this.u = d0 != null ? d0.t() : 0.0f;
        String h = scVar.h();
        this.z = TextUtils.isEmpty(h) ? null : h;
        String J = scVar.J();
        this.A = TextUtils.isEmpty(J) ? null : J;
        this.v = scVar.y();
        this.w = scVar.z();
        c7 X = scVar.X();
        this.B = X != null ? Collage.a(X) : null;
        ad b0 = scVar.b0();
        this.y = b0 != null ? new Html(b0.R(), b0.v()) : null;
        c(scVar);
    }
}
