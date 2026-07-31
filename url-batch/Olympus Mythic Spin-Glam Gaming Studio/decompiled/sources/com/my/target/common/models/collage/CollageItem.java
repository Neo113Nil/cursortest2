package com.my.target.common.models.collage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import com.my.target.d7;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes11.dex */
public class CollageItem {

    @NonNull
    public final String id;

    @Nullable
    public final ImageData image;

    @NonNull
    public final String type;

    @Nullable
    public final Video video;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class MediaFile {

        @NonNull
        public final String format;
        public final int height;

        @NonNull
        public final String src;
        public final int width;

        MediaFile(String str, String str2, int i, int i2) {
            this.format = str;
            this.src = str2;
            this.width = i;
            this.height = i2;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public static final class Video {
        public final int duration;

        @NonNull
        public final List<MediaFile> mediaFiles;

        @NonNull
        public final ImageData preview;

        Video(ImageData imageData, List list, int i) {
            this.preview = imageData;
            this.mediaFiles = list;
            this.duration = i;
        }

        public String toString() {
            return "Video{duration=" + this.duration + ", preview=" + this.preview + ", mediaFiles=" + this.mediaFiles + '}';
        }
    }

    CollageItem(String str, String str2, ImageData imageData, Video video) {
        this.id = str;
        this.type = str2;
        this.image = imageData;
        this.video = video;
    }

    public static CollageItem a(d7 d7Var) {
        Video video;
        d7.b bVar = d7Var.d;
        if (bVar != null) {
            List<d7.a> list = bVar.b;
            ArrayList arrayList = new ArrayList();
            for (d7.a aVar : list) {
                arrayList.add(new MediaFile(aVar.a, aVar.b, aVar.c, aVar.d));
            }
            video = new Video(bVar.a, arrayList, bVar.c);
        } else {
            video = null;
        }
        return new CollageItem(d7Var.a, d7Var.b, d7Var.c, video);
    }

    public String toString() {
        return "CollageItem{id='" + this.id + "', type='" + this.type + "', image=" + this.image + ", video=" + this.video + '}';
    }
}
