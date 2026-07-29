package o;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: o.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814c2 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C1077g2 h;
    public final /* synthetic */ C0880d2 i;

    public C0814c2(C0880d2 c0880d2, C1077g2 c1077g2) {
        this.i = c0880d2;
        this.h = c1077g2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0880d2 c0880d2 = this.i;
        DialogInterface.OnClickListener onClickListener = c0880d2.h;
        C1077g2 c1077g2 = this.h;
        onClickListener.onClick(c1077g2.b, i);
        if (c0880d2.i) {
            return;
        }
        c1077g2.b.dismiss();
    }
}
