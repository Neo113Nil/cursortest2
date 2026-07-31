package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bytedance.adsdk.ugeno.bvs.fb.fs$$ExternalSyntheticApiModelOutline0;
import com.bytedance.adsdk.ugeno.bvs.fb.zn$$ExternalSyntheticApiModelOutline0;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class qy0 implements jk0 {
    @Override // yads.jk0
    public final Drawable a(byte[] bArr, Context context) {
        ImageDecoder.Source createSource;
        Drawable decodeDrawable;
        if (Build.VERSION.SDK_INT < 28) {
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            if (decodeByteArray != null) {
                return new BitmapDrawable(context.getResources(), decodeByteArray);
            }
            throw new IllegalArgumentException("Cannot decode bitmap from data");
        }
        createSource = ImageDecoder.createSource(ByteBuffer.wrap(bArr));
        decodeDrawable = ImageDecoder.decodeDrawable(createSource);
        if (!fs$$ExternalSyntheticApiModelOutline0.m(decodeDrawable)) {
            return decodeDrawable;
        }
        zn$$ExternalSyntheticApiModelOutline0.m(decodeDrawable).start();
        return decodeDrawable;
    }
}
