package yads;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$id;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class da0 {
    public final b50 a;
    public final TextView b;
    public final ProgressBar c;

    public da0(IntegrationInspectorActivity integrationInspectorActivity, final qa1 qa1Var, LinearLayoutManager linearLayoutManager, b50 b50Var) {
        gh0 gh0Var;
        this.a = b50Var;
        ImageButton imageButton = (ImageButton) integrationInspectorActivity.findViewById(R$id.toolbar_navigation_button);
        this.b = (TextView) integrationInspectorActivity.findViewById(R$id.toolbar_title);
        this.c = (ProgressBar) integrationInspectorActivity.findViewById(R$id.loading_view);
        RecyclerView recyclerView = (RecyclerView) integrationInspectorActivity.findViewById(R$id.recycler_view);
        f80 f80Var = new f80();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: yads.da0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                da0.a(Function1.this, view);
            }
        });
        try {
            gh0Var = wo3.a(integrationInspectorActivity);
        } catch (Throwable unused) {
            boolean z = ob1.a;
            gh0Var = gh0.g;
        }
        int i = (int) gh0Var.d;
        recyclerView.setAdapter(b50Var);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(f80Var);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom() + i);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke(o90.a);
    }
}
