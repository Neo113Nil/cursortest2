package yads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes11.dex */
public final class b50 extends ListAdapter {
    public final tk3 a;
    public final fl3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(qa1 qa1Var, e80 e80Var) {
        super(new y70());
        tk3 tk3Var = new tk3(qa1Var, e80Var);
        fl3 fl3Var = new fl3();
        this.a = tk3Var;
        this.b = fl3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        oa0 oa0Var = (oa0) getItem(i);
        this.b.getClass();
        if (oa0Var instanceof ha0) {
            return R$layout.debug_panel_item_action_button;
        }
        if (oa0Var instanceof na0) {
            return R$layout.debug_panel_item_switch;
        }
        if (oa0Var instanceof ia0) {
            return R$layout.debug_panel_item_divider;
        }
        if (oa0Var instanceof ja0) {
            return R$layout.deubg_panel_item_header;
        }
        if (oa0Var instanceof ka0) {
            return R$layout.deubg_panel_item_key_value;
        }
        if (oa0Var instanceof la0) {
            return R$layout.debug_panel_item_mediation_adapter;
        }
        if (oa0Var instanceof fa0) {
            return R$layout.debug_panel_item_ad_units;
        }
        if (oa0Var instanceof ea0) {
            return R$layout.debug_panel_item_ad_unit;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((ra0) viewHolder).a((oa0) getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        tk3 tk3Var = this.a;
        tk3Var.getClass();
        return i == R$layout.debug_panel_item_action_button ? new k0(inflate, mk3.b) : i == R$layout.debug_panel_item_switch ? new m53(inflate, new ok3(tk3Var)) : i == R$layout.deubg_panel_item_header ? new yz0(inflate) : i == R$layout.deubg_panel_item_key_value ? new dd1(inflate) : i == R$layout.debug_panel_item_mediation_adapter ? new bs1(inflate, tk3Var.b, new pk3(tk3Var), new qk3(tk3Var)) : i == R$layout.debug_panel_item_ad_units ? new ma(inflate, new rk3(tk3Var)) : i == R$layout.debug_panel_item_ad_unit ? new ka(inflate, new sk3(tk3Var)) : new jj0(inflate);
    }
}
