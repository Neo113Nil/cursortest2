package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0104e f2205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0101b f2206b;

    public C0100a(C0101b c0101b, C0104e c0104e) {
        this.f2206b = c0101b;
        this.f2205a = c0104e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0101b c0101b = this.f2206b;
        DialogInterface.OnClickListener onClickListener = c0101b.h;
        C0104e c0104e = this.f2205a;
        onClickListener.onClick(c0104e.f2216b, i);
        if (c0101b.i) {
            return;
        }
        c0104e.f2216b.dismiss();
    }
}
