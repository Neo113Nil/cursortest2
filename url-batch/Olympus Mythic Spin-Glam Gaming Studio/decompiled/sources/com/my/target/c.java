package com.my.target;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.my.target.common.menu.MenuAction;
import com.my.target.d;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public class c extends BaseAdapter {
    private List a;
    private d.a b;

    public c(List list) {
        this.a = list;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public MenuAction getItem(int i) {
        return (MenuAction) this.a.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar = new d(viewGroup.getContext());
        final MenuAction menuAction = (MenuAction) this.a.get(i);
        dVar.setData(menuAction);
        dVar.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.c$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.this.a(menuAction, view2);
            }
        });
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(MenuAction menuAction, View view) {
        d.a aVar = this.b;
        if (aVar != null) {
            aVar.a(menuAction);
        }
    }

    public void a(d.a aVar) {
        this.b = aVar;
    }
}
