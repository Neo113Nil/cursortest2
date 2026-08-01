package P;

import A1.d;
import K.C0011d;
import K.InterfaceC0009c;
import K.T;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0283w;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f916a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f916a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0009c interfaceC0009c;
        d dVar = inputContentInfo == null ? null : new d(12, new d(11, inputContentInfo));
        b bVar = this.f916a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((d) dVar.f38b).f38b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((d) dVar.f38b).f38b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((d) dVar.f38b).f38b).getDescription();
        d dVar2 = (d) dVar.f38b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) dVar2.f38b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0009c = new d(clipData, 2);
        } else {
            C0011d c0011d = new C0011d();
            c0011d.f654b = clipData;
            c0011d.f655c = 2;
            interfaceC0009c = c0011d;
        }
        interfaceC0009c.c(((InputContentInfo) dVar2.f38b).getLinkUri());
        interfaceC0009c.a(bundle2);
        if (T.h((C0283w) bVar.f915a, interfaceC0009c.h()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
