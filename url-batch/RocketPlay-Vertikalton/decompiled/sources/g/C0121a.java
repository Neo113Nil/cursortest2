package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0125e f2628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0122b f2629b;

    public C0121a(C0122b c0122b, C0125e c0125e) {
        this.f2629b = c0122b;
        this.f2628a = c0125e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0122b c0122b = this.f2629b;
        DialogInterface.OnClickListener onClickListener = c0122b.f2638l;
        C0125e c0125e = this.f2628a;
        onClickListener.onClick(c0125e.f2647b, i);
        if (c0122b.f2639m) {
            return;
        }
        c0125e.f2647b.dismiss();
    }
}
