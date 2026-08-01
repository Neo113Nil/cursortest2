package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0134e f2292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0131b f2293b;

    public C0130a(C0131b c0131b, C0134e c0134e) {
        this.f2293b = c0131b;
        this.f2292a = c0134e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0131b c0131b = this.f2293b;
        DialogInterface.OnClickListener onClickListener = c0131b.h;
        C0134e c0134e = this.f2292a;
        onClickListener.onClick(c0134e.f2303b, i);
        if (c0131b.i) {
            return;
        }
        c0134e.f2303b.dismiss();
    }
}
