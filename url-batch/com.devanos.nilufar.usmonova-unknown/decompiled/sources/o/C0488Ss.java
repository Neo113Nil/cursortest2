package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: o.Ss, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488Ss implements InterfaceC0514Ts {
    public final InputContentInfo h;

    public C0488Ss(Object obj) {
        this.h = (InputContentInfo) obj;
    }

    @Override // o.InterfaceC0514Ts
    public final ClipDescription b() {
        return this.h.getDescription();
    }

    @Override // o.InterfaceC0514Ts
    public final Object c() {
        return this.h;
    }

    @Override // o.InterfaceC0514Ts
    public final Uri e() {
        return this.h.getContentUri();
    }

    @Override // o.InterfaceC0514Ts
    public final void g() {
        this.h.requestPermission();
    }

    @Override // o.InterfaceC0514Ts
    public final Uri h() {
        return this.h.getLinkUri();
    }

    public C0488Ss(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.h = new InputContentInfo(uri, clipDescription, uri2);
    }
}
