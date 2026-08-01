package P;

import A0.h;
import K.C0006e;
import K.InterfaceC0005d;
import K.T;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import l.C0240v;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f601a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        InterfaceC0005d interfaceC0005d;
        h hVar = inputContentInfo == null ? null : new h(8, new h(7, inputContentInfo));
        b bVar = this.f601a;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((h) hVar.f30b).f30b).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((h) hVar.f30b).f30b;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = ((InputContentInfo) ((h) hVar.f30b).f30b).getDescription();
        h hVar2 = (h) hVar.f30b;
        ClipData clipData = new ClipData(description, new ClipData.Item(((InputContentInfo) hVar2.f30b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0005d = new h(clipData, 2);
        } else {
            C0006e c0006e = new C0006e();
            c0006e.f392b = clipData;
            c0006e.f393c = 2;
            interfaceC0005d = c0006e;
        }
        interfaceC0005d.d(((InputContentInfo) hVar2.f30b).getLinkUri());
        interfaceC0005d.a(bundle2);
        if (T.h((C0240v) bVar.f600a, interfaceC0005d.j()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
