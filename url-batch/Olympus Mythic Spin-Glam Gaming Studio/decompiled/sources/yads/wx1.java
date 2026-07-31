package yads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes15.dex */
public final class wx1 extends RecyclerView.Adapter {
    public final List a;
    public final tx1 b;

    public wx1(ri2 ri2Var, List list, t8 t8Var) {
        tx1 tx1Var = new tx1(ri2Var, t8Var);
        this.a = list;
        this.b = tx1Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((rx1) viewHolder).a.b((q31) this.a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        tx1 tx1Var = this.b;
        tx1Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new sx1());
        int i2 = y31.$r8$clinit;
        return new rx1(imageView, new y31(imageView, tx1Var.a, tx1Var.b));
    }
}
