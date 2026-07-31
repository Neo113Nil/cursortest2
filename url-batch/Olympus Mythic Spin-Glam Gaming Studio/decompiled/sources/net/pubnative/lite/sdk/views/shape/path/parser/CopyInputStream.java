package net.pubnative.lite.sdk.views.shape.path.parser;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes5.dex */
class CopyInputStream {
    private static final String TAG = SvgToPath.TAG;
    private ByteArrayOutputStream _copy;
    private final InputStream _is;

    public CopyInputStream(InputStream inputStream) {
        this._is = inputStream;
        try {
            copy();
        } catch (IOException e) {
            HyBid.reportException((Exception) e);
            Log.w(TAG, "IOException in CopyInputStream " + e.toString());
        }
    }

    private void copy() {
        this._copy = new ByteArrayOutputStream();
        byte[] bArr = new byte[256];
        while (true) {
            int read = this._is.read(bArr);
            if (-1 == read) {
                this._copy.flush();
                return;
            }
            this._copy.write(bArr, 0, read);
        }
    }

    public ByteArrayInputStream getCopy() {
        return new ByteArrayInputStream(this._copy.toByteArray());
    }
}
