package com.my.target.common.models.qrcta;

import androidx.annotation.NonNull;
import com.my.target.common.models.ImageData;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class QrIcon {

    @NonNull
    public final ImageData iconImage;

    @NonNull
    public final Position position;

    private QrIcon(ImageData imageData, Position position) {
        this.iconImage = imageData;
        this.position = position;
    }

    @NonNull
    public static QrIcon newQrIconImage(@NonNull ImageData imageData, @NonNull Position position) {
        return new QrIcon(imageData, position);
    }
}
