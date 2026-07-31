package com.my.target;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.common.models.ImageData;
import com.my.target.ka;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class dh extends RecyclerView.ViewHolder {
    private final eh a;
    private final ka.a b;

    public dh(eh ehVar, ka.a aVar) {
        super(ehVar);
        this.a = ehVar;
        this.b = aVar;
    }

    public void a(final ng ngVar) {
        this.a.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.dh$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dh.this.a(ngVar, view);
            }
        });
        ImageData y = ngVar.a().y();
        if (y != null) {
            this.a.getAdImageView().setImageBitmap(y.getData());
        }
        if (ngVar.c()) {
            this.a.getSharedContainer().setVisibility(0);
        } else {
            this.a.getSharedContainer().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ng ngVar, View view) {
        ka.a aVar = this.b;
        if (aVar != null) {
            aVar.a(ngVar);
        }
    }
}
