package io.bidmachine.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lio/bidmachine/nativead/NativeMediaPublicData;", "", "iconDrawable", "Landroid/graphics/drawable/Drawable;", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "iconUri", "Landroid/net/Uri;", "getIconUri", "()Landroid/net/Uri;", "imageDrawable", "getImageDrawable", "imageUri", "getImageUri", "videoUri", "getVideoUri", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes15.dex */
public interface NativeMediaPublicData {
    @Nullable
    Drawable getIconDrawable();

    @Nullable
    Uri getIconUri();

    @Nullable
    Drawable getImageDrawable();

    @Nullable
    Uri getImageUri();

    @Nullable
    Uri getVideoUri();
}
