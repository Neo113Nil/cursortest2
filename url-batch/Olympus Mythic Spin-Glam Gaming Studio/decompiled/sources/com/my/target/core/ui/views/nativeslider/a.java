package com.my.target.core.ui.views.nativeslider;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.my.target.b6;
import com.my.target.common.models.ImageData;
import com.my.target.fh;
import com.my.target.ge;
import com.my.target.qi;
import com.my.target.uc;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
class a extends RecyclerView.Adapter {
    private final Context a;
    private final List b = new ArrayList();
    private c c;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    /* renamed from: com.my.target.core.ui.views.nativeslider.a$a, reason: collision with other inner class name */
    public static class C1680a extends FrameLayout {
        public int a;
        public int b;

        public C1680a(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch(h.r, this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (size == 0) {
                size = this.a;
            }
            if (size2 == 0) {
                size2 = this.b;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static class b extends RecyclerView.ViewHolder {
        private final fh a;
        private final FrameLayout b;

        b(FrameLayout frameLayout, fh fhVar, FrameLayout frameLayout2) {
            super(frameLayout);
            this.a = fhVar;
            this.b = frameLayout2;
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    interface c extends ge {
        void a(int i);
    }

    a(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a(view, 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == this.b.size() - 1 ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(b bVar, int i) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.a(i);
        }
        uc ucVar = i < this.b.size() ? (uc) this.b.get(i) : null;
        ImageData y = ucVar != null ? ucVar.y() : null;
        if (y != null) {
            bVar.a.setPlaceholderDimensions(y.getWidth(), y.getHeight());
            Bitmap bitmap = y.getBitmap();
            if (bitmap != null) {
                bVar.a.setImageBitmap(bitmap);
            } else {
                b6.b(y, bVar.a);
            }
        }
        bVar.a.setContentDescription("card_" + i);
        bVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.my.target.core.ui.views.nativeslider.a$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.a(view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1680a c1680a = new C1680a(this.a);
        c1680a.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        fh fhVar = new fh(this.a);
        qi.b(fhVar, "card_media_view");
        c1680a.addView(fhVar, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(this.a);
        if (viewGroup.isClickable()) {
            qi.a(frameLayout, 0, 1153821432);
        }
        c1680a.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return new b(c1680a, fhVar, frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(b bVar) {
        int adapterPosition = bVar.getAdapterPosition();
        uc ucVar = (adapterPosition <= 0 || adapterPosition >= this.b.size()) ? null : (uc) this.b.get(adapterPosition);
        bVar.a.setImageData(null);
        ImageData y = ucVar != null ? ucVar.y() : null;
        if (y != null) {
            b6.a(y, bVar.a);
        }
        bVar.b.setOnClickListener(null);
    }

    public void a(List list) {
        this.b.addAll(list);
    }

    public void a() {
        this.b.clear();
        notifyDataSetChanged();
        this.c = null;
    }

    void a(c cVar) {
        this.c = cVar;
    }
}
