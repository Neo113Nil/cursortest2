package com.yandex.div.core.images;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.PublicApi;

@PublicApi
/* loaded from: classes14.dex */
public class CachedBitmap {

    @NonNull
    private final Bitmap mBitmap;

    @Nullable
    private final byte[] mBytes;

    @Nullable
    private final Uri mCacheUri;

    @NonNull
    private final BitmapSource mFrom;

    public CachedBitmap(@NonNull Bitmap bitmap, @Nullable Uri uri, @NonNull BitmapSource bitmapSource) {
        this(bitmap, null, uri, bitmapSource);
    }

    public CachedBitmap(@NonNull Bitmap bitmap, @Nullable byte[] bArr, @Nullable Uri uri, @NonNull BitmapSource bitmapSource) {
        this.mBitmap = bitmap;
        this.mCacheUri = uri;
        this.mBytes = bArr;
        this.mFrom = bitmapSource;
    }

    @NonNull
    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    @Nullable
    public byte[] getBytes() {
        return this.mBytes;
    }

    @Nullable
    public Uri getCacheUri() {
        return this.mCacheUri;
    }

    @NonNull
    public BitmapSource getFrom() {
        return this.mFrom;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedBitmap cachedBitmap = (CachedBitmap) obj;
        if (!this.mBitmap.equals(cachedBitmap.getBitmap()) || this.mFrom != cachedBitmap.getFrom()) {
            return false;
        }
        Uri cacheUri = cachedBitmap.getCacheUri();
        Uri uri = this.mCacheUri;
        return uri != null ? uri.equals(cacheUri) : cacheUri == null;
    }

    public int hashCode() {
        int hashCode = ((this.mBitmap.hashCode() * 31) + this.mFrom.hashCode()) * 31;
        Uri uri = this.mCacheUri;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }
}
