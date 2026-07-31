package io.bidmachine.nativead;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.share.internal.ShareConstants;
import io.bidmachine.iab.vast.VastRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lio/bidmachine/nativead/NativeMediaPrivateData;", "Lio/bidmachine/nativead/NativeMediaPublicData;", "vastRequest", "Lio/bidmachine/iab/vast/VastRequest;", "getVastRequest", "()Lio/bidmachine/iab/vast/VastRequest;", "setVastRequest", "(Lio/bidmachine/iab/vast/VastRequest;)V", "setIconBitmap", "", "bitmap", "Landroid/graphics/Bitmap;", "setIconUri", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "setImageBitmap", "setImageUri", "setVideoUri", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface NativeMediaPrivateData extends NativeMediaPublicData {
    @Nullable
    VastRequest getVastRequest();

    void setIconBitmap(@Nullable Bitmap bitmap);

    void setIconUri(@Nullable Uri uri);

    void setImageBitmap(@Nullable Bitmap bitmap);

    void setImageUri(@Nullable Uri uri);

    void setVastRequest(@Nullable VastRequest vastRequest);

    void setVideoUri(@Nullable Uri uri);
}
