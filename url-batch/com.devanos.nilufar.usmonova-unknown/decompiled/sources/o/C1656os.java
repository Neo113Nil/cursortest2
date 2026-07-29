package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* renamed from: o.os, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656os extends C1590ns {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1656os(C1387kn c1387kn, int i) {
        super(0, c1387kn);
        this.j = i;
    }

    @Override // o.C1590ns
    public final Bitmap j(ByteBuffer byteBuffer, IC ic) {
        switch (this.j) {
            case 0:
                Bitmap j = super.j(byteBuffer, ic);
                if (j != null) {
                    return j;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (ic.c == 0) {
                    return AbstractC1473m3.e(decodeByteArray, ic.e);
                }
                Matrix matrix = new Matrix();
                matrix.postRotate(ic.c);
                Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                decodeByteArray.recycle();
                return AbstractC1473m3.e(createBitmap, ic.e);
            default:
                return AbstractC1473m3.e(super.j(byteBuffer, ic), ic.e);
        }
    }
}
