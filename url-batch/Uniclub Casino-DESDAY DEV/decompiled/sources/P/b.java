package P;

import C.g;
import K.C0003d;
import K.InterfaceC0002c;
import K.S;
import M0.k;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0258x;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f617a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, k kVar) {
        super(inputConnection, false);
        this.f617a = kVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0002c interfaceC0002c;
        g gVar = inputContentInfo == null ? null : new g(10, new g(9, inputContentInfo));
        k kVar = this.f617a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((g) gVar.f62b).f62b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((g) gVar.f62b).f62b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((g) gVar.f62b).f62b).getDescription();
        g gVar2 = (g) gVar.f62b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) gVar2.f62b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0002c = new g(clipData, 2);
        } else {
            C0003d c0003d = new C0003d();
            c0003d.f379b = clipData;
            c0003d.f380c = 2;
            interfaceC0002c = c0003d;
        }
        interfaceC0002c.c(((InputContentInfo) gVar2.f62b).getLinkUri());
        interfaceC0002c.a(bundle2);
        if (S.h((C0258x) kVar.f522a, interfaceC0002c.i()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
