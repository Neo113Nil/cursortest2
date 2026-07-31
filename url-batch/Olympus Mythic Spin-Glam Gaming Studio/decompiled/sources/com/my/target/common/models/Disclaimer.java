package com.my.target.common.models;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class Disclaimer {

    @NonNull
    public final String alias;
    public final int disclaimerType;

    @NonNull
    public final Map<String, ImageInfo> images;
    public final int percent;

    @NonNull
    public final String text;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static class ImageInfo {
        public final int height;
        public final int minHeight;

        @NonNull
        public final String url;
        public final int width;

        public ImageInfo(int i, @NonNull String str, int i2, int i3) {
            this.minHeight = i;
            this.url = str;
            this.width = i2;
            this.height = i3;
        }

        @NonNull
        public String toString() {
            return "ImageInfo{minHeight=" + this.minHeight + ", width=" + this.width + ", height=" + this.height + ", url='" + this.url + "'}";
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageType {
        public static final String LANDSCAPE = "landscape";
        public static final String PORTRAIT = "portrait";
    }

    @Deprecated
    public Disclaimer(int i, @NonNull String str) {
        this.images = new HashMap();
        this.disclaimerType = i;
        this.text = str;
        this.alias = "";
        this.percent = 10;
    }

    @NonNull
    public Disclaimer copy() {
        Disclaimer disclaimer = new Disclaimer(this.disclaimerType, this.text, this.alias, this.percent);
        disclaimer.images.putAll(this.images);
        return disclaimer;
    }

    @NonNull
    public String toString() {
        return "Disclaimer{disclaimerType=" + this.disclaimerType + ", alias=" + this.alias + ", percent=" + this.percent + ", images.size()=" + this.images.size() + ", text='" + this.text + "'}";
    }

    public Disclaimer(int i, @NonNull String str, @NonNull String str2, int i2) {
        this.images = new HashMap();
        this.disclaimerType = i;
        this.text = str;
        this.alias = str2;
        this.percent = i2;
    }
}
