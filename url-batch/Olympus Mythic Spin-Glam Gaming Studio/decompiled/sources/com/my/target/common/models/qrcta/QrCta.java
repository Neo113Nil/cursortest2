package com.my.target.common.models.qrcta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.common.models.ImageData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes8.dex */
public class QrCta {

    @Nullable
    public final ImageData additionalImage;

    @NonNull
    public final String additionalText;
    public final int colorScheme;

    @NonNull
    public final Position position;

    @Nullable
    public final QrIcon qrIcon;

    @NonNull
    public final ImageData qrImage;

    @NonNull
    public final String title;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
        public static final int BLUE = 1;
        public static final int GREEN = 3;
        public static final int PINK = 6;
        public static final int PURPLE = 7;
        public static final int RED = 5;
        public static final int TURQUOISE = 2;
        public static final int WHITE = 0;
        public static final int YELLOW = 4;
    }

    private QrCta(ImageData imageData, QrIcon qrIcon, ImageData imageData2, String str, String str2, Position position, int i) {
        this.qrImage = imageData;
        this.qrIcon = qrIcon;
        this.additionalImage = imageData2;
        this.title = str;
        this.additionalText = str2;
        this.position = position;
        this.colorScheme = i;
    }

    public static QrCta a(ImageData imageData, QrIcon qrIcon, ImageData imageData2, String str, String str2, Position position, int i) {
        return new QrCta(imageData, qrIcon, imageData2, str, str2, position, i);
    }
}
