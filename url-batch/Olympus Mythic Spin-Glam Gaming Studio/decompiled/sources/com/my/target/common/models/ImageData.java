package com.my.target.common.models;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.target.fb;
import com.my.target.mi;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes9.dex */
public final class ImageData extends fb {
    private static volatile LruCache f = new a(31457280);
    private volatile boolean e;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    private static class a extends LruCache {
        public a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    private ImageData(String str) {
        super(str);
    }

    @AnyThread
    public static void clearCache() {
        f.evictAll();
    }

    @NonNull
    public static ImageData newImageData(@NonNull String str) {
        return new ImageData(str);
    }

    @AnyThread
    public static void setCacheSize(int i) {
        if (i < 5242880) {
            mi.a("ImageData: Setting cache size ignored - size should be >= 5242880");
        } else {
            f.resize(i);
        }
    }

    @Override // com.my.target.fb
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ImageData.class == obj.getClass() && super.equals(obj) && this.e == ((ImageData) obj).e;
    }

    @Nullable
    public Bitmap getBitmap() {
        return getData();
    }

    @Nullable
    public Bitmap getData() {
        return this.e ? (Bitmap) f.get(this.a) : (Bitmap) super.a();
    }

    @Override // com.my.target.fb
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.e));
    }

    public boolean isUseCache() {
        return this.e;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        setData(bitmap);
    }

    public void setData(@Nullable Bitmap bitmap) {
        if (!this.e) {
            super.a(bitmap);
        } else if (bitmap == null) {
            f.remove(this.a);
        } else {
            f.put(this.a, bitmap);
        }
    }

    @NonNull
    public String toString() {
        return "ImageData{url='" + this.a + "', width=" + this.b + ", height=" + this.c + ", bitmap=" + getData() + '}';
    }

    public void useCache(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        if (!z) {
            super.a((Bitmap) f.remove(this.a));
            return;
        }
        Bitmap bitmap = (Bitmap) super.a();
        if (bitmap != null) {
            super.a(null);
            f.put(this.a, bitmap);
        }
    }

    private ImageData(String str, int i, int i2) {
        super(str);
        this.b = i;
        this.c = i2;
    }

    @NonNull
    public static ImageData newImageData(@NonNull String str, int i, int i2) {
        return new ImageData(str, i, i2);
    }
}
