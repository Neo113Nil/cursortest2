package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0121e f2283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0118b f2284b;

    public C0117a(C0118b c0118b, C0121e c0121e) {
        this.f2284b = c0118b;
        this.f2283a = c0121e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0118b c0118b = this.f2284b;
        DialogInterface.OnClickListener onClickListener = c0118b.h;
        C0121e c0121e = this.f2283a;
        onClickListener.onClick(c0121e.f2294b, i);
        if (c0118b.i) {
            return;
        }
        c0121e.f2294b.dismiss();
    }
}
