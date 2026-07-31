package com.smaato.sdk.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public class NativeAdAssets {
    private final String cta;
    private final Image icon;
    private final List<Image> images;
    private final String mraidJs;
    private final Double rating;
    private final String sponsored;
    private final String text;
    private final String title;
    private final String vastTag;

    private NativeAdAssets(String str, String str2, String str3, String str4, String str5, String str6, Image image, List<Image> list, Double d) {
        this.title = str;
        this.mraidJs = str2;
        this.vastTag = str3;
        this.text = str4;
        this.sponsored = str5;
        this.cta = str6;
        this.icon = image;
        this.images = list;
        this.rating = d;
    }

    public static Builder builder() {
        return new Builder().images(Collections.emptyList());
    }

    public String title() {
        return this.title;
    }

    public String mraidJs() {
        return this.mraidJs;
    }

    public String vastTag() {
        return this.vastTag;
    }

    public String text() {
        return this.text;
    }

    public String sponsored() {
        return this.sponsored;
    }

    public String cta() {
        return this.cta;
    }

    public Image icon() {
        return this.icon;
    }

    public List<Image> images() {
        return this.images;
    }

    public Double rating() {
        return this.rating;
    }

    public Builder buildUpon() {
        return new Builder().title(title()).mraidJs(mraidJs()).vastTag(vastTag()).text(text()).sponsored(sponsored()).cta(cta()).icon(icon()).images(images()).rating(rating());
    }

    public static class Image {
        private final Drawable drawable;
        private final int height;
        private final Uri uri;
        private final int width;

        private Image(Drawable drawable, Uri uri, int i, int i2) {
            this.drawable = drawable;
            this.uri = uri;
            this.width = i;
            this.height = i2;
        }

        public static Image create(Uri uri, int i, int i2) {
            return new Image(null, uri, i, i2);
        }

        public Drawable drawable() {
            return this.drawable;
        }

        public Uri uri() {
            return this.uri;
        }

        public int width() {
            return this.width;
        }

        public int height() {
            return this.height;
        }

        public Image withDrawable(Drawable drawable) {
            return new Image(drawable, uri(), width(), height());
        }
    }

    public static class Builder {
        private String cta;
        private Image icon;
        private List<Image> images;
        private String mraidJs;
        private Double rating;
        private String sponsored;
        private String text;
        private String title;
        private String vastTag;

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder text(String str) {
            this.text = str;
            return this;
        }

        public Builder sponsored(String str) {
            this.sponsored = str;
            return this;
        }

        public Builder cta(String str) {
            this.cta = str;
            return this;
        }

        public Builder icon(Image image) {
            this.icon = image;
            return this;
        }

        public Builder images(List<Image> list) {
            this.images = list;
            return this;
        }

        public Builder mraidJs(String str) {
            this.mraidJs = str;
            return this;
        }

        public Builder vastTag(String str) {
            this.vastTag = str;
            return this;
        }

        public Builder rating(Double d) {
            this.rating = d;
            return this;
        }

        public NativeAdAssets build() {
            return new NativeAdAssets(this.title, this.mraidJs, this.vastTag, this.text, this.sponsored, this.cta, this.icon, this.images, this.rating);
        }
    }
}
