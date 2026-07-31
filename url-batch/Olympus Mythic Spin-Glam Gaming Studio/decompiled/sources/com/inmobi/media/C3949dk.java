package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.dk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C3949dk implements N0 {
    public final byte[] a;
    public final String b;

    public C3949dk(String location, byte[] imageBytes) {
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(location, "location");
        this.a = imageBytes;
        this.b = location;
    }

    @Override // com.inmobi.media.N0
    public final Object a() {
        byte[] bArr = this.a;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Intrinsics.checkNotNull(decodeByteArray);
        return a(decodeByteArray);
    }

    public final String a(Bitmap bitmap) {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        String str = uuid + BrandSafetyUtils.a;
        File file = new File(this.b);
        if (!file.exists()) {
            file.mkdirs();
        }
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, InMobiFilesBridge.fileOutputStreamCtor(new File(this.b + "/" + str)));
        return this.b + "/" + str;
    }
}
