package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class go extends InputConnectionWrapper {
    public final /* synthetic */ h a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(InputConnection inputConnection, h hVar) {
        super(inputConnection, false);
        this.a = hVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        yc ycVar;
        j0 j0Var = inputContentInfo == null ? null : new j0(24, new j0(23, inputContentInfo));
        h4 h4Var = (h4) this.a.g;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((j0) j0Var.g).g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((j0) j0Var.g).g;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((j0) j0Var.g).g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            ycVar = new j0(clipData, 2);
        } else {
            zc zcVar = new zc();
            zcVar.g = clipData;
            zcVar.h = 2;
            ycVar = zcVar;
        }
        ycVar.q(inputContentInfo3.getLinkUri());
        ycVar.setExtras(bundle2);
        if (f80.i(h4Var, ycVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
